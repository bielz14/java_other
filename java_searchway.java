import java.util.ArrayList;
import java.util.Arrays;

public class eshe3 {
	static ArrayList<Integer> VSE = new ArrayList<Integer>();
	static ArrayList<Integer> DOB1 = new ArrayList<Integer>();
	static ArrayList<Integer> DOB2 = new ArrayList<Integer>();
	
	static ArrayList<Integer> way = new ArrayList<Integer>();

	public static void main(String[] args) {
		// Arrays.fill(vse, false);

		vyvod(61, 16);//08.10
		way=test2(61, 16, puti1);
		System.out.println(way);
	    //vyvod(61, 16, way);//08.10 

	}

	static int INF = Integer.MAX_VALUE / 2;
	static int vNum = 100;
	static int[][] graph = new int[10][10];
	static String[][] graph2 = new String[10][10];
	static boolean[] vse = new boolean[100];
	static int y = -1;

	public static void vyvod(int rrr, int ttt) {//(int rrr, int ttt, ArrayList<Integer> way) 08.10
		String s11 = Integer.toString(rrr).substring(0, 1);
		String s12 = Integer.toString(rrr).substring(1, 2);
		int si11 = Integer.parseInt(s11);
		int si12 = Integer.parseInt(s12);

		String s21 = Integer.toString(ttt).substring(0, 1);
		String s22 = Integer.toString(ttt).substring(1, 2);
		int si21 = Integer.parseInt(s21);
		int si22 = Integer.parseInt(s22);
        
		//int exemple = 0;//08.10
		//int number_all = 0;//08.10
        
		for (int i = 0; i < graph2.length; i++) {
			for (int j = 0; j < graph2[i].length; j++) {
				/*for(Integer element: way){//08.10
					String one_number = Integer.toString(i);//08.10
					String two_number = Integer.toString(j);//08.10
					number_all = Integer.parseInt(one_number + two_number);//08.10
					if(element == number_all){exemple = 1;break;}//08.10
				}*///08.10
				String element = "";
				element = "* ";
				//if(i == Integer.parseInt(Integer.toString(number_all).substring(0, 1)))element = "& ";//08.10
				//if(j == Integer.parseInt(Integer.toString(number_all).substring(1, 2)))element = "& ";//08.10
				if (i == si11 && j == si12)
					element = "& ";
				if (i == si21 && j == si22)
					element = "& ";
				//if(exemple!=1){//08.10
				if (i == 0 && j == 0)
					System.out.print("  ");
				if (i == 0 && j != 0)
					System.out.print(j + "  ");
				if (j == 0 && i != 0)
					System.out.print(i + " ");
				if (i != 0 && j != 0)
					System.out.print(element + " ");
				//if(exemple==1)exemple=0;//08.10
				//}//08.10*/
			}
			System.out.println();
		}
	}

	static int o = 0, prohodka = 0, konec = 0;
	static boolean off = false;
	static ArrayList<Integer> puti1 = new ArrayList<Integer>();
	static ArrayList<Integer> puti2 = new ArrayList<Integer>();

