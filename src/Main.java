import br.com.ederleite.example.reflectionsAndAnnotations.domain.model.Pessoa;
import br.com.ederleite.example.reflectionsAndAnnotations.util.MascaraUtil;

public class Main {
	
	public static void main(String[] args) {
	    final Pessoa pessoa = new Pessoa();
	    pessoa.setCpf("01234567890");
	    pessoa.setNome("mario rosafa");
	    /*
	    System.out.println("Antes : " + pessoa.getCpf());
	 
	    new MascaraUtil().aplicarMascara(pessoa);
	    System.out.println("Depois: " + pessoa.getCpf());
	    */
	    System.out.println(pessoa.getNome());
	}
}
