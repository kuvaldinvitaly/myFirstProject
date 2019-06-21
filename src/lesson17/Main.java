package lesson17;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Tovar rukzak = new Tovar();
        rukzak.setMainName("Рюкзак Mark Ryden MR-9032");
        rukzak.setArticul("MR-9032");
        rukzak.setOpisanie("Компактный городской рюкзак – отличный выбор для тех, кто привык идти вперед. Современные дизайн-решения и материалы премиум качества делают рюкзак отличным дополнением к любому стилю.\n" +
                "\n" +
                "Особенности:\n" +
                "\n" +
                "Ортопедическая спинка – три слоя высокотехнологичных материалов – и удобные мягкие лямки, регулирующийся по высоте\n" +
                "Внешний USB-порт.\n" +
                "Лёгкий, компактный городской рюкзак для тех, кто живёт в ритме города.\n" +
                "Рюкзак отлично держит форму и занимает минимум места – удобно в транспорте, на мероприятиях, на прогулках.\n" +
                "Система крепления телефона на лямке рюкзака OCTOPUS, внешний USB-порт – звони, снимай фото и видео не снимая с рюкзака.\n" +
                "Трёхслойная ортопедическая спинка с вентилируемой сеткой и мягкие лямки обеспечивают удобное использование.<br>        \n" +
                "        Подробнее: https://www.rukzakoff.ru/product/ryukzak-mark-ryden-mr-9032/");

        rukzak.setOstatokNaSklade(24);
        rukzak.setPriceFull(3990);
        rukzak.setPathToImage("https://img.rukzakoff.ru/wa-data/public/shop/products/42/72/27242/images/135952/135952.750.jpg");

        Otsiv otsiv1 = new Otsiv();
        otsiv1.setNameAvtora(" Ирина ");
        otsiv1.setTema(" Очень удобный рюкзак ");
        otsiv1.setTrueFoto(true);
        otsiv1.setTrueOpisanie(true);
        otsiv1.setReiting(5);
        otsiv1.setOtsiv("Мне все понравилось");
        otsiv1.setTrueRazmer(true);
        otsiv1.setDatePublikasii(new Date());

        Otsiv otsiv2 = new Otsiv();
        otsiv2.setNameAvtora(" Ирина уа");
        otsiv2.setTema(" Очень удобный рюкзакы ");
        otsiv2.setTrueFoto(true);
        otsiv2.setTrueOpisanie(true);
        otsiv2.setReiting(3);
        otsiv2.setOtsiv("Мне все понравилось");
        otsiv2.setTrueRazmer(true);
        otsiv2.setDatePublikasii(new Date());

        rukzak.addOtsiv(otsiv1);
        rukzak.addOtsiv(otsiv2);

        Haracteristika vmestimostA4 = new Haracteristika();
        vmestimostA4.setPodskazka("Параметр показывает, способны ли рюкзаки вместить тетради и папки А4 (размер 210×297 мм)");
        vmestimostA4.setKey("A4");
        vmestimostA4.setValue("Вмещает");

        Haracteristika material = new Haracteristika();
        material.setPodskazka("Хлопок - самые простые прогулочные рюкзаки изготавливают из хлопка. Он почти ничего не весит и не засчитан на серьезные нагрузки");
        material.setKey("Материал");
        material.setValue("Полиэстер");

        Haracteristika spinka = new Haracteristika();
        spinka.setPodskazka("Ортопедическая спинка");
        spinka.setKey("Спинка");
        spinka.setValue("Ортопедическая");

        rukzak.addHarakteristika(vmestimostA4);
        rukzak.addHarakteristika(material);
        rukzak.addHarakteristika(spinka);


        Foto foto = new Foto();
        foto.setPathToBigFoto("foto1.png");
        foto.setPathToSmallFoto("foto2.png");

        Foto foto1 = new Foto();
        foto1.setPathToBigFoto("foto3.png");
        foto1.setPathToSmallFoto("foto4.png");


        rukzak.addFoto(foto);
        rukzak.addFoto(foto1);

        rukzak.printSrednRate();

        rukzak.printOtsiviByRate();


    }

}