	public static ArrayList<Integer> test2(int chislo, int end, ArrayList<Integer> puti) {
		
		ArrayList<Integer> smejnie = new ArrayList<Integer>();
        
		for (int i = 10;; i += 10) {
			int poisk = chislo + i;
			puti.add(poisk);
			if (poisk == end) {
				puti.remove(puti.size() - 1);
				prohodka = 1;
				break;
			}
			String poiskSTR = Integer.toString(poisk);
			String poiskSMV = poiskSTR.substring(0, 1);
			int poiskINT = Integer.parseInt(poiskSMV);
			if (poiskINT == 9)
				break;
		}

		if (prohodka == 0) {
			puti.clear();
			for (int i = 10;; i += 10) {
				int poisk = chislo - i;
				puti.add(poisk);
				if (poisk == end) {
					puti.remove(puti.size() - 1);
					prohodka = 1;
					break;
				}
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(0, 1);
				int poiskINT = Integer.parseInt(poiskSMV);
				if(poiskSTR.length()==1 || poiskINT == 1)
					break;
			}
		}

		if (prohodka == 0) {
			puti.clear();
			for (int i = 1;; i++) {
				int poisk = chislo + i;
				puti.add(poisk);
				if (poisk == end) {
					puti.remove(puti.size() - 1);
					prohodka = 1;
					break;
				}
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(poiskSTR.length() - 1);
				int poiskINT = Integer.parseInt(poiskSMV);
				if (poiskINT == 9|| poiskINT == 0)
					break;
			}
		}

		if (prohodka == 0) {
			puti.clear();
			for (int i = 1;; i++) {
				int poisk = chislo - i;
				puti.add(poisk);
				if (poisk == end) {
					puti.remove(puti.size() - 1);
					prohodka = 1;
					break;
				}
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(poiskSTR.length() - 1);
				int poiskINT = Integer.parseInt(poiskSMV);
				if (poiskINT == 1 || poiskINT == 0)
					break;
			}
		}

		if (prohodka == 0) {
			puti.clear();
			for (int i = 9;; i += 9) {
				int poisk = chislo + i;
				puti.add(poisk);
				if (poisk == end) {
					puti.remove(puti.size() - 1);
					prohodka = 1;
					break;
				}
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(poiskSTR.length() - 1);
				int poiskINT = Integer.parseInt(poiskSMV);
				if (poiskINT == 1 || poiskINT == 0||poiskSTR.length()>2)
					break;
			}
		}

		if (prohodka == 0) {
			puti.clear();
			for (int i = 9;; i += 9) {
				int poisk = chislo - i;
				puti.add(poisk);
				if (poisk == end) {
					puti.remove(puti.size() - 1);
					prohodka = 1;
					break;
				}
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(0, 1);
				String poiskSMV2 = poiskSTR.substring(poiskSTR.length() - 1);
				int poiskINT = Integer.parseInt(poiskSMV);
				int poiskINT2 = Integer.parseInt(poiskSMV2);
				if (poiskINT == 1 || poiskSTR.length() == 1 || poiskINT2 == 0)
					break;
			}
		}

		if (prohodka == 0) {
			puti.clear();
			for (int i = 11;; i += 11) {
				int poisk = chislo + i;
				puti.add(poisk);
				if (poisk == end) {
					puti.remove(puti.size() - 1);
					prohodka = 1;
					break;
				}
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(0, 1);
				String poiskSMV2 = poiskSTR.substring(poiskSTR.length() - 1);
				int poiskINT = Integer.parseInt(poiskSMV);
				int poiskINT2 = Integer.parseInt(poiskSMV2);
				if (poiskINT == 9||poiskSTR.length()>2 || poiskINT2 == 0){
					break;
				}
			}
		}
            		
		if (prohodka == 0) {
			puti.clear();
			for (int i = 11;; i += 11) {
				int poisk = chislo - i;
				puti.add(poisk);
				if (poisk == end) {
					puti.remove(puti.size() - 1);
					prohodka = 1;
					break;
				}
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(0, 1);
				String poiskSMV2 = poiskSTR.substring(poiskSTR.length() - 1);
				int poiskINT = Integer.parseInt(poiskSMV);
				int poiskINT2 = Integer.parseInt(poiskSMV2);
				if (poiskINT == 1 || poiskSTR.length()==1 || poiskINT2 == 0)
					break;
			}
		}
		//////////////////////////////////////////////////////////////////////
		int konec = 0;
		ArrayList<Integer> srPuti = new ArrayList<Integer>();
		srPuti.addAll(puti);
		if (prohodka == 0) {
			puti.clear();
			for (int i = 11;; i += 11) {
				int poisk = chislo + i;
				puti.add(poisk);
				int smv1 = Integer.parseInt(Integer.toString(poisk).substring(0, 1));
				int smvEnd1 = Integer.parseInt(Integer.toString(end).substring(0, 1));
				
				int smv2 = Integer.parseInt(Integer.toString(poisk).substring(Integer.toString(poisk).length()-1));
				int smvEnd2 = Integer.parseInt(Integer.toString(end).substring(Integer.toString(end).length()-1));
				
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(0, 1);
				String poiskSMV2 = poiskSTR.substring(poiskSTR.length()-1);
				int poiskINT = Integer.parseInt(poiskSMV);
				int poiskINT2 = Integer.parseInt(poiskSMV2);
				if (poiskSTR.length()>2||poiskINT2 == 0){
					puti.clear();
					break;
				}
				if (smv1 == smvEnd1 || smv2 == smvEnd2) {
					konec = 1;
					test2(poisk, end, puti2);
				}
				if (konec == 1)
					break;
			}
			konec = 0;
			prohodka=0;
			srPuti.addAll(puti);
			srPuti.addAll(puti2);
		}
		
		if (prohodka == 0) {
			//int x = puti.size();
			//int h = puti2.size();
			//if(x!=0&&h!=0)srPuti.clear();
			ArrayList<Integer> srPuti2 = new ArrayList<Integer>();
			//srPuti.addAll(puti);
			//srPuti.addAll(puti2);
			puti.clear();
			puti2.clear();
			for (int i = 11;; i += 11) {
				int poisk = chislo - i;
				puti.add(poisk);
				int smv1 = Integer.parseInt(Integer.toString(poisk).substring(0, 1));
				int smvEnd1 = Integer.parseInt(Integer.toString(end).substring(0, 1));
				int smv2 = Integer.parseInt(Integer.toString(poisk).substring(Integer.toString(poisk).length()-1));
				int smvEnd2 = Integer.parseInt(Integer.toString(end).substring(Integer.toString(end).length()-1));
				
				
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(0, 1);
				String poiskSMV2 = poiskSTR.substring(poiskSTR.length()-1);
				int poiskINT = Integer.parseInt(poiskSMV);
				int poiskINT2 = Integer.parseInt(poiskSMV2);
				if (poiskSTR.length()<2||poiskINT2==0){
				   puti.clear();
				   break;	
				}
				if (smv1 == smvEnd1 || smv2 == smvEnd2) {
					konec = 1;
					test2(poisk, end, puti2);
				}
				if (konec == 1)
					break;
			}
			srPuti2.addAll(puti2);
			srPuti2.addAll(puti);
			
			int s1 = srPuti.size();
			int s2 = srPuti2.size();
			
			if (s1 > s2&&s2!=0) {
				srPuti.clear();
				srPuti.addAll(srPuti2);
			} 
		   if(s1==0){
			   srPuti.addAll(srPuti2);
		   }
			konec = 0;
			prohodka=0;
		}
		
		if (prohodka == 0) {//
			//int x = puti.size();
			//int h = puti2.size();
			//if(x!=0||h!=0)srPuti.clear();
			ArrayList<Integer> srPuti2 = new ArrayList<Integer>();
			//srPuti.addAll(puti);
			//srPuti.addAll(puti2);
			puti.clear();
			puti2.clear();
			for (int i = 10;; i += 10) {
				int poisk = chislo + i;
				puti.add(poisk);
				int smv1 = Integer.parseInt(Integer.toString(poisk).substring(0, 1));
				int smvEnd1 = Integer.parseInt(Integer.toString(end).substring(0, 1));
				
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(0, 1);
				int poiskINT = Integer.parseInt(poiskSMV);
				if (poiskSTR.length()>2){
				   puti.clear();
				   break;
				}
				if (smv1 == smvEnd1) {
					konec = 1;
					test2(poisk, end, puti2);
				}
				if (konec == 1)
					break;
			}
			srPuti2.addAll(puti2);
			srPuti2.addAll(puti);
			
			int s1 = srPuti.size();
			int s2 = srPuti2.size();
			
			if (s1 > s2&&s2!=0) {
				srPuti.clear();
				srPuti.addAll(srPuti2);
			} 
		   if(s1==0){
			   srPuti.addAll(srPuti2);
		   }
			konec = 0;
			prohodka=0;
		}
		
		if (prohodka == 0) {
		    //int x = puti.size();
			//int h = puti2.size();
			//if(x!=0&&h!=0)srPuti.clear();
			ArrayList<Integer> srPuti2 = new ArrayList<Integer>();
			//srPuti.addAll(puti);
			//srPuti.addAll(puti2);
			puti.clear();
			puti2.clear();
			for (int i = 10;; i += 10) {
				int poisk = chislo - i;
				puti.add(poisk);
				int smv1 = Integer.parseInt(Integer.toString(poisk).substring(0, 1));
				int smvEnd1 = Integer.parseInt(Integer.toString(end).substring(0, 1));
				
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(0, 1);
				int poiskINT = Integer.parseInt(poiskSMV);
				if(poiskSTR.length()==1){
					puti.clear();
					break;
				}
				if (smv1 == smvEnd1) {
					konec = 1;
					test2(poisk, end, puti2);
				}
				if (konec == 1)
					break;
			}
			srPuti2.addAll(puti2);
			srPuti2.addAll(puti);
			
			int s1 = srPuti.size();
			int s2 = srPuti2.size();
			
			if (s1 > s2&&s2!=0) {
				srPuti.clear();
				srPuti.addAll(srPuti2);
			} 
		   if(s1==0){
			   srPuti.addAll(srPuti2);
		   }
			konec = 0;
			prohodka=0;
		}
		
		if (prohodka == 0) {
			//int x = puti.size();
			//int h = puti2.size();
			//if(x!=0&&h!=0)srPuti.clear();
			ArrayList<Integer> srPuti2 = new ArrayList<Integer>();
			//srPuti.addAll(puti);
			//srPuti.addAll(puti2);
			puti.clear();
			puti2.clear();
			for (int i = 1;; i++) {
				int poisk = chislo + i;
				puti.add(poisk);
				int smv1 = Integer.parseInt(Integer.toString(poisk).substring(0, 1));
				int smvEnd1 = Integer.parseInt(Integer.toString(end).substring(0, 1));
				
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(poiskSTR.length() - 1);
				int poiskINT = Integer.parseInt(poiskSMV);
				if (poiskINT == 0){
					puti.clear();
					break;
				}
				if (smv1 == smvEnd1) {
					konec = 1;
					test2(poisk, end, puti2);
				}
				if (konec == 1)
					break;
			}
			srPuti2.addAll(puti2);
			srPuti2.addAll(puti);
			 
			int s1 = srPuti.size();
			int s2 = srPuti2.size();
			
			if (s1 > s2&&s2!=0) {
				srPuti.clear();
				srPuti.addAll(srPuti2);
			} 
		   if(s1==0){
			   srPuti.addAll(srPuti2);
		   }
			konec = 0;
			prohodka=0;
		}
		
		if (prohodka == 0) {
			//int x = puti.size();
			//int h = puti2.size();
			//if(x!=0&&h!=0)srPuti.clear();
			ArrayList<Integer> srPuti2 = new ArrayList<Integer>();
			//srPuti.addAll(puti);
			//srPuti.addAll(puti2);
			puti.clear();
			puti2.clear();
			for (int i = 1;; i++) {
				int poisk = chislo - i;
				puti.add(poisk);
				int smv1 = Integer.parseInt(Integer.toString(poisk).substring(0, 1));
				int smvEnd1 = Integer.parseInt(Integer.toString(end).substring(0, 1));
				
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(poiskSTR.length() - 1);
				int poiskINT = Integer.parseInt(poiskSMV);
				if (poiskINT == 0){
					puti.clear();
					break;
				}
				if (smv1 == smvEnd1) {
					konec = 1;
					test2(poisk, end, puti2);
				}
				if (konec == 1)
					break;
			}
			srPuti2.addAll(puti2);
			srPuti2.addAll(puti);
			
			int s1 = srPuti.size();
			int s2 = srPuti2.size();
			
			if (s1 > s2&&s2!=0) {
				srPuti.clear();
				srPuti.addAll(srPuti2);
			} 
		   if(s1==0){
			   srPuti.addAll(srPuti2);
		   }
			konec = 0;
			prohodka=0;
		}
		
		if (prohodka == 0) {/////
			//int x = puti.size();
			//int h = puti2.size();
			//if(x!=0&&h!=0)srPuti.clear();
			ArrayList<Integer> srPuti2 = new ArrayList<Integer>();
			//srPuti.addAll(puti);
			//srPuti.addAll(puti2);
			puti.clear();
			puti2.clear();
			for (int i = 9;; i+=9) {
				int poisk = chislo + i;
				puti.add(poisk);
				int smv1 = Integer.parseInt(Integer.toString(poisk).substring(0, 1));
				int smvEnd1 = Integer.parseInt(Integer.toString(end).substring(0, 1));
				
				int smv2 = Integer.parseInt(Integer.toString(poisk).substring(Integer.toString(poisk).length()-1));
				int smvEnd2 = Integer.parseInt(Integer.toString(end).substring(Integer.toString(end).length()-1));
				
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(poiskSTR.length() - 1);
				int poiskINT = Integer.parseInt(poiskSMV);
				if (poiskINT == 0||poiskSTR.length()>2){
					puti.clear();
					break;
				}
				if (smv1 == smvEnd1 || smv2 == smvEnd2) {
					konec = 1;
					test2(poisk, end, puti2);
				}

				if (konec == 1)
					break;
			}
			srPuti2.addAll(puti2);
			srPuti2.addAll(puti);
			
			int s1 = srPuti.size();
			int s2 = srPuti2.size();
			
			if (s1 > s2&&s2!=0) {
				srPuti.clear();
				srPuti.addAll(srPuti2);
			} 
		   if(s1==0){
			   srPuti.addAll(srPuti2);
		   }
			konec = 0;
			prohodka=0;
		}/////
		
		if (prohodka == 0) {
			//int x = puti.size();
			//int h = puti2.size();
			//if(x!=0&&h!=0)srPuti.clear();
			ArrayList<Integer> srPuti2 = new ArrayList<Integer>();
			//srPuti.addAll(puti);
			//srPuti.addAll(puti2);
			puti.clear();
			puti2.clear();
			for (int i = 9;; i+=9) {
				int poisk = chislo - i;
				puti.add(poisk);
				int smv1 = Integer.parseInt(Integer.toString(poisk).substring(0, 1));
				int smvEnd1 = Integer.parseInt(Integer.toString(end).substring(0, 1));

				int smv2 = Integer.parseInt(Integer.toString(poisk).substring(Integer.toString(poisk).length()-1));
				int smvEnd2 = Integer.parseInt(Integer.toString(end).substring(Integer.toString(end).length()-1));
				
				String poiskSTR = Integer.toString(poisk);
				String poiskSMV = poiskSTR.substring(0, 1);
				String poiskSMV2 = poiskSTR.substring(poiskSTR.length() - 1);
				int poiskINT = Integer.parseInt(poiskSMV);
				int poiskINT2 = Integer.parseInt(poiskSMV2);
				if (poiskSTR.length() < 2 || poiskINT2 == 0){
				   puti.clear();
				   break;
				}
				if (smv1 == smvEnd1 || smv2 == smvEnd2) {
					konec = 1;
					test2(poisk, end, puti2);
				}
				if (konec == 1)
					break;
			}
			srPuti2.addAll(puti2);
			srPuti2.addAll(puti);
			
			int s1 = srPuti.size();
			int s2 = srPuti2.size();
			
			if (s1 > s2&&s2!=0) {
				srPuti.clear();
				srPuti.addAll(srPuti2);
			} 
		   if(s1==0){
			   srPuti.addAll(srPuti2);
		   }
			konec = 0;
			prohodka=0;
		}
		
		return srPuti;
	}

