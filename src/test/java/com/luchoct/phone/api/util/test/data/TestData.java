package com.luchoct.phone.api.util.test.data;

import com.luchoct.phone.api.api.dto.Phone;

import java.util.Arrays;
import java.util.List;

public class TestData {
    public static final Phone PHONE_1_INSTANCE = new Phone(
            1,
            "Samsung Galaxy S8+ Plata",
            "Dicen que hay personas que nacen sabiendo, pues este móvil también. ¡Si es que tiene de todo! Batería de 3.600 mAh, procesador de ocho núcleos, 4 GB de RAM… Hasta una pantallaza Quad HD+ de 6,2”. Llévatelo con cualquiera de nuestras tarifas de contrato y sé el adelantado del grupo.",
            "samsung-s8plus-silver",
            "859.00",
            "[\"Android 7.0\",\"Pantalla 6,2 pulgadas QHD+\",\"Cámara Trasera 12 Mpx\",\"Cámara Frontal 8 Mpx\",\"Procesador 8 núcleos\",\"Memoria ROM/RAM: 64GB/4GB\",\"Batería de 3500 mAh\",\"Wifi, Bluetooth, GPS, NFC\"]");
    public static final String PHONE_1_JSON = "{\"id\":1,\"title\":\"Samsung Galaxy S8+ Plata\","
            + "\"description\":\"Dicen que hay personas que nacen sabiendo, pues este móvil también. ¡Si es que tiene de todo! Batería de 3.600 mAh, procesador de ocho núcleos, 4 GB de RAM… Hasta una pantallaza Quad HD+ de 6,2”. Llévatelo con cualquiera de nuestras tarifas de contrato y sé el adelantado del grupo.\","
            + "\"pictureId\":\"samsung-s8plus-silver\","
            + "\"fee\":\"859.00\","
            + "\"phoneFeatures\":\"[\\\"Android 7.0\\\",\\\"Pantalla 6,2 pulgadas QHD+\\\",\\\"Cámara Trasera 12 Mpx\\\",\\\"Cámara Frontal 8 Mpx\\\",\\\"Procesador 8 núcleos\\\",\\\"Memoria ROM/RAM: 64GB/4GB\\\",\\\"Batería de 3500 mAh\\\",\\\"Wifi, Bluetooth, GPS, NFC\\\"]\"}";

    public static final Phone PHONE_2_INSTANCE = new Phone(
            2,
            "iPhone 7 Plus 256 GB Negro",
            "Nueva cámara dual de 12 megapíxeles. La pantalla de iPhone más brillante y con más colores hasta la fecha. Más velocidad y autonomía que nunca. Resistencia al agua y a las salpicaduras. Y altavoces estéreo. Es una belleza. Es una bestia. Es el 7 Plus.",
            "iphone-7plus-256gb-black",
            "1089.00",
            "[\"Pantalla Retina HD de 5,5 pulgadas (en diagonal) con resolución de 1.920 por 1.080 píxeles y amplia gama cromática\",\"3D Touch\",\"Nuevas cámaras de 12 megapíxeles con zoom óptico x2, zoom digital hasta x10, estabilización óptica de imagen, flash True Tone de cuatro LED y Live Photos\",\"Resistencia a las salpicaduras, el agua y el polvo\",\"Chip A10 Fusion con coprocesador de movimiento M10 integrado\",\"Grabación de vídeo en 4K a 30 f/s y de vídeo a cámara lenta en 1080p a 120 f/s\",\"Cámara FaceTime HD de 7 megapíxeles con Retina Flash\",\"Sensor de identidad por huella integrado en el nuevo botón de inicio\",\"4G LTE Advanced de hasta 450 Mb/s y Wi-Fi 802.11a/b/g/n/ac con MIMO\",\"iOS 10 y iCloud\"]");
    public static final String PHONE_2_JSON = "{\"id\":2,\"title\":\"iPhone 7 Plus 256 GB Negro\","
            + "\"description\":\"Nueva cámara dual de 12 megapíxeles. La pantalla de iPhone más brillante y con más colores hasta la fecha. Más velocidad y autonomía que nunca. Resistencia al agua y a las salpicaduras. Y altavoces estéreo. Es una belleza. Es una bestia. Es el 7 Plus.\","
            + "\"pictureId\":\"iphone-7plus-256gb-black\","
            + "\"fee\":\"1089.00\","
            + "\"phoneFeatures\":\"[\\\"Pantalla Retina HD de 5,5 pulgadas (en diagonal) con resolución de 1.920 por 1.080 píxeles y amplia gama cromática\\\",\\\"3D Touch\\\",\\\"Nuevas cámaras de 12 megapíxeles con zoom óptico x2, zoom digital hasta x10, estabilización óptica de imagen, flash True Tone de cuatro LED y Live Photos\\\",\\\"Resistencia a las salpicaduras, el agua y el polvo\\\",\\\"Chip A10 Fusion con coprocesador de movimiento M10 integrado\\\",\\\"Grabación de vídeo en 4K a 30 f/s y de vídeo a cámara lenta en 1080p a 120 f/s\\\",\\\"Cámara FaceTime HD de 7 megapíxeles con Retina Flash\\\",\\\"Sensor de identidad por huella integrado en el nuevo botón de inicio\\\",\\\"4G LTE Advanced de hasta 450 Mb/s y Wi-Fi 802.11a/b/g/n/ac con MIMO\\\",\\\"iOS 10 y iCloud\\\"]\"}";

