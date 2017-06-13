package fr.obeo.dsl.designer.sample.flow.routerdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.obeo.dsl.designer.sample.flow.routerdsl.services.RouterDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRouterDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'capacity'", "'load'", "'consumption'", "'<'", "'<='", "'='", "'>'", "'>='", "'sec'", "'msec'", "'usec'", "'\\u00B0C'", "'\\u00B0F'", "'critical'", "'major'", "'error'", "'warning'", "'#'", "'Case'", "':'", "';'", "'->'", "'X'", "'/!\\\\'", "'/'", "'.'", "'.volume'", "'.temperature'"
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

    	public void setGrammarAccess(RouterDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRoutingRules"
    // InternalRouterDsl.g:53:1: entryRuleRoutingRules : ruleRoutingRules EOF ;
    public final void entryRuleRoutingRules() throws RecognitionException {
        try {
            // InternalRouterDsl.g:54:1: ( ruleRoutingRules EOF )
            // InternalRouterDsl.g:55:1: ruleRoutingRules EOF
            {
             before(grammarAccess.getRoutingRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleRoutingRules();

            state._fsp--;

             after(grammarAccess.getRoutingRulesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoutingRules"


    // $ANTLR start "ruleRoutingRules"
    // InternalRouterDsl.g:62:1: ruleRoutingRules : ( ( rule__RoutingRules__Group__0 ) ) ;
    public final void ruleRoutingRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:66:2: ( ( ( rule__RoutingRules__Group__0 ) ) )
            // InternalRouterDsl.g:67:2: ( ( rule__RoutingRules__Group__0 ) )
            {
            // InternalRouterDsl.g:67:2: ( ( rule__RoutingRules__Group__0 ) )
            // InternalRouterDsl.g:68:3: ( rule__RoutingRules__Group__0 )
            {
             before(grammarAccess.getRoutingRulesAccess().getGroup()); 
            // InternalRouterDsl.g:69:3: ( rule__RoutingRules__Group__0 )
            // InternalRouterDsl.g:69:4: rule__RoutingRules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoutingRules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoutingRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoutingRules"


    // $ANTLR start "entryRuleCaseRule"
    // InternalRouterDsl.g:78:1: entryRuleCaseRule : ruleCaseRule EOF ;
    public final void entryRuleCaseRule() throws RecognitionException {
        try {
            // InternalRouterDsl.g:79:1: ( ruleCaseRule EOF )
            // InternalRouterDsl.g:80:1: ruleCaseRule EOF
            {
             before(grammarAccess.getCaseRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleCaseRule();

            state._fsp--;

             after(grammarAccess.getCaseRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCaseRule"


    // $ANTLR start "ruleCaseRule"
    // InternalRouterDsl.g:87:1: ruleCaseRule : ( ( rule__CaseRule__Group__0 ) ) ;
    public final void ruleCaseRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:91:2: ( ( ( rule__CaseRule__Group__0 ) ) )
            // InternalRouterDsl.g:92:2: ( ( rule__CaseRule__Group__0 ) )
            {
            // InternalRouterDsl.g:92:2: ( ( rule__CaseRule__Group__0 ) )
            // InternalRouterDsl.g:93:3: ( rule__CaseRule__Group__0 )
            {
             before(grammarAccess.getCaseRuleAccess().getGroup()); 
            // InternalRouterDsl.g:94:3: ( rule__CaseRule__Group__0 )
            // InternalRouterDsl.g:94:4: rule__CaseRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CaseRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCaseRule"


    // $ANTLR start "entryRuleDecision"
    // InternalRouterDsl.g:103:1: entryRuleDecision : ruleDecision EOF ;
    public final void entryRuleDecision() throws RecognitionException {
        try {
            // InternalRouterDsl.g:104:1: ( ruleDecision EOF )
            // InternalRouterDsl.g:105:1: ruleDecision EOF
            {
             before(grammarAccess.getDecisionRule()); 
            pushFollow(FOLLOW_1);
            ruleDecision();

            state._fsp--;

             after(grammarAccess.getDecisionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecision"


    // $ANTLR start "ruleDecision"
    // InternalRouterDsl.g:112:1: ruleDecision : ( ( rule__Decision__Group__0 ) ) ;
    public final void ruleDecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:116:2: ( ( ( rule__Decision__Group__0 ) ) )
            // InternalRouterDsl.g:117:2: ( ( rule__Decision__Group__0 ) )
            {
            // InternalRouterDsl.g:117:2: ( ( rule__Decision__Group__0 ) )
            // InternalRouterDsl.g:118:3: ( rule__Decision__Group__0 )
            {
             before(grammarAccess.getDecisionAccess().getGroup()); 
            // InternalRouterDsl.g:119:3: ( rule__Decision__Group__0 )
            // InternalRouterDsl.g:119:4: rule__Decision__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Decision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecision"


    // $ANTLR start "entryRuleMessageDecision"
    // InternalRouterDsl.g:128:1: entryRuleMessageDecision : ruleMessageDecision EOF ;
    public final void entryRuleMessageDecision() throws RecognitionException {
        try {
            // InternalRouterDsl.g:129:1: ( ruleMessageDecision EOF )
            // InternalRouterDsl.g:130:1: ruleMessageDecision EOF
            {
             before(grammarAccess.getMessageDecisionRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageDecision();

            state._fsp--;

             after(grammarAccess.getMessageDecisionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageDecision"


    // $ANTLR start "ruleMessageDecision"
    // InternalRouterDsl.g:137:1: ruleMessageDecision : ( ( rule__MessageDecision__Alternatives ) ) ;
    public final void ruleMessageDecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:141:2: ( ( ( rule__MessageDecision__Alternatives ) ) )
            // InternalRouterDsl.g:142:2: ( ( rule__MessageDecision__Alternatives ) )
            {
            // InternalRouterDsl.g:142:2: ( ( rule__MessageDecision__Alternatives ) )
            // InternalRouterDsl.g:143:3: ( rule__MessageDecision__Alternatives )
            {
             before(grammarAccess.getMessageDecisionAccess().getAlternatives()); 
            // InternalRouterDsl.g:144:3: ( rule__MessageDecision__Alternatives )
            // InternalRouterDsl.g:144:4: rule__MessageDecision__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MessageDecision__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMessageDecisionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageDecision"


    // $ANTLR start "entryRuleRouteTo"
    // InternalRouterDsl.g:153:1: entryRuleRouteTo : ruleRouteTo EOF ;
    public final void entryRuleRouteTo() throws RecognitionException {
        try {
            // InternalRouterDsl.g:154:1: ( ruleRouteTo EOF )
            // InternalRouterDsl.g:155:1: ruleRouteTo EOF
            {
             before(grammarAccess.getRouteToRule()); 
            pushFollow(FOLLOW_1);
            ruleRouteTo();

            state._fsp--;

             after(grammarAccess.getRouteToRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRouteTo"


    // $ANTLR start "ruleRouteTo"
    // InternalRouterDsl.g:162:1: ruleRouteTo : ( ( rule__RouteTo__Group__0 ) ) ;
    public final void ruleRouteTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:166:2: ( ( ( rule__RouteTo__Group__0 ) ) )
            // InternalRouterDsl.g:167:2: ( ( rule__RouteTo__Group__0 ) )
            {
            // InternalRouterDsl.g:167:2: ( ( rule__RouteTo__Group__0 ) )
            // InternalRouterDsl.g:168:3: ( rule__RouteTo__Group__0 )
            {
             before(grammarAccess.getRouteToAccess().getGroup()); 
            // InternalRouterDsl.g:169:3: ( rule__RouteTo__Group__0 )
            // InternalRouterDsl.g:169:4: rule__RouteTo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RouteTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRouteToAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRouteTo"


    // $ANTLR start "entryRuleDropMessage"
    // InternalRouterDsl.g:178:1: entryRuleDropMessage : ruleDropMessage EOF ;
    public final void entryRuleDropMessage() throws RecognitionException {
        try {
            // InternalRouterDsl.g:179:1: ( ruleDropMessage EOF )
            // InternalRouterDsl.g:180:1: ruleDropMessage EOF
            {
             before(grammarAccess.getDropMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleDropMessage();

            state._fsp--;

             after(grammarAccess.getDropMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDropMessage"


    // $ANTLR start "ruleDropMessage"
    // InternalRouterDsl.g:187:1: ruleDropMessage : ( ( rule__DropMessage__Group__0 ) ) ;
    public final void ruleDropMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:191:2: ( ( ( rule__DropMessage__Group__0 ) ) )
            // InternalRouterDsl.g:192:2: ( ( rule__DropMessage__Group__0 ) )
            {
            // InternalRouterDsl.g:192:2: ( ( rule__DropMessage__Group__0 ) )
            // InternalRouterDsl.g:193:3: ( rule__DropMessage__Group__0 )
            {
             before(grammarAccess.getDropMessageAccess().getGroup()); 
            // InternalRouterDsl.g:194:3: ( rule__DropMessage__Group__0 )
            // InternalRouterDsl.g:194:4: rule__DropMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DropMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDropMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDropMessage"


    // $ANTLR start "entryRuleAlert"
    // InternalRouterDsl.g:203:1: entryRuleAlert : ruleAlert EOF ;
    public final void entryRuleAlert() throws RecognitionException {
        try {
            // InternalRouterDsl.g:204:1: ( ruleAlert EOF )
            // InternalRouterDsl.g:205:1: ruleAlert EOF
            {
             before(grammarAccess.getAlertRule()); 
            pushFollow(FOLLOW_1);
            ruleAlert();

            state._fsp--;

             after(grammarAccess.getAlertRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlert"


    // $ANTLR start "ruleAlert"
    // InternalRouterDsl.g:212:1: ruleAlert : ( ( rule__Alert__Group__0 ) ) ;
    public final void ruleAlert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:216:2: ( ( ( rule__Alert__Group__0 ) ) )
            // InternalRouterDsl.g:217:2: ( ( rule__Alert__Group__0 ) )
            {
            // InternalRouterDsl.g:217:2: ( ( rule__Alert__Group__0 ) )
            // InternalRouterDsl.g:218:3: ( rule__Alert__Group__0 )
            {
             before(grammarAccess.getAlertAccess().getGroup()); 
            // InternalRouterDsl.g:219:3: ( rule__Alert__Group__0 )
            // InternalRouterDsl.g:219:4: rule__Alert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alert__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlertAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlert"


    // $ANTLR start "entryRuleConditional"
    // InternalRouterDsl.g:228:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalRouterDsl.g:229:1: ( ruleConditional EOF )
            // InternalRouterDsl.g:230:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalRouterDsl.g:237:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:241:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // InternalRouterDsl.g:242:2: ( ( rule__Conditional__Group__0 ) )
            {
            // InternalRouterDsl.g:242:2: ( ( rule__Conditional__Group__0 ) )
            // InternalRouterDsl.g:243:3: ( rule__Conditional__Group__0 )
            {
             before(grammarAccess.getConditionalAccess().getGroup()); 
            // InternalRouterDsl.g:244:3: ( rule__Conditional__Group__0 )
            // InternalRouterDsl.g:244:4: rule__Conditional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleObjectAccessOrValue"
    // InternalRouterDsl.g:253:1: entryRuleObjectAccessOrValue : ruleObjectAccessOrValue EOF ;
    public final void entryRuleObjectAccessOrValue() throws RecognitionException {
        try {
            // InternalRouterDsl.g:254:1: ( ruleObjectAccessOrValue EOF )
            // InternalRouterDsl.g:255:1: ruleObjectAccessOrValue EOF
            {
             before(grammarAccess.getObjectAccessOrValueRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectAccessOrValue();

            state._fsp--;

             after(grammarAccess.getObjectAccessOrValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectAccessOrValue"


    // $ANTLR start "ruleObjectAccessOrValue"
    // InternalRouterDsl.g:262:1: ruleObjectAccessOrValue : ( ( rule__ObjectAccessOrValue__Alternatives ) ) ;
    public final void ruleObjectAccessOrValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:266:2: ( ( ( rule__ObjectAccessOrValue__Alternatives ) ) )
            // InternalRouterDsl.g:267:2: ( ( rule__ObjectAccessOrValue__Alternatives ) )
            {
            // InternalRouterDsl.g:267:2: ( ( rule__ObjectAccessOrValue__Alternatives ) )
            // InternalRouterDsl.g:268:3: ( rule__ObjectAccessOrValue__Alternatives )
            {
             before(grammarAccess.getObjectAccessOrValueAccess().getAlternatives()); 
            // InternalRouterDsl.g:269:3: ( rule__ObjectAccessOrValue__Alternatives )
            // InternalRouterDsl.g:269:4: rule__ObjectAccessOrValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAccessOrValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccessOrValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectAccessOrValue"


    // $ANTLR start "entryRuleLiteralValue"
    // InternalRouterDsl.g:278:1: entryRuleLiteralValue : ruleLiteralValue EOF ;
    public final void entryRuleLiteralValue() throws RecognitionException {
        try {
            // InternalRouterDsl.g:279:1: ( ruleLiteralValue EOF )
            // InternalRouterDsl.g:280:1: ruleLiteralValue EOF
            {
             before(grammarAccess.getLiteralValueRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralValue();

            state._fsp--;

             after(grammarAccess.getLiteralValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralValue"


    // $ANTLR start "ruleLiteralValue"
    // InternalRouterDsl.g:287:1: ruleLiteralValue : ( ( rule__LiteralValue__ValueAssignment ) ) ;
    public final void ruleLiteralValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:291:2: ( ( ( rule__LiteralValue__ValueAssignment ) ) )
            // InternalRouterDsl.g:292:2: ( ( rule__LiteralValue__ValueAssignment ) )
            {
            // InternalRouterDsl.g:292:2: ( ( rule__LiteralValue__ValueAssignment ) )
            // InternalRouterDsl.g:293:3: ( rule__LiteralValue__ValueAssignment )
            {
             before(grammarAccess.getLiteralValueAccess().getValueAssignment()); 
            // InternalRouterDsl.g:294:3: ( rule__LiteralValue__ValueAssignment )
            // InternalRouterDsl.g:294:4: rule__LiteralValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralValue"


    // $ANTLR start "entryRuleThroughtput"
    // InternalRouterDsl.g:303:1: entryRuleThroughtput : ruleThroughtput EOF ;
    public final void entryRuleThroughtput() throws RecognitionException {
        try {
            // InternalRouterDsl.g:304:1: ( ruleThroughtput EOF )
            // InternalRouterDsl.g:305:1: ruleThroughtput EOF
            {
             before(grammarAccess.getThroughtputRule()); 
            pushFollow(FOLLOW_1);
            ruleThroughtput();

            state._fsp--;

             after(grammarAccess.getThroughtputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThroughtput"


    // $ANTLR start "ruleThroughtput"
    // InternalRouterDsl.g:312:1: ruleThroughtput : ( ( rule__Throughtput__Group__0 ) ) ;
    public final void ruleThroughtput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:316:2: ( ( ( rule__Throughtput__Group__0 ) ) )
            // InternalRouterDsl.g:317:2: ( ( rule__Throughtput__Group__0 ) )
            {
            // InternalRouterDsl.g:317:2: ( ( rule__Throughtput__Group__0 ) )
            // InternalRouterDsl.g:318:3: ( rule__Throughtput__Group__0 )
            {
             before(grammarAccess.getThroughtputAccess().getGroup()); 
            // InternalRouterDsl.g:319:3: ( rule__Throughtput__Group__0 )
            // InternalRouterDsl.g:319:4: rule__Throughtput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Throughtput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThroughtputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThroughtput"


    // $ANTLR start "entryRuleTemperature"
    // InternalRouterDsl.g:328:1: entryRuleTemperature : ruleTemperature EOF ;
    public final void entryRuleTemperature() throws RecognitionException {
        try {
            // InternalRouterDsl.g:329:1: ( ruleTemperature EOF )
            // InternalRouterDsl.g:330:1: ruleTemperature EOF
            {
             before(grammarAccess.getTemperatureRule()); 
            pushFollow(FOLLOW_1);
            ruleTemperature();

            state._fsp--;

             after(grammarAccess.getTemperatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemperature"


    // $ANTLR start "ruleTemperature"
    // InternalRouterDsl.g:337:1: ruleTemperature : ( ( rule__Temperature__Group__0 ) ) ;
    public final void ruleTemperature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:341:2: ( ( ( rule__Temperature__Group__0 ) ) )
            // InternalRouterDsl.g:342:2: ( ( rule__Temperature__Group__0 ) )
            {
            // InternalRouterDsl.g:342:2: ( ( rule__Temperature__Group__0 ) )
            // InternalRouterDsl.g:343:3: ( rule__Temperature__Group__0 )
            {
             before(grammarAccess.getTemperatureAccess().getGroup()); 
            // InternalRouterDsl.g:344:3: ( rule__Temperature__Group__0 )
            // InternalRouterDsl.g:344:4: rule__Temperature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Temperature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemperatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemperature"


    // $ANTLR start "entryRuleObjectAccess"
    // InternalRouterDsl.g:353:1: entryRuleObjectAccess : ruleObjectAccess EOF ;
    public final void entryRuleObjectAccess() throws RecognitionException {
        try {
            // InternalRouterDsl.g:354:1: ( ruleObjectAccess EOF )
            // InternalRouterDsl.g:355:1: ruleObjectAccess EOF
            {
             before(grammarAccess.getObjectAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectAccess();

            state._fsp--;

             after(grammarAccess.getObjectAccessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectAccess"


    // $ANTLR start "ruleObjectAccess"
    // InternalRouterDsl.g:362:1: ruleObjectAccess : ( ( rule__ObjectAccess__Alternatives ) ) ;
    public final void ruleObjectAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:366:2: ( ( ( rule__ObjectAccess__Alternatives ) ) )
            // InternalRouterDsl.g:367:2: ( ( rule__ObjectAccess__Alternatives ) )
            {
            // InternalRouterDsl.g:367:2: ( ( rule__ObjectAccess__Alternatives ) )
            // InternalRouterDsl.g:368:3: ( rule__ObjectAccess__Alternatives )
            {
             before(grammarAccess.getObjectAccessAccess().getAlternatives()); 
            // InternalRouterDsl.g:369:3: ( rule__ObjectAccess__Alternatives )
            // InternalRouterDsl.g:369:4: rule__ObjectAccess__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAccess__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccessAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectAccess"


    // $ANTLR start "entryRuleProcessorAccess"
    // InternalRouterDsl.g:378:1: entryRuleProcessorAccess : ruleProcessorAccess EOF ;
    public final void entryRuleProcessorAccess() throws RecognitionException {
        try {
            // InternalRouterDsl.g:379:1: ( ruleProcessorAccess EOF )
            // InternalRouterDsl.g:380:1: ruleProcessorAccess EOF
            {
             before(grammarAccess.getProcessorAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessorAccess();

            state._fsp--;

             after(grammarAccess.getProcessorAccessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcessorAccess"


    // $ANTLR start "ruleProcessorAccess"
    // InternalRouterDsl.g:387:1: ruleProcessorAccess : ( ( rule__ProcessorAccess__Group__0 ) ) ;
    public final void ruleProcessorAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:391:2: ( ( ( rule__ProcessorAccess__Group__0 ) ) )
            // InternalRouterDsl.g:392:2: ( ( rule__ProcessorAccess__Group__0 ) )
            {
            // InternalRouterDsl.g:392:2: ( ( rule__ProcessorAccess__Group__0 ) )
            // InternalRouterDsl.g:393:3: ( rule__ProcessorAccess__Group__0 )
            {
             before(grammarAccess.getProcessorAccessAccess().getGroup()); 
            // InternalRouterDsl.g:394:3: ( rule__ProcessorAccess__Group__0 )
            // InternalRouterDsl.g:394:4: rule__ProcessorAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProcessorAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessorAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessorAccess"


    // $ANTLR start "entryRuleSensorAccess"
    // InternalRouterDsl.g:403:1: entryRuleSensorAccess : ruleSensorAccess EOF ;
    public final void entryRuleSensorAccess() throws RecognitionException {
        try {
            // InternalRouterDsl.g:404:1: ( ruleSensorAccess EOF )
            // InternalRouterDsl.g:405:1: ruleSensorAccess EOF
            {
             before(grammarAccess.getSensorAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorAccess();

            state._fsp--;

             after(grammarAccess.getSensorAccessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorAccess"


    // $ANTLR start "ruleSensorAccess"
    // InternalRouterDsl.g:412:1: ruleSensorAccess : ( ( rule__SensorAccess__Group__0 ) ) ;
    public final void ruleSensorAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:416:2: ( ( ( rule__SensorAccess__Group__0 ) ) )
            // InternalRouterDsl.g:417:2: ( ( rule__SensorAccess__Group__0 ) )
            {
            // InternalRouterDsl.g:417:2: ( ( rule__SensorAccess__Group__0 ) )
            // InternalRouterDsl.g:418:3: ( rule__SensorAccess__Group__0 )
            {
             before(grammarAccess.getSensorAccessAccess().getGroup()); 
            // InternalRouterDsl.g:419:3: ( rule__SensorAccess__Group__0 )
            // InternalRouterDsl.g:419:4: rule__SensorAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorAccess"


    // $ANTLR start "entryRuleSystemAccess"
    // InternalRouterDsl.g:428:1: entryRuleSystemAccess : ruleSystemAccess EOF ;
    public final void entryRuleSystemAccess() throws RecognitionException {
        try {
            // InternalRouterDsl.g:429:1: ( ruleSystemAccess EOF )
            // InternalRouterDsl.g:430:1: ruleSystemAccess EOF
            {
             before(grammarAccess.getSystemAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemAccess();

            state._fsp--;

             after(grammarAccess.getSystemAccessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemAccess"


    // $ANTLR start "ruleSystemAccess"
    // InternalRouterDsl.g:437:1: ruleSystemAccess : ( ( rule__SystemAccess__Group__0 ) ) ;
    public final void ruleSystemAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:441:2: ( ( ( rule__SystemAccess__Group__0 ) ) )
            // InternalRouterDsl.g:442:2: ( ( rule__SystemAccess__Group__0 ) )
            {
            // InternalRouterDsl.g:442:2: ( ( rule__SystemAccess__Group__0 ) )
            // InternalRouterDsl.g:443:3: ( rule__SystemAccess__Group__0 )
            {
             before(grammarAccess.getSystemAccessAccess().getGroup()); 
            // InternalRouterDsl.g:444:3: ( rule__SystemAccess__Group__0 )
            // InternalRouterDsl.g:444:4: rule__SystemAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemAccess"


    // $ANTLR start "ruleProcessorAttribute"
    // InternalRouterDsl.g:453:1: ruleProcessorAttribute : ( ( rule__ProcessorAttribute__Alternatives ) ) ;
    public final void ruleProcessorAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:457:1: ( ( ( rule__ProcessorAttribute__Alternatives ) ) )
            // InternalRouterDsl.g:458:2: ( ( rule__ProcessorAttribute__Alternatives ) )
            {
            // InternalRouterDsl.g:458:2: ( ( rule__ProcessorAttribute__Alternatives ) )
            // InternalRouterDsl.g:459:3: ( rule__ProcessorAttribute__Alternatives )
            {
             before(grammarAccess.getProcessorAttributeAccess().getAlternatives()); 
            // InternalRouterDsl.g:460:3: ( rule__ProcessorAttribute__Alternatives )
            // InternalRouterDsl.g:460:4: rule__ProcessorAttribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessorAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessorAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessorAttribute"


    // $ANTLR start "ruleComparison"
    // InternalRouterDsl.g:469:1: ruleComparison : ( ( rule__Comparison__Alternatives ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:473:1: ( ( ( rule__Comparison__Alternatives ) ) )
            // InternalRouterDsl.g:474:2: ( ( rule__Comparison__Alternatives ) )
            {
            // InternalRouterDsl.g:474:2: ( ( rule__Comparison__Alternatives ) )
            // InternalRouterDsl.g:475:3: ( rule__Comparison__Alternatives )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives()); 
            // InternalRouterDsl.g:476:3: ( rule__Comparison__Alternatives )
            // InternalRouterDsl.g:476:4: rule__Comparison__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "ruleTimeUnit"
    // InternalRouterDsl.g:485:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:489:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalRouterDsl.g:490:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalRouterDsl.g:490:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalRouterDsl.g:491:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalRouterDsl.g:492:3: ( rule__TimeUnit__Alternatives )
            // InternalRouterDsl.g:492:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleTemperatureUnit"
    // InternalRouterDsl.g:501:1: ruleTemperatureUnit : ( ( rule__TemperatureUnit__Alternatives ) ) ;
    public final void ruleTemperatureUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:505:1: ( ( ( rule__TemperatureUnit__Alternatives ) ) )
            // InternalRouterDsl.g:506:2: ( ( rule__TemperatureUnit__Alternatives ) )
            {
            // InternalRouterDsl.g:506:2: ( ( rule__TemperatureUnit__Alternatives ) )
            // InternalRouterDsl.g:507:3: ( rule__TemperatureUnit__Alternatives )
            {
             before(grammarAccess.getTemperatureUnitAccess().getAlternatives()); 
            // InternalRouterDsl.g:508:3: ( rule__TemperatureUnit__Alternatives )
            // InternalRouterDsl.g:508:4: rule__TemperatureUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TemperatureUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTemperatureUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemperatureUnit"


    // $ANTLR start "ruleAlertLevel"
    // InternalRouterDsl.g:517:1: ruleAlertLevel : ( ( rule__AlertLevel__Alternatives ) ) ;
    public final void ruleAlertLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:521:1: ( ( ( rule__AlertLevel__Alternatives ) ) )
            // InternalRouterDsl.g:522:2: ( ( rule__AlertLevel__Alternatives ) )
            {
            // InternalRouterDsl.g:522:2: ( ( rule__AlertLevel__Alternatives ) )
            // InternalRouterDsl.g:523:3: ( rule__AlertLevel__Alternatives )
            {
             before(grammarAccess.getAlertLevelAccess().getAlternatives()); 
            // InternalRouterDsl.g:524:3: ( rule__AlertLevel__Alternatives )
            // InternalRouterDsl.g:524:4: rule__AlertLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AlertLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAlertLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlertLevel"


    // $ANTLR start "rule__Decision__Alternatives_0"
    // InternalRouterDsl.g:532:1: rule__Decision__Alternatives_0 : ( ( ruleRouteTo ) | ( ruleMessageDecision ) );
    public final void rule__Decision__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:536:1: ( ( ruleRouteTo ) | ( ruleMessageDecision ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=33 && LA1_0<=34)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRouterDsl.g:537:2: ( ruleRouteTo )
                    {
                    // InternalRouterDsl.g:537:2: ( ruleRouteTo )
                    // InternalRouterDsl.g:538:3: ruleRouteTo
                    {
                     before(grammarAccess.getDecisionAccess().getRouteToParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRouteTo();

                    state._fsp--;

                     after(grammarAccess.getDecisionAccess().getRouteToParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:543:2: ( ruleMessageDecision )
                    {
                    // InternalRouterDsl.g:543:2: ( ruleMessageDecision )
                    // InternalRouterDsl.g:544:3: ruleMessageDecision
                    {
                     before(grammarAccess.getDecisionAccess().getMessageDecisionParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMessageDecision();

                    state._fsp--;

                     after(grammarAccess.getDecisionAccess().getMessageDecisionParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decision__Alternatives_0"


    // $ANTLR start "rule__MessageDecision__Alternatives"
    // InternalRouterDsl.g:553:1: rule__MessageDecision__Alternatives : ( ( ruleDropMessage ) | ( ruleAlert ) );
    public final void rule__MessageDecision__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:557:1: ( ( ruleDropMessage ) | ( ruleAlert ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==33) ) {
                alt2=1;
            }
            else if ( (LA2_0==34) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRouterDsl.g:558:2: ( ruleDropMessage )
                    {
                    // InternalRouterDsl.g:558:2: ( ruleDropMessage )
                    // InternalRouterDsl.g:559:3: ruleDropMessage
                    {
                     before(grammarAccess.getMessageDecisionAccess().getDropMessageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDropMessage();

                    state._fsp--;

                     after(grammarAccess.getMessageDecisionAccess().getDropMessageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:564:2: ( ruleAlert )
                    {
                    // InternalRouterDsl.g:564:2: ( ruleAlert )
                    // InternalRouterDsl.g:565:3: ruleAlert
                    {
                     before(grammarAccess.getMessageDecisionAccess().getAlertParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAlert();

                    state._fsp--;

                     after(grammarAccess.getMessageDecisionAccess().getAlertParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDecision__Alternatives"


    // $ANTLR start "rule__ObjectAccessOrValue__Alternatives"
    // InternalRouterDsl.g:574:1: rule__ObjectAccessOrValue__Alternatives : ( ( ruleObjectAccess ) | ( ruleLiteralValue ) | ( ruleThroughtput ) | ( ruleTemperature ) );
    public final void rule__ObjectAccessOrValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:578:1: ( ( ruleObjectAccess ) | ( ruleLiteralValue ) | ( ruleThroughtput ) | ( ruleTemperature ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 30:
                    {
                    alt3=2;
                    }
                    break;
                case 22:
                case 23:
                    {
                    alt3=4;
                    }
                    break;
                case 35:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRouterDsl.g:579:2: ( ruleObjectAccess )
                    {
                    // InternalRouterDsl.g:579:2: ( ruleObjectAccess )
                    // InternalRouterDsl.g:580:3: ruleObjectAccess
                    {
                     before(grammarAccess.getObjectAccessOrValueAccess().getObjectAccessParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectAccess();

                    state._fsp--;

                     after(grammarAccess.getObjectAccessOrValueAccess().getObjectAccessParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:585:2: ( ruleLiteralValue )
                    {
                    // InternalRouterDsl.g:585:2: ( ruleLiteralValue )
                    // InternalRouterDsl.g:586:3: ruleLiteralValue
                    {
                     before(grammarAccess.getObjectAccessOrValueAccess().getLiteralValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralValue();

                    state._fsp--;

                     after(grammarAccess.getObjectAccessOrValueAccess().getLiteralValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:591:2: ( ruleThroughtput )
                    {
                    // InternalRouterDsl.g:591:2: ( ruleThroughtput )
                    // InternalRouterDsl.g:592:3: ruleThroughtput
                    {
                     before(grammarAccess.getObjectAccessOrValueAccess().getThroughtputParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleThroughtput();

                    state._fsp--;

                     after(grammarAccess.getObjectAccessOrValueAccess().getThroughtputParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRouterDsl.g:597:2: ( ruleTemperature )
                    {
                    // InternalRouterDsl.g:597:2: ( ruleTemperature )
                    // InternalRouterDsl.g:598:3: ruleTemperature
                    {
                     before(grammarAccess.getObjectAccessOrValueAccess().getTemperatureParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTemperature();

                    state._fsp--;

                     after(grammarAccess.getObjectAccessOrValueAccess().getTemperatureParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectAccessOrValue__Alternatives"


    // $ANTLR start "rule__ObjectAccess__Alternatives"
    // InternalRouterDsl.g:607:1: rule__ObjectAccess__Alternatives : ( ( ruleProcessorAccess ) | ( ruleSensorAccess ) | ( ruleSystemAccess ) );
    public final void rule__ObjectAccess__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:611:1: ( ( ruleProcessorAccess ) | ( ruleSensorAccess ) | ( ruleSystemAccess ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    alt4=3;
                    }
                    break;
                case 37:
                    {
                    alt4=2;
                    }
                    break;
                case 36:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRouterDsl.g:612:2: ( ruleProcessorAccess )
                    {
                    // InternalRouterDsl.g:612:2: ( ruleProcessorAccess )
                    // InternalRouterDsl.g:613:3: ruleProcessorAccess
                    {
                     before(grammarAccess.getObjectAccessAccess().getProcessorAccessParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleProcessorAccess();

                    state._fsp--;

                     after(grammarAccess.getObjectAccessAccess().getProcessorAccessParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:618:2: ( ruleSensorAccess )
                    {
                    // InternalRouterDsl.g:618:2: ( ruleSensorAccess )
                    // InternalRouterDsl.g:619:3: ruleSensorAccess
                    {
                     before(grammarAccess.getObjectAccessAccess().getSensorAccessParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSensorAccess();

                    state._fsp--;

                     after(grammarAccess.getObjectAccessAccess().getSensorAccessParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:624:2: ( ruleSystemAccess )
                    {
                    // InternalRouterDsl.g:624:2: ( ruleSystemAccess )
                    // InternalRouterDsl.g:625:3: ruleSystemAccess
                    {
                     before(grammarAccess.getObjectAccessAccess().getSystemAccessParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemAccess();

                    state._fsp--;

                     after(grammarAccess.getObjectAccessAccess().getSystemAccessParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectAccess__Alternatives"


    // $ANTLR start "rule__ProcessorAttribute__Alternatives"
    // InternalRouterDsl.g:634:1: rule__ProcessorAttribute__Alternatives : ( ( ( 'capacity' ) ) | ( ( 'load' ) ) | ( ( 'consumption' ) ) );
    public final void rule__ProcessorAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:638:1: ( ( ( 'capacity' ) ) | ( ( 'load' ) ) | ( ( 'consumption' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRouterDsl.g:639:2: ( ( 'capacity' ) )
                    {
                    // InternalRouterDsl.g:639:2: ( ( 'capacity' ) )
                    // InternalRouterDsl.g:640:3: ( 'capacity' )
                    {
                     before(grammarAccess.getProcessorAttributeAccess().getCapacityEnumLiteralDeclaration_0()); 
                    // InternalRouterDsl.g:641:3: ( 'capacity' )
                    // InternalRouterDsl.g:641:4: 'capacity'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getProcessorAttributeAccess().getCapacityEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:645:2: ( ( 'load' ) )
                    {
                    // InternalRouterDsl.g:645:2: ( ( 'load' ) )
                    // InternalRouterDsl.g:646:3: ( 'load' )
                    {
                     before(grammarAccess.getProcessorAttributeAccess().getLoadEnumLiteralDeclaration_1()); 
                    // InternalRouterDsl.g:647:3: ( 'load' )
                    // InternalRouterDsl.g:647:4: 'load'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getProcessorAttributeAccess().getLoadEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:651:2: ( ( 'consumption' ) )
                    {
                    // InternalRouterDsl.g:651:2: ( ( 'consumption' ) )
                    // InternalRouterDsl.g:652:3: ( 'consumption' )
                    {
                     before(grammarAccess.getProcessorAttributeAccess().getConsumptionEnumLiteralDeclaration_2()); 
                    // InternalRouterDsl.g:653:3: ( 'consumption' )
                    // InternalRouterDsl.g:653:4: 'consumption'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getProcessorAttributeAccess().getConsumptionEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAttribute__Alternatives"


    // $ANTLR start "rule__Comparison__Alternatives"
    // InternalRouterDsl.g:661:1: rule__Comparison__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );
    public final void rule__Comparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:665:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            case 18:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRouterDsl.g:666:2: ( ( '<' ) )
                    {
                    // InternalRouterDsl.g:666:2: ( ( '<' ) )
                    // InternalRouterDsl.g:667:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonAccess().getLOWEREnumLiteralDeclaration_0()); 
                    // InternalRouterDsl.g:668:3: ( '<' )
                    // InternalRouterDsl.g:668:4: '<'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonAccess().getLOWEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:672:2: ( ( '<=' ) )
                    {
                    // InternalRouterDsl.g:672:2: ( ( '<=' ) )
                    // InternalRouterDsl.g:673:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonAccess().getLOWER_EQEnumLiteralDeclaration_1()); 
                    // InternalRouterDsl.g:674:3: ( '<=' )
                    // InternalRouterDsl.g:674:4: '<='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonAccess().getLOWER_EQEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:678:2: ( ( '=' ) )
                    {
                    // InternalRouterDsl.g:678:2: ( ( '=' ) )
                    // InternalRouterDsl.g:679:3: ( '=' )
                    {
                     before(grammarAccess.getComparisonAccess().getEQEnumLiteralDeclaration_2()); 
                    // InternalRouterDsl.g:680:3: ( '=' )
                    // InternalRouterDsl.g:680:4: '='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonAccess().getEQEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRouterDsl.g:684:2: ( ( '>' ) )
                    {
                    // InternalRouterDsl.g:684:2: ( ( '>' ) )
                    // InternalRouterDsl.g:685:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonAccess().getHIGHEREnumLiteralDeclaration_3()); 
                    // InternalRouterDsl.g:686:3: ( '>' )
                    // InternalRouterDsl.g:686:4: '>'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonAccess().getHIGHEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRouterDsl.g:690:2: ( ( '>=' ) )
                    {
                    // InternalRouterDsl.g:690:2: ( ( '>=' ) )
                    // InternalRouterDsl.g:691:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonAccess().getHIGHER_EQEnumLiteralDeclaration_4()); 
                    // InternalRouterDsl.g:692:3: ( '>=' )
                    // InternalRouterDsl.g:692:4: '>='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonAccess().getHIGHER_EQEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalRouterDsl.g:700:1: rule__TimeUnit__Alternatives : ( ( ( 'sec' ) ) | ( ( 'msec' ) ) | ( ( 'usec' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:704:1: ( ( ( 'sec' ) ) | ( ( 'msec' ) ) | ( ( 'usec' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
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
                    // InternalRouterDsl.g:705:2: ( ( 'sec' ) )
                    {
                    // InternalRouterDsl.g:705:2: ( ( 'sec' ) )
                    // InternalRouterDsl.g:706:3: ( 'sec' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_0()); 
                    // InternalRouterDsl.g:707:3: ( 'sec' )
                    // InternalRouterDsl.g:707:4: 'sec'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:711:2: ( ( 'msec' ) )
                    {
                    // InternalRouterDsl.g:711:2: ( ( 'msec' ) )
                    // InternalRouterDsl.g:712:3: ( 'msec' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMillisecondsEnumLiteralDeclaration_1()); 
                    // InternalRouterDsl.g:713:3: ( 'msec' )
                    // InternalRouterDsl.g:713:4: 'msec'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMillisecondsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:717:2: ( ( 'usec' ) )
                    {
                    // InternalRouterDsl.g:717:2: ( ( 'usec' ) )
                    // InternalRouterDsl.g:718:3: ( 'usec' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMicrosecondsEnumLiteralDeclaration_2()); 
                    // InternalRouterDsl.g:719:3: ( 'usec' )
                    // InternalRouterDsl.g:719:4: 'usec'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMicrosecondsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__TemperatureUnit__Alternatives"
    // InternalRouterDsl.g:727:1: rule__TemperatureUnit__Alternatives : ( ( ( '\\u00B0C' ) ) | ( ( '\\u00B0F' ) ) );
    public final void rule__TemperatureUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:731:1: ( ( ( '\\u00B0C' ) ) | ( ( '\\u00B0F' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRouterDsl.g:732:2: ( ( '\\u00B0C' ) )
                    {
                    // InternalRouterDsl.g:732:2: ( ( '\\u00B0C' ) )
                    // InternalRouterDsl.g:733:3: ( '\\u00B0C' )
                    {
                     before(grammarAccess.getTemperatureUnitAccess().getCelsiusEnumLiteralDeclaration_0()); 
                    // InternalRouterDsl.g:734:3: ( '\\u00B0C' )
                    // InternalRouterDsl.g:734:4: '\\u00B0C'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemperatureUnitAccess().getCelsiusEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:738:2: ( ( '\\u00B0F' ) )
                    {
                    // InternalRouterDsl.g:738:2: ( ( '\\u00B0F' ) )
                    // InternalRouterDsl.g:739:3: ( '\\u00B0F' )
                    {
                     before(grammarAccess.getTemperatureUnitAccess().getFahrenheitEnumLiteralDeclaration_1()); 
                    // InternalRouterDsl.g:740:3: ( '\\u00B0F' )
                    // InternalRouterDsl.g:740:4: '\\u00B0F'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemperatureUnitAccess().getFahrenheitEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemperatureUnit__Alternatives"


    // $ANTLR start "rule__AlertLevel__Alternatives"
    // InternalRouterDsl.g:748:1: rule__AlertLevel__Alternatives : ( ( ( 'critical' ) ) | ( ( 'major' ) ) | ( ( 'error' ) ) | ( ( 'warning' ) ) );
    public final void rule__AlertLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:752:1: ( ( ( 'critical' ) ) | ( ( 'major' ) ) | ( ( 'error' ) ) | ( ( 'warning' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 27:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRouterDsl.g:753:2: ( ( 'critical' ) )
                    {
                    // InternalRouterDsl.g:753:2: ( ( 'critical' ) )
                    // InternalRouterDsl.g:754:3: ( 'critical' )
                    {
                     before(grammarAccess.getAlertLevelAccess().getCriticalEnumLiteralDeclaration_0()); 
                    // InternalRouterDsl.g:755:3: ( 'critical' )
                    // InternalRouterDsl.g:755:4: 'critical'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlertLevelAccess().getCriticalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:759:2: ( ( 'major' ) )
                    {
                    // InternalRouterDsl.g:759:2: ( ( 'major' ) )
                    // InternalRouterDsl.g:760:3: ( 'major' )
                    {
                     before(grammarAccess.getAlertLevelAccess().getMajorEnumLiteralDeclaration_1()); 
                    // InternalRouterDsl.g:761:3: ( 'major' )
                    // InternalRouterDsl.g:761:4: 'major'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlertLevelAccess().getMajorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:765:2: ( ( 'error' ) )
                    {
                    // InternalRouterDsl.g:765:2: ( ( 'error' ) )
                    // InternalRouterDsl.g:766:3: ( 'error' )
                    {
                     before(grammarAccess.getAlertLevelAccess().getErrorEnumLiteralDeclaration_2()); 
                    // InternalRouterDsl.g:767:3: ( 'error' )
                    // InternalRouterDsl.g:767:4: 'error'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlertLevelAccess().getErrorEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRouterDsl.g:771:2: ( ( 'warning' ) )
                    {
                    // InternalRouterDsl.g:771:2: ( ( 'warning' ) )
                    // InternalRouterDsl.g:772:3: ( 'warning' )
                    {
                     before(grammarAccess.getAlertLevelAccess().getWarningEnumLiteralDeclaration_3()); 
                    // InternalRouterDsl.g:773:3: ( 'warning' )
                    // InternalRouterDsl.g:773:4: 'warning'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlertLevelAccess().getWarningEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlertLevel__Alternatives"


    // $ANTLR start "rule__RoutingRules__Group__0"
    // InternalRouterDsl.g:781:1: rule__RoutingRules__Group__0 : rule__RoutingRules__Group__0__Impl rule__RoutingRules__Group__1 ;
    public final void rule__RoutingRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:785:1: ( rule__RoutingRules__Group__0__Impl rule__RoutingRules__Group__1 )
            // InternalRouterDsl.g:786:2: rule__RoutingRules__Group__0__Impl rule__RoutingRules__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RoutingRules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoutingRules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoutingRules__Group__0"


    // $ANTLR start "rule__RoutingRules__Group__0__Impl"
    // InternalRouterDsl.g:793:1: rule__RoutingRules__Group__0__Impl : ( () ) ;
    public final void rule__RoutingRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:797:1: ( ( () ) )
            // InternalRouterDsl.g:798:1: ( () )
            {
            // InternalRouterDsl.g:798:1: ( () )
            // InternalRouterDsl.g:799:2: ()
            {
             before(grammarAccess.getRoutingRulesAccess().getRoutingRuleAction_0()); 
            // InternalRouterDsl.g:800:2: ()
            // InternalRouterDsl.g:800:3: 
            {
            }

             after(grammarAccess.getRoutingRulesAccess().getRoutingRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoutingRules__Group__0__Impl"


    // $ANTLR start "rule__RoutingRules__Group__1"
    // InternalRouterDsl.g:808:1: rule__RoutingRules__Group__1 : rule__RoutingRules__Group__1__Impl rule__RoutingRules__Group__2 ;
    public final void rule__RoutingRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:812:1: ( rule__RoutingRules__Group__1__Impl rule__RoutingRules__Group__2 )
            // InternalRouterDsl.g:813:2: rule__RoutingRules__Group__1__Impl rule__RoutingRules__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RoutingRules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoutingRules__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoutingRules__Group__1"


    // $ANTLR start "rule__RoutingRules__Group__1__Impl"
    // InternalRouterDsl.g:820:1: rule__RoutingRules__Group__1__Impl : ( '#' ) ;
    public final void rule__RoutingRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:824:1: ( ( '#' ) )
            // InternalRouterDsl.g:825:1: ( '#' )
            {
            // InternalRouterDsl.g:825:1: ( '#' )
            // InternalRouterDsl.g:826:2: '#'
            {
             before(grammarAccess.getRoutingRulesAccess().getNumberSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRoutingRulesAccess().getNumberSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoutingRules__Group__1__Impl"


    // $ANTLR start "rule__RoutingRules__Group__2"
    // InternalRouterDsl.g:835:1: rule__RoutingRules__Group__2 : rule__RoutingRules__Group__2__Impl ;
    public final void rule__RoutingRules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:839:1: ( rule__RoutingRules__Group__2__Impl )
            // InternalRouterDsl.g:840:2: rule__RoutingRules__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoutingRules__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoutingRules__Group__2"


    // $ANTLR start "rule__RoutingRules__Group__2__Impl"
    // InternalRouterDsl.g:846:1: rule__RoutingRules__Group__2__Impl : ( ( rule__RoutingRules__RulesAssignment_2 )* ) ;
    public final void rule__RoutingRules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:850:1: ( ( ( rule__RoutingRules__RulesAssignment_2 )* ) )
            // InternalRouterDsl.g:851:1: ( ( rule__RoutingRules__RulesAssignment_2 )* )
            {
            // InternalRouterDsl.g:851:1: ( ( rule__RoutingRules__RulesAssignment_2 )* )
            // InternalRouterDsl.g:852:2: ( rule__RoutingRules__RulesAssignment_2 )*
            {
             before(grammarAccess.getRoutingRulesAccess().getRulesAssignment_2()); 
            // InternalRouterDsl.g:853:2: ( rule__RoutingRules__RulesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRouterDsl.g:853:3: rule__RoutingRules__RulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__RoutingRules__RulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRoutingRulesAccess().getRulesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoutingRules__Group__2__Impl"


    // $ANTLR start "rule__CaseRule__Group__0"
    // InternalRouterDsl.g:862:1: rule__CaseRule__Group__0 : rule__CaseRule__Group__0__Impl rule__CaseRule__Group__1 ;
    public final void rule__CaseRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:866:1: ( rule__CaseRule__Group__0__Impl rule__CaseRule__Group__1 )
            // InternalRouterDsl.g:867:2: rule__CaseRule__Group__0__Impl rule__CaseRule__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CaseRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseRule__Group__0"


    // $ANTLR start "rule__CaseRule__Group__0__Impl"
    // InternalRouterDsl.g:874:1: rule__CaseRule__Group__0__Impl : ( 'Case' ) ;
    public final void rule__CaseRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:878:1: ( ( 'Case' ) )
            // InternalRouterDsl.g:879:1: ( 'Case' )
            {
            // InternalRouterDsl.g:879:1: ( 'Case' )
            // InternalRouterDsl.g:880:2: 'Case'
            {
             before(grammarAccess.getCaseRuleAccess().getCaseKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCaseRuleAccess().getCaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseRule__Group__0__Impl"


    // $ANTLR start "rule__CaseRule__Group__1"
    // InternalRouterDsl.g:889:1: rule__CaseRule__Group__1 : rule__CaseRule__Group__1__Impl rule__CaseRule__Group__2 ;
    public final void rule__CaseRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:893:1: ( rule__CaseRule__Group__1__Impl rule__CaseRule__Group__2 )
            // InternalRouterDsl.g:894:2: rule__CaseRule__Group__1__Impl rule__CaseRule__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__CaseRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseRule__Group__1"


    // $ANTLR start "rule__CaseRule__Group__1__Impl"
    // InternalRouterDsl.g:901:1: rule__CaseRule__Group__1__Impl : ( ( rule__CaseRule__ConditionAssignment_1 ) ) ;
    public final void rule__CaseRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:905:1: ( ( ( rule__CaseRule__ConditionAssignment_1 ) ) )
            // InternalRouterDsl.g:906:1: ( ( rule__CaseRule__ConditionAssignment_1 ) )
            {
            // InternalRouterDsl.g:906:1: ( ( rule__CaseRule__ConditionAssignment_1 ) )
            // InternalRouterDsl.g:907:2: ( rule__CaseRule__ConditionAssignment_1 )
            {
             before(grammarAccess.getCaseRuleAccess().getConditionAssignment_1()); 
            // InternalRouterDsl.g:908:2: ( rule__CaseRule__ConditionAssignment_1 )
            // InternalRouterDsl.g:908:3: rule__CaseRule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CaseRule__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseRuleAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseRule__Group__1__Impl"


    // $ANTLR start "rule__CaseRule__Group__2"
    // InternalRouterDsl.g:916:1: rule__CaseRule__Group__2 : rule__CaseRule__Group__2__Impl rule__CaseRule__Group__3 ;
    public final void rule__CaseRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:920:1: ( rule__CaseRule__Group__2__Impl rule__CaseRule__Group__3 )
            // InternalRouterDsl.g:921:2: rule__CaseRule__Group__2__Impl rule__CaseRule__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__CaseRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CaseRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseRule__Group__2"


    // $ANTLR start "rule__CaseRule__Group__2__Impl"
    // InternalRouterDsl.g:928:1: rule__CaseRule__Group__2__Impl : ( ':' ) ;
    public final void rule__CaseRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:932:1: ( ( ':' ) )
            // InternalRouterDsl.g:933:1: ( ':' )
            {
            // InternalRouterDsl.g:933:1: ( ':' )
            // InternalRouterDsl.g:934:2: ':'
            {
             before(grammarAccess.getCaseRuleAccess().getColonKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCaseRuleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseRule__Group__2__Impl"


    // $ANTLR start "rule__CaseRule__Group__3"
    // InternalRouterDsl.g:943:1: rule__CaseRule__Group__3 : rule__CaseRule__Group__3__Impl ;
    public final void rule__CaseRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:947:1: ( rule__CaseRule__Group__3__Impl )
            // InternalRouterDsl.g:948:2: rule__CaseRule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CaseRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseRule__Group__3"


    // $ANTLR start "rule__CaseRule__Group__3__Impl"
    // InternalRouterDsl.g:954:1: rule__CaseRule__Group__3__Impl : ( ( ( rule__CaseRule__DecisionsAssignment_3 ) ) ( ( rule__CaseRule__DecisionsAssignment_3 )* ) ) ;
    public final void rule__CaseRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:958:1: ( ( ( ( rule__CaseRule__DecisionsAssignment_3 ) ) ( ( rule__CaseRule__DecisionsAssignment_3 )* ) ) )
            // InternalRouterDsl.g:959:1: ( ( ( rule__CaseRule__DecisionsAssignment_3 ) ) ( ( rule__CaseRule__DecisionsAssignment_3 )* ) )
            {
            // InternalRouterDsl.g:959:1: ( ( ( rule__CaseRule__DecisionsAssignment_3 ) ) ( ( rule__CaseRule__DecisionsAssignment_3 )* ) )
            // InternalRouterDsl.g:960:2: ( ( rule__CaseRule__DecisionsAssignment_3 ) ) ( ( rule__CaseRule__DecisionsAssignment_3 )* )
            {
            // InternalRouterDsl.g:960:2: ( ( rule__CaseRule__DecisionsAssignment_3 ) )
            // InternalRouterDsl.g:961:3: ( rule__CaseRule__DecisionsAssignment_3 )
            {
             before(grammarAccess.getCaseRuleAccess().getDecisionsAssignment_3()); 
            // InternalRouterDsl.g:962:3: ( rule__CaseRule__DecisionsAssignment_3 )
            // InternalRouterDsl.g:962:4: rule__CaseRule__DecisionsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__CaseRule__DecisionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCaseRuleAccess().getDecisionsAssignment_3()); 

            }

            // InternalRouterDsl.g:965:2: ( ( rule__CaseRule__DecisionsAssignment_3 )* )
            // InternalRouterDsl.g:966:3: ( rule__CaseRule__DecisionsAssignment_3 )*
            {
             before(grammarAccess.getCaseRuleAccess().getDecisionsAssignment_3()); 
            // InternalRouterDsl.g:967:3: ( rule__CaseRule__DecisionsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=32 && LA11_0<=34)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRouterDsl.g:967:4: rule__CaseRule__DecisionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CaseRule__DecisionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCaseRuleAccess().getDecisionsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseRule__Group__3__Impl"


    // $ANTLR start "rule__Decision__Group__0"
    // InternalRouterDsl.g:977:1: rule__Decision__Group__0 : rule__Decision__Group__0__Impl rule__Decision__Group__1 ;
    public final void rule__Decision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:981:1: ( rule__Decision__Group__0__Impl rule__Decision__Group__1 )
            // InternalRouterDsl.g:982:2: rule__Decision__Group__0__Impl rule__Decision__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Decision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decision__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decision__Group__0"


    // $ANTLR start "rule__Decision__Group__0__Impl"
    // InternalRouterDsl.g:989:1: rule__Decision__Group__0__Impl : ( ( rule__Decision__Alternatives_0 ) ) ;
    public final void rule__Decision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:993:1: ( ( ( rule__Decision__Alternatives_0 ) ) )
            // InternalRouterDsl.g:994:1: ( ( rule__Decision__Alternatives_0 ) )
            {
            // InternalRouterDsl.g:994:1: ( ( rule__Decision__Alternatives_0 ) )
            // InternalRouterDsl.g:995:2: ( rule__Decision__Alternatives_0 )
            {
             before(grammarAccess.getDecisionAccess().getAlternatives_0()); 
            // InternalRouterDsl.g:996:2: ( rule__Decision__Alternatives_0 )
            // InternalRouterDsl.g:996:3: rule__Decision__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Decision__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDecisionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decision__Group__0__Impl"


    // $ANTLR start "rule__Decision__Group__1"
    // InternalRouterDsl.g:1004:1: rule__Decision__Group__1 : rule__Decision__Group__1__Impl ;
    public final void rule__Decision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1008:1: ( rule__Decision__Group__1__Impl )
            // InternalRouterDsl.g:1009:2: rule__Decision__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Decision__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decision__Group__1"


    // $ANTLR start "rule__Decision__Group__1__Impl"
    // InternalRouterDsl.g:1015:1: rule__Decision__Group__1__Impl : ( ';' ) ;
    public final void rule__Decision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1019:1: ( ( ';' ) )
            // InternalRouterDsl.g:1020:1: ( ';' )
            {
            // InternalRouterDsl.g:1020:1: ( ';' )
            // InternalRouterDsl.g:1021:2: ';'
            {
             before(grammarAccess.getDecisionAccess().getSemicolonKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDecisionAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decision__Group__1__Impl"


    // $ANTLR start "rule__RouteTo__Group__0"
    // InternalRouterDsl.g:1031:1: rule__RouteTo__Group__0 : rule__RouteTo__Group__0__Impl rule__RouteTo__Group__1 ;
    public final void rule__RouteTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1035:1: ( rule__RouteTo__Group__0__Impl rule__RouteTo__Group__1 )
            // InternalRouterDsl.g:1036:2: rule__RouteTo__Group__0__Impl rule__RouteTo__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RouteTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouteTo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteTo__Group__0"


    // $ANTLR start "rule__RouteTo__Group__0__Impl"
    // InternalRouterDsl.g:1043:1: rule__RouteTo__Group__0__Impl : ( '->' ) ;
    public final void rule__RouteTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1047:1: ( ( '->' ) )
            // InternalRouterDsl.g:1048:1: ( '->' )
            {
            // InternalRouterDsl.g:1048:1: ( '->' )
            // InternalRouterDsl.g:1049:2: '->'
            {
             before(grammarAccess.getRouteToAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRouteToAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteTo__Group__0__Impl"


    // $ANTLR start "rule__RouteTo__Group__1"
    // InternalRouterDsl.g:1058:1: rule__RouteTo__Group__1 : rule__RouteTo__Group__1__Impl ;
    public final void rule__RouteTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1062:1: ( rule__RouteTo__Group__1__Impl )
            // InternalRouterDsl.g:1063:2: rule__RouteTo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RouteTo__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteTo__Group__1"


    // $ANTLR start "rule__RouteTo__Group__1__Impl"
    // InternalRouterDsl.g:1069:1: rule__RouteTo__Group__1__Impl : ( ( rule__RouteTo__DestinationAssignment_1 ) ) ;
    public final void rule__RouteTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1073:1: ( ( ( rule__RouteTo__DestinationAssignment_1 ) ) )
            // InternalRouterDsl.g:1074:1: ( ( rule__RouteTo__DestinationAssignment_1 ) )
            {
            // InternalRouterDsl.g:1074:1: ( ( rule__RouteTo__DestinationAssignment_1 ) )
            // InternalRouterDsl.g:1075:2: ( rule__RouteTo__DestinationAssignment_1 )
            {
             before(grammarAccess.getRouteToAccess().getDestinationAssignment_1()); 
            // InternalRouterDsl.g:1076:2: ( rule__RouteTo__DestinationAssignment_1 )
            // InternalRouterDsl.g:1076:3: rule__RouteTo__DestinationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RouteTo__DestinationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRouteToAccess().getDestinationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteTo__Group__1__Impl"


    // $ANTLR start "rule__DropMessage__Group__0"
    // InternalRouterDsl.g:1085:1: rule__DropMessage__Group__0 : rule__DropMessage__Group__0__Impl rule__DropMessage__Group__1 ;
    public final void rule__DropMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1089:1: ( rule__DropMessage__Group__0__Impl rule__DropMessage__Group__1 )
            // InternalRouterDsl.g:1090:2: rule__DropMessage__Group__0__Impl rule__DropMessage__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DropMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropMessage__Group__0"


    // $ANTLR start "rule__DropMessage__Group__0__Impl"
    // InternalRouterDsl.g:1097:1: rule__DropMessage__Group__0__Impl : ( () ) ;
    public final void rule__DropMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1101:1: ( ( () ) )
            // InternalRouterDsl.g:1102:1: ( () )
            {
            // InternalRouterDsl.g:1102:1: ( () )
            // InternalRouterDsl.g:1103:2: ()
            {
             before(grammarAccess.getDropMessageAccess().getDropMessageAction_0()); 
            // InternalRouterDsl.g:1104:2: ()
            // InternalRouterDsl.g:1104:3: 
            {
            }

             after(grammarAccess.getDropMessageAccess().getDropMessageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropMessage__Group__0__Impl"


    // $ANTLR start "rule__DropMessage__Group__1"
    // InternalRouterDsl.g:1112:1: rule__DropMessage__Group__1 : rule__DropMessage__Group__1__Impl ;
    public final void rule__DropMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1116:1: ( rule__DropMessage__Group__1__Impl )
            // InternalRouterDsl.g:1117:2: rule__DropMessage__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DropMessage__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropMessage__Group__1"


    // $ANTLR start "rule__DropMessage__Group__1__Impl"
    // InternalRouterDsl.g:1123:1: rule__DropMessage__Group__1__Impl : ( 'X' ) ;
    public final void rule__DropMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1127:1: ( ( 'X' ) )
            // InternalRouterDsl.g:1128:1: ( 'X' )
            {
            // InternalRouterDsl.g:1128:1: ( 'X' )
            // InternalRouterDsl.g:1129:2: 'X'
            {
             before(grammarAccess.getDropMessageAccess().getXKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDropMessageAccess().getXKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropMessage__Group__1__Impl"


    // $ANTLR start "rule__Alert__Group__0"
    // InternalRouterDsl.g:1139:1: rule__Alert__Group__0 : rule__Alert__Group__0__Impl rule__Alert__Group__1 ;
    public final void rule__Alert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1143:1: ( rule__Alert__Group__0__Impl rule__Alert__Group__1 )
            // InternalRouterDsl.g:1144:2: rule__Alert__Group__0__Impl rule__Alert__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Alert__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alert__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alert__Group__0"


    // $ANTLR start "rule__Alert__Group__0__Impl"
    // InternalRouterDsl.g:1151:1: rule__Alert__Group__0__Impl : ( '/!\\\\' ) ;
    public final void rule__Alert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1155:1: ( ( '/!\\\\' ) )
            // InternalRouterDsl.g:1156:1: ( '/!\\\\' )
            {
            // InternalRouterDsl.g:1156:1: ( '/!\\\\' )
            // InternalRouterDsl.g:1157:2: '/!\\\\'
            {
             before(grammarAccess.getAlertAccess().getSolidusExclamationMarkReverseSolidusKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAlertAccess().getSolidusExclamationMarkReverseSolidusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alert__Group__0__Impl"


    // $ANTLR start "rule__Alert__Group__1"
    // InternalRouterDsl.g:1166:1: rule__Alert__Group__1 : rule__Alert__Group__1__Impl rule__Alert__Group__2 ;
    public final void rule__Alert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1170:1: ( rule__Alert__Group__1__Impl rule__Alert__Group__2 )
            // InternalRouterDsl.g:1171:2: rule__Alert__Group__1__Impl rule__Alert__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Alert__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alert__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alert__Group__1"


    // $ANTLR start "rule__Alert__Group__1__Impl"
    // InternalRouterDsl.g:1178:1: rule__Alert__Group__1__Impl : ( ( rule__Alert__LevelAssignment_1 ) ) ;
    public final void rule__Alert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1182:1: ( ( ( rule__Alert__LevelAssignment_1 ) ) )
            // InternalRouterDsl.g:1183:1: ( ( rule__Alert__LevelAssignment_1 ) )
            {
            // InternalRouterDsl.g:1183:1: ( ( rule__Alert__LevelAssignment_1 ) )
            // InternalRouterDsl.g:1184:2: ( rule__Alert__LevelAssignment_1 )
            {
             before(grammarAccess.getAlertAccess().getLevelAssignment_1()); 
            // InternalRouterDsl.g:1185:2: ( rule__Alert__LevelAssignment_1 )
            // InternalRouterDsl.g:1185:3: rule__Alert__LevelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Alert__LevelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlertAccess().getLevelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alert__Group__1__Impl"


    // $ANTLR start "rule__Alert__Group__2"
    // InternalRouterDsl.g:1193:1: rule__Alert__Group__2 : rule__Alert__Group__2__Impl ;
    public final void rule__Alert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1197:1: ( rule__Alert__Group__2__Impl )
            // InternalRouterDsl.g:1198:2: rule__Alert__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alert__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alert__Group__2"


    // $ANTLR start "rule__Alert__Group__2__Impl"
    // InternalRouterDsl.g:1204:1: rule__Alert__Group__2__Impl : ( '/!\\\\' ) ;
    public final void rule__Alert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1208:1: ( ( '/!\\\\' ) )
            // InternalRouterDsl.g:1209:1: ( '/!\\\\' )
            {
            // InternalRouterDsl.g:1209:1: ( '/!\\\\' )
            // InternalRouterDsl.g:1210:2: '/!\\\\'
            {
             before(grammarAccess.getAlertAccess().getSolidusExclamationMarkReverseSolidusKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAlertAccess().getSolidusExclamationMarkReverseSolidusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alert__Group__2__Impl"


    // $ANTLR start "rule__Conditional__Group__0"
    // InternalRouterDsl.g:1220:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1224:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // InternalRouterDsl.g:1225:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Conditional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0"


    // $ANTLR start "rule__Conditional__Group__0__Impl"
    // InternalRouterDsl.g:1232:1: rule__Conditional__Group__0__Impl : ( ( rule__Conditional__LeftAssignment_0 ) ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1236:1: ( ( ( rule__Conditional__LeftAssignment_0 ) ) )
            // InternalRouterDsl.g:1237:1: ( ( rule__Conditional__LeftAssignment_0 ) )
            {
            // InternalRouterDsl.g:1237:1: ( ( rule__Conditional__LeftAssignment_0 ) )
            // InternalRouterDsl.g:1238:2: ( rule__Conditional__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionalAccess().getLeftAssignment_0()); 
            // InternalRouterDsl.g:1239:2: ( rule__Conditional__LeftAssignment_0 )
            // InternalRouterDsl.g:1239:3: rule__Conditional__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0__Impl"


    // $ANTLR start "rule__Conditional__Group__1"
    // InternalRouterDsl.g:1247:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1251:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // InternalRouterDsl.g:1252:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Conditional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1"


    // $ANTLR start "rule__Conditional__Group__1__Impl"
    // InternalRouterDsl.g:1259:1: rule__Conditional__Group__1__Impl : ( ( rule__Conditional__OpAssignment_1 ) ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1263:1: ( ( ( rule__Conditional__OpAssignment_1 ) ) )
            // InternalRouterDsl.g:1264:1: ( ( rule__Conditional__OpAssignment_1 ) )
            {
            // InternalRouterDsl.g:1264:1: ( ( rule__Conditional__OpAssignment_1 ) )
            // InternalRouterDsl.g:1265:2: ( rule__Conditional__OpAssignment_1 )
            {
             before(grammarAccess.getConditionalAccess().getOpAssignment_1()); 
            // InternalRouterDsl.g:1266:2: ( rule__Conditional__OpAssignment_1 )
            // InternalRouterDsl.g:1266:3: rule__Conditional__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1__Impl"


    // $ANTLR start "rule__Conditional__Group__2"
    // InternalRouterDsl.g:1274:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1278:1: ( rule__Conditional__Group__2__Impl )
            // InternalRouterDsl.g:1279:2: rule__Conditional__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__2"


    // $ANTLR start "rule__Conditional__Group__2__Impl"
    // InternalRouterDsl.g:1285:1: rule__Conditional__Group__2__Impl : ( ( rule__Conditional__RightAssignment_2 ) ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1289:1: ( ( ( rule__Conditional__RightAssignment_2 ) ) )
            // InternalRouterDsl.g:1290:1: ( ( rule__Conditional__RightAssignment_2 ) )
            {
            // InternalRouterDsl.g:1290:1: ( ( rule__Conditional__RightAssignment_2 ) )
            // InternalRouterDsl.g:1291:2: ( rule__Conditional__RightAssignment_2 )
            {
             before(grammarAccess.getConditionalAccess().getRightAssignment_2()); 
            // InternalRouterDsl.g:1292:2: ( rule__Conditional__RightAssignment_2 )
            // InternalRouterDsl.g:1292:3: rule__Conditional__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__2__Impl"


    // $ANTLR start "rule__Throughtput__Group__0"
    // InternalRouterDsl.g:1301:1: rule__Throughtput__Group__0 : rule__Throughtput__Group__0__Impl rule__Throughtput__Group__1 ;
    public final void rule__Throughtput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1305:1: ( rule__Throughtput__Group__0__Impl rule__Throughtput__Group__1 )
            // InternalRouterDsl.g:1306:2: rule__Throughtput__Group__0__Impl rule__Throughtput__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Throughtput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Throughtput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throughtput__Group__0"


    // $ANTLR start "rule__Throughtput__Group__0__Impl"
    // InternalRouterDsl.g:1313:1: rule__Throughtput__Group__0__Impl : ( ( rule__Throughtput__ValueAssignment_0 ) ) ;
    public final void rule__Throughtput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1317:1: ( ( ( rule__Throughtput__ValueAssignment_0 ) ) )
            // InternalRouterDsl.g:1318:1: ( ( rule__Throughtput__ValueAssignment_0 ) )
            {
            // InternalRouterDsl.g:1318:1: ( ( rule__Throughtput__ValueAssignment_0 ) )
            // InternalRouterDsl.g:1319:2: ( rule__Throughtput__ValueAssignment_0 )
            {
             before(grammarAccess.getThroughtputAccess().getValueAssignment_0()); 
            // InternalRouterDsl.g:1320:2: ( rule__Throughtput__ValueAssignment_0 )
            // InternalRouterDsl.g:1320:3: rule__Throughtput__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Throughtput__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getThroughtputAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throughtput__Group__0__Impl"


    // $ANTLR start "rule__Throughtput__Group__1"
    // InternalRouterDsl.g:1328:1: rule__Throughtput__Group__1 : rule__Throughtput__Group__1__Impl rule__Throughtput__Group__2 ;
    public final void rule__Throughtput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1332:1: ( rule__Throughtput__Group__1__Impl rule__Throughtput__Group__2 )
            // InternalRouterDsl.g:1333:2: rule__Throughtput__Group__1__Impl rule__Throughtput__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Throughtput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Throughtput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throughtput__Group__1"


    // $ANTLR start "rule__Throughtput__Group__1__Impl"
    // InternalRouterDsl.g:1340:1: rule__Throughtput__Group__1__Impl : ( '/' ) ;
    public final void rule__Throughtput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1344:1: ( ( '/' ) )
            // InternalRouterDsl.g:1345:1: ( '/' )
            {
            // InternalRouterDsl.g:1345:1: ( '/' )
            // InternalRouterDsl.g:1346:2: '/'
            {
             before(grammarAccess.getThroughtputAccess().getSolidusKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getThroughtputAccess().getSolidusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throughtput__Group__1__Impl"


    // $ANTLR start "rule__Throughtput__Group__2"
    // InternalRouterDsl.g:1355:1: rule__Throughtput__Group__2 : rule__Throughtput__Group__2__Impl ;
    public final void rule__Throughtput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1359:1: ( rule__Throughtput__Group__2__Impl )
            // InternalRouterDsl.g:1360:2: rule__Throughtput__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Throughtput__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throughtput__Group__2"


    // $ANTLR start "rule__Throughtput__Group__2__Impl"
    // InternalRouterDsl.g:1366:1: rule__Throughtput__Group__2__Impl : ( ( rule__Throughtput__UnitAssignment_2 ) ) ;
    public final void rule__Throughtput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1370:1: ( ( ( rule__Throughtput__UnitAssignment_2 ) ) )
            // InternalRouterDsl.g:1371:1: ( ( rule__Throughtput__UnitAssignment_2 ) )
            {
            // InternalRouterDsl.g:1371:1: ( ( rule__Throughtput__UnitAssignment_2 ) )
            // InternalRouterDsl.g:1372:2: ( rule__Throughtput__UnitAssignment_2 )
            {
             before(grammarAccess.getThroughtputAccess().getUnitAssignment_2()); 
            // InternalRouterDsl.g:1373:2: ( rule__Throughtput__UnitAssignment_2 )
            // InternalRouterDsl.g:1373:3: rule__Throughtput__UnitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Throughtput__UnitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getThroughtputAccess().getUnitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throughtput__Group__2__Impl"


    // $ANTLR start "rule__Temperature__Group__0"
    // InternalRouterDsl.g:1382:1: rule__Temperature__Group__0 : rule__Temperature__Group__0__Impl rule__Temperature__Group__1 ;
    public final void rule__Temperature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1386:1: ( rule__Temperature__Group__0__Impl rule__Temperature__Group__1 )
            // InternalRouterDsl.g:1387:2: rule__Temperature__Group__0__Impl rule__Temperature__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Temperature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Temperature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Temperature__Group__0"


    // $ANTLR start "rule__Temperature__Group__0__Impl"
    // InternalRouterDsl.g:1394:1: rule__Temperature__Group__0__Impl : ( ( rule__Temperature__ValueAssignment_0 ) ) ;
    public final void rule__Temperature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1398:1: ( ( ( rule__Temperature__ValueAssignment_0 ) ) )
            // InternalRouterDsl.g:1399:1: ( ( rule__Temperature__ValueAssignment_0 ) )
            {
            // InternalRouterDsl.g:1399:1: ( ( rule__Temperature__ValueAssignment_0 ) )
            // InternalRouterDsl.g:1400:2: ( rule__Temperature__ValueAssignment_0 )
            {
             before(grammarAccess.getTemperatureAccess().getValueAssignment_0()); 
            // InternalRouterDsl.g:1401:2: ( rule__Temperature__ValueAssignment_0 )
            // InternalRouterDsl.g:1401:3: rule__Temperature__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Temperature__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTemperatureAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Temperature__Group__0__Impl"


    // $ANTLR start "rule__Temperature__Group__1"
    // InternalRouterDsl.g:1409:1: rule__Temperature__Group__1 : rule__Temperature__Group__1__Impl ;
    public final void rule__Temperature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1413:1: ( rule__Temperature__Group__1__Impl )
            // InternalRouterDsl.g:1414:2: rule__Temperature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Temperature__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Temperature__Group__1"


    // $ANTLR start "rule__Temperature__Group__1__Impl"
    // InternalRouterDsl.g:1420:1: rule__Temperature__Group__1__Impl : ( ( rule__Temperature__UnitAssignment_1 ) ) ;
    public final void rule__Temperature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1424:1: ( ( ( rule__Temperature__UnitAssignment_1 ) ) )
            // InternalRouterDsl.g:1425:1: ( ( rule__Temperature__UnitAssignment_1 ) )
            {
            // InternalRouterDsl.g:1425:1: ( ( rule__Temperature__UnitAssignment_1 ) )
            // InternalRouterDsl.g:1426:2: ( rule__Temperature__UnitAssignment_1 )
            {
             before(grammarAccess.getTemperatureAccess().getUnitAssignment_1()); 
            // InternalRouterDsl.g:1427:2: ( rule__Temperature__UnitAssignment_1 )
            // InternalRouterDsl.g:1427:3: rule__Temperature__UnitAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Temperature__UnitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemperatureAccess().getUnitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Temperature__Group__1__Impl"


    // $ANTLR start "rule__ProcessorAccess__Group__0"
    // InternalRouterDsl.g:1436:1: rule__ProcessorAccess__Group__0 : rule__ProcessorAccess__Group__0__Impl rule__ProcessorAccess__Group__1 ;
    public final void rule__ProcessorAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1440:1: ( rule__ProcessorAccess__Group__0__Impl rule__ProcessorAccess__Group__1 )
            // InternalRouterDsl.g:1441:2: rule__ProcessorAccess__Group__0__Impl rule__ProcessorAccess__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ProcessorAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessorAccess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAccess__Group__0"


    // $ANTLR start "rule__ProcessorAccess__Group__0__Impl"
    // InternalRouterDsl.g:1448:1: rule__ProcessorAccess__Group__0__Impl : ( ( rule__ProcessorAccess__ProcessorAssignment_0 ) ) ;
    public final void rule__ProcessorAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1452:1: ( ( ( rule__ProcessorAccess__ProcessorAssignment_0 ) ) )
            // InternalRouterDsl.g:1453:1: ( ( rule__ProcessorAccess__ProcessorAssignment_0 ) )
            {
            // InternalRouterDsl.g:1453:1: ( ( rule__ProcessorAccess__ProcessorAssignment_0 ) )
            // InternalRouterDsl.g:1454:2: ( rule__ProcessorAccess__ProcessorAssignment_0 )
            {
             before(grammarAccess.getProcessorAccessAccess().getProcessorAssignment_0()); 
            // InternalRouterDsl.g:1455:2: ( rule__ProcessorAccess__ProcessorAssignment_0 )
            // InternalRouterDsl.g:1455:3: rule__ProcessorAccess__ProcessorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ProcessorAccess__ProcessorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProcessorAccessAccess().getProcessorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAccess__Group__0__Impl"


    // $ANTLR start "rule__ProcessorAccess__Group__1"
    // InternalRouterDsl.g:1463:1: rule__ProcessorAccess__Group__1 : rule__ProcessorAccess__Group__1__Impl rule__ProcessorAccess__Group__2 ;
    public final void rule__ProcessorAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1467:1: ( rule__ProcessorAccess__Group__1__Impl rule__ProcessorAccess__Group__2 )
            // InternalRouterDsl.g:1468:2: rule__ProcessorAccess__Group__1__Impl rule__ProcessorAccess__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ProcessorAccess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessorAccess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAccess__Group__1"


    // $ANTLR start "rule__ProcessorAccess__Group__1__Impl"
    // InternalRouterDsl.g:1475:1: rule__ProcessorAccess__Group__1__Impl : ( '.' ) ;
    public final void rule__ProcessorAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1479:1: ( ( '.' ) )
            // InternalRouterDsl.g:1480:1: ( '.' )
            {
            // InternalRouterDsl.g:1480:1: ( '.' )
            // InternalRouterDsl.g:1481:2: '.'
            {
             before(grammarAccess.getProcessorAccessAccess().getFullStopKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProcessorAccessAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAccess__Group__1__Impl"


    // $ANTLR start "rule__ProcessorAccess__Group__2"
    // InternalRouterDsl.g:1490:1: rule__ProcessorAccess__Group__2 : rule__ProcessorAccess__Group__2__Impl ;
    public final void rule__ProcessorAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1494:1: ( rule__ProcessorAccess__Group__2__Impl )
            // InternalRouterDsl.g:1495:2: rule__ProcessorAccess__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProcessorAccess__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAccess__Group__2"


    // $ANTLR start "rule__ProcessorAccess__Group__2__Impl"
    // InternalRouterDsl.g:1501:1: rule__ProcessorAccess__Group__2__Impl : ( ( rule__ProcessorAccess__AttributeAssignment_2 ) ) ;
    public final void rule__ProcessorAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1505:1: ( ( ( rule__ProcessorAccess__AttributeAssignment_2 ) ) )
            // InternalRouterDsl.g:1506:1: ( ( rule__ProcessorAccess__AttributeAssignment_2 ) )
            {
            // InternalRouterDsl.g:1506:1: ( ( rule__ProcessorAccess__AttributeAssignment_2 ) )
            // InternalRouterDsl.g:1507:2: ( rule__ProcessorAccess__AttributeAssignment_2 )
            {
             before(grammarAccess.getProcessorAccessAccess().getAttributeAssignment_2()); 
            // InternalRouterDsl.g:1508:2: ( rule__ProcessorAccess__AttributeAssignment_2 )
            // InternalRouterDsl.g:1508:3: rule__ProcessorAccess__AttributeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProcessorAccess__AttributeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessorAccessAccess().getAttributeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAccess__Group__2__Impl"


    // $ANTLR start "rule__SensorAccess__Group__0"
    // InternalRouterDsl.g:1517:1: rule__SensorAccess__Group__0 : rule__SensorAccess__Group__0__Impl rule__SensorAccess__Group__1 ;
    public final void rule__SensorAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1521:1: ( rule__SensorAccess__Group__0__Impl rule__SensorAccess__Group__1 )
            // InternalRouterDsl.g:1522:2: rule__SensorAccess__Group__0__Impl rule__SensorAccess__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__SensorAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorAccess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorAccess__Group__0"


    // $ANTLR start "rule__SensorAccess__Group__0__Impl"
    // InternalRouterDsl.g:1529:1: rule__SensorAccess__Group__0__Impl : ( ( rule__SensorAccess__SensorAssignment_0 ) ) ;
    public final void rule__SensorAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1533:1: ( ( ( rule__SensorAccess__SensorAssignment_0 ) ) )
            // InternalRouterDsl.g:1534:1: ( ( rule__SensorAccess__SensorAssignment_0 ) )
            {
            // InternalRouterDsl.g:1534:1: ( ( rule__SensorAccess__SensorAssignment_0 ) )
            // InternalRouterDsl.g:1535:2: ( rule__SensorAccess__SensorAssignment_0 )
            {
             before(grammarAccess.getSensorAccessAccess().getSensorAssignment_0()); 
            // InternalRouterDsl.g:1536:2: ( rule__SensorAccess__SensorAssignment_0 )
            // InternalRouterDsl.g:1536:3: rule__SensorAccess__SensorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SensorAccess__SensorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccessAccess().getSensorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorAccess__Group__0__Impl"


    // $ANTLR start "rule__SensorAccess__Group__1"
    // InternalRouterDsl.g:1544:1: rule__SensorAccess__Group__1 : rule__SensorAccess__Group__1__Impl ;
    public final void rule__SensorAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1548:1: ( rule__SensorAccess__Group__1__Impl )
            // InternalRouterDsl.g:1549:2: rule__SensorAccess__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorAccess__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorAccess__Group__1"


    // $ANTLR start "rule__SensorAccess__Group__1__Impl"
    // InternalRouterDsl.g:1555:1: rule__SensorAccess__Group__1__Impl : ( '.volume' ) ;
    public final void rule__SensorAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1559:1: ( ( '.volume' ) )
            // InternalRouterDsl.g:1560:1: ( '.volume' )
            {
            // InternalRouterDsl.g:1560:1: ( '.volume' )
            // InternalRouterDsl.g:1561:2: '.volume'
            {
             before(grammarAccess.getSensorAccessAccess().getVolumeKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSensorAccessAccess().getVolumeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorAccess__Group__1__Impl"


    // $ANTLR start "rule__SystemAccess__Group__0"
    // InternalRouterDsl.g:1571:1: rule__SystemAccess__Group__0 : rule__SystemAccess__Group__0__Impl rule__SystemAccess__Group__1 ;
    public final void rule__SystemAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1575:1: ( rule__SystemAccess__Group__0__Impl rule__SystemAccess__Group__1 )
            // InternalRouterDsl.g:1576:2: rule__SystemAccess__Group__0__Impl rule__SystemAccess__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SystemAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemAccess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemAccess__Group__0"


    // $ANTLR start "rule__SystemAccess__Group__0__Impl"
    // InternalRouterDsl.g:1583:1: rule__SystemAccess__Group__0__Impl : ( ( rule__SystemAccess__SystemAssignment_0 ) ) ;
    public final void rule__SystemAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1587:1: ( ( ( rule__SystemAccess__SystemAssignment_0 ) ) )
            // InternalRouterDsl.g:1588:1: ( ( rule__SystemAccess__SystemAssignment_0 ) )
            {
            // InternalRouterDsl.g:1588:1: ( ( rule__SystemAccess__SystemAssignment_0 ) )
            // InternalRouterDsl.g:1589:2: ( rule__SystemAccess__SystemAssignment_0 )
            {
             before(grammarAccess.getSystemAccessAccess().getSystemAssignment_0()); 
            // InternalRouterDsl.g:1590:2: ( rule__SystemAccess__SystemAssignment_0 )
            // InternalRouterDsl.g:1590:3: rule__SystemAccess__SystemAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SystemAccess__SystemAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccessAccess().getSystemAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemAccess__Group__0__Impl"


    // $ANTLR start "rule__SystemAccess__Group__1"
    // InternalRouterDsl.g:1598:1: rule__SystemAccess__Group__1 : rule__SystemAccess__Group__1__Impl ;
    public final void rule__SystemAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1602:1: ( rule__SystemAccess__Group__1__Impl )
            // InternalRouterDsl.g:1603:2: rule__SystemAccess__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemAccess__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemAccess__Group__1"


    // $ANTLR start "rule__SystemAccess__Group__1__Impl"
    // InternalRouterDsl.g:1609:1: rule__SystemAccess__Group__1__Impl : ( '.temperature' ) ;
    public final void rule__SystemAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1613:1: ( ( '.temperature' ) )
            // InternalRouterDsl.g:1614:1: ( '.temperature' )
            {
            // InternalRouterDsl.g:1614:1: ( '.temperature' )
            // InternalRouterDsl.g:1615:2: '.temperature'
            {
             before(grammarAccess.getSystemAccessAccess().getTemperatureKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSystemAccessAccess().getTemperatureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemAccess__Group__1__Impl"


    // $ANTLR start "rule__RoutingRules__RulesAssignment_2"
    // InternalRouterDsl.g:1625:1: rule__RoutingRules__RulesAssignment_2 : ( ruleCaseRule ) ;
    public final void rule__RoutingRules__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1629:1: ( ( ruleCaseRule ) )
            // InternalRouterDsl.g:1630:2: ( ruleCaseRule )
            {
            // InternalRouterDsl.g:1630:2: ( ruleCaseRule )
            // InternalRouterDsl.g:1631:3: ruleCaseRule
            {
             before(grammarAccess.getRoutingRulesAccess().getRulesCaseRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCaseRule();

            state._fsp--;

             after(grammarAccess.getRoutingRulesAccess().getRulesCaseRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoutingRules__RulesAssignment_2"


    // $ANTLR start "rule__CaseRule__ConditionAssignment_1"
    // InternalRouterDsl.g:1640:1: rule__CaseRule__ConditionAssignment_1 : ( ruleConditional ) ;
    public final void rule__CaseRule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1644:1: ( ( ruleConditional ) )
            // InternalRouterDsl.g:1645:2: ( ruleConditional )
            {
            // InternalRouterDsl.g:1645:2: ( ruleConditional )
            // InternalRouterDsl.g:1646:3: ruleConditional
            {
             before(grammarAccess.getCaseRuleAccess().getConditionConditionalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getCaseRuleAccess().getConditionConditionalParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseRule__ConditionAssignment_1"


    // $ANTLR start "rule__CaseRule__DecisionsAssignment_3"
    // InternalRouterDsl.g:1655:1: rule__CaseRule__DecisionsAssignment_3 : ( ruleDecision ) ;
    public final void rule__CaseRule__DecisionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1659:1: ( ( ruleDecision ) )
            // InternalRouterDsl.g:1660:2: ( ruleDecision )
            {
            // InternalRouterDsl.g:1660:2: ( ruleDecision )
            // InternalRouterDsl.g:1661:3: ruleDecision
            {
             before(grammarAccess.getCaseRuleAccess().getDecisionsDecisionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDecision();

            state._fsp--;

             after(grammarAccess.getCaseRuleAccess().getDecisionsDecisionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseRule__DecisionsAssignment_3"


    // $ANTLR start "rule__RouteTo__DestinationAssignment_1"
    // InternalRouterDsl.g:1670:1: rule__RouteTo__DestinationAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RouteTo__DestinationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1674:1: ( ( ( RULE_ID ) ) )
            // InternalRouterDsl.g:1675:2: ( ( RULE_ID ) )
            {
            // InternalRouterDsl.g:1675:2: ( ( RULE_ID ) )
            // InternalRouterDsl.g:1676:3: ( RULE_ID )
            {
             before(grammarAccess.getRouteToAccess().getDestinationProcessorCrossReference_1_0()); 
            // InternalRouterDsl.g:1677:3: ( RULE_ID )
            // InternalRouterDsl.g:1678:4: RULE_ID
            {
             before(grammarAccess.getRouteToAccess().getDestinationProcessorIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRouteToAccess().getDestinationProcessorIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRouteToAccess().getDestinationProcessorCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteTo__DestinationAssignment_1"


    // $ANTLR start "rule__Alert__LevelAssignment_1"
    // InternalRouterDsl.g:1689:1: rule__Alert__LevelAssignment_1 : ( ruleAlertLevel ) ;
    public final void rule__Alert__LevelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1693:1: ( ( ruleAlertLevel ) )
            // InternalRouterDsl.g:1694:2: ( ruleAlertLevel )
            {
            // InternalRouterDsl.g:1694:2: ( ruleAlertLevel )
            // InternalRouterDsl.g:1695:3: ruleAlertLevel
            {
             before(grammarAccess.getAlertAccess().getLevelAlertLevelEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlertLevel();

            state._fsp--;

             after(grammarAccess.getAlertAccess().getLevelAlertLevelEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alert__LevelAssignment_1"


    // $ANTLR start "rule__Conditional__LeftAssignment_0"
    // InternalRouterDsl.g:1704:1: rule__Conditional__LeftAssignment_0 : ( ruleObjectAccessOrValue ) ;
    public final void rule__Conditional__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1708:1: ( ( ruleObjectAccessOrValue ) )
            // InternalRouterDsl.g:1709:2: ( ruleObjectAccessOrValue )
            {
            // InternalRouterDsl.g:1709:2: ( ruleObjectAccessOrValue )
            // InternalRouterDsl.g:1710:3: ruleObjectAccessOrValue
            {
             before(grammarAccess.getConditionalAccess().getLeftObjectAccessOrValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectAccessOrValue();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getLeftObjectAccessOrValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__LeftAssignment_0"


    // $ANTLR start "rule__Conditional__OpAssignment_1"
    // InternalRouterDsl.g:1719:1: rule__Conditional__OpAssignment_1 : ( ruleComparison ) ;
    public final void rule__Conditional__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1723:1: ( ( ruleComparison ) )
            // InternalRouterDsl.g:1724:2: ( ruleComparison )
            {
            // InternalRouterDsl.g:1724:2: ( ruleComparison )
            // InternalRouterDsl.g:1725:3: ruleComparison
            {
             before(grammarAccess.getConditionalAccess().getOpComparisonEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getOpComparisonEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__OpAssignment_1"


    // $ANTLR start "rule__Conditional__RightAssignment_2"
    // InternalRouterDsl.g:1734:1: rule__Conditional__RightAssignment_2 : ( ruleObjectAccessOrValue ) ;
    public final void rule__Conditional__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1738:1: ( ( ruleObjectAccessOrValue ) )
            // InternalRouterDsl.g:1739:2: ( ruleObjectAccessOrValue )
            {
            // InternalRouterDsl.g:1739:2: ( ruleObjectAccessOrValue )
            // InternalRouterDsl.g:1740:3: ruleObjectAccessOrValue
            {
             before(grammarAccess.getConditionalAccess().getRightObjectAccessOrValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectAccessOrValue();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getRightObjectAccessOrValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__RightAssignment_2"


    // $ANTLR start "rule__LiteralValue__ValueAssignment"
    // InternalRouterDsl.g:1749:1: rule__LiteralValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__LiteralValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1753:1: ( ( RULE_INT ) )
            // InternalRouterDsl.g:1754:2: ( RULE_INT )
            {
            // InternalRouterDsl.g:1754:2: ( RULE_INT )
            // InternalRouterDsl.g:1755:3: RULE_INT
            {
             before(grammarAccess.getLiteralValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLiteralValueAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralValue__ValueAssignment"


    // $ANTLR start "rule__Throughtput__ValueAssignment_0"
    // InternalRouterDsl.g:1764:1: rule__Throughtput__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Throughtput__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1768:1: ( ( RULE_INT ) )
            // InternalRouterDsl.g:1769:2: ( RULE_INT )
            {
            // InternalRouterDsl.g:1769:2: ( RULE_INT )
            // InternalRouterDsl.g:1770:3: RULE_INT
            {
             before(grammarAccess.getThroughtputAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getThroughtputAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throughtput__ValueAssignment_0"


    // $ANTLR start "rule__Throughtput__UnitAssignment_2"
    // InternalRouterDsl.g:1779:1: rule__Throughtput__UnitAssignment_2 : ( ruleTimeUnit ) ;
    public final void rule__Throughtput__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1783:1: ( ( ruleTimeUnit ) )
            // InternalRouterDsl.g:1784:2: ( ruleTimeUnit )
            {
            // InternalRouterDsl.g:1784:2: ( ruleTimeUnit )
            // InternalRouterDsl.g:1785:3: ruleTimeUnit
            {
             before(grammarAccess.getThroughtputAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getThroughtputAccess().getUnitTimeUnitEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throughtput__UnitAssignment_2"


    // $ANTLR start "rule__Temperature__ValueAssignment_0"
    // InternalRouterDsl.g:1794:1: rule__Temperature__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Temperature__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1798:1: ( ( RULE_INT ) )
            // InternalRouterDsl.g:1799:2: ( RULE_INT )
            {
            // InternalRouterDsl.g:1799:2: ( RULE_INT )
            // InternalRouterDsl.g:1800:3: RULE_INT
            {
             before(grammarAccess.getTemperatureAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTemperatureAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Temperature__ValueAssignment_0"


    // $ANTLR start "rule__Temperature__UnitAssignment_1"
    // InternalRouterDsl.g:1809:1: rule__Temperature__UnitAssignment_1 : ( ruleTemperatureUnit ) ;
    public final void rule__Temperature__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1813:1: ( ( ruleTemperatureUnit ) )
            // InternalRouterDsl.g:1814:2: ( ruleTemperatureUnit )
            {
            // InternalRouterDsl.g:1814:2: ( ruleTemperatureUnit )
            // InternalRouterDsl.g:1815:3: ruleTemperatureUnit
            {
             before(grammarAccess.getTemperatureAccess().getUnitTemperatureUnitEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTemperatureUnit();

            state._fsp--;

             after(grammarAccess.getTemperatureAccess().getUnitTemperatureUnitEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Temperature__UnitAssignment_1"


    // $ANTLR start "rule__ProcessorAccess__ProcessorAssignment_0"
    // InternalRouterDsl.g:1824:1: rule__ProcessorAccess__ProcessorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ProcessorAccess__ProcessorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1828:1: ( ( ( RULE_ID ) ) )
            // InternalRouterDsl.g:1829:2: ( ( RULE_ID ) )
            {
            // InternalRouterDsl.g:1829:2: ( ( RULE_ID ) )
            // InternalRouterDsl.g:1830:3: ( RULE_ID )
            {
             before(grammarAccess.getProcessorAccessAccess().getProcessorProcessorCrossReference_0_0()); 
            // InternalRouterDsl.g:1831:3: ( RULE_ID )
            // InternalRouterDsl.g:1832:4: RULE_ID
            {
             before(grammarAccess.getProcessorAccessAccess().getProcessorProcessorIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessorAccessAccess().getProcessorProcessorIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getProcessorAccessAccess().getProcessorProcessorCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAccess__ProcessorAssignment_0"


    // $ANTLR start "rule__ProcessorAccess__AttributeAssignment_2"
    // InternalRouterDsl.g:1843:1: rule__ProcessorAccess__AttributeAssignment_2 : ( ruleProcessorAttribute ) ;
    public final void rule__ProcessorAccess__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1847:1: ( ( ruleProcessorAttribute ) )
            // InternalRouterDsl.g:1848:2: ( ruleProcessorAttribute )
            {
            // InternalRouterDsl.g:1848:2: ( ruleProcessorAttribute )
            // InternalRouterDsl.g:1849:3: ruleProcessorAttribute
            {
             before(grammarAccess.getProcessorAccessAccess().getAttributeProcessorAttributeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessorAttribute();

            state._fsp--;

             after(grammarAccess.getProcessorAccessAccess().getAttributeProcessorAttributeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAccess__AttributeAssignment_2"


    // $ANTLR start "rule__SensorAccess__SensorAssignment_0"
    // InternalRouterDsl.g:1858:1: rule__SensorAccess__SensorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SensorAccess__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1862:1: ( ( ( RULE_ID ) ) )
            // InternalRouterDsl.g:1863:2: ( ( RULE_ID ) )
            {
            // InternalRouterDsl.g:1863:2: ( ( RULE_ID ) )
            // InternalRouterDsl.g:1864:3: ( RULE_ID )
            {
             before(grammarAccess.getSensorAccessAccess().getSensorDataSourceCrossReference_0_0()); 
            // InternalRouterDsl.g:1865:3: ( RULE_ID )
            // InternalRouterDsl.g:1866:4: RULE_ID
            {
             before(grammarAccess.getSensorAccessAccess().getSensorDataSourceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorAccessAccess().getSensorDataSourceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSensorAccessAccess().getSensorDataSourceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorAccess__SensorAssignment_0"


    // $ANTLR start "rule__SystemAccess__SystemAssignment_0"
    // InternalRouterDsl.g:1877:1: rule__SystemAccess__SystemAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SystemAccess__SystemAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1881:1: ( ( ( RULE_ID ) ) )
            // InternalRouterDsl.g:1882:2: ( ( RULE_ID ) )
            {
            // InternalRouterDsl.g:1882:2: ( ( RULE_ID ) )
            // InternalRouterDsl.g:1883:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemAccessAccess().getSystemSystemCrossReference_0_0()); 
            // InternalRouterDsl.g:1884:3: ( RULE_ID )
            // InternalRouterDsl.g:1885:4: RULE_ID
            {
             before(grammarAccess.getSystemAccessAccess().getSystemSystemIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemAccessAccess().getSystemSystemIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSystemAccessAccess().getSystemSystemCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemAccess__SystemAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});

}