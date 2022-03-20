package javaDers28_SvitchCase;

import java.util.Scanner;

public class Pratik03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Uc mertebeli bir eded girin");
        int sayi =input.nextInt();

        int birler =sayi % 10; // 3

         sayi = sayi / 10;
        int onlar = sayi % 10; // 2

        sayi = sayi/ 10;
        int yuzler = sayi % 10; // 1

        switch (yuzler) {
            case 1: {
                System.out.print("yuz");
                break;
            }
            case 2: {
                System.out.print("ikiyuz");
                break;
            }

            case 3: {
                System.out.print("ucyuz");
                break;
            }

            case 4: {
                System.out.print("dordyuz");
                break;
            }

            case 5: {
                System.out.print("besyuz");
                break;
            }

            case 6: {
                System.out.print("altiyuz");
                break;
            }

            case 7: {
                System.out.print("yeddiyuz");
                break;
            }

            case 8: {
                System.out.print("seggizyuz");
                break;
            }

            case 9: {
                System.out.print("doqquzyuz");
                break;
            }
        }
        System.out.print(" ");
            switch (onlar) {
                case 1: {
                    System.out.print("on");
                    break;
                }
                case 2: {
                    System.out.print("iyirmi");
                    break;
                }

                case 3: {
                    System.out.print("otuz");
                    break;
                }

                case 4: {
                    System.out.print("qirx");
                    break;
                }

                case 5: {
                    System.out.print("elli");
                    break;
                }

                case 6: {
                    System.out.print("altmis");
                    break;
                }

                case 7: {
                    System.out.print("yetmis");
                    break;
                }

                case 8: {
                    System.out.print("seksen");
                    break;
                }

                case 9: {
                    System.out.print("doxsan");
                    break;
                }
            }
        System.out.print(" ");

                switch (birler) {
                    case 1: {
                        System.out.print("bir");
                        break;
                    }
                    case 2: {
                        System.out.print("iki");
                        break;
                    }

                    case 3: {
                        System.out.print("uc");
                        break;
                    }

                    case 4: {
                        System.out.print("dord");
                        break;
                    }

                    case 5: {
                        System.out.print("bes");
                        break;
                    }

                    case 6: {
                        System.out.print("alti");
                        break;
                    }

                    case 7: {
                        System.out.print("yeddi");
                        break;
                    }

                    case 8: {
                        System.out.print("sekgiz");
                        break;
                    }

                    case 9: {
                        System.out.print("doqquz");
                        break;
                    }
                    default: {
                        System.out.println("sehvdir");
                        break;
                    }

                }

            }
        }
