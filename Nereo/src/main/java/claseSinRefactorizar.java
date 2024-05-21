public class claseSinRefactorizar {
	int variableInecesariamenteLarga;
	String unaCosaMas;
	final boolean variableTotalmenteinecesaria = false;

	public claseSinRefactorizar(int variableInecesariamenteLarga, String unaCosaMas) {
		super();
		this.variableInecesariamenteLarga = variableInecesariamenteLarga;
		this.unaCosaMas = unaCosaMas;
	}

	public int getVariableInecesariamenteLarga() {
		return variableInecesariamenteLarga;
	}

	public void setVariableInecesariamenteLarga(int variableInecesariamenteLarga) {
		this.variableInecesariamenteLarga = variableInecesariamenteLarga;
	}

	public String getUnaCosaMas() {
		return unaCosaMas;
	}

	public void setUnaCosaMas(String unaCosaMas) {
		this.unaCosaMas = unaCosaMas;
	}

	public String añadeAUnaCosaMas(int miNumeroDeObjeto, String variableInecesariamenteLarga) {

		return miNumeroDeObjeto + variableInecesariamenteLarga;
	}

}