	public static void test(int chislo, int end) {// ArrayList<Integer>
		vse[chislo] = true; // DOB, int
		// one_two)
		// {

		ArrayList<Integer> smejnie = new ArrayList<Integer>();
		ArrayList<Integer> puti = new ArrayList<Integer>();

		int deystvie = 0;

		int i1 = j(chislo, 1);
		int j1 = j(chislo, 0);

		int i2 = j(end, 1);
		int j2 = j(end, 0);

		smejnie = smej(graph, i1, j1);
		for (int i = 0; i < smejnie.size(); i++) {
			int smejnaya = smejnie.get(i);
			vse[smejnaya] = true;
			int i3 = j(smejnaya, 1);
			int j3 = j(smejnaya, 0);
			if (i3 == i2 && j3 == j2) {
				puti.add(smejnaya);
				deystvie = 1;
				break;
			}
		}

		if (deystvie == 0) {
			ArrayList<Integer> kv = new ArrayList<Integer>();
			for (int i = 0; i < smejnie.size(); i++) {
				delo(smejnie.get(i), puti, i2, j2);
				if (konec == 0) {
					int i4 = j(smejnie.get(i), 1);
					int j4 = j(smejnie.get(i), 0);
					ArrayList<Integer> smejnie2 = smej(graph, i4, j4);
					for (int j = 0; j < smejnie2.size(); j++) {
						// vse[smejnie2.get(i)] = true;
						int i5 = j(smejnie2.get(j), 1);
						int j5 = j(smejnie2.get(j), 0);
						if (i5 == i2 && j5 == j2) {
							puti.clear();
							puti.add(smejnie.get(i));
							puti.add(smejnie2.get(j));
							deystvie = 1;
							break;
						}
						if (!vse[smejnie2.get(j)]) {
							kv.add(smejnie2.get(j));
							vse[smejnie2.get(j)] = true;
						}
					}
				}
				int l = 0, m = 0;
				ArrayList<Integer> kv2 = new ArrayList<Integer>();
				if (konec == 1) {
					int z = puti.get(0);
					System.out.println(puti);
					for (int g = 0; g < kv.size(); g++) {
						String bb = Integer.toString(kv.get(g));
						for (int b = 0; b < kv.size(); b++) {
							String bb2 = Integer.toString(kv.get(g + 1));
							if (bb.substring(0, 1) == bb2.substring(0, 1)) {
								l = Integer.parseInt(bb.substring(0, 1));
								m = 1;
								break;
							}
						}
					}
					System.out.println(m);
					if (m == 1) {
						for (int c = 0; c < kv.size(); c++) {
							String tr = Integer.toString(kv.get(c)).substring(0, 1);
							int si = kv.size();
							if (tr.equals(l)) {
								if (kv2.get(si - 1) != kv.get(c) - 10) {
									kv2.add(kv.get(c) - 10);
								}
							}
							if (!tr.equals(l)) {
								if (kv2.get(si - 1) != kv.get(c) - 1) {
									kv2.add(kv.get(c) - 1);
								}
							}
							System.out.println(kv2);
						}
					}
				}
			}
		}
	}
	/*
	 * if (sposob == 1) { smejnie = smej(graph, i1, j1); for (int i = 0; i <
	 * smejnie.size(); i++) { int smejnaya = smejnie.get(i); // int i3 =
	 * j(smejnaya, 1); // int j3 = j(smejnaya, 0); for (;;) {// smejnaya += 1;
	 * puti.add(smejnaya); int i4 = j(smejnaya, 1); int j4 = j(smejnaya, 0); if
	 * (i4 == i2 && j4 == j2) { off = true; prohodka = 1; konec = 1; break; }
	 * double proverka = smejnaya % 10; if (proverka == 0) { off = true; //
	 * prohodka = 1; konec = 1; break; } // проходка ниже не происходит } // //
	 * System.out.println(prohodka); if (prohodka == 0) { puti.clear(); for (;;)
	 * { smejnaya -= 1; puti.add(smejnaya); int i4 = j(smejnaya, 1); int j4 =
	 * j(smejnaya, 0); if (i4 == i2 && j4 == j2) { off = true; prohodka = 1;
	 * konec = 1; break; } double proverka = (smejnaya - 1) % 10; if (proverka
	 * == 0) { off = true; // prohodka = 1; konec = 1; break; } } }
	 * 
	 * if (prohodka == 0) { puti.clear(); for (;;) { smejnaya += 9;
	 * puti.add(smejnaya); int i4 = j(smejnaya, 1); int j4 = j(smejnaya, 0); if
	 * (i4 == i2 && j4 == j2) { off = true; prohodka = 1; konec = 1; break; } if
	 * (i4 == 1) { off = true; // prohodka = 1; konec = 1; break; } } }
	 * 
	 * if (prohodka == 0) { puti.clear(); for (;;) { smejnaya -= 9;
	 * puti.add(smejnaya); int i4 = j(smejnaya, 1); int j4 = j(smejnaya, 0); if
	 * (i4 == i2 && j4 == j2) { off = true; prohodka = 1; konec = 1; break; } if
	 * (i4 == 9) { off = true; // prohodka = 1; konec = 1; break; } } }
	 * 
	 * if (prohodka == 0) { puti.clear(); for (;;) { smejnaya += 10;
	 * puti.add(smejnaya); int i4 = j(smejnaya, 1); int j4 = j(smejnaya, 0); if
	 * (i4 == i2 && j4 == j2) { off = true; prohodka = 1; konec = 1; break; } if
	 * (i4 == 8) { off = true; // prohodka = 1; konec = 1; break; } } }
	 * 
	 * if (prohodka == 0) { puti.clear(); for (;;) { smejnaya -= 10;
	 * puti.add(smejnaya); int i4 = j(smejnaya, 1); int j4 = j(smejnaya, 0); if
	 * (i4 == i2 && j4 == j2) { off = true; prohodka = 1; konec = 1; break; } if
	 * (i4 == 1) { off = true; // prohodka = 1; konec = 1; break; } } }
	 * 
	 * if (prohodka == 0) { puti.clear(); for (;;) { smejnaya += 11;
	 * puti.add(smejnaya); int i4 = j(smejnaya, 1); int j4 = j(smejnaya, 0); if
	 * (i4 == i2 && j4 == j2) { off = true; prohodka = 1; konec = 1; break; } if
	 * (i4 == 8) { off = true; // prohodka = 1; konec = 1; break; } } }
	 * 
	 * if (prohodka == 0) { puti.clear(); for (;;) { smejnaya -= 11;
	 * puti.add(smejnaya); int i4 = j(smejnaya, 1); int j4 = j(smejnaya, 0); if
	 * (i4 == i2 && j4 == j2) { off = true; prohodka = 1; konec = 1; break; } if
	 * (i4 == 1) { off = true; // prohodka = 1; konec = 1; break; } } } if
	 * (konec == 1) break; o = 1; } if (o == 1) { smejnie.clear(); smejnie =
	 * smej(graph, i1, j1); for (int i = 0; i < smejnie.size(); i++) { int
	 * smejnaya = smejnie.get(i); boolean mesnayaProverka = test(smejnaya, end,
	 * 1); if (mesnayaProverka == true) break; } } }
	 */
	// System.out.println(puti);
	// return off;
	// }

