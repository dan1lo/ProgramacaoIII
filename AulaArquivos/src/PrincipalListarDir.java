import java.io.File;

public class PrincipalListarDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("novo");
		if( dir.isDirectory() ){
		    String[] arqs = dir.list();
		    for(String nome : arqs){
		        System.out.println(nome);
		    }
		}
	}

}
