package week_5.codeWithMosh.oopPractice;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html>/<html>";
    }

    private String findIpAddress(String address) {
        return "101.1010.20.102";
    }

}