	public static void delo(int smejnaya, ArrayList<Integer> puti, int i2, int j2) {
		for (;;) {//
			smejnaya += 1;
			puti.add(smejnaya);
			int i4 = j(smejnaya, 1);
			int j4 = j(smejnaya, 0);
			if (i4 == i2 && j4 == j2) {
				off = true;
				prohodka = 1;
				konec = 1;
				break;
			}
			double proverka = smejnaya % 10;
			if (proverka == 0) {
				off = true;
				// prohodka = 1;
				konec = 1;
				break;
			}
			// проходка ниже не происходит
		} //
			// System.out.println(prohodka);
		if (prohodka == 0) {
			puti.clear();
			for (;;) {
				smejnaya -= 1;
				puti.add(smejnaya);
				int i4 = j(smejnaya, 1);
				int j4 = j(smejnaya, 0);
				if (i4 == i2 && j4 == j2) {
					off = true;
					prohodka = 1;
					konec = 1;
					break;
				}
				double proverka = (smejnaya - 1) % 10;
				if (proverka == 0) {
					off = true;
					// prohodka = 1;
					konec = 1;
					break;
				}
			}
		}

		if (prohodka == 0) {
			puti.clear();
			for (;;) {
				smejnaya += 9;
				puti.add(smejnaya);
				int i4 = j(smejnaya, 1);
				int j4 = j(smejnaya, 0);
				if (i4 == i2 && j4 == j2) {
					off = true;
					prohodka = 1;
					konec = 1;
					break;
				}
				if (i4 == 1) {
					off = true;
					// prohodka = 1;
					konec = 1;
					break;
				}
			}
		}

		if (prohodka == 0) {
			puti.clear();
			for (;;) {
				smejnaya -= 9;
				puti.add(smejnaya);
				int i4 = j(smejnaya, 1);
				int j4 = j(smejnaya, 0);
				if (i4 == i2 && j4 == j2) {
					off = true;
					prohodka = 1;
					konec = 1;
					break;
				}
				if (i4 == 9) {
					off = true;
					// prohodka = 1;
					konec = 1;
					break;
				}
			}
		}

		if (prohodka == 0) {
			puti.clear();
			for (;;) {
				smejnaya += 10;
				puti.add(smejnaya);
				int i4 = j(smejnaya, 1);
				int j4 = j(smejnaya, 0);
				if (i4 == i2 && j4 == j2) {
					off = true;
					prohodka = 1;
					konec = 1;
					break;
				}
				if (i4 == 8) {
					off = true;
					// prohodka = 1;
					konec = 1;
					break;
				}
			}
		}

		if (prohodka == 0) {
			puti.clear();
			for (;;) {
				smejnaya -= 10;
				puti.add(smejnaya);
				int i4 = j(smejnaya, 1);
				int j4 = j(smejnaya, 0);
				if (i4 == i2 && j4 == j2) {
					off = true;
					prohodka = 1;
					konec = 1;
					break;
				}
				if (i4 == 1) {
					off = true;
					// prohodka = 1;
					konec = 1;
					break;
				}
			}
		}

		if (prohodka == 0) {
			puti.clear();
			for (;;) {
				smejnaya += 11;
				puti.add(smejnaya);
				int i4 = j(smejnaya, 1);
				int j4 = j(smejnaya, 0);
				if (i4 == i2 && j4 == j2) {
					off = true;
					prohodka = 1;
					konec = 1;
					break;
				}
				if (i4 == 8) {
					off = true;
					// prohodka = 1;
					konec = 1;
					break;
				}
			}
		}

		if (prohodka == 0) {
			puti.clear();
			for (;;) {
				smejnaya -= 11;
				puti.add(smejnaya);
				int i4 = j(smejnaya, 1);
				int j4 = j(smejnaya, 0);
				if (i4 == i2 && j4 == j2) {
					off = true;
					prohodka = 1;
					konec = 1;
					break;
				}
				if (i4 == 1) {
					off = true;
					// prohodka = 1;
					konec = 1;
					break;
				}
			}
		}
	}

