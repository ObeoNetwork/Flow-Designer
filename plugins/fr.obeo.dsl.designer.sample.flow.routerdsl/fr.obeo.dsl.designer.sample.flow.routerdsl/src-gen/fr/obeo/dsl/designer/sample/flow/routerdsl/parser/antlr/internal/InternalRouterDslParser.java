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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'Case'", "':'", "';'", "'->'", "'X'", "'/!\\\\'", "'/'", "'.'", "'.volume'", "'.temperature'", "'capacity'", "'load'", "'consumption'", "'<'", "'<='", "'='", "'>'", "'>='", "'sec'", "'msec'", "'usec'", "'\\u00B0C'", "'\\u00B0F'", "'critical'", "'major'", "'error'", "'warning'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalRouterDsl.g:72:1: ruleRoutingRules returns [EObject current=null] : ( () otherlv_1= '#' ( (lv_rules_2_0= ruleCaseRule ) )* ) ;
    public final EObject ruleRoutingRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:78:2: ( ( () otherlv_1= '#' ( (lv_rules_2_0= ruleCaseRule ) )* ) )
            // InternalRouterDsl.g:79:2: ( () otherlv_1= '#' ( (lv_rules_2_0= ruleCaseRule ) )* )
            {
            // InternalRouterDsl.g:79:2: ( () otherlv_1= '#' ( (lv_rules_2_0= ruleCaseRule ) )* )
            // InternalRouterDsl.g:80:3: () otherlv_1= '#' ( (lv_rules_2_0= ruleCaseRule ) )*
            {
            // InternalRouterDsl.g:80:3: ()
            // InternalRouterDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoutingRulesAccess().getRoutingRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoutingRulesAccess().getNumberSignKeyword_1());
            		
            // InternalRouterDsl.g:91:3: ( (lv_rules_2_0= ruleCaseRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRouterDsl.g:92:4: (lv_rules_2_0= ruleCaseRule )
            	    {
            	    // InternalRouterDsl.g:92:4: (lv_rules_2_0= ruleCaseRule )
            	    // InternalRouterDsl.g:93:5: lv_rules_2_0= ruleCaseRule
            	    {

            	    					newCompositeNode(grammarAccess.getRoutingRulesAccess().getRulesCaseRuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_rules_2_0=ruleCaseRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoutingRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_2_0,
            	    						"fr.obeo.dsl.designer.sample.flow.routerdsl.RouterDsl.CaseRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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


    // $ANTLR start "entryRuleCaseRule"
    // InternalRouterDsl.g:114:1: entryRuleCaseRule returns [EObject current=null] : iv_ruleCaseRule= ruleCaseRule EOF ;
    public final EObject entryRuleCaseRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseRule = null;


        try {
            // InternalRouterDsl.g:114:49: (iv_ruleCaseRule= ruleCaseRule EOF )
            // InternalRouterDsl.g:115:2: iv_ruleCaseRule= ruleCaseRule EOF
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
    // InternalRouterDsl.g:121:1: ruleCaseRule returns [EObject current=null] : (otherlv_0= 'Case' ( (lv_condition_1_0= ruleConditional ) ) otherlv_2= ':' ( (lv_decisions_3_0= ruleDecision ) )+ ) ;
    public final EObject ruleCaseRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_decisions_3_0 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:127:2: ( (otherlv_0= 'Case' ( (lv_condition_1_0= ruleConditional ) ) otherlv_2= ':' ( (lv_decisions_3_0= ruleDecision ) )+ ) )
            // InternalRouterDsl.g:128:2: (otherlv_0= 'Case' ( (lv_condition_1_0= ruleConditional ) ) otherlv_2= ':' ( (lv_decisions_3_0= ruleDecision ) )+ )
            {
            // InternalRouterDsl.g:128:2: (otherlv_0= 'Case' ( (lv_condition_1_0= ruleConditional ) ) otherlv_2= ':' ( (lv_decisions_3_0= ruleDecision ) )+ )
            // InternalRouterDsl.g:129:3: otherlv_0= 'Case' ( (lv_condition_1_0= ruleConditional ) ) otherlv_2= ':' ( (lv_decisions_3_0= ruleDecision ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseRuleAccess().getCaseKeyword_0());
            		
            // InternalRouterDsl.g:133:3: ( (lv_condition_1_0= ruleConditional ) )
            // InternalRouterDsl.g:134:4: (lv_condition_1_0= ruleConditional )
            {
            // InternalRouterDsl.g:134:4: (lv_condition_1_0= ruleConditional )
            // InternalRouterDsl.g:135:5: lv_condition_1_0= ruleConditional
            {

            					newCompositeNode(grammarAccess.getCaseRuleAccess().getConditionConditionalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseRuleAccess().getColonKeyword_2());
            		
            // InternalRouterDsl.g:156:3: ( (lv_decisions_3_0= ruleDecision ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=17)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRouterDsl.g:157:4: (lv_decisions_3_0= ruleDecision )
            	    {
            	    // InternalRouterDsl.g:157:4: (lv_decisions_3_0= ruleDecision )
            	    // InternalRouterDsl.g:158:5: lv_decisions_3_0= ruleDecision
            	    {

            	    					newCompositeNode(grammarAccess.getCaseRuleAccess().getDecisionsDecisionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // InternalRouterDsl.g:179:1: entryRuleDecision returns [EObject current=null] : iv_ruleDecision= ruleDecision EOF ;
    public final EObject entryRuleDecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecision = null;


        try {
            // InternalRouterDsl.g:179:49: (iv_ruleDecision= ruleDecision EOF )
            // InternalRouterDsl.g:180:2: iv_ruleDecision= ruleDecision EOF
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
    // InternalRouterDsl.g:186:1: ruleDecision returns [EObject current=null] : ( (this_RouteTo_0= ruleRouteTo | this_MessageDecision_1= ruleMessageDecision ) otherlv_2= ';' ) ;
    public final EObject ruleDecision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_RouteTo_0 = null;

        EObject this_MessageDecision_1 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:192:2: ( ( (this_RouteTo_0= ruleRouteTo | this_MessageDecision_1= ruleMessageDecision ) otherlv_2= ';' ) )
            // InternalRouterDsl.g:193:2: ( (this_RouteTo_0= ruleRouteTo | this_MessageDecision_1= ruleMessageDecision ) otherlv_2= ';' )
            {
            // InternalRouterDsl.g:193:2: ( (this_RouteTo_0= ruleRouteTo | this_MessageDecision_1= ruleMessageDecision ) otherlv_2= ';' )
            // InternalRouterDsl.g:194:3: (this_RouteTo_0= ruleRouteTo | this_MessageDecision_1= ruleMessageDecision ) otherlv_2= ';'
            {
            // InternalRouterDsl.g:194:3: (this_RouteTo_0= ruleRouteTo | this_MessageDecision_1= ruleMessageDecision )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=16 && LA3_0<=17)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRouterDsl.g:195:4: this_RouteTo_0= ruleRouteTo
                    {

                    				newCompositeNode(grammarAccess.getDecisionAccess().getRouteToParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_8);
                    this_RouteTo_0=ruleRouteTo();

                    state._fsp--;


                    				current = this_RouteTo_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:204:4: this_MessageDecision_1= ruleMessageDecision
                    {

                    				newCompositeNode(grammarAccess.getDecisionAccess().getMessageDecisionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_MessageDecision_1=ruleMessageDecision();

                    state._fsp--;


                    				current = this_MessageDecision_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRouterDsl.g:221:1: entryRuleMessageDecision returns [EObject current=null] : iv_ruleMessageDecision= ruleMessageDecision EOF ;
    public final EObject entryRuleMessageDecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDecision = null;


        try {
            // InternalRouterDsl.g:221:56: (iv_ruleMessageDecision= ruleMessageDecision EOF )
            // InternalRouterDsl.g:222:2: iv_ruleMessageDecision= ruleMessageDecision EOF
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
    // InternalRouterDsl.g:228:1: ruleMessageDecision returns [EObject current=null] : (this_DropMessage_0= ruleDropMessage | this_Alert_1= ruleAlert ) ;
    public final EObject ruleMessageDecision() throws RecognitionException {
        EObject current = null;

        EObject this_DropMessage_0 = null;

        EObject this_Alert_1 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:234:2: ( (this_DropMessage_0= ruleDropMessage | this_Alert_1= ruleAlert ) )
            // InternalRouterDsl.g:235:2: (this_DropMessage_0= ruleDropMessage | this_Alert_1= ruleAlert )
            {
            // InternalRouterDsl.g:235:2: (this_DropMessage_0= ruleDropMessage | this_Alert_1= ruleAlert )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRouterDsl.g:236:3: this_DropMessage_0= ruleDropMessage
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
                    // InternalRouterDsl.g:245:3: this_Alert_1= ruleAlert
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
    // InternalRouterDsl.g:257:1: entryRuleRouteTo returns [EObject current=null] : iv_ruleRouteTo= ruleRouteTo EOF ;
    public final EObject entryRuleRouteTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRouteTo = null;


        try {
            // InternalRouterDsl.g:257:48: (iv_ruleRouteTo= ruleRouteTo EOF )
            // InternalRouterDsl.g:258:2: iv_ruleRouteTo= ruleRouteTo EOF
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
    // InternalRouterDsl.g:264:1: ruleRouteTo returns [EObject current=null] : (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRouteTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:270:2: ( (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRouterDsl.g:271:2: (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRouterDsl.g:271:2: (otherlv_0= '->' ( (otherlv_1= RULE_ID ) ) )
            // InternalRouterDsl.g:272:3: otherlv_0= '->' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRouteToAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalRouterDsl.g:276:3: ( (otherlv_1= RULE_ID ) )
            // InternalRouterDsl.g:277:4: (otherlv_1= RULE_ID )
            {
            // InternalRouterDsl.g:277:4: (otherlv_1= RULE_ID )
            // InternalRouterDsl.g:278:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouteToRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getRouteToAccess().getDestinationProcessorCrossReference_1_0());
            				

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
    // InternalRouterDsl.g:293:1: entryRuleDropMessage returns [EObject current=null] : iv_ruleDropMessage= ruleDropMessage EOF ;
    public final EObject entryRuleDropMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropMessage = null;


        try {
            // InternalRouterDsl.g:293:52: (iv_ruleDropMessage= ruleDropMessage EOF )
            // InternalRouterDsl.g:294:2: iv_ruleDropMessage= ruleDropMessage EOF
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
    // InternalRouterDsl.g:300:1: ruleDropMessage returns [EObject current=null] : ( () otherlv_1= 'X' ) ;
    public final EObject ruleDropMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:306:2: ( ( () otherlv_1= 'X' ) )
            // InternalRouterDsl.g:307:2: ( () otherlv_1= 'X' )
            {
            // InternalRouterDsl.g:307:2: ( () otherlv_1= 'X' )
            // InternalRouterDsl.g:308:3: () otherlv_1= 'X'
            {
            // InternalRouterDsl.g:308:3: ()
            // InternalRouterDsl.g:309:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDropMessageAccess().getDropMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_2); 

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
    // InternalRouterDsl.g:323:1: entryRuleAlert returns [EObject current=null] : iv_ruleAlert= ruleAlert EOF ;
    public final EObject entryRuleAlert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlert = null;


        try {
            // InternalRouterDsl.g:323:46: (iv_ruleAlert= ruleAlert EOF )
            // InternalRouterDsl.g:324:2: iv_ruleAlert= ruleAlert EOF
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
    // InternalRouterDsl.g:330:1: ruleAlert returns [EObject current=null] : (otherlv_0= '/!\\\\' ( (lv_level_1_0= ruleAlertLevel ) ) otherlv_2= '/!\\\\' ) ;
    public final EObject ruleAlert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_level_1_0 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:336:2: ( (otherlv_0= '/!\\\\' ( (lv_level_1_0= ruleAlertLevel ) ) otherlv_2= '/!\\\\' ) )
            // InternalRouterDsl.g:337:2: (otherlv_0= '/!\\\\' ( (lv_level_1_0= ruleAlertLevel ) ) otherlv_2= '/!\\\\' )
            {
            // InternalRouterDsl.g:337:2: (otherlv_0= '/!\\\\' ( (lv_level_1_0= ruleAlertLevel ) ) otherlv_2= '/!\\\\' )
            // InternalRouterDsl.g:338:3: otherlv_0= '/!\\\\' ( (lv_level_1_0= ruleAlertLevel ) ) otherlv_2= '/!\\\\'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAlertAccess().getSolidusExclamationMarkReverseSolidusKeyword_0());
            		
            // InternalRouterDsl.g:342:3: ( (lv_level_1_0= ruleAlertLevel ) )
            // InternalRouterDsl.g:343:4: (lv_level_1_0= ruleAlertLevel )
            {
            // InternalRouterDsl.g:343:4: (lv_level_1_0= ruleAlertLevel )
            // InternalRouterDsl.g:344:5: lv_level_1_0= ruleAlertLevel
            {

            					newCompositeNode(grammarAccess.getAlertAccess().getLevelAlertLevelEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

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
    // InternalRouterDsl.g:369:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalRouterDsl.g:369:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalRouterDsl.g:370:2: iv_ruleConditional= ruleConditional EOF
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
    // InternalRouterDsl.g:376:1: ruleConditional returns [EObject current=null] : ( ( (lv_left_0_0= ruleObjectAccessOrValue ) ) ( (lv_op_1_0= ruleComparison ) ) ( (lv_right_2_0= ruleObjectAccessOrValue ) ) ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:382:2: ( ( ( (lv_left_0_0= ruleObjectAccessOrValue ) ) ( (lv_op_1_0= ruleComparison ) ) ( (lv_right_2_0= ruleObjectAccessOrValue ) ) ) )
            // InternalRouterDsl.g:383:2: ( ( (lv_left_0_0= ruleObjectAccessOrValue ) ) ( (lv_op_1_0= ruleComparison ) ) ( (lv_right_2_0= ruleObjectAccessOrValue ) ) )
            {
            // InternalRouterDsl.g:383:2: ( ( (lv_left_0_0= ruleObjectAccessOrValue ) ) ( (lv_op_1_0= ruleComparison ) ) ( (lv_right_2_0= ruleObjectAccessOrValue ) ) )
            // InternalRouterDsl.g:384:3: ( (lv_left_0_0= ruleObjectAccessOrValue ) ) ( (lv_op_1_0= ruleComparison ) ) ( (lv_right_2_0= ruleObjectAccessOrValue ) )
            {
            // InternalRouterDsl.g:384:3: ( (lv_left_0_0= ruleObjectAccessOrValue ) )
            // InternalRouterDsl.g:385:4: (lv_left_0_0= ruleObjectAccessOrValue )
            {
            // InternalRouterDsl.g:385:4: (lv_left_0_0= ruleObjectAccessOrValue )
            // InternalRouterDsl.g:386:5: lv_left_0_0= ruleObjectAccessOrValue
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getLeftObjectAccessOrValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalRouterDsl.g:403:3: ( (lv_op_1_0= ruleComparison ) )
            // InternalRouterDsl.g:404:4: (lv_op_1_0= ruleComparison )
            {
            // InternalRouterDsl.g:404:4: (lv_op_1_0= ruleComparison )
            // InternalRouterDsl.g:405:5: lv_op_1_0= ruleComparison
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getOpComparisonEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            // InternalRouterDsl.g:422:3: ( (lv_right_2_0= ruleObjectAccessOrValue ) )
            // InternalRouterDsl.g:423:4: (lv_right_2_0= ruleObjectAccessOrValue )
            {
            // InternalRouterDsl.g:423:4: (lv_right_2_0= ruleObjectAccessOrValue )
            // InternalRouterDsl.g:424:5: lv_right_2_0= ruleObjectAccessOrValue
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
    // InternalRouterDsl.g:445:1: entryRuleObjectAccessOrValue returns [EObject current=null] : iv_ruleObjectAccessOrValue= ruleObjectAccessOrValue EOF ;
    public final EObject entryRuleObjectAccessOrValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAccessOrValue = null;


        try {
            // InternalRouterDsl.g:445:60: (iv_ruleObjectAccessOrValue= ruleObjectAccessOrValue EOF )
            // InternalRouterDsl.g:446:2: iv_ruleObjectAccessOrValue= ruleObjectAccessOrValue EOF
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
    // InternalRouterDsl.g:452:1: ruleObjectAccessOrValue returns [EObject current=null] : (this_ObjectAccess_0= ruleObjectAccess | this_LiteralValue_1= ruleLiteralValue | this_Throughtput_2= ruleThroughtput | this_Temperature_3= ruleTemperature ) ;
    public final EObject ruleObjectAccessOrValue() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectAccess_0 = null;

        EObject this_LiteralValue_1 = null;

        EObject this_Throughtput_2 = null;

        EObject this_Temperature_3 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:458:2: ( (this_ObjectAccess_0= ruleObjectAccess | this_LiteralValue_1= ruleLiteralValue | this_Throughtput_2= ruleThroughtput | this_Temperature_3= ruleTemperature ) )
            // InternalRouterDsl.g:459:2: (this_ObjectAccess_0= ruleObjectAccess | this_LiteralValue_1= ruleLiteralValue | this_Throughtput_2= ruleThroughtput | this_Temperature_3= ruleTemperature )
            {
            // InternalRouterDsl.g:459:2: (this_ObjectAccess_0= ruleObjectAccess | this_LiteralValue_1= ruleLiteralValue | this_Throughtput_2= ruleThroughtput | this_Temperature_3= ruleTemperature )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt5=3;
                    }
                    break;
                case EOF:
                case 13:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    {
                    alt5=2;
                    }
                    break;
                case 33:
                case 34:
                    {
                    alt5=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRouterDsl.g:460:3: this_ObjectAccess_0= ruleObjectAccess
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
                    // InternalRouterDsl.g:469:3: this_LiteralValue_1= ruleLiteralValue
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
                    // InternalRouterDsl.g:478:3: this_Throughtput_2= ruleThroughtput
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
                    // InternalRouterDsl.g:487:3: this_Temperature_3= ruleTemperature
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
    // InternalRouterDsl.g:499:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // InternalRouterDsl.g:499:53: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalRouterDsl.g:500:2: iv_ruleLiteralValue= ruleLiteralValue EOF
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
    // InternalRouterDsl.g:506:1: ruleLiteralValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:512:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRouterDsl.g:513:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRouterDsl.g:513:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRouterDsl.g:514:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRouterDsl.g:514:3: (lv_value_0_0= RULE_INT )
            // InternalRouterDsl.g:515:4: lv_value_0_0= RULE_INT
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
    // InternalRouterDsl.g:534:1: entryRuleThroughtput returns [EObject current=null] : iv_ruleThroughtput= ruleThroughtput EOF ;
    public final EObject entryRuleThroughtput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThroughtput = null;


        try {
            // InternalRouterDsl.g:534:52: (iv_ruleThroughtput= ruleThroughtput EOF )
            // InternalRouterDsl.g:535:2: iv_ruleThroughtput= ruleThroughtput EOF
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
    // InternalRouterDsl.g:541:1: ruleThroughtput returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleThroughtput() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_unit_2_0 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:547:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // InternalRouterDsl.g:548:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // InternalRouterDsl.g:548:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // InternalRouterDsl.g:549:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // InternalRouterDsl.g:549:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalRouterDsl.g:550:4: (lv_value_0_0= RULE_INT )
            {
            // InternalRouterDsl.g:550:4: (lv_value_0_0= RULE_INT )
            // InternalRouterDsl.g:551:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getThroughtputAccess().getSolidusKeyword_1());
            		
            // InternalRouterDsl.g:571:3: ( (lv_unit_2_0= ruleTimeUnit ) )
            // InternalRouterDsl.g:572:4: (lv_unit_2_0= ruleTimeUnit )
            {
            // InternalRouterDsl.g:572:4: (lv_unit_2_0= ruleTimeUnit )
            // InternalRouterDsl.g:573:5: lv_unit_2_0= ruleTimeUnit
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
    // InternalRouterDsl.g:594:1: entryRuleTemperature returns [EObject current=null] : iv_ruleTemperature= ruleTemperature EOF ;
    public final EObject entryRuleTemperature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperature = null;


        try {
            // InternalRouterDsl.g:594:52: (iv_ruleTemperature= ruleTemperature EOF )
            // InternalRouterDsl.g:595:2: iv_ruleTemperature= ruleTemperature EOF
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
    // InternalRouterDsl.g:601:1: ruleTemperature returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTemperatureUnit ) ) ) ;
    public final EObject ruleTemperature() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:607:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTemperatureUnit ) ) ) )
            // InternalRouterDsl.g:608:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTemperatureUnit ) ) )
            {
            // InternalRouterDsl.g:608:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTemperatureUnit ) ) )
            // InternalRouterDsl.g:609:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTemperatureUnit ) )
            {
            // InternalRouterDsl.g:609:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalRouterDsl.g:610:4: (lv_value_0_0= RULE_INT )
            {
            // InternalRouterDsl.g:610:4: (lv_value_0_0= RULE_INT )
            // InternalRouterDsl.g:611:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            // InternalRouterDsl.g:627:3: ( (lv_unit_1_0= ruleTemperatureUnit ) )
            // InternalRouterDsl.g:628:4: (lv_unit_1_0= ruleTemperatureUnit )
            {
            // InternalRouterDsl.g:628:4: (lv_unit_1_0= ruleTemperatureUnit )
            // InternalRouterDsl.g:629:5: lv_unit_1_0= ruleTemperatureUnit
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
    // InternalRouterDsl.g:650:1: entryRuleObjectAccess returns [EObject current=null] : iv_ruleObjectAccess= ruleObjectAccess EOF ;
    public final EObject entryRuleObjectAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAccess = null;


        try {
            // InternalRouterDsl.g:650:53: (iv_ruleObjectAccess= ruleObjectAccess EOF )
            // InternalRouterDsl.g:651:2: iv_ruleObjectAccess= ruleObjectAccess EOF
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
    // InternalRouterDsl.g:657:1: ruleObjectAccess returns [EObject current=null] : (this_ProcessorAccess_0= ruleProcessorAccess | this_SensorAccess_1= ruleSensorAccess | this_SystemAccess_2= ruleSystemAccess ) ;
    public final EObject ruleObjectAccess() throws RecognitionException {
        EObject current = null;

        EObject this_ProcessorAccess_0 = null;

        EObject this_SensorAccess_1 = null;

        EObject this_SystemAccess_2 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:663:2: ( (this_ProcessorAccess_0= ruleProcessorAccess | this_SensorAccess_1= ruleSensorAccess | this_SystemAccess_2= ruleSystemAccess ) )
            // InternalRouterDsl.g:664:2: (this_ProcessorAccess_0= ruleProcessorAccess | this_SensorAccess_1= ruleSensorAccess | this_SystemAccess_2= ruleSystemAccess )
            {
            // InternalRouterDsl.g:664:2: (this_ProcessorAccess_0= ruleProcessorAccess | this_SensorAccess_1= ruleSensorAccess | this_SystemAccess_2= ruleSystemAccess )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 21:
                    {
                    alt6=3;
                    }
                    break;
                case 20:
                    {
                    alt6=2;
                    }
                    break;
                case 19:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRouterDsl.g:665:3: this_ProcessorAccess_0= ruleProcessorAccess
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
                    // InternalRouterDsl.g:674:3: this_SensorAccess_1= ruleSensorAccess
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
                    // InternalRouterDsl.g:683:3: this_SystemAccess_2= ruleSystemAccess
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
    // InternalRouterDsl.g:695:1: entryRuleProcessorAccess returns [EObject current=null] : iv_ruleProcessorAccess= ruleProcessorAccess EOF ;
    public final EObject entryRuleProcessorAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorAccess = null;


        try {
            // InternalRouterDsl.g:695:56: (iv_ruleProcessorAccess= ruleProcessorAccess EOF )
            // InternalRouterDsl.g:696:2: iv_ruleProcessorAccess= ruleProcessorAccess EOF
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
    // InternalRouterDsl.g:702:1: ruleProcessorAccess returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleProcessorAttribute ) ) ) ;
    public final EObject ruleProcessorAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalRouterDsl.g:708:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleProcessorAttribute ) ) ) )
            // InternalRouterDsl.g:709:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleProcessorAttribute ) ) )
            {
            // InternalRouterDsl.g:709:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleProcessorAttribute ) ) )
            // InternalRouterDsl.g:710:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= ruleProcessorAttribute ) )
            {
            // InternalRouterDsl.g:710:3: ( (otherlv_0= RULE_ID ) )
            // InternalRouterDsl.g:711:4: (otherlv_0= RULE_ID )
            {
            // InternalRouterDsl.g:711:4: (otherlv_0= RULE_ID )
            // InternalRouterDsl.g:712:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessorAccessRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_0, grammarAccess.getProcessorAccessAccess().getProcessorProcessorCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessorAccessAccess().getFullStopKeyword_1());
            		
            // InternalRouterDsl.g:727:3: ( (lv_attribute_2_0= ruleProcessorAttribute ) )
            // InternalRouterDsl.g:728:4: (lv_attribute_2_0= ruleProcessorAttribute )
            {
            // InternalRouterDsl.g:728:4: (lv_attribute_2_0= ruleProcessorAttribute )
            // InternalRouterDsl.g:729:5: lv_attribute_2_0= ruleProcessorAttribute
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
    // InternalRouterDsl.g:750:1: entryRuleSensorAccess returns [EObject current=null] : iv_ruleSensorAccess= ruleSensorAccess EOF ;
    public final EObject entryRuleSensorAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorAccess = null;


        try {
            // InternalRouterDsl.g:750:53: (iv_ruleSensorAccess= ruleSensorAccess EOF )
            // InternalRouterDsl.g:751:2: iv_ruleSensorAccess= ruleSensorAccess EOF
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
    // InternalRouterDsl.g:757:1: ruleSensorAccess returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.volume' ) ;
    public final EObject ruleSensorAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:763:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.volume' ) )
            // InternalRouterDsl.g:764:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.volume' )
            {
            // InternalRouterDsl.g:764:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.volume' )
            // InternalRouterDsl.g:765:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.volume'
            {
            // InternalRouterDsl.g:765:3: ( (otherlv_0= RULE_ID ) )
            // InternalRouterDsl.g:766:4: (otherlv_0= RULE_ID )
            {
            // InternalRouterDsl.g:766:4: (otherlv_0= RULE_ID )
            // InternalRouterDsl.g:767:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorAccessRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getSensorAccessAccess().getSensorDataSourceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

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
    // InternalRouterDsl.g:786:1: entryRuleSystemAccess returns [EObject current=null] : iv_ruleSystemAccess= ruleSystemAccess EOF ;
    public final EObject entryRuleSystemAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemAccess = null;


        try {
            // InternalRouterDsl.g:786:53: (iv_ruleSystemAccess= ruleSystemAccess EOF )
            // InternalRouterDsl.g:787:2: iv_ruleSystemAccess= ruleSystemAccess EOF
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
    // InternalRouterDsl.g:793:1: ruleSystemAccess returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.temperature' ) ;
    public final EObject ruleSystemAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:799:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.temperature' ) )
            // InternalRouterDsl.g:800:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.temperature' )
            {
            // InternalRouterDsl.g:800:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.temperature' )
            // InternalRouterDsl.g:801:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.temperature'
            {
            // InternalRouterDsl.g:801:3: ( (otherlv_0= RULE_ID ) )
            // InternalRouterDsl.g:802:4: (otherlv_0= RULE_ID )
            {
            // InternalRouterDsl.g:802:4: (otherlv_0= RULE_ID )
            // InternalRouterDsl.g:803:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemAccessRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_0, grammarAccess.getSystemAccessAccess().getSystemSystemCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRouterDsl.g:822:1: ruleProcessorAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'capacity' ) | (enumLiteral_1= 'load' ) | (enumLiteral_2= 'consumption' ) ) ;
    public final Enumerator ruleProcessorAttribute() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:828:2: ( ( (enumLiteral_0= 'capacity' ) | (enumLiteral_1= 'load' ) | (enumLiteral_2= 'consumption' ) ) )
            // InternalRouterDsl.g:829:2: ( (enumLiteral_0= 'capacity' ) | (enumLiteral_1= 'load' ) | (enumLiteral_2= 'consumption' ) )
            {
            // InternalRouterDsl.g:829:2: ( (enumLiteral_0= 'capacity' ) | (enumLiteral_1= 'load' ) | (enumLiteral_2= 'consumption' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRouterDsl.g:830:3: (enumLiteral_0= 'capacity' )
                    {
                    // InternalRouterDsl.g:830:3: (enumLiteral_0= 'capacity' )
                    // InternalRouterDsl.g:831:4: enumLiteral_0= 'capacity'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getProcessorAttributeAccess().getCapacityEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProcessorAttributeAccess().getCapacityEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:838:3: (enumLiteral_1= 'load' )
                    {
                    // InternalRouterDsl.g:838:3: (enumLiteral_1= 'load' )
                    // InternalRouterDsl.g:839:4: enumLiteral_1= 'load'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getProcessorAttributeAccess().getLoadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProcessorAttributeAccess().getLoadEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:846:3: (enumLiteral_2= 'consumption' )
                    {
                    // InternalRouterDsl.g:846:3: (enumLiteral_2= 'consumption' )
                    // InternalRouterDsl.g:847:4: enumLiteral_2= 'consumption'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

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
    // InternalRouterDsl.g:857:1: ruleComparison returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) ) ;
    public final Enumerator ruleComparison() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:863:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) ) )
            // InternalRouterDsl.g:864:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) )
            {
            // InternalRouterDsl.g:864:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt8=1;
                }
                break;
            case 26:
                {
                alt8=2;
                }
                break;
            case 27:
                {
                alt8=3;
                }
                break;
            case 28:
                {
                alt8=4;
                }
                break;
            case 29:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRouterDsl.g:865:3: (enumLiteral_0= '<' )
                    {
                    // InternalRouterDsl.g:865:3: (enumLiteral_0= '<' )
                    // InternalRouterDsl.g:866:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getComparisonAccess().getLOWEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonAccess().getLOWEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:873:3: (enumLiteral_1= '<=' )
                    {
                    // InternalRouterDsl.g:873:3: (enumLiteral_1= '<=' )
                    // InternalRouterDsl.g:874:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getComparisonAccess().getLOWER_EQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonAccess().getLOWER_EQEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:881:3: (enumLiteral_2= '=' )
                    {
                    // InternalRouterDsl.g:881:3: (enumLiteral_2= '=' )
                    // InternalRouterDsl.g:882:4: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getComparisonAccess().getEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonAccess().getEQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRouterDsl.g:889:3: (enumLiteral_3= '>' )
                    {
                    // InternalRouterDsl.g:889:3: (enumLiteral_3= '>' )
                    // InternalRouterDsl.g:890:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getComparisonAccess().getHIGHEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisonAccess().getHIGHEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRouterDsl.g:897:3: (enumLiteral_4= '>=' )
                    {
                    // InternalRouterDsl.g:897:3: (enumLiteral_4= '>=' )
                    // InternalRouterDsl.g:898:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRouterDsl.g:908:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'msec' ) | (enumLiteral_2= 'usec' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:914:2: ( ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'msec' ) | (enumLiteral_2= 'usec' ) ) )
            // InternalRouterDsl.g:915:2: ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'msec' ) | (enumLiteral_2= 'usec' ) )
            {
            // InternalRouterDsl.g:915:2: ( (enumLiteral_0= 'sec' ) | (enumLiteral_1= 'msec' ) | (enumLiteral_2= 'usec' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                alt9=2;
                }
                break;
            case 32:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRouterDsl.g:916:3: (enumLiteral_0= 'sec' )
                    {
                    // InternalRouterDsl.g:916:3: (enumLiteral_0= 'sec' )
                    // InternalRouterDsl.g:917:4: enumLiteral_0= 'sec'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:924:3: (enumLiteral_1= 'msec' )
                    {
                    // InternalRouterDsl.g:924:3: (enumLiteral_1= 'msec' )
                    // InternalRouterDsl.g:925:4: enumLiteral_1= 'msec'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMillisecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:932:3: (enumLiteral_2= 'usec' )
                    {
                    // InternalRouterDsl.g:932:3: (enumLiteral_2= 'usec' )
                    // InternalRouterDsl.g:933:4: enumLiteral_2= 'usec'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

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
    // InternalRouterDsl.g:943:1: ruleTemperatureUnit returns [Enumerator current=null] : ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) ) ;
    public final Enumerator ruleTemperatureUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:949:2: ( ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) ) )
            // InternalRouterDsl.g:950:2: ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) )
            {
            // InternalRouterDsl.g:950:2: ( (enumLiteral_0= '\\u00B0C' ) | (enumLiteral_1= '\\u00B0F' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            else if ( (LA10_0==34) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRouterDsl.g:951:3: (enumLiteral_0= '\\u00B0C' )
                    {
                    // InternalRouterDsl.g:951:3: (enumLiteral_0= '\\u00B0C' )
                    // InternalRouterDsl.g:952:4: enumLiteral_0= '\\u00B0C'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTemperatureUnitAccess().getCelsiusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTemperatureUnitAccess().getCelsiusEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:959:3: (enumLiteral_1= '\\u00B0F' )
                    {
                    // InternalRouterDsl.g:959:3: (enumLiteral_1= '\\u00B0F' )
                    // InternalRouterDsl.g:960:4: enumLiteral_1= '\\u00B0F'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

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
    // InternalRouterDsl.g:970:1: ruleAlertLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'critical' ) | (enumLiteral_1= 'major' ) | (enumLiteral_2= 'error' ) | (enumLiteral_3= 'warning' ) ) ;
    public final Enumerator ruleAlertLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRouterDsl.g:976:2: ( ( (enumLiteral_0= 'critical' ) | (enumLiteral_1= 'major' ) | (enumLiteral_2= 'error' ) | (enumLiteral_3= 'warning' ) ) )
            // InternalRouterDsl.g:977:2: ( (enumLiteral_0= 'critical' ) | (enumLiteral_1= 'major' ) | (enumLiteral_2= 'error' ) | (enumLiteral_3= 'warning' ) )
            {
            // InternalRouterDsl.g:977:2: ( (enumLiteral_0= 'critical' ) | (enumLiteral_1= 'major' ) | (enumLiteral_2= 'error' ) | (enumLiteral_3= 'warning' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt11=1;
                }
                break;
            case 36:
                {
                alt11=2;
                }
                break;
            case 37:
                {
                alt11=3;
                }
                break;
            case 38:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRouterDsl.g:978:3: (enumLiteral_0= 'critical' )
                    {
                    // InternalRouterDsl.g:978:3: (enumLiteral_0= 'critical' )
                    // InternalRouterDsl.g:979:4: enumLiteral_0= 'critical'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getAlertLevelAccess().getCriticalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAlertLevelAccess().getCriticalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:986:3: (enumLiteral_1= 'major' )
                    {
                    // InternalRouterDsl.g:986:3: (enumLiteral_1= 'major' )
                    // InternalRouterDsl.g:987:4: enumLiteral_1= 'major'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getAlertLevelAccess().getMajorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAlertLevelAccess().getMajorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:994:3: (enumLiteral_2= 'error' )
                    {
                    // InternalRouterDsl.g:994:3: (enumLiteral_2= 'error' )
                    // InternalRouterDsl.g:995:4: enumLiteral_2= 'error'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getAlertLevelAccess().getErrorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAlertLevelAccess().getErrorEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRouterDsl.g:1002:3: (enumLiteral_3= 'warning' )
                    {
                    // InternalRouterDsl.g:1002:3: (enumLiteral_3= 'warning' )
                    // InternalRouterDsl.g:1003:4: enumLiteral_3= 'warning'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});

}