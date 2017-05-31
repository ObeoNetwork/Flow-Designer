package fr.obeo.dsl.designer.sample.flow.routerdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.obeo.dsl.designer.sample.flow.routerdsl.services.RouterDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRouterDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'sensor'", "'('", "')'", "'processor'", "'system'", "'Case'", "':'", "';'", "'->'", "'X'", "'/!\\\\'", "'/'", "'.'", "'.volume'", "'.temperature'", "'capacity'", "'load'", "'consumption'", "'<'", "'<='", "'='", "'>'", "'>='", "'sec'", "'msec'", "'usec'", "'\\u00B0C'", "'\\u00B0F'", "'critical'", "'major'", "'error'", "'warning'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRouterDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRouterDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRouterDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRouterDsl.g"; }



     	private RouterDslGrammarAccess grammarAccess;

        public InternalRouterDslParser(TokenStream input, RouterDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RoutingRules";
       	}

       	@Override
       	protected RouterDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoutingRules"
    // InternalRouterDsl.g:65:1: entryRuleRoutingRules returns [EObject current=null] : iv_ruleRoutingRules= ruleRoutingRules EOF ;
    public final EObject entryRuleRoutingRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoutingRules = null;


        try {
            // InternalRouterDsl.g:65:53: (iv_ruleRoutingRules= ruleRoutingRules EOF )
            // InternalRouterDsl.g:66:2: iv_ruleRoutingRules= ruleRoutingRules EOF
            {
             newCompositeNode(grammarAccess.getRoutingRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoutingRules=ruleRoutingRules();

            state._fsp--;

             current =iv_ruleRoutingRules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoutingRules"


    // $ANTLR start "ruleRoutingRules"
    // InternalRouterDsl.g:72:1: ruleRoutingRules returns [EObject current=null] : ( () ( (lv_processors_1_0= ruleProcessorDeclaration ) )* ( (lv_sensors_2_0= ruleDataSourceDeclaration ) )* ( (lv_systems_3_0= ruleSystemDeclaration ) )* otherlv_4= '#' ( (lv_rules_5_0= ruleCaseRule ) )* ) ;
    public final EObject ruleRoutingRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_processors_1_0 = null;

        EObject lv_sensors_2_0 = null;

        EObject lv_systems_3_0 = null;

        EObject lv_rules_5_0 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:78:2: ( ( () ( (lv_processors_1_0= ruleProcessorDeclaration ) )* ( (lv_sensors_2_0= ruleDataSourceDeclaration ) )* ( (lv_systems_3_0= ruleSystemDeclaration ) )* otherlv_4= '#' ( (lv_rules_5_0= ruleCaseRule ) )* ) )
            // InternalRouterDsl.g:79:2: ( () ( (lv_processors_1_0= ruleProcessorDeclaration ) )* ( (lv_sensors_2_0= ruleDataSourceDeclaration ) )* ( (lv_systems_3_0= ruleSystemDeclaration ) )* otherlv_4= '#' ( (lv_rules_5_0= ruleCaseRule ) )* )
            {
            // InternalRouterDsl.g:79:2: ( () ( (lv_processors_1_0= ruleProcessorDeclaration ) )* ( (lv_sensors_2_0= ruleDataSourceDeclaration ) )* ( (lv_systems_3_0= ruleSystemDeclaration ) )* otherlv_4= '#' ( (lv_rules_5_0= ruleCaseRule ) )* )
            // InternalRouterDsl.g:80:3: () ( (lv_processors_1_0= ruleProcessorDeclaration ) )* ( (lv_sensors_2_0= ruleDataSourceDeclaration ) )* ( (lv_systems_3_0= ruleSystemDeclaration ) )* otherlv_4= '#' ( (lv_rules_5_0= ruleCaseRule ) )*
            {
            // InternalRouterDsl.g:80:3: ()
            // InternalRouterDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoutingRulesAccess().getRoutingRuleAction_0(),
            					current);
            			

            }

            // InternalRouterDsl.g:87:3: ( (lv_processors_1_0= ruleProcessorDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRouterDsl.g:88:4: (lv_processors_1_0= ruleProcessorDeclaration )
            	    {
            	    // InternalRouterDsl.g:88:4: (lv_processors_1_0= ruleProcessorDeclaration )
            	    // InternalRouterDsl.g:89:5: lv_processors_1_0= ruleProcessorDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getRoutingRulesAccess().getProcessorsProcessorDeclarationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_processors_1_0=ruleProcessorDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoutingRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processors",
            	    						lv_processors_1_0,
            	    						"fr.obeo.dsl.designer.sample.flow.routerdsl.RouterDsl.ProcessorDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRouterDsl.g:106:3: ( (lv_sensors_2_0= ruleDataSourceDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRouterDsl.g:107:4: (lv_sensors_2_0= ruleDataSourceDeclaration )
            	    {
            	    // InternalRouterDsl.g:107:4: (lv_sensors_2_0= ruleDataSourceDeclaration )
            	    // InternalRouterDsl.g:108:5: lv_sensors_2_0= ruleDataSourceDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getRoutingRulesAccess().getSensorsDataSourceDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_sensors_2_0=ruleDataSourceDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoutingRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sensors",
            	    						lv_sensors_2_0,
            	    						"fr.obeo.dsl.designer.sample.flow.routerdsl.RouterDsl.DataSourceDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalRouterDsl.g:125:3: ( (lv_systems_3_0= ruleSystemDeclaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRouterDsl.g:126:4: (lv_systems_3_0= ruleSystemDeclaration )
            	    {
            	    // InternalRouterDsl.g:126:4: (lv_systems_3_0= ruleSystemDeclaration )
            	    // InternalRouterDsl.g:127:5: lv_systems_3_0= ruleSystemDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getRoutingRulesAccess().getSystemsSystemDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_systems_3_0=ruleSystemDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoutingRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"systems",
            	    						lv_systems_3_0,
            	    						"fr.obeo.dsl.designer.sample.flow.routerdsl.RouterDsl.SystemDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRoutingRulesAccess().getNumberSignKeyword_4());
            		
            // InternalRouterDsl.g:148:3: ( (lv_rules_5_0= ruleCaseRule ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRouterDsl.g:149:4: (lv_rules_5_0= ruleCaseRule )
            	    {
            	    // InternalRouterDsl.g:149:4: (lv_rules_5_0= ruleCaseRule )
            	    // InternalRouterDsl.g:150:5: lv_rules_5_0= ruleCaseRule
            	    {

            	    					newCompositeNode(grammarAccess.getRoutingRulesAccess().getRulesCaseRuleParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_rules_5_0=ruleCaseRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoutingRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_5_0,
            	    						"fr.obeo.dsl.designer.sample.flow.routerdsl.RouterDsl.CaseRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoutingRules"


    // $ANTLR start "entryRuleDataSourceDeclaration"
    // InternalRouterDsl.g:171:1: entryRuleDataSourceDeclaration returns [EObject current=null] : iv_ruleDataSourceDeclaration= ruleDataSourceDeclaration EOF ;
    public final EObject entryRuleDataSourceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSourceDeclaration = null;


        try {
            // InternalRouterDsl.g:171:62: (iv_ruleDataSourceDeclaration= ruleDataSourceDeclaration EOF )
            // InternalRouterDsl.g:172:2: iv_ruleDataSourceDeclaration= ruleDataSourceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDataSourceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataSourceDeclaration=ruleDataSourceDeclaration();

            state._fsp--;

             current =iv_ruleDataSourceDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataSourceDeclaration"


    // $ANTLR start "ruleDataSourceDeclaration"
    // InternalRouterDsl.g:178:1: ruleDataSourceDeclaration returns [EObject current=null] : (otherlv_0= 'sensor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleDataSourceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:184:2: ( (otherlv_0= 'sensor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalRouterDsl.g:185:2: (otherlv_0= 'sensor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalRouterDsl.g:185:2: (otherlv_0= 'sensor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
            // InternalRouterDsl.g:186:3: otherlv_0= 'sensor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDataSourceDeclarationAccess().getSensorKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDataSourceDeclarationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRouterDsl.g:194:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRouterDsl.g:195:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRouterDsl.g:195:4: (lv_name_2_0= RULE_ID )
            // InternalRouterDsl.g:196:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDataSourceDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDataSourceDeclarationAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataSourceDeclaration"


    // $ANTLR start "entryRuleProcessorDeclaration"
    // InternalRouterDsl.g:220:1: entryRuleProcessorDeclaration returns [EObject current=null] : iv_ruleProcessorDeclaration= ruleProcessorDeclaration EOF ;
    public final EObject entryRuleProcessorDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorDeclaration = null;


        try {
            // InternalRouterDsl.g:220:61: (iv_ruleProcessorDeclaration= ruleProcessorDeclaration EOF )
            // InternalRouterDsl.g:221:2: iv_ruleProcessorDeclaration= ruleProcessorDeclaration EOF
            {
             newCompositeNode(grammarAccess.getProcessorDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessorDeclaration=ruleProcessorDeclaration();

            state._fsp--;

             current =iv_ruleProcessorDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessorDeclaration"


    // $ANTLR start "ruleProcessorDeclaration"
    // InternalRouterDsl.g:227:1: ruleProcessorDeclaration returns [EObject current=null] : (otherlv_0= 'processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleProcessorDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:233:2: ( (otherlv_0= 'processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalRouterDsl.g:234:2: (otherlv_0= 'processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalRouterDsl.g:234:2: (otherlv_0= 'processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
            // InternalRouterDsl.g:235:3: otherlv_0= 'processor' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessorDeclarationAccess().getProcessorKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessorDeclarationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRouterDsl.g:243:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRouterDsl.g:244:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRouterDsl.g:244:4: (lv_name_2_0= RULE_ID )
            // InternalRouterDsl.g:245:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getProcessorDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessorDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessorDeclarationAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessorDeclaration"


    // $ANTLR start "entryRuleSystemDeclaration"
    // InternalRouterDsl.g:269:1: entryRuleSystemDeclaration returns [EObject current=null] : iv_ruleSystemDeclaration= ruleSystemDeclaration EOF ;
    public final EObject entryRuleSystemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDeclaration = null;


        try {
            // InternalRouterDsl.g:269:58: (iv_ruleSystemDeclaration= ruleSystemDeclaration EOF )
            // InternalRouterDsl.g:270:2: iv_ruleSystemDeclaration= ruleSystemDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSystemDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemDeclaration=ruleSystemDeclaration();

            state._fsp--;

             current =iv_ruleSystemDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemDeclaration"


    // $ANTLR start "ruleSystemDeclaration"
    // InternalRouterDsl.g:276:1: ruleSystemDeclaration returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleSystemDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:282:2: ( (otherlv_0= 'system' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalRouterDsl.g:283:2: (otherlv_0= 'system' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalRouterDsl.g:283:2: (otherlv_0= 'system' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
            // InternalRouterDsl.g:284:3: otherlv_0= 'system' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemDeclarationAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemDeclarationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRouterDsl.g:292:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRouterDsl.g:293:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRouterDsl.g:293:4: (lv_name_2_0= RULE_ID )
            // InternalRouterDsl.g:294:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSystemDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemDeclarationAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemDeclaration"


    // $ANTLR start "entryRuleCaseRule"
    // InternalRouterDsl.g:318:1: entryRuleCaseRule returns [EObject current=null] : iv_ruleCaseRule= ruleCaseRule EOF ;
    public final EObject entryRuleCaseRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseRule = null;


        try {
            // InternalRouterDsl.g:318:49: (iv_ruleCaseRule= ruleCaseRule EOF )
            // InternalRouterDsl.g:319:2: iv_ruleCaseRule= ruleCaseRule EOF
            {
             newCompositeNode(grammarAccess.getCaseRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaseRule=ruleCaseRule();

            state._fsp--;

             current =iv_ruleCaseRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseRule"


    // $ANTLR start "ruleCaseRule"
    // InternalRouterDsl.g:325:1: ruleCaseRule returns [EObject current=null] : (otherlv_0= 'Case' ( (lv_condition_1_0= ruleConditional ) ) otherlv_2= ':' ( (lv_decisions_3_0= ruleDecision ) )+ ) ;
    public final EObject ruleCaseRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_decisions_3_0 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:331:2: ( (otherlv_0= 'Case' ( (lv_condition_1_0= ruleConditional ) ) otherlv_2= ':' ( (lv_decisions_3_0= ruleDecision ) )+ ) )
            // InternalRouterDsl.g:332:2: (otherlv_0= 'Case' ( (lv_condition_1_0= ruleConditional ) ) otherlv_2= ':' ( (lv_decisions_3_0= ruleDecision ) )+ )
            {
            // InternalRouterDsl.g:332:2: (otherlv_0= 'Case' ( (lv_condition_1_0= ruleConditional ) ) otherlv_2= ':' ( (lv_decisions_3_0= ruleDecision ) )+ )
            // InternalRouterDsl.g:333:3: otherlv_0= 'Case' ( (lv_condition_1_0= ruleConditional ) ) otherlv_2= ':' ( (lv_decisions_3_0= ruleDecision ) )+
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseRuleAccess().getCaseKeyword_0());
            		
            // InternalRouterDsl.g:337:3: ( (lv_condition_1_0= ruleConditional ) )
            // InternalRouterDsl.g:338:4: (lv_condition_1_0= ruleConditional )
            {
            // InternalRouterDsl.g:338:4: (lv_condition_1_0= ruleConditional )
            // InternalRouterDsl.g:339:5: lv_condition_1_0= ruleConditional
            {

            					newCompositeNode(grammarAccess.getCaseRuleAccess().getConditionConditionalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_condition_1_0=ruleConditional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"fr.obeo.dsl.designer.sample.flow.routerdsl.RouterDsl.Conditional");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseRuleAccess().getColonKeyword_2());
            		
            // InternalRouterDsl.g:360:3: ( (lv_decisions_3_0= ruleDecision ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=20 && LA5_0<=22)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRouterDsl.g:361:4: (lv_decisions_3_0= ruleDecision )
            	    {
            	    // InternalRouterDsl.g:361:4: (lv_decisions_3_0= ruleDecision )
            	    // InternalRouterDsl.g:362:5: lv_decisions_3_0= ruleDecision
            	    {

            	    					newCompositeNode(grammarAccess.getCaseRuleAccess().getDecisionsDecisionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_decisions_3_0=ruleDecision();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCaseRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"decisions",
            	    						lv_decisions_3_0,
            	    						"fr.obeo.dsl.designer.sample.flow.routerdsl.RouterDsl.Decision");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseRule"


    // $ANTLR start "entryRuleDecision"
    // InternalRouterDsl.g:383:1: entryRuleDecision returns [EObject current=null] : iv_ruleDecision= ruleDecision EOF ;
    public final EObject entryRuleDecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecision = null;


        try {
            // InternalRouterDsl.g:383:49: (iv_ruleDecision= ruleDecision EOF )
            // InternalRouterDsl.g:384:2: iv_ruleDecision= ruleDecision EOF
            {
             newCompositeNode(grammarAccess.getDecisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecision=ruleDecision();

            state._fsp--;

             current =iv_ruleDecision; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecision"


    // $ANTLR start "ruleDecision"
    // InternalRouterDsl.g:390:1: ruleDecision returns [EObject current=null] : ( (this_RouteTo_0= ruleRouteTo | this_MessageDecision_1= ruleMessageDecision ) otherlv_2= ';' ) ;
    public final EObject ruleDecision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_RouteTo_0 = null;

        EObject this_MessageDecision_1 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:396:2: ( ( (this_RouteTo_0= ruleRouteTo | this_MessageDecision_1= ruleMessageDecision ) otherlv_2= ';' ) )
            // InternalRouterDsl.g:397:2: ( (this_RouteTo_0= ruleRouteTo | this_MessageDecision_1= ruleMessageDecision ) otherlv_2= ';' )
            {
            // InternalRouterDsl.g:397:2: ( (this_RouteTo_0= ruleRouteTo | this_MessageDecision_1= ruleMessageDecision ) otherlv_2= ';' )
            // InternalRouterDsl.g:398:3: (this_RouteTo_0= ruleRouteTo | this_MessageDecision_1= ruleMessageDecision ) otherlv_2= ';'
            {
            // InternalRouterDsl.g:398:3: (this_RouteTo_0= ruleRouteTo | this_MessageDecision_1= ruleMessageDecision )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=21 && LA6_0<=22)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRouterDsl.g:399:4: this_RouteTo_0= ruleRouteTo
                    {

                    				newCompositeNode(grammarAccess.getDecisionAccess().getRouteToParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_14);
                    this_RouteTo_0=ruleRouteTo();

                    state._fsp--;


                    				current = this_RouteTo_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:408:4: this_MessageDecision_1= ruleMessageDecision
                    {

                    				newCompositeNode(grammarAccess.getDecisionAccess().getMessageDecisionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_14);
                    this_MessageDecision_1=ruleMessageDecision();

                    state._fsp--;


                    				current = this_MessageDecision_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDecisionAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecision"


    // $ANTLR start "entryRuleMessageDecision"
    // InternalRouterDsl.g:425:1: entryRuleMessageDecision returns [EObject current=null] : iv_ruleMessageDecision= ruleMessageDecision EOF ;
    public final EObject entryRuleMessageDecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDecision = null;


        try {
            // InternalRouterDsl.g:425:56: (iv_ruleMessageDecision= ruleMessageDecision EOF )
            // InternalRouterDsl.g:426:2: iv_ruleMessageDecision= ruleMessageDecision EOF
            {
             newCompositeNode(grammarAccess.getMessageDecisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageDecision=ruleMessageDecision();

            state._fsp--;

             current =iv_ruleMessageDecision; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageDecision"


    // $ANTLR start "ruleMessageDecision"
    // InternalRouterDsl.g:432:1: ruleMessageDecision returns [EObject current=null] : (this_DropMessage_0= ruleDropMessage | this_Alert_1= ruleAlert ) ;
    public final EObject ruleMessageDecision() throws RecognitionException {
        EObject current = null;

        EObject this_DropMessage_0 = null;

        EObject this_Alert_1 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:438:2: ( (this_DropMessage_0= ruleDropMessage | this_Alert_1= ruleAlert ) )
            // InternalRouterDsl.g:439:2: (this_DropMessage_0= ruleDropMessage | this_Alert_1= ruleAlert )
            {
            // InternalRouterDsl.g:439:2: (this_DropMessage_0= ruleDropMessage | this_Alert_1= ruleAlert )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRouterDsl.g:440:3: this_DropMessage_0= ruleDropMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageDecisionAccess().getDropMessageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropMessage_0=ruleDropMessage();

                    state._fsp--;


                    			current = this_DropMessage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:449:3: this_Alert_1= ruleAlert
                    {

                    			newCompositeNode(grammarAccess.getMessageDecisionAccess().getAlertParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Alert_1=ruleAlert();

                    state._fsp--;


                    			current = this_Alert_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageDecision"


    // $ANTLR start "entryRuleRouteTo"
    // InternalRouterDsl.g:461:1: entryRuleRouteTo returns [EObject current=null] : iv_ruleRouteTo= ruleRouteTo EOF ;
    public final EObject entryRuleRouteTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRouteTo = null;


        try {
            // InternalRouterDsl.g:461:48: (iv_ruleRouteTo= ruleRouteTo EOF )
            // InternalRouterDsl.g:462:2: iv_ruleRouteTo= ruleRouteTo EOF
            {
             newCompositeNode(grammarAccess.getRouteToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRouteTo=ruleRouteTo();

            state._fsp--;

             current =iv_ruleRouteTo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRouteTo"


    // $ANTLR start "ruleRouteTo"
    // InternalRouterDsl.g:468:1: ruleRouteTo returns [EObject current=null] : (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRouteTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:474:2: ( (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRouterDsl.g:475:2: (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRouterDsl.g:475:2: (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) )
            // InternalRouterDsl.g:476:3: otherlv_0= '->' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRouteToAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalRouterDsl.g:480:3: ( (otherlv_1= RULE_ID ) )
            // InternalRouterDsl.g:481:4: (otherlv_1= RULE_ID )
            {
            // InternalRouterDsl.g:481:4: (otherlv_1= RULE_ID )
            // InternalRouterDsl.g:482:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouteToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getRouteToAccess().getDestinationProcessorDeclarationCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRouteTo"


    // $ANTLR start "entryRuleDropMessage"
    // InternalRouterDsl.g:497:1: entryRuleDropMessage returns [EObject current=null] : iv_ruleDropMessage= ruleDropMessage EOF ;
    public final EObject entryRuleDropMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropMessage = null;


        try {
            // InternalRouterDsl.g:497:52: (iv_ruleDropMessage= ruleDropMessage EOF )
            // InternalRouterDsl.g:498:2: iv_ruleDropMessage= ruleDropMessage EOF
            {
             newCompositeNode(grammarAccess.getDropMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropMessage=ruleDropMessage();

            state._fsp--;

             current =iv_ruleDropMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDropMessage"


    // $ANTLR start "ruleDropMessage"
    // InternalRouterDsl.g:504:1: ruleDropMessage returns [EObject current=null] : ( () otherlv_1= 'X' ) ;
    public final EObject ruleDropMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:510:2: ( ( () otherlv_1= 'X' ) )
            // InternalRouterDsl.g:511:2: ( () otherlv_1= 'X' )
            {
            // InternalRouterDsl.g:511:2: ( () otherlv_1= 'X' )
            // InternalRouterDsl.g:512:3: () otherlv_1= 'X'
            {
            // InternalRouterDsl.g:512:3: ()
            // InternalRouterDsl.g:513:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDropMessageAccess().getDropMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDropMessageAccess().getXKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDropMessage"


    // $ANTLR start "entryRuleAlert"
    // InternalRouterDsl.g:527:1: entryRuleAlert returns [EObject current=null] : iv_ruleAlert= ruleAlert EOF ;
    public final EObject entryRuleAlert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlert = null;


        try {
            // InternalRouterDsl.g:527:46: (iv_ruleAlert= ruleAlert EOF )
            // InternalRouterDsl.g:528:2: iv_ruleAlert= ruleAlert EOF
            {
             newCompositeNode(grammarAccess.getAlertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlert=ruleAlert();

            state._fsp--;

             current =iv_ruleAlert; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlert"


    // $ANTLR start "ruleAlert"
    // InternalRouterDsl.g:534:1: ruleAlert returns [EObject current=null] : (otherlv_0= '/!\\\\' ( (lv_level_1_0= ruleAlertLevel ) ) otherlv_2= '/!\\\\' ) ;
    public final EObject ruleAlert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_level_1_0 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:540:2: ( (otherlv_0= '/!\\\\' ( (lv_level_1_0= ruleAlertLevel ) ) otherlv_2= '/!\\\\' ) )
            // InternalRouterDsl.g:541:2: (otherlv_0= '/!\\\\' ( (lv_level_1_0= ruleAlertLevel ) ) otherlv_2= '/!\\\\' )
            {
            // InternalRouterDsl.g:541:2: (otherlv_0= '/!\\\\' ( (lv_level_1_0= ruleAlertLevel ) ) otherlv_2= '/!\\\\' )
            // InternalRouterDsl.g:542:3: otherlv_0= '/!\\\\' ( (lv_level_1_0= ruleAlertLevel ) ) otherlv_2= '/!\\\\'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAlertAccess().getSolidusExclamationMarkReverseSolidusKeyword_0());
            		
            // InternalRouterDsl.g:546:3: ( (lv_level_1_0= ruleAlertLevel ) )
            // InternalRouterDsl.g:547:4: (lv_level_1_0= ruleAlertLevel )
            {
            // InternalRouterDsl.g:547:4: (lv_level_1_0= ruleAlertLevel )
            // InternalRouterDsl.g:548:5: lv_level_1_0= ruleAlertLevel
            {

            					newCompositeNode(grammarAccess.getAlertAccess().getLevelAlertLevelEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_level_1_0=ruleAlertLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlertRule());
            					}
            					set(
            						current,
            						"level",
            						lv_level_1_0,
            						"fr.obeo.dsl.designer.sample.flow.routerdsl.RouterDsl.AlertLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAlertAccess().getSolidusExclamationMarkReverseSolidusKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlert"


    // $ANTLR start "entryRuleConditional"
    // InternalRouterDsl.g:573:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalRouterDsl.g:573:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalRouterDsl.g:574:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalRouterDsl.g:580:1: ruleConditional returns [EObject current=null] : ( ( (lv_left_0_0= ruleObjectAccessOrValue ) ) ( (lv_op_1_0= ruleComparison ) ) ( (lv_right_2_0= ruleObjectAccessOrValue ) ) ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:586:2: ( ( ( (lv_left_0_0= ruleObjectAccessOrValue ) ) ( (lv_op_1_0= ruleComparison ) ) ( (lv_right_2_0= ruleObjectAccessOrValue ) ) ) )
            // InternalRouterDsl.g:587:2: ( ( (lv_left_0_0= ruleObjectAccessOrValue ) ) ( (lv_op_1_0= ruleComparison ) ) ( (lv_right_2_0= ruleObjectAccessOrValue ) ) )
            {
            // InternalRouterDsl.g:587:2: ( ( (lv_left_0_0= ruleObjectAccessOrValue ) ) ( (lv_op_1_0= ruleComparison ) ) ( (lv_right_2_0= ruleObjectAccessOrValue ) ) )
            // InternalRouterDsl.g:588:3: ( (lv_left_0_0= ruleObjectAccessOrValue ) ) ( (lv_op_1_0= ruleComparison ) ) ( (lv_right_2_0= ruleObjectAccessOrValue ) )
            {
            // InternalRouterDsl.g:588:3: ( (lv_left_0_0= ruleObjectAccessOrValue ) )
            // InternalRouterDsl.g:589:4: (lv_left_0_0= ruleObjectAccessOrValue )
            {
            // InternalRouterDsl.g:589:4: (lv_left_0_0= ruleObjectAccessOrValue )
            // InternalRouterDsl.g:590:5: lv_left_0_0= ruleObjectAccessOrValue
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getLeftObjectAccessOrValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_left_0_0=ruleObjectAccessOrValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"fr.obeo.dsl.designer.sample.flow.routerdsl.RouterDsl.ObjectAccessOrValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRouterDsl.g:607:3: ( (lv_op_1_0= ruleComparison ) )
            // InternalRouterDsl.g:608:4: (lv_op_1_0= ruleComparison )
            {
            // InternalRouterDsl.g:608:4: (lv_op_1_0= ruleComparison )
            // InternalRouterDsl.g:609:5: lv_op_1_0= ruleComparison
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getOpComparisonEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_op_1_0=ruleComparison();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"fr.obeo.dsl.designer.sample.flow.routerdsl.RouterDsl.Comparison");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRouterDsl.g:626:3: ( (lv_right_2_0= ruleObjectAccessOrValue ) )
            // InternalRouterDsl.g:627:4: (lv_right_2_0= ruleObjectAccessOrValue )
            {
            // InternalRouterDsl.g:627:4: (lv_right_2_0= ruleObjectAccessOrValue )
            // InternalRouterDsl.g:628:5: lv_right_2_0= ruleObjectAccessOrValue
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getRightObjectAccessOrValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleObjectAccessOrValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"fr.obeo.dsl.designer.sample.flow.routerdsl.RouterDsl.ObjectAccessOrValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleObjectAccessOrValue"
    // InternalRouterDsl.g:649:1: entryRuleObjectAccessOrValue returns [EObject current=null] : iv_ruleObjectAccessOrValue= ruleObjectAccessOrValue EOF ;
    public final EObject entryRuleObjectAccessOrValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAccessOrValue = null;


        try {
            // InternalRouterDsl.g:649:60: (iv_ruleObjectAccessOrValue= ruleObjectAccessOrValue EOF )
            // InternalRouterDsl.g:650:2: iv_ruleObjectAccessOrValue= ruleObjectAccessOrValue EOF
            {
             newCompositeNode(grammarAccess.getObjectAccessOrValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectAccessOrValue=ruleObjectAccessOrValue();

            state._fsp--;

             current =iv_ruleObjectAccessOrValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectAccessOrValue"


    // $ANTLR start "ruleObjectAccessOrValue"
    // InternalRouterDsl.g:656:1: ruleObjectAccessOrValue returns [EObject current=null] : (this_ObjectAccess_0= ruleObjectAccess | this_LiteralValue_1= ruleLiteralValue | this_Throughtput_2= ruleThroughtput | this_Temperature_3= ruleTemperature ) ;
    public final EObject ruleObjectAccessOrValue() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectAccess_0 = null;

        EObject this_LiteralValue_1 = null;

        EObject this_Throughtput_2 = null;

        EObject this_Temperature_3 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:662:2: ( (this_ObjectAccess_0= ruleObjectAccess | this_LiteralValue_1= ruleLiteralValue | this_Throughtput_2= ruleThroughtput | this_Temperature_3= ruleTemperature ) )
            // InternalRouterDsl.g:663:2: (this_ObjectAccess_0= ruleObjectAccess | this_LiteralValue_1= ruleLiteralValue | this_Throughtput_2= ruleThroughtput | this_Temperature_3= ruleTemperature )
            {
            // InternalRouterDsl.g:663:2: (this_ObjectAccess_0= ruleObjectAccess | this_LiteralValue_1= ruleLiteralValue | this_Throughtput_2= ruleThroughtput | this_Temperature_3= ruleTemperature )
            int alt8=4;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 18:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                    {
                    alt8=2;
                    }
                    break;
                case 38:
                case 39:
                    {
                    alt8=4;
                    }
                    break;
                case 23:
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRouterDsl.g:664:3: this_ObjectAccess_0= ruleObjectAccess
                    {

                    			newCompositeNode(grammarAccess.getObjectAccessOrValueAccess().getObjectAccessParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectAccess_0=ruleObjectAccess();

                    state._fsp--;


                    			current = this_ObjectAccess_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:673:3: this_LiteralValue_1= ruleLiteralValue
                    {

                    			newCompositeNode(grammarAccess.getObjectAccessOrValueAccess().getLiteralValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralValue_1=ruleLiteralValue();

                    state._fsp--;


                    			current = this_LiteralValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:682:3: this_Throughtput_2= ruleThroughtput
                    {

                    			newCompositeNode(grammarAccess.getObjectAccessOrValueAccess().getThroughtputParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Throughtput_2=ruleThroughtput();

                    state._fsp--;


                    			current = this_Throughtput_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRouterDsl.g:691:3: this_Temperature_3= ruleTemperature
                    {

                    			newCompositeNode(grammarAccess.getObjectAccessOrValueAccess().getTemperatureParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Temperature_3=ruleTemperature();

                    state._fsp--;


                    			current = this_Temperature_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectAccessOrValue"


    // $ANTLR start "entryRuleLiteralValue"
    // InternalRouterDsl.g:703:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // InternalRouterDsl.g:703:53: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalRouterDsl.g:704:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
             newCompositeNode(grammarAccess.getLiteralValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;

             current =iv_ruleLiteralValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralValue"


    // $ANTLR start "ruleLiteralValue"
    // InternalRouterDsl.g:710:1: ruleLiteralValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:716:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRouterDsl.g:717:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRouterDsl.g:717:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRouterDsl.g:718:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRouterDsl.g:718:3: (lv_value_0_0= RULE_INT )
            // InternalRouterDsl.g:719:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getLiteralValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLiteralValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralValue"


    // $ANTLR start "entryRuleThroughtput"
    // InternalRouterDsl.g:738:1: entryRuleThroughtput returns [EObject current=null] : iv_ruleThroughtput= ruleThroughtput EOF ;
    public final EObject entryRuleThroughtput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThroughtput = null;


        try {
            // InternalRouterDsl.g:738:52: (iv_ruleThroughtput= ruleThroughtput EOF )
            // InternalRouterDsl.g:739:2: iv_ruleThroughtput= ruleThroughtput EOF
            {
             newCompositeNode(grammarAccess.getThroughtputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThroughtput=ruleThroughtput();

            state._fsp--;

             current =iv_ruleThroughtput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThroughtput"


    // $ANTLR start "ruleThroughtput"
    // InternalRouterDsl.g:745:1: ruleThroughtput returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleThroughtput() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_unit_2_0 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:751:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // InternalRouterDsl.g:752:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // InternalRouterDsl.g:752:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // InternalRouterDsl.g:753:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // InternalRouterDsl.g:753:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalRouterDsl.g:754:4: (lv_value_0_0= RULE_INT )
            {
            // InternalRouterDsl.g:754:4: (lv_value_0_0= RULE_INT )
            // InternalRouterDsl.g:755:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_value_0_0, grammarAccess.getThroughtputAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThroughtputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getThroughtputAccess().getSolidusKeyword_1());
            		
            // InternalRouterDsl.g:775:3: ( (lv_unit_2_0= ruleTimeUnit ) )
            // InternalRouterDsl.g:776:4: (lv_unit_2_0= ruleTimeUnit )
            {
            // InternalRouterDsl.g:776:4: (lv_unit_2_0= ruleTimeUnit )
            // InternalRouterDsl.g:777:5: lv_unit_2_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getThroughtputAccess().getUnitTimeUnitEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_2_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThroughtputRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_2_0,
            						"fr.obeo.dsl.designer.sample.flow.routerdsl.RouterDsl.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThroughtput"


    // $ANTLR start "entryRuleTemperature"
    // InternalRouterDsl.g:798:1: entryRuleTemperature returns [EObject current=null] : iv_ruleTemperature= ruleTemperature EOF ;
    public final EObject entryRuleTemperature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperature = null;


        try {
            // InternalRouterDsl.g:798:52: (iv_ruleTemperature= ruleTemperature EOF )
            // InternalRouterDsl.g:799:2: iv_ruleTemperature= ruleTemperature EOF
            {
             newCompositeNode(grammarAccess.getTemperatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemperature=ruleTemperature();

            state._fsp--;

             current =iv_ruleTemperature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemperature"


    // $ANTLR start "ruleTemperature"
    // InternalRouterDsl.g:805:1: ruleTemperature returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTemperatureUnit ) ) ) ;
    public final EObject ruleTemperature() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:811:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTemperatureUnit ) ) ) )
            // InternalRouterDsl.g:812:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTemperatureUnit ) ) )
            {
            // InternalRouterDsl.g:812:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTemperatureUnit ) ) )
            // InternalRouterDsl.g:813:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTemperatureUnit ) )
            {
            // InternalRouterDsl.g:813:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalRouterDsl.g:814:4: (lv_value_0_0= RULE_INT )
            {
            // InternalRouterDsl.g:814:4: (lv_value_0_0= RULE_INT )
            // InternalRouterDsl.g:815:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_value_0_0, grammarAccess.getTemperatureAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemperatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalRouterDsl.g:831:3: ( (lv_unit_1_0= ruleTemperatureUnit ) )
            // InternalRouterDsl.g:832:4: (lv_unit_1_0= ruleTemperatureUnit )
            {
            // InternalRouterDsl.g:832:4: (lv_unit_1_0= ruleTemperatureUnit )
            // InternalRouterDsl.g:833:5: lv_unit_1_0= ruleTemperatureUnit
            {

            					newCompositeNode(grammarAccess.getTemperatureAccess().getUnitTemperatureUnitEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_1_0=ruleTemperatureUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTemperatureRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_1_0,
            						"fr.obeo.dsl.designer.sample.flow.routerdsl.RouterDsl.TemperatureUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemperature"


    // $ANTLR start "entryRuleObjectAccess"
    // InternalRouterDsl.g:854:1: entryRuleObjectAccess returns [EObject current=null] : iv_ruleObjectAccess= ruleObjectAccess EOF ;
    public final EObject entryRuleObjectAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAccess = null;


        try {
            // InternalRouterDsl.g:854:53: (iv_ruleObjectAccess= ruleObjectAccess EOF )
            // InternalRouterDsl.g:855:2: iv_ruleObjectAccess= ruleObjectAccess EOF
            {
             newCompositeNode(grammarAccess.getObjectAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectAccess=ruleObjectAccess();

            state._fsp--;

             current =iv_ruleObjectAccess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectAccess"


    // $ANTLR start "ruleObjectAccess"
    // InternalRouterDsl.g:861:1: ruleObjectAccess returns [EObject current=null] : (this_ProcessorAccess_0= ruleProcessorAccess | this_SensorAccess_1= ruleSensorAccess | this_SystemAccess_2= ruleSystemAccess ) ;
    public final EObject ruleObjectAccess() throws RecognitionException {
        EObject current = null;

        EObject this_ProcessorAccess_0 = null;

        EObject this_SensorAccess_1 = null;

        EObject this_SystemAccess_2 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:867:2: ( (this_ProcessorAccess_0= ruleProcessorAccess | this_SensorAccess_1= ruleSensorAccess | this_SystemAccess_2= ruleSystemAccess ) )
            // InternalRouterDsl.g:868:2: (this_ProcessorAccess_0= ruleProcessorAccess | this_SensorAccess_1= ruleSensorAccess | this_SystemAccess_2= ruleSystemAccess )
            {
            // InternalRouterDsl.g:868:2: (this_ProcessorAccess_0= ruleProcessorAccess | this_SensorAccess_1= ruleSensorAccess | this_SystemAccess_2= ruleSystemAccess )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt9=1;
                    }
                    break;
                case 26:
                    {
                    alt9=3;
                    }
                    break;
                case 25:
                    {
                    alt9=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRouterDsl.g:869:3: this_ProcessorAccess_0= ruleProcessorAccess
                    {

                    			newCompositeNode(grammarAccess.getObjectAccessAccess().getProcessorAccessParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessorAccess_0=ruleProcessorAccess();

                    state._fsp--;


                    			current = this_ProcessorAccess_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:878:3: this_SensorAccess_1= ruleSensorAccess
                    {

                    			newCompositeNode(grammarAccess.getObjectAccessAccess().getSensorAccessParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SensorAccess_1=ruleSensorAccess();

                    state._fsp--;


                    			current = this_SensorAccess_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:887:3: this_SystemAccess_2= ruleSystemAccess
                    {

                    			newCompositeNode(grammarAccess.getObjectAccessAccess().getSystemAccessParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemAccess_2=ruleSystemAccess();

                    state._fsp--;


                    			current = this_SystemAccess_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectAccess"


    // $ANTLR start "entryRuleProcessorAccess"
    // InternalRouterDsl.g:899:1: entryRuleProcessorAccess returns [EObject current=null] : iv_ruleProcessorAccess= ruleProcessorAccess EOF ;
    public final EObject entryRuleProcessorAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorAccess = null;


        try {
            // InternalRouterDsl.g:899:56: (iv_ruleProcessorAccess= ruleProcessorAccess EOF )
            // InternalRouterDsl.g:900:2: iv_ruleProcessorAccess= ruleProcessorAccess EOF
            {
             newCompositeNode(grammarAccess.getProcessorAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessorAccess=ruleProcessorAccess();

            state._fsp--;

             current =iv_ruleProcessorAccess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessorAccess"


    // $ANTLR start "ruleProcessorAccess"
    // InternalRouterDsl.g:906:1: ruleProcessorAccess returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleProcessorAttribute ) ) ) ;
    public final EObject ruleProcessorAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:912:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleProcessorAttribute ) ) ) )
            // InternalRouterDsl.g:913:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleProcessorAttribute ) ) )
            {
            // InternalRouterDsl.g:913:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleProcessorAttribute ) ) )
            // InternalRouterDsl.g:914:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleProcessorAttribute ) )
            {
            // InternalRouterDsl.g:914:3: ( (otherlv_0= RULE_ID ) )
            // InternalRouterDsl.g:915:4: (otherlv_0= RULE_ID )
            {
            // InternalRouterDsl.g:915:4: (otherlv_0= RULE_ID )
            // InternalRouterDsl.g:916:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessorAccessRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getProcessorAccessAccess().getProcessorProcessorDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessorAccessAccess().getFullStopKeyword_1());
            		
            // InternalRouterDsl.g:931:3: ( (lv_attribute_2_0= ruleProcessorAttribute ) )
            // InternalRouterDsl.g:932:4: (lv_attribute_2_0= ruleProcessorAttribute )
            {
            // InternalRouterDsl.g:932:4: (lv_attribute_2_0= ruleProcessorAttribute )
            // InternalRouterDsl.g:933:5: lv_attribute_2_0= ruleProcessorAttribute
            {

            					newCompositeNode(grammarAccess.getProcessorAccessAccess().getAttributeProcessorAttributeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_attribute_2_0=ruleProcessorAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessorAccessRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_2_0,
            						"fr.obeo.dsl.designer.sample.flow.routerdsl.RouterDsl.ProcessorAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessorAccess"


    // $ANTLR start "entryRuleSensorAccess"
    // InternalRouterDsl.g:954:1: entryRuleSensorAccess returns [EObject current=null] : iv_ruleSensorAccess= ruleSensorAccess EOF ;
    public final EObject entryRuleSensorAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorAccess = null;


        try {
            // InternalRouterDsl.g:954:53: (iv_ruleSensorAccess= ruleSensorAccess EOF )
            // InternalRouterDsl.g:955:2: iv_ruleSensorAccess= ruleSensorAccess EOF
            {
             newCompositeNode(grammarAccess.getSensorAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorAccess=ruleSensorAccess();

            state._fsp--;

             current =iv_ruleSensorAccess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorAccess"


    // $ANTLR start "ruleSensorAccess"
    // InternalRouterDsl.g:961:1: ruleSensorAccess returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.volume' ) ;
    public final EObject ruleSensorAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:967:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.volume' ) )
            // InternalRouterDsl.g:968:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.volume' )
            {
            // InternalRouterDsl.g:968:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.volume' )
            // InternalRouterDsl.g:969:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.volume'
            {
            // InternalRouterDsl.g:969:3: ( (otherlv_0= RULE_ID ) )
            // InternalRouterDsl.g:970:4: (otherlv_0= RULE_ID )
            {
            // InternalRouterDsl.g:970:4: (otherlv_0= RULE_ID )
            // InternalRouterDsl.g:971:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorAccessRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getSensorAccessAccess().getSensorDataSourceDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccessAccess().getVolumeKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorAccess"


    // $ANTLR start "entryRuleSystemAccess"
    // InternalRouterDsl.g:990:1: entryRuleSystemAccess returns [EObject current=null] : iv_ruleSystemAccess= ruleSystemAccess EOF ;
    public final EObject entryRuleSystemAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemAccess = null;


        try {
            // InternalRouterDsl.g:990:53: (iv_ruleSystemAccess= ruleSystemAccess EOF )
            // InternalRouterDsl.g:991:2: iv_ruleSystemAccess= ruleSystemAccess EOF
            {
             newCompositeNode(grammarAccess.getSystemAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemAccess=ruleSystemAccess();

            state._fsp--;

             current =iv_ruleSystemAccess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemAccess"


    // $ANTLR start "ruleSystemAccess"
    // InternalRouterDsl.g:997:1: ruleSystemAccess returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.temperature' ) ;
    public final EObject ruleSystemAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:1003:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.temperature' ) )
            // InternalRouterDsl.g:1004:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.temperature' )
            {
            // InternalRouterDsl.g:1004:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.temperature' )
            // InternalRouterDsl.g:1005:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.temperature'
            {
            // InternalRouterDsl.g:1005:3: ( (otherlv_0= RULE_ID ) )
            // InternalRouterDsl.g:1006:4: (otherlv_0= RULE_ID )
            {
            // InternalRouterDsl.g:1006:4: (otherlv_0= RULE_ID )
            // InternalRouterDsl.g:1007:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemAccessRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getSystemAccessAccess().getSystemSystemDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccessAccess().getTemperatureKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemAccess"


    // $ANTLR start "ruleProcessorAttribute"
    // InternalRouterDsl.g:1026:1: ruleProcessorAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'capacity' ) | (enumLiteral_1= 'load' ) | (enumLiteral_2= 'consumption' ) ) ;
    public final Enumerator ruleProcessorAttribute() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:1032:2: ( ( (enumLiteral_0= 'capacity' ) | (enumLiteral_1= 'load' ) | (enumLiteral_2= 'consumption' ) ) )
            // InternalRouterDsl.g:1033:2: ( (enumLiteral_0= 'capacity' ) | (enumLiteral_1= 'load' ) | (enumLiteral_2= 'consumption' ) )
            {
            // InternalRouterDsl.g:1033:2: ( (enumLiteral_0= 'capacity' ) | (enumLiteral_1= 'load' ) | (enumLiteral_2= 'consumption' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 28:
                {
                alt10=2;
                }
                break;
            case 29:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRouterDsl.g:1034:3: (enumLiteral_0= 'capacity' )
                    {
                    // InternalRouterDsl.g:1034:3: (enumLiteral_0= 'capacity' )
                    // InternalRouterDsl.g:1035:4: enumLiteral_0= 'capacity'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getProcessorAttributeAccess().getCapacityEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProcessorAttributeAccess().getCapacityEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:1042:3: (enumLiteral_1= 'load' )
                    {
                    // InternalRouterDsl.g:1042:3: (enumLiteral_1= 'load' )
                    // InternalRouterDsl.g:1043:4: enumLiteral_1= 'load'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getProcessorAttributeAccess().getLoadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProcessorAttributeAccess().getLoadEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:1050:3: (enumLiteral_2= 'consumption' )
                    {
                    // InternalRouterDsl.g:1050:3: (enumLiteral_2= 'consumption' )
                    // InternalRouterDsl.g:1051:4: enumLiteral_2= 'consumption'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getProcessorAttributeAccess().getConsumptionEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getProcessorAttributeAccess().getConsumptionEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessorAttribute"


    // $ANTLR start "ruleComparison"
    // InternalRouterDsl.g:1061:1: ruleComparison returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) ) ;
    public final Enumerator ruleComparison() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:1067:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) ) )
            // InternalRouterDsl.g:1068:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) )
            {
            // InternalRouterDsl.g:1068:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            case 34:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRouterDsl.g:1069:3: (enumLiteral_0= '<' )
                    {
                    // InternalRouterDsl.g:1069:3: (enumLiteral_0= '<' )
                    // InternalRouterDsl.g:1070:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getComparisonAccess().getLOWEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonAccess().getLOWEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:1077:3: (enumLiteral_1= '<=' )
                    {
                    // InternalRouterDsl.g:1077:3: (enumLiteral_1= '<=' )
                    // InternalRouterDsl.g:1078:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getComparisonAccess().getLOWER_EQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonAccess().getLOWER_EQEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:1085:3: (enumLiteral_2= '=' )
                    {
                    // InternalRouterDsl.g:1085:3: (enumLiteral_2= '=' )
                    // InternalRouterDsl.g:1086:4: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getComparisonAccess().getEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonAccess().getEQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRouterDsl.g:1093:3: (enumLiteral_3= '>' )
                    {
                    // InternalRouterDsl.g:1093:3: (enumLiteral_3= '>' )
                    // InternalRouterDsl.g:1094:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getComparisonAccess().getHIGHEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisonAccess().getHIGHEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRouterDsl.g:1101:3: (enumLiteral_4= '>=' )
                    {
                    // InternalRouterDsl.g:1101:3: (enumLiteral_4= '>=' )
                    // InternalRouterDsl.g:1102:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getComparisonAccess().getHIGHER_EQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparisonAccess().getHIGHER_EQEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "ruleTimeUnit"
    // InternalRouterDsl.g:1112:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'msec' ) | (enumLiteral_2= 'usec' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:1118:2: ( ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'msec' ) | (enumLiteral_2= 'usec' ) ) )
            // InternalRouterDsl.g:1119:2: ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'msec' ) | (enumLiteral_2= 'usec' ) )
            {
            // InternalRouterDsl.g:1119:2: ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'msec' ) | (enumLiteral_2= 'usec' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt12=1;
                }
                break;
            case 36:
                {
                alt12=2;
                }
                break;
            case 37:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRouterDsl.g:1120:3: (enumLiteral_0= 'sec' )
                    {
                    // InternalRouterDsl.g:1120:3: (enumLiteral_0= 'sec' )
                    // InternalRouterDsl.g:1121:4: enumLiteral_0= 'sec'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:1128:3: (enumLiteral_1= 'msec' )
                    {
                    // InternalRouterDsl.g:1128:3: (enumLiteral_1= 'msec' )
                    // InternalRouterDsl.g:1129:4: enumLiteral_1= 'msec'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMillisecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:1136:3: (enumLiteral_2= 'usec' )
                    {
                    // InternalRouterDsl.g:1136:3: (enumLiteral_2= 'usec' )
                    // InternalRouterDsl.g:1137:4: enumLiteral_2= 'usec'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMicrosecondsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleTemperatureUnit"
    // InternalRouterDsl.g:1147:1: ruleTemperatureUnit returns [Enumerator current=null] : ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) ) ;
    public final Enumerator ruleTemperatureUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:1153:2: ( ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) ) )
            // InternalRouterDsl.g:1154:2: ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) )
            {
            // InternalRouterDsl.g:1154:2: ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            else if ( (LA13_0==39) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRouterDsl.g:1155:3: (enumLiteral_0= '\\u00B0C' )
                    {
                    // InternalRouterDsl.g:1155:3: (enumLiteral_0= '\\u00B0C' )
                    // InternalRouterDsl.g:1156:4: enumLiteral_0= '\\u00B0C'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTemperatureUnitAccess().getCelsiusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTemperatureUnitAccess().getCelsiusEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:1163:3: (enumLiteral_1= '\\u00B0F' )
                    {
                    // InternalRouterDsl.g:1163:3: (enumLiteral_1= '\\u00B0F' )
                    // InternalRouterDsl.g:1164:4: enumLiteral_1= '\\u00B0F'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTemperatureUnitAccess().getFahrenheitEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTemperatureUnitAccess().getFahrenheitEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemperatureUnit"


    // $ANTLR start "ruleAlertLevel"
    // InternalRouterDsl.g:1174:1: ruleAlertLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'critical' ) | (enumLiteral_1= 'major' ) | (enumLiteral_2= 'error' ) | (enumLiteral_3= 'warning' ) ) ;
    public final Enumerator ruleAlertLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:1180:2: ( ( (enumLiteral_0= 'critical' ) | (enumLiteral_1= 'major' ) | (enumLiteral_2= 'error' ) | (enumLiteral_3= 'warning' ) ) )
            // InternalRouterDsl.g:1181:2: ( (enumLiteral_0= 'critical' ) | (enumLiteral_1= 'major' ) | (enumLiteral_2= 'error' ) | (enumLiteral_3= 'warning' ) )
            {
            // InternalRouterDsl.g:1181:2: ( (enumLiteral_0= 'critical' ) | (enumLiteral_1= 'major' ) | (enumLiteral_2= 'error' ) | (enumLiteral_3= 'warning' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt14=1;
                }
                break;
            case 41:
                {
                alt14=2;
                }
                break;
            case 42:
                {
                alt14=3;
                }
                break;
            case 43:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalRouterDsl.g:1182:3: (enumLiteral_0= 'critical' )
                    {
                    // InternalRouterDsl.g:1182:3: (enumLiteral_0= 'critical' )
                    // InternalRouterDsl.g:1183:4: enumLiteral_0= 'critical'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getAlertLevelAccess().getCriticalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAlertLevelAccess().getCriticalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:1190:3: (enumLiteral_1= 'major' )
                    {
                    // InternalRouterDsl.g:1190:3: (enumLiteral_1= 'major' )
                    // InternalRouterDsl.g:1191:4: enumLiteral_1= 'major'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getAlertLevelAccess().getMajorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAlertLevelAccess().getMajorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:1198:3: (enumLiteral_2= 'error' )
                    {
                    // InternalRouterDsl.g:1198:3: (enumLiteral_2= 'error' )
                    // InternalRouterDsl.g:1199:4: enumLiteral_2= 'error'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getAlertLevelAccess().getErrorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAlertLevelAccess().getErrorEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRouterDsl.g:1206:3: (enumLiteral_3= 'warning' )
                    {
                    // InternalRouterDsl.g:1206:3: (enumLiteral_3= 'warning' )
                    // InternalRouterDsl.g:1207:4: enumLiteral_3= 'warning'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getAlertLevelAccess().getWarningEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAlertLevelAccess().getWarningEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlertLevel"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000019800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});

}