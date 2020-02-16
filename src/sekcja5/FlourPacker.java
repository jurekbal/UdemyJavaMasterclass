package sekcja5;

//Cw 24
public class FlourPacker {

        public static boolean canPack(int bigCount, int smallCount, int goal){
            if (bigCount < 0 || smallCount < 0 || goal < 0) {
                return false;
            }
            // spr czy goal jest w ogole osiagniety
            if ( (bigCount*5 + smallCount) < goal) {
                return false;
            }

            //spr czy paczki beda pelne
            if (smallCount >= goal % 5) {
                return true;
            }
            return false;
        }
}
