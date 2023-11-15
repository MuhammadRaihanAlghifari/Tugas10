package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {
        Member NPlatinum = new MemberPlatinum();
        Member NGold = new MemberGold();
        Member NSilver = new MemberSilver();
        Member NReguler = new MemberReguler();

        Integer HPlatinum = NPlatinum.hitungTotalBayar(100000);
        Integer HGold = NGold.hitungTotalBayar(100000);
        Integer HSilver = NSilver.hitungTotalBayar(100000);
        Integer HReguler = NReguler.hitungTotalBayar(100000);

        System.out.println("total yang harus dibayarkan member Platinum : " + HPlatinum);
        System.out.println("total yang harus dibayarkan member Gold : " + HGold);
        System.out.println("total yang harus dibayarkan member Silver : " + HSilver);
        System.out.println("total yang harus dibayarkan member Reguler : " + HReguler);
    }
    
}
