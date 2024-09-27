package d3;

class UserInterface {
    public void start() {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("IP: ");
            String ip = scanner.nextLine();

            System.out.print("Portrange (default 1-1024): ");
            String range = scanner.nextLine();

            if (range == "" || range == null) {
                range = "1-1024";
            }

            String[] ports = range.split("-");

            if (ports.length != 2) {
                throw new InvalidInputException("Portrange muss zwei Zahlen enthalten");
            }

            int start = Integer.parseInt(ports[0]);
            int end = Integer.parseInt(ports[1]);

            if (start < 1 || start > 65535 || end < 1 || end > 65535) {
                throw new InvalidInputException("Portnummer muss zwischen 1 und 65535 liegen");
            }

            PortScanner ps = new PortScanner(ip, start, end);
            ps.run();

        } catch (InvalidInputException e) {
            System.out.println("Fehler: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ungültige Eingabe");
        }
    }
}
