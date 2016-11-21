public class lab3_inter implements var06 {
	public double logika(double d1, double d2, double d3){
		if (d1<d2 && d1<d3)
			System.out.println("Наименьшее число под № 1.");
		else if (d2<d1 && d2<d3)
			System.out.println("Наименьшее число под № 2.");
		else if (d3<d1 && d3<d2)
			System.out.println("Наименьшее число под № 3.");
		else
			System.out.println("Наименьшего числа нет.");
		return 0;
	}
		public void poka(int N){
		int res=0;
		if(N%10==0)
			System.out.print(0);
		while(N!=0){
			res*=10;
			res+=N%10;
			N/=10;
		}
		System.out.print(res);
	}
	public void massivy(double[] A){
		System.out.println("");
		int size=A.length;
		double[] B = new double[size];
		int[] C = new int[size];
		int j=0;
		for(int i=1;i<=(size-1);i++){
			if(A[i]<A[i-1] && A[i]<A[i+1]){
				System.out.println("Номер локального минимума: "+(i+1));
				B[j]=A[i];
				C[j]=i;
				j++;
			}
		}
		System.out.println(C.length);
		test:
		for(int i=0;i<size;i++){
			for(int q=0;q<C.length;q++){
				if(C[q]==0)
					continue;
				if(i==C[q])
					continue test;
			}
			B[j]=A[i];
			j++;
		}
		System.out.println(" ");
		System.out.print("Новый массив: ");
		for(int i=0;i<size;i++){
			System.out.print(B[i]+" ");
		}
	}
}