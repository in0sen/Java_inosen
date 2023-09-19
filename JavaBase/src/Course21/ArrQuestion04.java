package Course21;

import java.util.Scanner;

public class ArrQuestion04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		do {
			int a = 0;
			int b = 0;
			int c = 0;
			int e = 0;
			int h = 0;
			int i = 0;
			int irekae[] = new int[12];
			int large = 0;
			int goukei = 0;
			int henkou = 0;
			int typhoon[] = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };
			int quake[] = { 153, 127, 130, 109, 118, 164, 130, 103, 103, 104, 123, 141 };
			int rain[] = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };
			System.out.println("見たい情報を選んでください");
			System.out.println("１：台風件数　２：地震件数　３：降水量　４：すべて");
			while (a > 4 || a < 1) {
				if (a >= 5) {
					System.out.println("5以上、０以下は入力しないでね");
				}
				a = stdIn.nextInt();
			}
			if (a == 1) {
				System.out.println("年別か月別かを選んでください");
				System.out.println("１：年別　２：月別　３：月別(大きい順)");
				b = stdIn.nextInt();
				while (b > 3 || b < 1) {
					System.out.println("４以上、０以下は入力しないでね");
					b = stdIn.nextInt();
				}
				if (b == 1) {
					for (int d : typhoon) {
						goukei = goukei + d;
					}
					System.out.println("１年間に起こった台風の総合計は" + goukei + "です");
				} else {
					if (b == 2) {
						System.out.println("見たい月を入力してください");
						e = stdIn.nextInt();
						while (e > 12 || e < 1) {
							System.out.println("１３以上、０以下は入力しないでね");
							e = stdIn.nextInt();
						}
						System.out.println(typhoon[e - 1]);
					} else {
						for (a = 0; a < typhoon.length; a++) {
							irekae[a] = typhoon[a];
						}
						for (b = 0; b < typhoon.length; b++) {
							large = typhoon[b];
							for (c = typhoon.length - 1; b < c; c--) {
								if (typhoon[b] <= typhoon[c]) {
									typhoon[b] = typhoon[c];
									h = c;
									henkou++;
								}
							}
							if (henkou >= 1) {
								typhoon[h] = large;
								henkou = 0;
							}
						}
						System.out.println();
						for (e = 0; e < typhoon.length; e++) {
							for (i = 0; i < irekae.length; i++) {
								if (typhoon[e] == irekae[i]) {
									if (i + 1 < 10) {
										System.out.print(" ");
									}
									System.out.println(i + 1 + "月" + irekae[i]);
									irekae[i] = -(irekae[i] + 1);
									break;
								}
							}
						}
					}
				}
			} else {
				if (a == 2) {
					System.out.println("年別か月別かを選んでください");
					System.out.println("１：年別　２：月別　３：月別（大きい順");
					b = stdIn.nextInt();
					while (b > 3 || b < 1) {
						System.out.println("４以上、０以下は入力しないでね");
						b = stdIn.nextInt();
					}
					if (b == 1) {
						for (int d : quake) {
							goukei = goukei + d;
						}
						System.out.println("１年間に起こった地震の総合計は" + goukei + "です");
					} else {
						if (b == 2) {
							System.out.println("見たい月を入力してください");
							e = stdIn.nextInt();
							while (e > 12 || e < 1) {
								System.out.println("１３以上、０以下は入力しないでね");
								e = stdIn.nextInt();
							}
							System.out.println(e + "月の地震件数は" + quake[e - 1] + "です。");
						} else {
							for (a = 0; a < quake.length; a++) {
								irekae[a] = quake[a];
							}
							for (b = 0; b < quake.length; b++) {
								large = quake[b];
								for (c = quake.length - 1; b < c; c--) {
									if (quake[b] <= quake[c]) {
										quake[b] = quake[c];
										h = c;
										henkou++;
									}
								}
								if (henkou >= 1) {
									quake[h] = large;
									henkou = 0;
								}
							}
							for (e = 0; e < quake.length; e++) {
								for (i = 0; i < irekae.length; i++) {
									if (quake[e] == irekae[i]) {
										if (i + 1 < 10) {
											System.out.print(" ");
										}
										System.out.println(i + 1 + "月" + irekae[i]);
										irekae[i] = -(irekae[i] + 1);
										break;
									}
								}
							}
						}
					}
				} else {
					if (a == 3) {
						System.out.println("年別か月別かを選んでください");
						System.out.println("１：年別　２：月別　３：月別（大きい順）");
						b = stdIn.nextInt();
						while (b > 3 || b < 1) {
							System.out.println("４以上、０以下は入力しないでね");
							b = stdIn.nextInt();
						}
						if (b == 1) {
							for (int d : rain) {
								goukei = goukei + d;
							}
							System.out.println("１年間に起こった降水量の総合計は" + goukei + "です");
						} else {
							if (b == 2) {
								System.out.println("見たい月を入力してください");
								e = stdIn.nextInt();
								while (e > 12 || e < 1) {
									System.out.println("１３以上、０以下は入力しないでね");
									e = stdIn.nextInt();
								}
								System.out.println(e + "月の降水量は" + rain[e - 1] + "です。");
							} else {
								
								
								for (a = 0; a < rain.length; a++) {
									irekae[a] = rain[a];
								}
								
								
								for (b = 0; b < rain.length; b++) {
									large = rain[b];
									for (c = rain.length - 1; b < c; c--) {
										if (rain[b] <= rain[c]) {
											rain[b] = rain[c];
											h = c;
											henkou++;
										}
									}
									if (henkou >= 1) {
										rain[h] = large;
										henkou = 0;
									}
								}
								
								for (e = 0; e < rain.length; e++) {
									for (i = 0; i < irekae.length; i++) {
										if (rain[e] == irekae[i]) {
											if (i + 1 < 10) {
												System.out.print(" ");
											}
											System.out.println(i + 1 + "月" + irekae[i]);
											irekae[i] = -(irekae[i] + 1);
											break;
										}
									}
								}
							}
						}
					} else {
						System.out.println("台風");
						int tuki = 1;
						for (int taihuu : typhoon) {
							System.out.print(tuki + "月" + taihuu + " ");
							if (taihuu < 100) {
								System.out.print(" ");
							}
							if (taihuu < 10) {
								System.out.print(" ");
							}
							tuki++;
						}
						tuki = 1;
						System.out.println("\n地震");
						for (int jisinn : quake) {
							System.out.print(tuki + "月" + jisinn + " ");
							if (jisinn < 100) {
								System.out.print(" ");
							}
							if (jisinn < 10) {
								System.out.print(" ");
							}
							tuki++;
						}
						tuki = 1;
						System.out.println("\n雨");
						for (int ame : rain) {
							System.out.print(tuki + "月" + ame + " ");
							if (ame < 100) {
								System.out.print(" ");
							}
							if (ame < 10) {
								System.out.print(" ");
							}
							tuki++;
						}
					}
				}
			}
			System.out.println("\n\n１：再検索しますか？");
		} while (stdIn.nextInt() == 1);
	}
}