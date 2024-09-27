package d3;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class PortScanner implements Runnable {
    private String ip;
    private int start;
    private int end;

    public PortScanner(String ip, int start, int end) {
        this.ip = ip;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        ConcurrentLinkedQueue openPort = new ConcurrentLinkedQueue<>();
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        AtomicInteger port = new AtomicInteger(start);
        while (port.get() < end) {
            // clear screen
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Progress: " + 100 * port.get() / end);
            Socket socket = new Socket();
            executorService.submit(() -> {
                try {
                    socket.connect(new InetSocketAddress(ip, port.get()), 200);
                    openPort.add(port.get());
                } catch (Exception e) {
                }
            });
            port.getAndIncrement();
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
        System.out.println("Offene Ports: " + openPort);
    }

}