	/*
	 * ArrayList<Integer> bolee = new ArrayList<Integer>();
	 * 
	 * smejnie = smej(graph, i1, j1);
	 * 
	 * for (int i = 0; i < smejnie.size(); i++) { int smejnaya = smejnie.get(i);
	 * int i3 = j(smejnaya, 1); int j3 = j(smejnaya, 0); if (i3 == i2 && j3 ==
	 * j2) { deystvie = 1; y++; if (one_two == 0) break; if (one_two == 1) { int
	 * z = 0; for (int element1 : DOB1) { z += element1; } int d = 0; for (int
	 * element1 : DOB2) { d += element1; } if (z > d) { bolee.addAll(DOB1); }
	 * 
	 * if (d > z) { bolee.addAll(DOB2); } break; } }
	 * 
	 * if (one_two == 1){
	 * 
	 * }
	 * 
	 * if (deystvie == 0) { DOB.add(chislo); test(smejnaya, end, DOB1, 0); } if
	 * (deystvie == 1) { int i4 = j(chislo, 1); int j4 = j(chislo, 0); smejnie =
	 * smej(graph, i1, j1); int x = smejnie.get(y); test(x, end, DOB2, 1); } }
	 */

	public static void metod(int one, int two) {
		String qza = Integer.toString(one).substring(0, 1);
		String dza = Integer.toString(two).substring(0, 1);
		String qza1 = Integer.toString(one).substring(1, 2);
		String dza1 = Integer.toString(two).substring(1, 2);
		int vc = Integer.parseInt(qza1);
		int vd = Integer.parseInt(dza1);
		if (vc < vd) {
			int vremennaya = one;
			one = two;
			two = vremennaya;
		}
		if (!qza.equals(dza) && !qza1.equals(dza1)) {
			ArrayList<Integer> AL1 = new ArrayList<Integer>();
			int ii = j(one, 1);
			int jj = j(one, 0);
			m(graph, 2);
			AL1 = smej(graph, ii, jj);
			ArrayList<Integer> AL2 = new ArrayList<Integer>();
			int zz = j(two, 1);
			int kk = j(two, 0);
			m(graph, 2);
			AL2 = smej(graph, zz, kk);
			rec(AL1, two);
		}
		if (qza.equals(dza)) {
			for (;;) {
				if (two > one) {
					one++;
					AL4.add(one);
				}
				if (two < one) {
					one--;
					AL4.add(one);
				}
				if (one == two - 1)
					break;
			}
		}
		if (qza1.equals(dza1)) {
			for (;;) {
				if (two > one) {
					one += 10;
					AL4.add(one);
				}
				if (two < one) {
					one -= 10;
					AL4.add(one);
				}
				if (one == two - 10)
					break;
			}
		}
	}

