package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les param�tres de la ligne de commande
        for (int i=0;i<args.length;i++){
               int fahrenheit = Integer.parseInt(args[i]);
               float celsius=fahrenheitEnCelsius(fahrenheit);
               System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
        }
                                                                                
    }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float resultat= ((((float)f - 32)*5)/9);
        resultat=(int)(resultat*10);
        resultat=resultat/10;
        
        return resultat; // � compl�ter en rempla�ant ce return 0.F par la fonction
                         // de conversion
    }

}
