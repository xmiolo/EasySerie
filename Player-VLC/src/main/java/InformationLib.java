import uk.co.caprica.vlcj.binding.LibVlc;

public class InformationLib {
	public static void main(String[] args) throws Exception {
		System.out.println(" Versão: {}" + LibVlc.INSTANCE.libvlc_get_version());
		System.out.println(" Compilador: {}" + LibVlc.INSTANCE.libvlc_get_compiler());
		System.out.println("Changeset: {}" + LibVlc.INSTANCE.libvlc_get_changeset());
	}

}