	static ArrayList<Integer> AL4 = new ArrayList<Integer>();
	static int proverka = 0;

	public static void rec(ArrayList<Integer> AL1, int two) {
		int dobav = 0;
		ArrayList<Integer> AL3 = new ArrayList<Integer>();
		int cx = 0;
		int y = AL1.size();
		for (int a : AL1) {
			cx++;
			int gg = j(a, 1);
			int ff = j(a, 0);
			m(graph, 2);
			AL3 = smej(graph, gg, ff);
			for (int v : AL3) {
				if (two == v) {
					VSE.add(a);
					dobav = 1;
					break;
				}
			}
			if (dobav == 1)
				break;
			if (dobav == 0 && cx == y) {
				String qa = Integer.toString(two).substring(0, 1);
				String da = Integer.toString(a).substring(0, 1);
				if (qa.equals(da)) {
					proverka = 1;
					for (;;) {
						if (two > a) {
							AL4.add(a);
							a++;
						}
						if (two < a) {
							AL4.add(a);
							a--;
						}
						if (a == two)
							break;
					}
				}

				String qa1 = Integer.toString(two).substring(1, 2);
				String da1 = Integer.toString(a).substring(1, 2);
				if (qa1.equals(da1)) {
					proverka = 1;
					for (;;) {
						if (two > a) {
							AL4.add(a);
							a += 10;
						}
						if (two < a) {
							AL4.add(a);
							a -= 10;
						}
						if (a == two)
							break;
					}
				}

				if (proverka == 0)
					AL4.add(a);
			}
		}
		if (dobav == 0) {
			rec(AL3, two);
		}
	}

