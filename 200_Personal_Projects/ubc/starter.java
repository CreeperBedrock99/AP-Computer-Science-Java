/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static boolean stringInArray(String input, String [] arr){
		for (int i = 0; i < arr.length; i++){
			if (input.equals(arr[i])){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		// This is my extra credit project
		Scanner sc = new Scanner(System.in);
		System.out.print("Welcome to the emoticon creator, where you can create an emoticon.\nHere, you can create an emoticon by selecting the eyes, mouth and other optional parts of an emoticon.\nReady to create some emoticons? (y/n): ");
		String ready = sc.nextLine();
		while (!ready.equals("no") || !ready.equals("No") || !ready.equals("n") || !ready.equals("N")){
			if (ready.equals("yes") || ready.equals("Yes") || ready.equals("y") || ready.equals("Y")){
				String orientation = "";
				String eyes = "";
				String [] eyesVert = new String[] {":", "=", "X", "<", ";", "B", "8"};
				String [] eyesHoriz = new String[] {"0", "U", "V", "-", "T", "$", "O", "o", "X", "x", "+", "(o)", ";", "Q", "<", ">", "^", "|", "'", "."};
				String mouth = "";
				String [] mouthVert = new String[] {")", "(", "]", "[", "}", "{", ">", "<", "D", "|", "v", "^", "()", "[]", "O", "o", "/", "\\", "P", "p", "b", "d"};
				String [] mouthHoriz = new String[] {"_", "-", "O", "o", "n", "v", "u", "."};
				String lor = "";
				String [] lorOpt = new String[] {"left", "Left", "right", "Right"};
				String addEmoticonPart = "";
				String [] yesOrNo = new String[] {"yes", "Yes", "y", "Y", "no", "No", "n", "N"};
				String eyebrows = "";
				String [] eyebrowsOpt = new String[] {">", "<", "}", "{", "',", "O"};
				String nose = "";
				String [] noseOpt = new String[] {"-", "^", "v"};
				String tears = "";
				String [] tearsOpt = new String[] {"'", "\""};
				String p = "";
				String addSecondEye = "";
				String secondEye = "";
				String addArms = "";
				int numArms = 0;
				String arms = "";
				String [] arms1 = new String[] {"/", "\\", ">", "<", "v"};
				String [] arms2 = new String[] {"/ \\", "\\ /", "/ /", "\\ \\", "< >", "< <", "> >", "> <"};
				String armsIn = "";
				String [] armsIn2 = new String[] {"one", "One", "both", "Both", "none", "None"};
				String lor2 = "";
				String addExtra = "";
				String extra = "";
				String [] extraOpt = new String[] {";", "#"};
				while (true){
					System.out.print("Would you like your emoticon's orientation to be vertical or horizontal? ");
					orientation = sc.nextLine();
					if (orientation.equals("horizontal") || orientation.equals("Horizontal") || orientation.equals("vertical") || orientation.equals("Vertical")){
						break;
					}else{
						System.out.print("That wasn't quite the answer I was looking for. ");
					}
				}
				
				//------------------------------------VERTICAL EMOTICON------------------------------------//
				if (orientation.equals("vertical") || orientation.equals("Vertical")){
					
					//------------------------------------EYES------------------------------------//
					while (true){
						System.out.println("Please select your emoticon's eyes: :, =, X, <, ;, B, 8");
						eyes = sc.nextLine();
						if (stringInArray(eyes, eyesVert)){
							break;
						}else{
							System.out.println("Invalid input.");
						}
					}
					
					//------------------------------------MOUTH------------------------------------//
					while (true){
						System.out.println("Please select your emoticon's mouth: ), (, ], [, }, {, >, <, D, |, v, ^, (), [], O, o, /, \\, P, p, b, d");
						mouth = sc.nextLine();
						if (stringInArray(mouth, mouthVert)){
							break;
						}else{
							System.out.println("Invalid input.");
						}
					}
					
					while (true){
						System.out.print("Would you like your emoticon's eyes to be to the left or right of its mouth? (left/right): ");
						lor = sc.nextLine();
						if (stringInArray(lor, lorOpt)){
							break;
						}else{
							System.out.print("That wasn't quite the answer I was looking for. ");
						}
					}
					
					//------------------------------------EYEBROWS------------------------------------//
					while (true){
						System.out.print("Would you like to add eyebrows to your emoticon? (y/n): ");
						addEmoticonPart = sc.nextLine();	
						if (stringInArray(addEmoticonPart, yesOrNo)){
							break;
						}else{
							System.out.print("That wasn't quite the answer I was looking for. ");
						}
					}	
					if (addEmoticonPart.equals("yes") || addEmoticonPart.equals("Yes") || addEmoticonPart.equals("y") || addEmoticonPart.equals("Y")){
						while (true){
							System.out.println("Please select your emoticon's eyebrows: >, <, }, {, ',(This is a raised eyebrow), O");
							eyebrows = sc.nextLine();
							if(stringInArray(eyebrows, eyebrowsOpt)){
								break;
							}else{
								System.out.println("Invalid input. ");
							}
						}
					}
					
					//------------------------------------NOSE------------------------------------//
					while (true){
						System.out.print("Would you like to add a nose to your emoticon? (y/n): ");
						addEmoticonPart = sc.nextLine();	
						if (stringInArray(addEmoticonPart, yesOrNo)){
							break;
						}else{
							System.out.print("That wasn't quite the answer I was looking for. ");
						}
					}
					if (addEmoticonPart.equals("yes") || addEmoticonPart.equals("Yes") || addEmoticonPart.equals("y") || addEmoticonPart.equals("Y")){
						while (true){
							System.out.println("Please select your emoticon's nose: -, ^, v");
							nose = sc.nextLine();
							if (stringInArray(nose, noseOpt)){
								break;
							}else{
								System.out.println("Invalid input. ");
							}
						}
					}
					
					//------------------------------------TEARS------------------------------------//
					while (true){
						System.out.print("Would you like to add tears to your emoticon? (y/n): ");
						addEmoticonPart = sc.nextLine();	
						if (stringInArray(addEmoticonPart, yesOrNo)){
							break;
						}else{
							System.out.print("That wasn't quite the answer I was looking for. ");
						}
					}
					if (addEmoticonPart.equals("yes") || addEmoticonPart.equals("Yes") || addEmoticonPart.equals("y") || addEmoticonPart.equals("Y")){
						while (true){
							System.out.println("Please select your emoticon's tears: ', \"");
							tears = sc.nextLine();
							if (stringInArray(tears, tearsOpt)){
								break;
							}else{
								System.out.println("Invalid input. ");
							}
						}
					}
					
					//------------------------------------PRINT EMOTICON------------------------------------//
					System.out.println("Here is your emoticon:");
					if (lor.equals("left") || lor.equals("Left")){
						System.out.println(eyebrows + eyes + tears + nose + mouth);
					}else{
						System.out.println(mouth + nose + tears + eyes + eyebrows);
					}
					
				//------------------------------------HORIZONTAL EMOTICON------------------------------------//
				}else if (orientation.equals("horizontal") || orientation.equals("Horizontal")){
					
					//------------------------------------PARENTHESES------------------------------------//
					while (true){
						System.out.print("Would you like your emoticon to be in parentheses? (y/n): ");
						p = sc.nextLine();
						if (stringInArray(p, yesOrNo)){
							break;
						}else{
							System.out.print("That wasn't quite the answer I was looking for. ");
						}
					}
					
					//------------------------------------EYES------------------------------------//
					while (true){
						System.out.println("Please select your emoticon's eyes: 0, U, V, -, T, $, O, o, X, x, +, (o), ;, Q, <, >, ^, |, ', .");
						eyes = sc.nextLine();
						if (stringInArray(eyes, eyesHoriz)){
							break;
						}else{
							System.out.println("Invalid input.");
						}
					}
					
					//------------------------------------MOUTH------------------------------------//
					while (true){
						System.out.print("Would you like to add a mouth to your emoticon? (y/n) (If no/No/n/N is selected, the mouth will be replaced by a space in between the eyes): ");
						addEmoticonPart = sc.nextLine();
						if(stringInArray(addEmoticonPart, yesOrNo)){
							break;
						}else{
							System.out.print("That wasn't quite the answer I was looking for. ");
						}
					}
					mouth = " ";
					if (addEmoticonPart.equals("yes") || addEmoticonPart.equals("Yes") || addEmoticonPart.equals("y") || addEmoticonPart.equals("Y")){
						while (true){
							System.out.println("Please select your emoticon's mouth: _, -, O, o, n, v, u, .");
							mouth = sc.nextLine();
							if (stringInArray(mouth, mouthHoriz)){
								break;
							}else{
								System.out.println("Invalid input.");
							}
						}
					}
					
					//------------------------------------SECOND EYE------------------------------------//
					while (true){
						System.out.print("Would you like one of your emoticon's eyes to be different? (y/n): ");
						addSecondEye = sc.nextLine();
						if (stringInArray(addSecondEye, yesOrNo)){
							break;
						}else{
							System.out.print("That wasn't quite the answer I was looking for. ");
						}
					}
					if (addSecondEye.equals("yes") || addSecondEye.equals("Yes") || addSecondEye.equals("y") || addSecondEye.equals("Y")){
						while (true){
							System.out.println("Please select your emoticon's other eye: 0, U, V, -, T, $, O, o, X, x, +, (o), ;, Q, <, >, ^, |, ', .");
							secondEye = sc.nextLine();
							if (stringInArray(secondEye, eyesHoriz)){
								break;
							}else{
								System.out.println("Invalid input.");
							}
						}
						while (true){
							System.out.print("Would you like your emoticon's other eye to be the left or right eye? (left/right): ");
							lor = sc.nextLine();
							if (stringInArray(lor, lorOpt)){
								break;
							}else{
								System.out.print("That wasn't quite the answer I was looking for. ");
							}
						}
					}
					
					//------------------------------------ARMS------------------------------------//
					while (true){
						System.out.print("Would you like to add arms to your emoticon? (y/n): ");
						addArms = sc.nextLine();
						if (stringInArray(addArms, yesOrNo)){
							break;
						}else{
							System.out.print("That wasn't quite the answer I was looking for. ");
						}
					}
					if (addArms.equals("yes") || addArms.equals("Yes") || addArms.equals("y") || addArms.equals("Y")){
						System.out.print("Would you like to add one arm or two arms? (1/2): ");
						numArms = sc.nextInt();
						sc.nextLine();
						if (numArms > 2 || numArms < 1){
							while (numArms > 2 || numArms < 1){
								System.out.print("Invalid input. Would you like to add one arm or two arms? (1/2): ");
								numArms = sc.nextInt();
								sc.nextLine();
							}
						}
						if (numArms == 1){
							while (true){
								System.out.println("Please select the arm you want for your emoticon: /, \\, >, <, v");
								arms = sc.nextLine();
								if (stringInArray(arms, arms1)){
									break;
								}else{
									System.out.println("Invalid input.");
								}
							}
							while (true){
								System.out.print("Would you like the arm to be on the left side or the right side of your emoticon? (left/right): ");
								lor2 = sc.nextLine();
								if (stringInArray(lor2, lorOpt)){
									break;
								}else{
									System.out.print("That wasn't quite the answer I was looking for. ");
								}
							}
							if (p.equals("yes") || p.equals("Yes") || p.equals("y") || p.equals("Y")){
								while (true){
									System.out.print("Would you like the arm in the parentheses? (y/n): ");
									armsIn = sc.nextLine();
									if (stringInArray(armsIn, yesOrNo)){
										break;
									}else{
										System.out.print("That wasn't quite the answer I was looking for. ");
									}
								}
							}
						}else{
							while (true){
								System.out.println("Please select the arms you want for your emoticon (include space between arms during input): / \\, \\ /, / /, \\ \\, < >, < <, > >, > <");
								arms = sc.nextLine();
								if (stringInArray(arms, arms2)){
									break;
								}else{
									System.out.println("Invalid input.");
								}
							}
							if (p.equals("yes") || p.equals("Yes") || p.equals("y") || p.equals("Y")){
								while (true){
									System.out.print("Would you like one arm in the parentheses, both arms in the parentheses or no arms in the parentheses? (one, both, none): ");
									armsIn = sc.nextLine();
									if (stringInArray(armsIn, armsIn2)){
										break;
									}else{
										System.out.print("That wasn't quite the answer I was looking for. ");
									}
								}
								if (armsIn.equals("one") || armsIn.equals("One")){
									while (true){
										System.out.print("Would you like your emoticon's left arm or right arm to be in the parentheses? (left/right): ");
										lor2 = sc.nextLine();
										if (stringInArray(lor2, lorOpt)){
											break;
										}else{
											System.out.print("That wasn't quite the answer I was looking for. ");
										}
									}
								}
							}
						}
					}
					
					//------------------------------------EXTRAS------------------------------------//
					while (true){
						System.out.print("Would you like to add something to your emoticon's cheeks? (y/n): ");
						addExtra = sc.nextLine();
						if (stringInArray(addExtra, yesOrNo)){
							break;
						}else{
							System.out.print("That wasn't quite the answer I was looking for. ");
						}
					}
					if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
						while (true){
							System.out.println("Please select what you want to add to your emoticon's cheeks: ;, #");
							extra = sc.nextLine();
							if (stringInArray(extra, extraOpt)){
								break;
							}else{
								System.out.println("Invalid input.");
							}
						}
					}
					
					//------------------------------------PRINT EMOTICON------------------------------------//
					System.out.println("Here is your emoticon:");
					if (p.equals("yes") || p.equals("Yes") || p.equals("y") || p.equals("Y")){
						if (addSecondEye.equals("yes") || addSecondEye.equals("Yes") || addSecondEye.equals("y") || addSecondEye.equals("Y")){
							if (lor.equals("left") || lor.equals("Left")){
								if (addArms.equals("yes") || addArms.equals("Yes") || addArms.equals("y") || addArms.equals("Y")){
									if (numArms == 1){
										if (lor2.equals("left") || lor2.equals("Left")){
											if (armsIn.equals("yes") || armsIn.equals("Yes") || armsIn.equals("y") || armsIn.equals("Y")){
												if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
													if (extra.equals(";")){
														System.out.println("(" + arms + secondEye + mouth + eyes + extra + ")");
													}else{
														System.out.println("(" + arms + extra + secondEye + mouth + eyes + extra + ")");
													}
												}else{
													System.out.println("(" + arms + secondEye + mouth + eyes + ")");
												}
											}else{
												if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
													if (extra.equals(";")){
														System.out.println(arms + "(" + secondEye + mouth + eyes + extra + ")");
													}else{
														System.out.println(arms + "(" + extra + secondEye + mouth + eyes + extra + ")");
													}
												}else{
													System.out.println(arms + "(" + secondEye + mouth + eyes + ")");
												}
											}
										}else{
											if (armsIn.equals("yes") || armsIn.equals("Yes") || armsIn.equals("y") || armsIn.equals("Y")){
												if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
													if (extra.equals(";")){
														System.out.println("(" + secondEye + mouth + eyes + extra + arms + ")");
													}else{
														System.out.println("(" + extra + secondEye + mouth + eyes + extra + arms + ")");
													}
												}else{
													System.out.println("(" + secondEye + mouth + eyes + arms + ")");
												}
											}else{
												if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
													if (extra.equals(";")){
														System.out.println("(" + secondEye + mouth + eyes + extra + ")" + arms);
													}else{
														System.out.println("(" + extra + secondEye + mouth + eyes + extra + ")" + arms);
													}
												}else{
													System.out.println("(" + secondEye + mouth + eyes + ")" + arms);
												}
											}
										}
									}else{
										if (armsIn.equals("one") || armsIn.equals("One")){
											if (lor2.equals("right") || lor2.equals("Right")){
												if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
													if (extra.equals(";")){
														System.out.println(arms.substring(0,1) + "(" + secondEye + mouth + eyes + extra + arms.substring(2) + ")");
													}else{
														System.out.println(arms.substring(0,1) + "(" + extra + secondEye + mouth + eyes + extra + arms.substring(2) + ")");
													}
												}else{
													System.out.println(arms.substring(0,1) + "(" + secondEye + mouth + eyes + arms.substring(2) + ")");
												}
											}else{
												if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
													if (extra.equals(";")){
														System.out.println("(" + arms.substring(0,1) + secondEye + mouth + eyes + extra + ")" + arms.substring(2));
													}else{
														System.out.println("(" + arms.substring(0,1) + extra + secondEye + mouth + eyes + extra + ")" + arms.substring(2));
													}
												}else{
													System.out.println("(" + arms.substring(0,1) + secondEye + mouth + eyes + ")" + arms.substring(2));
												}
											}
										}else if (armsIn.equals("both") || armsIn.equals("Both")){
											if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
												if (extra.equals(";")){
													System.out.println("(" + arms.substring(0,1) + secondEye + mouth + eyes + extra + arms.substring(2) + ")");
												}else{
													System.out.println("(" + arms.substring(0,1) + extra + secondEye + mouth + eyes + extra + arms.substring(2) + ")");
												}
											}else{
												System.out.println("(" + arms.substring(0,1) + secondEye + mouth + eyes + arms + ")");
											}
										}else{
											if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
												if (extra.equals(";")){
													System.out.println(arms.substring(0,1) + "(" + secondEye + mouth + eyes + extra + ")" + arms.substring(2));
												}else{
													System.out.println(arms.substring(0,1) + "(" + extra + secondEye + mouth + eyes + extra + ")" + arms.substring(2));
												}
											}else{
												System.out.println(arms.substring(0,1) + "(" + secondEye + mouth + eyes + ")" + arms.substring(2));
											}
										}
									}
								}else{
									if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
										if (extra.equals(";")){
											System.out.println("(" + secondEye + mouth + eyes + extra + ")");
										}else{
											System.out.println("(" + extra + secondEye + mouth + eyes + extra + ")");
										}
									}else{
										System.out.println("(" + secondEye + mouth + eyes + ")");
									}
								}
							}else{
								if (addArms.equals("yes") || addArms.equals("Yes") || addArms.equals("y") || addArms.equals("Y")){
									if (numArms == 1){
										if (lor2.equals("left") || lor2.equals("Left")){
											if (armsIn.equals("yes") || armsIn.equals("Yes") || armsIn.equals("y") || armsIn.equals("Y")){
												if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
													if (extra.equals(";")){
														System.out.println("(" + arms + eyes + mouth + secondEye + extra + ")");
													}else{
														System.out.println("(" + arms + extra + eyes + mouth + secondEye + extra + ")");
													}
												}else{
													System.out.println("(" + arms + eyes + mouth + secondEye + ")");
												}
											}else{
												if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
													if (extra.equals(";")){
														System.out.println(arms + "(" + eyes + mouth + secondEye + extra + ")");
													}else{
														System.out.println(arms + "(" + extra + eyes + mouth + secondEye + extra + ")");
													}
												}else{
													System.out.println(arms + "(" + eyes + mouth + secondEye + ")");
												}
											}
										}else{
											if (armsIn.equals("yes") || armsIn.equals("Yes") || armsIn.equals("y") || armsIn.equals("Y")){
												if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
													if (extra.equals(";")){
														System.out.println("(" + eyes + mouth + secondEye + extra + arms + ")");
													}else{
														System.out.println("(" + extra + eyes + mouth + secondEye + extra + arms + ")");
													}
												}else{
													System.out.println("(" + eyes + mouth + secondEye + arms + ")");
												}
											}else{
												if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
													if (extra.equals(";")){
														System.out.println("(" + eyes + mouth + secondEye + extra + ")" + arms);
													}else{
														System.out.println("(" + extra + eyes + mouth + secondEye + extra + ")" + arms);
													}
												}else{
													System.out.println("(" + eyes + mouth + secondEye + ")" + arms);
												}
											}
										}
									}else{
										if (armsIn.equals("one") || armsIn.equals("One")){
											if (lor2.equals("right") || lor2.equals("Right")){
												if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
													if (extra.equals(";")){
														System.out.println(arms.substring(0,1) + "(" + eyes + mouth + secondEye + extra + arms.substring(2) + ")");
													}else{
														System.out.println(arms.substring(0,1) + "(" + extra + eyes + mouth + secondEye + extra + arms.substring(2) + ")");
													}
												}else{
													System.out.println(arms.substring(0,1) + "(" + eyes + mouth + secondEye + arms.substring(2) + ")");
												}
											}else{
												if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
													if (extra.equals(";")){
														System.out.println("(" + arms.substring(0,1) + eyes + mouth + secondEye + extra + ")" + arms.substring(2));
													}else{
														System.out.println("(" + arms.substring(0,1) + extra + eyes + mouth + secondEye + extra + ")" + arms.substring(2));
													}
												}else{
													System.out.println("(" + arms.substring(0,1) + eyes + mouth + secondEye + ")" + arms.substring(2));
												}
											}
										}else if (armsIn.equals("both") || armsIn.equals("Both")){
											if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
												if (extra.equals(";")){
													System.out.println("(" + arms.substring(0,1) + eyes + mouth + secondEye + extra + arms.substring(2) + ")");
												}else{
													System.out.println("(" + arms.substring(0,1) + extra + eyes + mouth + secondEye + extra + arms.substring(2) + ")");
												}
											}else{
												System.out.println("(" + arms.substring(0,1) + eyes + mouth + secondEye + arms.substring(2) + ")");
											}
										}else{
											if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
												if (extra.equals(";")){
													System.out.println(arms.substring(0,1) + "(" + eyes + mouth + secondEye + extra + ")" + arms.substring(2));
												}else{
													System.out.println(arms.substring(0,1) + "(" + extra + eyes + mouth + secondEye + extra + ")" + arms.substring(2));
												}
											}else{
												System.out.println(arms.substring(0,1) + "(" + eyes + mouth + secondEye + ")" + arms.substring(2));
											}
										}
									}
								}else{
									if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
										if (extra.equals(";")){
											System.out.println("(" + eyes + mouth + secondEye + extra + ")");
										}else{
											System.out.println("(" + extra + eyes + mouth + secondEye + extra + ")");
										}
									}else{
										System.out.println("(" + eyes + mouth + secondEye + ")");
									}
								}
							}
						}else{
							if (addArms.equals("yes") || addArms.equals("Yes") || addArms.equals("y") || addArms.equals("Y")){
								if (numArms == 1){
									if (lor2.equals("left") || lor2.equals("Left")){
										if (armsIn.equals("yes") || armsIn.equals("Yes") || armsIn.equals("y") || armsIn.equals("Y")){
											if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
												if (extra.equals(";")){
													System.out.println("(" + arms + eyes + mouth + eyes + extra + ")");
												}else{
													System.out.println("(" + arms + extra + eyes + mouth + eyes + extra + ")");
												}
											}else{
												System.out.println("(" + arms + eyes + mouth + eyes + ")");
											}
										}else{
											if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
												if (extra.equals(";")){
													System.out.println(arms + "(" + eyes + mouth + eyes + extra + ")");
												}else{
													System.out.println(arms + "(" + extra + eyes + mouth + eyes + extra + ")");
												}
											}else{
												System.out.println(arms + "(" + eyes + mouth + eyes + ")");
											}
										}
									}else{
										if (armsIn.equals("yes") || armsIn.equals("Yes") || armsIn.equals("y") || armsIn.equals("Y")){
											if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
												if (extra.equals(";")){
													System.out.println("(" + eyes + mouth + eyes + extra + arms + ")");
												}else{
													System.out.println("(" + extra + eyes + mouth + eyes + extra + arms + ")");
												}
											}else{
												System.out.println("(" + eyes + mouth + eyes + arms + ")");
											}
										}else{
											if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
												if (extra.equals(";")){
													System.out.println("(" + eyes + mouth + eyes + extra + ")" + arms);
												}else{
													System.out.println("(" + extra + eyes + mouth + eyes + extra + ")" + arms);
												}
											}else{
												System.out.println("(" + eyes + mouth + eyes + ")" + arms);
											}
										}
									}
								}else{
									if (armsIn.equals("one") || armsIn.equals("One")){
										if (lor2.equals("right") || lor2.equals("Right")){
											if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
												if (extra.equals(";")){
													System.out.println(arms.substring(0,1) + "(" + eyes + mouth + eyes + extra + arms.substring(2) + ")");
												}else{
													System.out.println(arms.substring(0,1) + "(" + extra + eyes + mouth + eyes + extra + arms.substring(2) + ")");
												}
											}else{
												System.out.println(arms.substring(0,1) + "(" + eyes + mouth + eyes + arms.substring(2) + ")");
											}
										}else{
											if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
												if (extra.equals(";")){
													System.out.println("(" + arms.substring(0,1) + eyes + mouth + eyes + extra + ")" + arms.substring(2));
												}else{
													System.out.println("(" + arms.substring(0,1) + extra + eyes + mouth + eyes + extra + ")" + arms.substring(2));
												}
											}else{
												System.out.println("(" + arms.substring(0,1) + eyes + mouth + eyes + ")" + arms.substring(2));
											}
										}
									}else if (armsIn.equals("both") || armsIn.equals("Both")){
										if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
											if (extra.equals(";")){
												System.out.println("(" + arms.substring(0,1) + eyes + mouth + eyes + extra + arms.substring(2) + ")");
											}else{
												System.out.println("(" + arms.substring(0,1) + extra + eyes + mouth + eyes + extra + arms.substring(2) + ")");
											}
										}else{
											System.out.println("(" + arms.substring(0,1) + eyes + mouth + eyes + arms.substring(2) + ")");
										}
									}else{
										if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
											if (extra.equals(";")){
												System.out.println(arms.substring(0,1) + "(" + eyes + mouth + eyes + extra + ")" + arms.substring(2));
											}else{
												System.out.println(arms.substring(0,1) + "(" + extra + eyes + mouth + eyes + extra + ")" + arms.substring(2));
											}
										}else{
											System.out.println(arms.substring(0,1) + "(" + eyes + mouth + eyes + ")" + arms.substring(2));
										}
									}
								}
							}else{
								if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
									if (extra.equals(";")){
										System.out.println("(" + eyes + mouth + eyes + extra + ")");
									}else{
										System.out.println("(" + extra + eyes + mouth + eyes + extra + ")");
									}
								}else{
									System.out.println("(" + eyes + mouth + eyes + ")");
								}
							}
						}
					}else{
						if (addSecondEye.equals("yes") || addSecondEye.equals("Yes") || addSecondEye.equals("y") || addSecondEye.equals("Y")){
							if (lor.equals("left") || lor.equals("Left")){
								if (addArms.equals("yes") || addArms.equals("Yes") || addArms.equals("y") || addArms.equals("Y")){
									if (numArms == 1){
										if (lor2.equals("left") || lor2.equals("Left")){
											if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
												if (extra.equals(";")){
													System.out.println(arms + secondEye + mouth + eyes + extra);
												}else{
													System.out.println(arms + extra + secondEye + mouth + eyes + extra);
												}
											}else{
												System.out.println(arms + secondEye + mouth + eyes);
											}
										}else{
											if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
												if (extra.equals(";")){
													System.out.println(secondEye + mouth + eyes + extra + arms);
												}else{
													System.out.println(extra + secondEye + mouth + eyes + extra + arms);
												}
											}else{
												System.out.println(secondEye + mouth + eyes + arms);
											}
										}
									}else{
										if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
											if (extra.equals(";")){
												System.out.println(arms.substring(0,1) + secondEye + mouth + eyes + extra + arms.substring(2));
											}else{
												System.out.println(arms.substring(0,1) + extra + secondEye + mouth + eyes + extra + arms.substring(2));
											}
										}else{
											System.out.println(arms.substring(0,1) + secondEye + mouth + eyes + arms.substring(2));
										}
									}
								}else{
									if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
										if (extra.equals(";")){
											System.out.println(secondEye + mouth + eyes + extra);
										}else{
											System.out.println(extra + secondEye + mouth + eyes + extra);
										}
									}else{
										System.out.println(secondEye + mouth + eyes);
									}
								}
							}else{
								if (addArms.equals("yes") || addArms.equals("Yes") || addArms.equals("y") || addArms.equals("Y")){
									if (numArms == 1){
										if (lor2.equals("left") || lor2.equals("Left")){
											if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
												if (extra.equals(";")){
													System.out.println(arms + eyes + mouth + secondEye + extra);
												}else{
													System.out.println(arms + extra + eyes + mouth + secondEye + extra);
												}
											}else{
												System.out.println(arms + eyes + mouth + secondEye);
											}
										}else{
											if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
												if (extra.equals(";")){
													System.out.println(eyes + mouth + secondEye + extra + arms);
												}else{
													System.out.println(extra + eyes + mouth + secondEye + extra + arms);
												}
											}else{
												System.out.println(eyes + mouth + secondEye + arms);
											}
										}
									}else{
										if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
											if (extra.equals(";")){
												System.out.println(arms.substring(0,1) + eyes + mouth + secondEye + extra + arms.substring(2));
											}else{
												System.out.println(arms.substring(0,1) + extra + eyes + mouth + secondEye + extra + arms.substring(2));
											}
										}else{
											System.out.println(arms.substring(0,1) + eyes + mouth + secondEye + arms.substring(2));
										}
									}
								}else{
									if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
										if (extra.equals(";")){
											System.out.println(eyes + mouth + secondEye + extra);
										}else{
											System.out.println(extra + eyes + mouth + secondEye + extra);
										}
									}else{
										System.out.println(eyes + mouth + secondEye);
									}
								}
							}
						}else{
							if (addArms.equals("yes") || addArms.equals("Yes") || addArms.equals("y") || addArms.equals("Y")){
								if (numArms == 1){
									if (lor2.equals("left") || lor2.equals("Left")){
										if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
											if (extra.equals(";")){
												System.out.println(arms + eyes + mouth + eyes + extra);
											}else{
												System.out.println(arms + extra + eyes + mouth + eyes + extra);
											}
										}else{
											System.out.println(arms + eyes + mouth + eyes);
										}
									}else{
										if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
											if (extra.equals(";")){
												System.out.println(eyes + mouth + eyes + extra + arms);
											}else{
												System.out.println(extra + eyes + mouth + eyes + extra + arms);
											}
										}else{
											System.out.println(eyes + mouth + eyes + arms);
										}
									}
								}else{
									if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
										if (extra.equals(";")){
											System.out.println(arms.substring(0,1) + eyes + mouth + eyes + extra + arms.substring(2));
										}else{
											System.out.println(arms.substring(0,1) + extra + eyes + mouth + eyes + extra + arms.substring(2));
										}
									}else{
										System.out.println(arms.substring(0,1) + eyes + mouth + eyes + arms.substring(2));
									}
								}
							}else{
								if (addExtra.equals("yes") || addExtra.equals("Yes") || addExtra.equals("y") || addExtra.equals("Y")){
									if (extra.equals(";")){
										System.out.println(eyes + mouth + eyes + extra);
									}else{
										System.out.println(extra + eyes + mouth + eyes + extra);
									}
								}else{
									System.out.println(eyes + mouth + eyes);
								}
							}
						}
					}
				}
				System.out.println();
				System.out.print("Would you like to create another emoticon? (y/n): ");
				ready = sc.nextLine();
			}else if (ready.equals("No") || ready.equals("no") || ready.equals("N") || ready.equals("n")){
				break;
			}else{
				System.out.print("That wasn't quite the answer I was looking for. Would you like to make an emoticon? (y/n): ");
				ready = sc.nextLine();
			}
		}
		System.out.println("Thank you for testing the emoticon creator. Have a plesant day! :)");
	}
}