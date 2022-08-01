package imera;

import java.net.URL;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        day();
        week();
    }
	public static void day(){
        String day = "https://cvetrends.com/api/cves/24hrs";
        String html = "";
        try {
            URL url1 = new URL(day);
            Scanner scanner = new Scanner(url1.openStream());
            while (scanner.hasNext()) {
                html += scanner.nextLine();
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] cve = html.split("\"cve\":");
        for (int i = 0; i < cve.length; i++) {
            System.out.println(cve[i].split("\"")[1]);
        }
        System.out.println("24 hours cve count: " + cve.length);
    }
    public static void week(){
        String week = "https://cvetrends.com/api/cves/24hrs";
        String html = "";
        try {
            URL url1 = new URL(week);
            Scanner scanner = new Scanner(url1.openStream());
            while (scanner.hasNext()) {
                html += scanner.nextLine();
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] cve = html.split("\"cve\":");
        for (int i = 0; i < cve.length; i++) {
            System.out.println(cve[i].split("\"")[1]);
        }
        System.out.println("7 days cve count: " + cve.length);

    }

}