	static void dijkstra(int start) {
		start -= 1;
		int z = 0, k = 0;
		int ii = j(start, 1);
		int jj = j(start, 0);
		smej(graph, ii, jj);
		boolean[] used = new boolean[vNum];
		int[] dist = new int[vNum];
		Arrays.fill(dist, INF);
		dist[start] = 0;
		for (;;) {
			int v = -1;
			for (int nv = 0; nv < vNum; nv++)
				if (!used[nv] && dist[nv] < INF && (v == -1 || dist[v] > dist[nv]))
					v = nv;
			if (v == -1)
				break;
			used[v] = true;
			for (int nv = 0; nv < vNum; nv++) {
				if (!used[nv]) {
					z = j(nv, 1);
					k = j(nv, 0);
					if (graph[z][k] != 0) {
						dist[nv] = Math.min(dist[nv], dist[v] + graph[z][k]);
					}
				}
			}
		}

	}

	public static void m(int[][] graph2, int h) {
		if (h == 1) {
			int z = 0;
			for (int i = 0; i < graph2.length; i++) {
				for (int j = 0; j < graph2.length; j++) {
					z++;
					graph2[i][j] = z;
				}
			}
		}
		if (h == 2) {
			for (int i = 0; i < graph.length; i++) {
				for (int j = 0; j < graph.length; j++) {
					if (i != 0 && j != 0)
						graph[i][j] = 0;
					if (i == 0)
						graph[i][j] = j;
					if (j == 0)
						graph[i][j] = i;
				}
			}
		}
	}

