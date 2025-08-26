

public class AccountManager {
    public void registerAccount(String user, String mail) {
        System.out.println("Nova conta criada para: " + user + " | Email: " + mail);
    }
}

public class MailService {
    public void confirmMail(String mail) {
        System.out.println("Confirmação de email enviada para: " + mail);
    }
}

public class LogService {
    public void saveLog(String user) {
        System.out.println("LOG: Usuário registrado -> " + user);
    }
}

public class MainApp {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        MailService mailService = new MailService();
        LogService logService = new LogService();

        String user = "Maria";
        String mail = "maria@teste.com";

        accountManager.registerAccount(user, mail);
        mailService.confirmMail(mail);
        logService.saveLog(user);
    }
}