    public static final Phone PHONE_3_INSTANCE = new Phone(
            3,
            "Huawei P9 Plus Gris",
            "Una imagen vale más que mil palabras, y si está hecha con la Cámara Dual de 12 megapíxeles marca Leica de este móvil, vale más que el Quijote entero. Alucina con la cantidad de fotos de alta calidad que vas a hacer en su pantalla Full HD de 5,5” y su memoria interna de 64 GB. Pero no deja de ser un móvil de lo más elegante, con tecnología 4G, batería 3.400 mAh y puerto de infrarrojos.",
            "huawei-p9-plus-grey",
            "589.00",
            "[\"Procesador 8 núcleos 4x2.5 GHZ + 4x1.8 GHZ\",\"Cámara de 12Mpx, delantera 8Mpx\",\"Plataforma Android 6.0\",\"Pantalla táctil 5,5 pulgadas\",\"Reproductor MP3\",\"Conectividad Wi-fi, bluetooth y NFC\",\"A-GPS integrado con Google Maps™\",\"Aplicaciones de Google™\"]");
    public static final String PHONE_3_JSON = "{\"id\":3,\"title\":\"Huawei P9 Plus Gris\","
            + "\"description\":\"Una imagen vale más que mil palabras, y si está hecha con la Cámara Dual de 12 megapíxeles marca Leica de este móvil, vale más que el Quijote entero. Alucina con la cantidad de fotos de alta calidad que vas a hacer en su pantalla Full HD de 5,5” y su memoria interna de 64 GB. Pero no deja de ser un móvil de lo más elegante, con tecnología 4G, batería 3.400 mAh y puerto de infrarrojos.\","
            + "\"pictureId\":\"huawei-p9-plus-grey\","
            + "\"fee\":\"589.00\","
            + "\"phoneFeatures\":\"[\\\"Procesador 8 núcleos 4x2.5 GHZ + 4x1.8 GHZ\\\",\\\"Cámara de 12Mpx, delantera 8Mpx\\\",\\\"Plataforma Android 6.0\\\",\\\"Pantalla táctil 5,5 pulgadas\\\",\\\"Reproductor MP3\\\",\\\"Conectividad Wi-fi, bluetooth y NFC\\\",\\\"A-GPS integrado con Google Maps™\\\",\\\"Aplicaciones de Google™\\\"]\"}";

    public static final Phone PHONE_4_INSTANCE = new Phone(
            4,
            "LG G6 Plata",
            "Es tan guay que todos quieren parecerse a él ¡Y no le culpo! Tiene unos acabados y un diseño que ni la Venus de Milo. Vamos, que si se te ocurre ponerle una funda la lías. Lo completa su doble cámara de 13 MP, la pantalla de 5,7” y ya para rematar soporta Dolby Vision y HDR. Si eres de los que se pasa el día cantando el “Antes muerta que sencilla” llévatelo con nuestras tarifas de contrato.",
            "lg-g6-silver",
            "539.00",
            "[\"Android 7.0\",\"Pantalla 5,7 pulgadas QHD+\",\"Cámara Trasera 13 Mpx\",\"Cámara Frontal 5 Mpx\",\"Procesador 4 núcleos\",\"Memoria ROM/RAM: 32GB/4GB\",\"Batería de 3300 mAh\",\"Wifi, Bluetooth, GPS, NFC\"]");
    public static final String PHONE_4_JSON = "{\"id\":4,\"title\":\"LG G6 Plata\","
            + "\"description\":\"Es tan guay que todos quieren parecerse a él ¡Y no le culpo! Tiene unos acabados y un diseño que ni la Venus de Milo. Vamos, que si se te ocurre ponerle una funda la lías. Lo completa su doble cámara de 13 MP, la pantalla de 5,7” y ya para rematar soporta Dolby Vision y HDR. Si eres de los que se pasa el día cantando el “Antes muerta que sencilla” llévatelo con nuestras tarifas de contrato.\","
            + "\"pictureId\":\"lg-g6-silver\","
            + "\"fee\":\"539.00\","
            + "\"phoneFeatures\":\"[\\\"Android 7.0\\\",\\\"Pantalla 5,7 pulgadas QHD+\\\",\\\"Cámara Trasera 13 Mpx\\\",\\\"Cámara Frontal 5 Mpx\\\",\\\"Procesador 4 núcleos\\\",\\\"Memoria ROM/RAM: 32GB/4GB\\\",\\\"Batería de 3300 mAh\\\",\\\"Wifi, Bluetooth, GPS, NFC\\\"]\"}";


    public static final Phone PHONE_INSTANCE = PHONE_1_INSTANCE;
    public static final String PHONE_JSON = PHONE_1_JSON;

    public static final List<Phone> ALL_PHONE_INSTANCE_ORDERED_BY_FEE = Arrays.asList(PHONE_2_INSTANCE, PHONE_1_INSTANCE, PHONE_3_INSTANCE, PHONE_4_INSTANCE);
    public static final String ALL_PHONE_JSON_ORDERED_BY_FEE = "[" + String.join(",", PHONE_2_JSON, PHONE_1_JSON, PHONE_3_JSON, PHONE_4_JSON) + "]";
}
