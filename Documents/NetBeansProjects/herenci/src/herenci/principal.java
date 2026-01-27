/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package herenci;

/**
 *Hasta el final... vamos Madrid
 * @author KIKI<16@CHAMPIONSLEAGUE.COM>
 * @url KIKI<16@CHAMPIONSLEAGUE.COM>
 * @date KIKI<16@CHAMPIONSLEAGUE.COM>
 */
public class principal {
    public static void main(String[] args) {
        persona p1 = new persona("Gundi");
        
        System.out.println(p1.getNombre());
        
        deportista d1 = new deportista();
        d1.setdeporte("campeon de barra fija");
        d1.setnombre("torrente");
        
        System.out.println(d1.getNombre());
    }

}