	public static int j(int start, int iz) {
		int length = 0, ii = 0, jj = 0;
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				if (length == start) {
					ii = i;
					jj = j;
					length++;
					break;
				}
				length++;
			}
			if (length + 1 == start)
				;
		}
		if (iz == 1)
			return ii;
		else
			return jj;
	}

	public static ArrayList smej(int[][] graph, int ii, int jj) {
		String index = Integer.toString(ii) + Integer.toString(jj);
		int indexFinal = Integer.parseInt(index);
		ArrayList<Integer> AL = new ArrayList<Integer>();
		if (ii != 1 && jj != 1 && jj != 9 && ii != 0 && jj != 0) {
			int index1m = indexFinal - 1;
			AL.add(index1m);
			one(index1m);
			int index1p = indexFinal + 1;
			AL.add(index1p);
			one(index1p);
			int index9m = indexFinal - 9;
			AL.add(index9m);
			one(index9m);
			int index9p = indexFinal + 9;
			AL.add(index9p);
			one(index9p);
			int index10m = indexFinal - 10;
			AL.add(index10m);
			one(index10m);
			int index10p = indexFinal + 10;
			AL.add(index10p);
			one(index10p);
			int index11m = indexFinal - 11;
			AL.add(index11m);
			one(index11m);
			int index11p = indexFinal + 11;
			AL.add(index11p);
			one(index11p);
		}
		if (ii != 1 && jj == 9 && ii != 0 && jj != 0) {
			int index1m = indexFinal - 1;
			AL.add(index1m);
			one(index1m);
			int index1p = indexFinal + 1;
			// one(index1p);
			int index9m = indexFinal - 9;
			// one(index9m);
			int index9p = indexFinal + 9;
			AL.add(index9p);
			one(index9p);
			int index10m = indexFinal - 10;
			AL.add(index10m);
			one(index10m);
			int index10p = indexFinal + 10;
			AL.add(index10p);
			one(index10p);
			int index11m = indexFinal - 11;
			AL.add(index11m);
			one(index11m);
			int index11p = indexFinal + 11;
			// one(index11p);
		}
		if (ii == 1 && jj == 1 && ii != 0 && jj != 0) {
			int index1p = indexFinal + 1;
			AL.add(index1p);
			one(index1p);
			int index10m = indexFinal - 10;
			AL.add(index10m);
			one(index10m);
			int index10p = indexFinal + 10;
			AL.add(index10p);
			one(index10p);
			int index11m = indexFinal - 11;
			AL.add(index11m);
			one(index11m);
			int index11p = indexFinal + 11;
			AL.add(index11p);
			one(index11p);
		}
		if (ii == 1 && jj > 1 && jj != 9 && ii != 0 && jj != 0) {
			int index1m = indexFinal - 1;
			AL.add(index1m);
			one(index1m);
			int index1p = indexFinal + 1;
			AL.add(index1p);
			one(index1p);
			int index9m = indexFinal - 9;
			// one(index9m);
			int index9p = indexFinal + 9;
			AL.add(index9p);
			one(index9p);
			int index10m = indexFinal - 10;
			// one(index10m);
			int index10p = indexFinal + 10;
			AL.add(index10p);
			one(index10p);
			int index11m = indexFinal - 11;
			// one(index11m);
			int index11p = indexFinal + 11;
			AL.add(index11p);
			one(index11p);
		}
		if (ii == 1 && jj == 9 && ii != 0 && jj != 0) {
			int index1m = indexFinal - 1;
			AL.add(index1m);
			one(index1m);
			int index1p = indexFinal + 1;
			// one(index1p);
			int index9m = indexFinal - 9;
			// one(index9m);
			int index9p = indexFinal + 9;
			AL.add(index9p);
			one(index9p);
			int index10m = indexFinal - 10;
			// one(index10m);
			int index10p = indexFinal + 10;
			AL.add(index10p);
			one(index10p);
			int index11m = indexFinal - 11;
			// one(index11m);
			int index11p = indexFinal + 11;
			// one(index11p);
		}
		if (ii != 1 && jj == 1 && jj != 0) {
			int index1m = indexFinal - 1;
			// one(index1m);
			int index1p = indexFinal + 1;
			AL.add(index1p);
			one(index1p);
			int index9m = indexFinal - 9;
			AL.add(index9m);
			one(index9m);
			int index9p = indexFinal + 9;
			// one(index9p);
			int index10m = indexFinal - 10;
			AL.add(index10m);
			one(index10m);
			int index10p = indexFinal + 10;
			AL.add(index10p);
			one(index10p);
			int index11m = indexFinal - 11;
			// one(index11m);
			int index11p = indexFinal + 11;
			AL.add(index11p);
			one(index11p);
		}
		return AL;
	}

	public static void one(int index) {
		String all = Integer.toString(index);
		if (all.length() == 2) {
			int i = Integer.parseInt(all.substring(0, 1));
			int j = Integer.parseInt(all.substring(1, 2));
			graph[i][j] = 1;
		}
		if (all.length() == 1) {
			StringBuffer SB = new StringBuffer();
			SB.append(all);
			SB.insert(0, 0);
			int i = Integer.parseInt(SB.substring(0, 1));
			int j = Integer.parseInt(SB.substring(1, 2));
			graph[i][j] = 1;
		}
	}
}