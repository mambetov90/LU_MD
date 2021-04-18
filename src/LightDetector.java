//Uzrakstīt programmu, kura noteiks gaismas līmeni un izvadīs rezultātu konsolē.
//
//        Nosacījumi:
//
//        Klases nosaukums – LightDetector(int lightRange);
//
//        Gaismas līmeņi:
//
//        380 ... 449 - violets ("violet")
//        450 ... 494 - zils ("blue")
//        495 ... 569 - zaļš ("green")
//        570 ... 589 - dzeltens ("yellow")
//        590 ... 619 - oranžs ("orange")
//        620 ... 750 - sarkans ("red")
//        Ārpus joslas - neredzamais spektrs ("Invisible light")
public class LightDetector {

    public LightDetector(int lightRange){

        if (lightRange > 379 && lightRange < 450) {
            System.out.println("violet");
        } else if (lightRange > 449 && lightRange < 495 ){
            System.out.println("blue");
        } else if (lightRange > 494 && lightRange < 570 ){
            System.out.println("green");
        } else if (lightRange > 569 && lightRange < 590 ) {
            System.out.println("yellow");
        } else if (lightRange > 589 && lightRange < 620 ) {
            System.out.println("orange");
        } else if (lightRange > 619 && lightRange < 751 ) {
            System.out.println("red");
        } else {
            System.out.println("Invisible light");
        }
    }
    public static void main(String[] args) {
        LightDetector lightDetector = new LightDetector(751);
        System.out.println(lightDetector);
    }
}