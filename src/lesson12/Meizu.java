package lesson12;

public class Meizu implements Phone, Photoapparat{


    @Override
    public void call() {
        System.out.println("Meizu осущесвление звонка ...");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Meizu отправляем сообщение ...");
    }

    @Override
    public void doFoto() {
        System.out.println("Meizu делаем фото ...");
    }

    @Override
    public void doVideo() {
        System.out.println("Meizu делаем видео ...");
    }
}
