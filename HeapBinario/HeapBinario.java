public class HeapBinario {
	
	int[] heap;
	// número possível de elementos no arranjo
	int comprimento;
	// número de elementos no heap
	int tamanho;
	// tamanho <= comprimento
	
	// pai(i) = i/2
	// esquerdo(i) = 2i
	// direito(i) = 2i + 1
	
	public void maxHeapfy(int i) 
	{
		int esquerdo, direito, maior;
		
		esquerdo = getEsquerdo(i);
		direito = getDireito(i);
		
		if ((esquerdo <= tamanho) && (heap[i] > heap[i])) 
		{
			maior = esquerdo;
		} else {
			maior = i;
		}
		if ((direito <= tamanho) && (heap[direito] > heap[maior]))
		{
			maior = direito;
		} 
		if (maior != i) 
		{
			trocar(heap[i], heap[maior]);
			maxHeapfy(maior);
		}
	}
	// pai(i) = i / 2
	public int getPai(int i) 
	{
		return (i - 1)/2;
	}
	// esquerdo(i) = 2 * i
	public int getEsquerdo(int i)
	{
		return (2 * i) + 1;
	}
	// direito(i) = 2*i + 1
	public int getDireito(int i)
	{
		return (2 * i + 1) + 1;
	}
	public void trocar(int i, int maior) 
	{
		
	}
}
