package day05_practice_tasks;

public class Alphabets_and_use_a_nestedloop {

    public static void main(String[] args) {

        for (char letter = 'A'; letter <= 'E'; letter++) {
            for (char letters = 'a'; letters <= 'z'; letters++) {
                System.out.print(letter);
                System.out.print(letters + " ");
            }
            System.out.println(" ");
        }



    }
}
/*8. Create a class named Alphabets and use a nested loop to print the following output:

		Aa Ab Ac Ad Ae Af Ag Ah Ai Aj Ak Al Am An Ao Ap Aq Ar As At Au Av Aw Ax Ay Az
		Ba Bb Bc Bd Be Bf Bg Bh Bi Bj Bk Bl Bm Bn Bo Bp Bq Br Bs Bt Bu Bv Bw Bx By Bz
		Ca Cb Cc Cd Ce Cf Cg Ch Ci Cj Ck Cl Cm Cn Co Cp Cq Cr Cs Ct Cu Cv Cw Cx Cy Cz
		Da Db Dc Dd De Df Dg Dh Di Dj Dk Dl Dm Dn Do Dp Dq Dr Ds Dt Du Dv Dw Dx Dy Dz
		Ea Eb Ec Ed Ee Ef Eg Eh Ei Ej Ek El Em En Eo Ep Eq Er Es Et Eu Ev Ew Ex Ey Ez
 */