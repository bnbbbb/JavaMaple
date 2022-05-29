package Thread;

public class SkillEffectThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			String[] skillImages=new String[5];
			
			skillImages[0]="                    \n"+
						  "                    \n"+
						  "                    \n"+
						  "                    \n"+
						  "                    \n"+
						  "                    \n"+
						  "                    \n"+
						  ".                   \n"+
						  "77i:i7i             \n"+
						  "rr7rrr7i..i.        \n"+
						  "iriiirr77iii        \n"+
						  "..:..:iirrrr:.      \n"+
						  "      ...rrriii.    \n"+
						  "         :iirri.    \n"+
						  "         ..:iri     \n"+
						  "          .:ri      \n"+
						  "          .:ii      \n"+
						  "         .::irv     \n"+
						  "       ....iii7:    \n"+
						  ".. .:...i:ii7i:.    \n"+
						  ":::i::.irrr7r.      \n"+
						  "rrririir7rr:        \n"+
						  "rririr7vr...        \n"+
						  "77rr77i.            \n"+
						  "::::.     r:        \n"+
						  "                    \n"+
						  "                    \n"+
						  "                    \n"+
						  ":                   \n"+
						  "                    \n"+
						  "                    \n"+
						  "                    ";
							  
			skillImages[1]="                                        \n"+
						  "                                         \n"+
						  "..                                      \n"+
						  "                                        \n"+
						  "                                        \n"+
						  "                                        \n"+
						  "                                        \n"+
						  "::         : .iii::..                   \n"+
						  ".    ..:::i:.::ir7rv77i:i7i             \n"+
						  "   .::ir7r7r7rrirrrrrr7rrr7i..i.        \n"+
						  ":ir777rrrrirrrrrii:iiriiirr77iii  .     \n"+
						  ".:riririiiiiiiiii::...:..:iirrrr:.:     \n"+
						  ":iiririrrri::.......      ...rrriii.    \n"+
						  "777rrrriiii::....            :iirri.    \n"+
						  "::........ . . .             ..:iri     \n"+
						  "                              .:ri      \n"+
						  "........                      .:ii      \n"+
						  "rii:::::::::::..             .::irv     \n"+
						  "rrrrii:::::::......        ....iii7:    \n"+
						  "rr7rrri:i:i:i:i::..... .:...i:ii7i:.    \n"+
						  ":ii::iirrrrrrr::::ii:::i::.irrr7r.      \n"+
						  "i   .:rrrrririrrrrrirrririir7rr:        \n"+
						  "   ::iiiiiiiiririrrrrririr7vr...        \n"+
						  "          ..ii7rrrrr77rr77i.            \n"+
						  "            ::::irrr::::                \n"+
						  "                                        \n"+
						  "                                        \n"+
						  "                                        \n"+
						  "                                        \n"+
						  "                                        \n"+
						  "                                        \n"+
						  "                                        ";
			
			skillImages[2]="                                                            \n"+
						  "                                                            \n"+
						  "                                                            \n"+
						  "                                                            \n"+
						  "                                                            \n"+
						  "                                                            \n"+
						  "                                                            \n"+
						  "                               : .iii::..                   \n"+
						  "                           :::i:.::ir7rv77i:i7i             \n"+
						  "                        ::ir7r7r7rrirrrrrr7rrr7i..i.        \n"+
						  "                      r777rrrrirrrrrii:iiriiirr77iii  .     \n"+
						  ":                    :riririiiiiiiiii::...:..:iirrrr:.:     \n"+
						  "                   ::iiririrrri::.......      ...rrriii.    \n"+
						  " ...:.i:::i:j7irrrv7777rrrriiii::....            :iirri.    \n"+
						  "iiirrriiii:PUU2I2j::::........ . . .             ..:iri     \n"+
						  "           .i.:.rE.                               .:ri      \n"+
						  "irii:i:i::::.....:..........                      .:ii      \n"+
						  "              vusirrrii:::::::::::..             .::irv     \n"+
						  "               Yr7r7rrrrii:::::::......        ....iii7:    \n"+
						  "                   irr7rrri:i:i:i:i::..... .:...i:ii7i:.    \n"+
						  "                    :ii::iirrrrrrr::::ii:::i::.irrr7r.      \n"+
						  ".                       .:rrrrririrrrrrirrririir7rr:        \n"+
						  "                           iiiiiiririrrrrririr7v            \n"+
						  "                              ..ii7rrrrr77rr77              \n"+
						  "                                 :::irrr:                   \n"+
						  "                                                            \n"+
						  "                                                            \n"+
						  "                                                            \n"+
						  "                                                            \n"+
						  "                                                            \n"+
						  "                                                            \n"+
						  "                                                            ";
			
			skillImages[3]="                                                                               \n"+
						  "                                                                                \n"+
						  "                                                                                \n"+
						  "                                                                                \n"+
						  "                                                                                \n"+
						  "                                                                                \n"+
						  "                                                                                \n"+
						  "                                                   : .iii::..      .            \n"+
						  "                                             ..:::i:.::ir7rv77i:i7i             \n"+
						  "                                           .::ir7r7r7rrirrrrrr7rrr7i..i.        \n"+
						  "                                        :ir777rrrrirrrrrii:iiriiirr77iii  .     \n"+
						  "                                        .:riririiiiiiiiii::...:..:iirrrr:.:     \n"+
						  "                                       ::iiririrrri::.......      ...rrriii.    \n"+
						  "                       .:.i:::i:j7irrrv7777rrrriiii::....            :iirri.    \n"+
						  "  .. .:i...::::YPJ::iiirrriiii:PUU2I2j::::........ . . .             ..:iri     \n"+
						  "irriiii:::::..:5:              .i.:.rE.                               .:ri      \n"+
						  ":::irrrrr7r7rr2j:iiririi:i:i::::.....:..........                      .:ii      \n"+
						  "                             vLrrrvusirrrii:::::::::::..             .::irv     \n"+
						  "                                    r7r7rrrrii:::::::......        ....iii7:    \n"+
						  "                                      :irr7rrri:i:i:i:i::..... .:...i:ii7i:.    \n"+
						  "                                           ::iirrrrrrr::::ii:::i::.irrr7r.      \n"+
						  "                                             :rrrrririrrrrrirrririir7rr:        \n"+
						  "                                                iiiiiririrrrrririr7vr...        \n"+
						  "                                                    ii7rrrrr77rr                \n"+
						  "                                                                                \n"+
						  "                                                                                \n"+
						  "                                                                                \n"+
						  "                                                                                \n"+
						  "                                                                                \n"+
						  "                                                                                \n"+
						  "                                                                                \n"+
						  "    .                                                                           ";
			
			skillImages[4]="                                                                                                   \n"+
						  "                                                                                                    \n"+
						  "                                                                                                    \n"+
						  "                                                                                                    \n"+
						  "                                                                                                    \n"+
						  "                                                                                                    \n"+
						  "                                                                                                    \n"+
						  "                                                                       : .iii::..  ...              \n"+
						  "                                                                    ::i:.::ir7rv77i:i7i             \n"+
						  "                                                                 :ir7r7r7rrirrrrrr7rrr7i..i.        \n"+
						  "                                                             ir777rrrrirrrrrii:iiriiirr77iii  .     \n"+
						  "                                                            .:riririiiiiiiiii::...:..:iirrrr:.:     \n"+
						  "                                                           ::iiririrrri::.......      ...rrriii.    \n"+
						  "                                                 :i:j7irrrv7777rrrriiii::....            :iirri.    \n"+
						  "                                       :iiirrriiii:PUU2I2j::::........ . . .             ..:iri     \n"+
						  "   rB..:::.:iiriiq2:irriiii:::::..:5:              .i.:.rE.                               .:ri      \n"+
						  "                     ::irrrrr7r7rr2j:iiririi:i:i::::.....:..........                      .:ii      \n"+
						  "                                        ::iivYsvYvLrrrvusirrrii:::::::::::..             .::irv     \n"+
						  "                                                   .7PXYr7r7rrrrii:::::::......        ....iii7:    \n"+
						  "                                                           irr7rrri:i:i:i:i::..... .:...i:ii7i:.    \n"+
						  "                                                            :ii::iirrrrrrr::::ii:::i::.irrr7r.      \n"+
						  "                                                                .:rrrrririrrrrrirrririir7rr:        \n"+
						  "                                                               ::iiiiiiiiririrrrrririr7vr...        \n"+
						  "                                                                      ..ii7rrrrr77rr77i.            \n"+
						  "                                                                        ::::irrr::                  \n"+
						  "                                                                                                    \n"+
						  "                                                                                                    \n"+
						  "                                                                                                    \n"+
						  "                                                                                                    \n"+
						  "                                                                                                    \n"+
						  "                                                                                                    \n"+
						  "                        .                                                                           ";
			
			
			for(int i=0; i<100; i++) {
				System.out.println("");
			}
			for(int i=0; i<skillImages.length; i++ ) {
				for(int j=0;j<50;j++) {
					System.out.println("");
				}
				System.out.println(skillImages[i]);
				try {
					Thread.sleep(120);
				} catch (InterruptedException e) {
					
				}
			
			}
			
						 
			
		}
	}
	
	


