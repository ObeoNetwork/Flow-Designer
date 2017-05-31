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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'capacity'", "'load'", "'consumption'", "'<'", "'<='", "'='", "'>'", "'>='", "'sec'", "'msec'", "'usec'", "'\\u00B0C'", "'\\u00B0F'", "'critical'", "'major'", "'error'", "'warning'", "'#'", "'sensor'", "'('", "')'", "'processor'", "'system'", "'Case'", "':'", "';'", "'->'", "'X'", "'/!\\\\'", "'/'", "'.'", "'.volume'", "'.temperature'"
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


    // $ANTLR start "entryRuleDataSourceDeclaration"
    // InternalRouterDsl.g:78:1: entryRuleDataSourceDeclaration : ruleDataSourceDeclaration EOF ;
    public final void entryRuleDataSourceDeclaration() throws RecognitionException {
        try {
            // InternalRouterDsl.g:79:1: ( ruleDataSourceDeclaration EOF )
            // InternalRouterDsl.g:80:1: ruleDataSourceDeclaration EOF
            {
             before(grammarAccess.getDataSourceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDataSourceDeclaration();

            state._fsp--;

             after(grammarAccess.getDataSourceDeclarationRule()); 
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
    // $ANTLR end "entryRuleDataSourceDeclaration"


    // $ANTLR start "ruleDataSourceDeclaration"
    // InternalRouterDsl.g:87:1: ruleDataSourceDeclaration : ( ( rule__DataSourceDeclaration__Group__0 ) ) ;
    public final void ruleDataSourceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:91:2: ( ( ( rule__DataSourceDeclaration__Group__0 ) ) )
            // InternalRouterDsl.g:92:2: ( ( rule__DataSourceDeclaration__Group__0 ) )
            {
            // InternalRouterDsl.g:92:2: ( ( rule__DataSourceDeclaration__Group__0 ) )
            // InternalRouterDsl.g:93:3: ( rule__DataSourceDeclaration__Group__0 )
            {
             before(grammarAccess.getDataSourceDeclarationAccess().getGroup()); 
            // InternalRouterDsl.g:94:3: ( rule__DataSourceDeclaration__Group__0 )
            // InternalRouterDsl.g:94:4: rule__DataSourceDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleDataSourceDeclaration"


    // $ANTLR start "entryRuleProcessorDeclaration"
    // InternalRouterDsl.g:103:1: entryRuleProcessorDeclaration : ruleProcessorDeclaration EOF ;
    public final void entryRuleProcessorDeclaration() throws RecognitionException {
        try {
            // InternalRouterDsl.g:104:1: ( ruleProcessorDeclaration EOF )
            // InternalRouterDsl.g:105:1: ruleProcessorDeclaration EOF
            {
             before(grammarAccess.getProcessorDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessorDeclaration();

            state._fsp--;

             after(grammarAccess.getProcessorDeclarationRule()); 
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
    // $ANTLR end "entryRuleProcessorDeclaration"


    // $ANTLR start "ruleProcessorDeclaration"
    // InternalRouterDsl.g:112:1: ruleProcessorDeclaration : ( ( rule__ProcessorDeclaration__Group__0 ) ) ;
    public final void ruleProcessorDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:116:2: ( ( ( rule__ProcessorDeclaration__Group__0 ) ) )
            // InternalRouterDsl.g:117:2: ( ( rule__ProcessorDeclaration__Group__0 ) )
            {
            // InternalRouterDsl.g:117:2: ( ( rule__ProcessorDeclaration__Group__0 ) )
            // InternalRouterDsl.g:118:3: ( rule__ProcessorDeclaration__Group__0 )
            {
             before(grammarAccess.getProcessorDeclarationAccess().getGroup()); 
            // InternalRouterDsl.g:119:3: ( rule__ProcessorDeclaration__Group__0 )
            // InternalRouterDsl.g:119:4: rule__ProcessorDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProcessorDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessorDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleProcessorDeclaration"


    // $ANTLR start "entryRuleSystemDeclaration"
    // InternalRouterDsl.g:128:1: entryRuleSystemDeclaration : ruleSystemDeclaration EOF ;
    public final void entryRuleSystemDeclaration() throws RecognitionException {
        try {
            // InternalRouterDsl.g:129:1: ( ruleSystemDeclaration EOF )
            // InternalRouterDsl.g:130:1: ruleSystemDeclaration EOF
            {
             before(grammarAccess.getSystemDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemDeclaration();

            state._fsp--;

             after(grammarAccess.getSystemDeclarationRule()); 
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
    // $ANTLR end "entryRuleSystemDeclaration"


    // $ANTLR start "ruleSystemDeclaration"
    // InternalRouterDsl.g:137:1: ruleSystemDeclaration : ( ( rule__SystemDeclaration__Group__0 ) ) ;
    public final void ruleSystemDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:141:2: ( ( ( rule__SystemDeclaration__Group__0 ) ) )
            // InternalRouterDsl.g:142:2: ( ( rule__SystemDeclaration__Group__0 ) )
            {
            // InternalRouterDsl.g:142:2: ( ( rule__SystemDeclaration__Group__0 ) )
            // InternalRouterDsl.g:143:3: ( rule__SystemDeclaration__Group__0 )
            {
             before(grammarAccess.getSystemDeclarationAccess().getGroup()); 
            // InternalRouterDsl.g:144:3: ( rule__SystemDeclaration__Group__0 )
            // InternalRouterDsl.g:144:4: rule__SystemDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleSystemDeclaration"


    // $ANTLR start "entryRuleCaseRule"
    // InternalRouterDsl.g:153:1: entryRuleCaseRule : ruleCaseRule EOF ;
    public final void entryRuleCaseRule() throws RecognitionException {
        try {
            // InternalRouterDsl.g:154:1: ( ruleCaseRule EOF )
            // InternalRouterDsl.g:155:1: ruleCaseRule EOF
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
    // InternalRouterDsl.g:162:1: ruleCaseRule : ( ( rule__CaseRule__Group__0 ) ) ;
    public final void ruleCaseRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:166:2: ( ( ( rule__CaseRule__Group__0 ) ) )
            // InternalRouterDsl.g:167:2: ( ( rule__CaseRule__Group__0 ) )
            {
            // InternalRouterDsl.g:167:2: ( ( rule__CaseRule__Group__0 ) )
            // InternalRouterDsl.g:168:3: ( rule__CaseRule__Group__0 )
            {
             before(grammarAccess.getCaseRuleAccess().getGroup()); 
            // InternalRouterDsl.g:169:3: ( rule__CaseRule__Group__0 )
            // InternalRouterDsl.g:169:4: rule__CaseRule__Group__0
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
    // InternalRouterDsl.g:178:1: entryRuleDecision : ruleDecision EOF ;
    public final void entryRuleDecision() throws RecognitionException {
        try {
            // InternalRouterDsl.g:179:1: ( ruleDecision EOF )
            // InternalRouterDsl.g:180:1: ruleDecision EOF
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
    // InternalRouterDsl.g:187:1: ruleDecision : ( ( rule__Decision__Group__0 ) ) ;
    public final void ruleDecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:191:2: ( ( ( rule__Decision__Group__0 ) ) )
            // InternalRouterDsl.g:192:2: ( ( rule__Decision__Group__0 ) )
            {
            // InternalRouterDsl.g:192:2: ( ( rule__Decision__Group__0 ) )
            // InternalRouterDsl.g:193:3: ( rule__Decision__Group__0 )
            {
             before(grammarAccess.getDecisionAccess().getGroup()); 
            // InternalRouterDsl.g:194:3: ( rule__Decision__Group__0 )
            // InternalRouterDsl.g:194:4: rule__Decision__Group__0
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
    // InternalRouterDsl.g:203:1: entryRuleMessageDecision : ruleMessageDecision EOF ;
    public final void entryRuleMessageDecision() throws RecognitionException {
        try {
            // InternalRouterDsl.g:204:1: ( ruleMessageDecision EOF )
            // InternalRouterDsl.g:205:1: ruleMessageDecision EOF
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
    // InternalRouterDsl.g:212:1: ruleMessageDecision : ( ( rule__MessageDecision__Alternatives ) ) ;
    public final void ruleMessageDecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:216:2: ( ( ( rule__MessageDecision__Alternatives ) ) )
            // InternalRouterDsl.g:217:2: ( ( rule__MessageDecision__Alternatives ) )
            {
            // InternalRouterDsl.g:217:2: ( ( rule__MessageDecision__Alternatives ) )
            // InternalRouterDsl.g:218:3: ( rule__MessageDecision__Alternatives )
            {
             before(grammarAccess.getMessageDecisionAccess().getAlternatives()); 
            // InternalRouterDsl.g:219:3: ( rule__MessageDecision__Alternatives )
            // InternalRouterDsl.g:219:4: rule__MessageDecision__Alternatives
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
    // InternalRouterDsl.g:228:1: entryRuleRouteTo : ruleRouteTo EOF ;
    public final void entryRuleRouteTo() throws RecognitionException {
        try {
            // InternalRouterDsl.g:229:1: ( ruleRouteTo EOF )
            // InternalRouterDsl.g:230:1: ruleRouteTo EOF
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
    // InternalRouterDsl.g:237:1: ruleRouteTo : ( ( rule__RouteTo__Group__0 ) ) ;
    public final void ruleRouteTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:241:2: ( ( ( rule__RouteTo__Group__0 ) ) )
            // InternalRouterDsl.g:242:2: ( ( rule__RouteTo__Group__0 ) )
            {
            // InternalRouterDsl.g:242:2: ( ( rule__RouteTo__Group__0 ) )
            // InternalRouterDsl.g:243:3: ( rule__RouteTo__Group__0 )
            {
             before(grammarAccess.getRouteToAccess().getGroup()); 
            // InternalRouterDsl.g:244:3: ( rule__RouteTo__Group__0 )
            // InternalRouterDsl.g:244:4: rule__RouteTo__Group__0
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
    // InternalRouterDsl.g:253:1: entryRuleDropMessage : ruleDropMessage EOF ;
    public final void entryRuleDropMessage() throws RecognitionException {
        try {
            // InternalRouterDsl.g:254:1: ( ruleDropMessage EOF )
            // InternalRouterDsl.g:255:1: ruleDropMessage EOF
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
    // InternalRouterDsl.g:262:1: ruleDropMessage : ( ( rule__DropMessage__Group__0 ) ) ;
    public final void ruleDropMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:266:2: ( ( ( rule__DropMessage__Group__0 ) ) )
            // InternalRouterDsl.g:267:2: ( ( rule__DropMessage__Group__0 ) )
            {
            // InternalRouterDsl.g:267:2: ( ( rule__DropMessage__Group__0 ) )
            // InternalRouterDsl.g:268:3: ( rule__DropMessage__Group__0 )
            {
             before(grammarAccess.getDropMessageAccess().getGroup()); 
            // InternalRouterDsl.g:269:3: ( rule__DropMessage__Group__0 )
            // InternalRouterDsl.g:269:4: rule__DropMessage__Group__0
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
    // InternalRouterDsl.g:278:1: entryRuleAlert : ruleAlert EOF ;
    public final void entryRuleAlert() throws RecognitionException {
        try {
            // InternalRouterDsl.g:279:1: ( ruleAlert EOF )
            // InternalRouterDsl.g:280:1: ruleAlert EOF
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
    // InternalRouterDsl.g:287:1: ruleAlert : ( ( rule__Alert__Group__0 ) ) ;
    public final void ruleAlert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:291:2: ( ( ( rule__Alert__Group__0 ) ) )
            // InternalRouterDsl.g:292:2: ( ( rule__Alert__Group__0 ) )
            {
            // InternalRouterDsl.g:292:2: ( ( rule__Alert__Group__0 ) )
            // InternalRouterDsl.g:293:3: ( rule__Alert__Group__0 )
            {
             before(grammarAccess.getAlertAccess().getGroup()); 
            // InternalRouterDsl.g:294:3: ( rule__Alert__Group__0 )
            // InternalRouterDsl.g:294:4: rule__Alert__Group__0
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
    // InternalRouterDsl.g:303:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalRouterDsl.g:304:1: ( ruleConditional EOF )
            // InternalRouterDsl.g:305:1: ruleConditional EOF
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
    // InternalRouterDsl.g:312:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:316:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // InternalRouterDsl.g:317:2: ( ( rule__Conditional__Group__0 ) )
            {
            // InternalRouterDsl.g:317:2: ( ( rule__Conditional__Group__0 ) )
            // InternalRouterDsl.g:318:3: ( rule__Conditional__Group__0 )
            {
             before(grammarAccess.getConditionalAccess().getGroup()); 
            // InternalRouterDsl.g:319:3: ( rule__Conditional__Group__0 )
            // InternalRouterDsl.g:319:4: rule__Conditional__Group__0
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
    // InternalRouterDsl.g:328:1: entryRuleObjectAccessOrValue : ruleObjectAccessOrValue EOF ;
    public final void entryRuleObjectAccessOrValue() throws RecognitionException {
        try {
            // InternalRouterDsl.g:329:1: ( ruleObjectAccessOrValue EOF )
            // InternalRouterDsl.g:330:1: ruleObjectAccessOrValue EOF
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
    // InternalRouterDsl.g:337:1: ruleObjectAccessOrValue : ( ( rule__ObjectAccessOrValue__Alternatives ) ) ;
    public final void ruleObjectAccessOrValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:341:2: ( ( ( rule__ObjectAccessOrValue__Alternatives ) ) )
            // InternalRouterDsl.g:342:2: ( ( rule__ObjectAccessOrValue__Alternatives ) )
            {
            // InternalRouterDsl.g:342:2: ( ( rule__ObjectAccessOrValue__Alternatives ) )
            // InternalRouterDsl.g:343:3: ( rule__ObjectAccessOrValue__Alternatives )
            {
             before(grammarAccess.getObjectAccessOrValueAccess().getAlternatives()); 
            // InternalRouterDsl.g:344:3: ( rule__ObjectAccessOrValue__Alternatives )
            // InternalRouterDsl.g:344:4: rule__ObjectAccessOrValue__Alternatives
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
    // InternalRouterDsl.g:353:1: entryRuleLiteralValue : ruleLiteralValue EOF ;
    public final void entryRuleLiteralValue() throws RecognitionException {
        try {
            // InternalRouterDsl.g:354:1: ( ruleLiteralValue EOF )
            // InternalRouterDsl.g:355:1: ruleLiteralValue EOF
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
    // InternalRouterDsl.g:362:1: ruleLiteralValue : ( ( rule__LiteralValue__ValueAssignment ) ) ;
    public final void ruleLiteralValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:366:2: ( ( ( rule__LiteralValue__ValueAssignment ) ) )
            // InternalRouterDsl.g:367:2: ( ( rule__LiteralValue__ValueAssignment ) )
            {
            // InternalRouterDsl.g:367:2: ( ( rule__LiteralValue__ValueAssignment ) )
            // InternalRouterDsl.g:368:3: ( rule__LiteralValue__ValueAssignment )
            {
             before(grammarAccess.getLiteralValueAccess().getValueAssignment()); 
            // InternalRouterDsl.g:369:3: ( rule__LiteralValue__ValueAssignment )
            // InternalRouterDsl.g:369:4: rule__LiteralValue__ValueAssignment
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
    // InternalRouterDsl.g:378:1: entryRuleThroughtput : ruleThroughtput EOF ;
    public final void entryRuleThroughtput() throws RecognitionException {
        try {
            // InternalRouterDsl.g:379:1: ( ruleThroughtput EOF )
            // InternalRouterDsl.g:380:1: ruleThroughtput EOF
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
    // InternalRouterDsl.g:387:1: ruleThroughtput : ( ( rule__Throughtput__Group__0 ) ) ;
    public final void ruleThroughtput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:391:2: ( ( ( rule__Throughtput__Group__0 ) ) )
            // InternalRouterDsl.g:392:2: ( ( rule__Throughtput__Group__0 ) )
            {
            // InternalRouterDsl.g:392:2: ( ( rule__Throughtput__Group__0 ) )
            // InternalRouterDsl.g:393:3: ( rule__Throughtput__Group__0 )
            {
             before(grammarAccess.getThroughtputAccess().getGroup()); 
            // InternalRouterDsl.g:394:3: ( rule__Throughtput__Group__0 )
            // InternalRouterDsl.g:394:4: rule__Throughtput__Group__0
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
    // InternalRouterDsl.g:403:1: entryRuleTemperature : ruleTemperature EOF ;
    public final void entryRuleTemperature() throws RecognitionException {
        try {
            // InternalRouterDsl.g:404:1: ( ruleTemperature EOF )
            // InternalRouterDsl.g:405:1: ruleTemperature EOF
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
    // InternalRouterDsl.g:412:1: ruleTemperature : ( ( rule__Temperature__Group__0 ) ) ;
    public final void ruleTemperature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:416:2: ( ( ( rule__Temperature__Group__0 ) ) )
            // InternalRouterDsl.g:417:2: ( ( rule__Temperature__Group__0 ) )
            {
            // InternalRouterDsl.g:417:2: ( ( rule__Temperature__Group__0 ) )
            // InternalRouterDsl.g:418:3: ( rule__Temperature__Group__0 )
            {
             before(grammarAccess.getTemperatureAccess().getGroup()); 
            // InternalRouterDsl.g:419:3: ( rule__Temperature__Group__0 )
            // InternalRouterDsl.g:419:4: rule__Temperature__Group__0
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
    // InternalRouterDsl.g:428:1: entryRuleObjectAccess : ruleObjectAccess EOF ;
    public final void entryRuleObjectAccess() throws RecognitionException {
        try {
            // InternalRouterDsl.g:429:1: ( ruleObjectAccess EOF )
            // InternalRouterDsl.g:430:1: ruleObjectAccess EOF
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
    // InternalRouterDsl.g:437:1: ruleObjectAccess : ( ( rule__ObjectAccess__Alternatives ) ) ;
    public final void ruleObjectAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:441:2: ( ( ( rule__ObjectAccess__Alternatives ) ) )
            // InternalRouterDsl.g:442:2: ( ( rule__ObjectAccess__Alternatives ) )
            {
            // InternalRouterDsl.g:442:2: ( ( rule__ObjectAccess__Alternatives ) )
            // InternalRouterDsl.g:443:3: ( rule__ObjectAccess__Alternatives )
            {
             before(grammarAccess.getObjectAccessAccess().getAlternatives()); 
            // InternalRouterDsl.g:444:3: ( rule__ObjectAccess__Alternatives )
            // InternalRouterDsl.g:444:4: rule__ObjectAccess__Alternatives
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
    // InternalRouterDsl.g:453:1: entryRuleProcessorAccess : ruleProcessorAccess EOF ;
    public final void entryRuleProcessorAccess() throws RecognitionException {
        try {
            // InternalRouterDsl.g:454:1: ( ruleProcessorAccess EOF )
            // InternalRouterDsl.g:455:1: ruleProcessorAccess EOF
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
    // InternalRouterDsl.g:462:1: ruleProcessorAccess : ( ( rule__ProcessorAccess__Group__0 ) ) ;
    public final void ruleProcessorAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:466:2: ( ( ( rule__ProcessorAccess__Group__0 ) ) )
            // InternalRouterDsl.g:467:2: ( ( rule__ProcessorAccess__Group__0 ) )
            {
            // InternalRouterDsl.g:467:2: ( ( rule__ProcessorAccess__Group__0 ) )
            // InternalRouterDsl.g:468:3: ( rule__ProcessorAccess__Group__0 )
            {
             before(grammarAccess.getProcessorAccessAccess().getGroup()); 
            // InternalRouterDsl.g:469:3: ( rule__ProcessorAccess__Group__0 )
            // InternalRouterDsl.g:469:4: rule__ProcessorAccess__Group__0
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
    // InternalRouterDsl.g:478:1: entryRuleSensorAccess : ruleSensorAccess EOF ;
    public final void entryRuleSensorAccess() throws RecognitionException {
        try {
            // InternalRouterDsl.g:479:1: ( ruleSensorAccess EOF )
            // InternalRouterDsl.g:480:1: ruleSensorAccess EOF
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
    // InternalRouterDsl.g:487:1: ruleSensorAccess : ( ( rule__SensorAccess__Group__0 ) ) ;
    public final void ruleSensorAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:491:2: ( ( ( rule__SensorAccess__Group__0 ) ) )
            // InternalRouterDsl.g:492:2: ( ( rule__SensorAccess__Group__0 ) )
            {
            // InternalRouterDsl.g:492:2: ( ( rule__SensorAccess__Group__0 ) )
            // InternalRouterDsl.g:493:3: ( rule__SensorAccess__Group__0 )
            {
             before(grammarAccess.getSensorAccessAccess().getGroup()); 
            // InternalRouterDsl.g:494:3: ( rule__SensorAccess__Group__0 )
            // InternalRouterDsl.g:494:4: rule__SensorAccess__Group__0
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
    // InternalRouterDsl.g:503:1: entryRuleSystemAccess : ruleSystemAccess EOF ;
    public final void entryRuleSystemAccess() throws RecognitionException {
        try {
            // InternalRouterDsl.g:504:1: ( ruleSystemAccess EOF )
            // InternalRouterDsl.g:505:1: ruleSystemAccess EOF
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
    // InternalRouterDsl.g:512:1: ruleSystemAccess : ( ( rule__SystemAccess__Group__0 ) ) ;
    public final void ruleSystemAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:516:2: ( ( ( rule__SystemAccess__Group__0 ) ) )
            // InternalRouterDsl.g:517:2: ( ( rule__SystemAccess__Group__0 ) )
            {
            // InternalRouterDsl.g:517:2: ( ( rule__SystemAccess__Group__0 ) )
            // InternalRouterDsl.g:518:3: ( rule__SystemAccess__Group__0 )
            {
             before(grammarAccess.getSystemAccessAccess().getGroup()); 
            // InternalRouterDsl.g:519:3: ( rule__SystemAccess__Group__0 )
            // InternalRouterDsl.g:519:4: rule__SystemAccess__Group__0
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
    // InternalRouterDsl.g:528:1: ruleProcessorAttribute : ( ( rule__ProcessorAttribute__Alternatives ) ) ;
    public final void ruleProcessorAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:532:1: ( ( ( rule__ProcessorAttribute__Alternatives ) ) )
            // InternalRouterDsl.g:533:2: ( ( rule__ProcessorAttribute__Alternatives ) )
            {
            // InternalRouterDsl.g:533:2: ( ( rule__ProcessorAttribute__Alternatives ) )
            // InternalRouterDsl.g:534:3: ( rule__ProcessorAttribute__Alternatives )
            {
             before(grammarAccess.getProcessorAttributeAccess().getAlternatives()); 
            // InternalRouterDsl.g:535:3: ( rule__ProcessorAttribute__Alternatives )
            // InternalRouterDsl.g:535:4: rule__ProcessorAttribute__Alternatives
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
    // InternalRouterDsl.g:544:1: ruleComparison : ( ( rule__Comparison__Alternatives ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:548:1: ( ( ( rule__Comparison__Alternatives ) ) )
            // InternalRouterDsl.g:549:2: ( ( rule__Comparison__Alternatives ) )
            {
            // InternalRouterDsl.g:549:2: ( ( rule__Comparison__Alternatives ) )
            // InternalRouterDsl.g:550:3: ( rule__Comparison__Alternatives )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives()); 
            // InternalRouterDsl.g:551:3: ( rule__Comparison__Alternatives )
            // InternalRouterDsl.g:551:4: rule__Comparison__Alternatives
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
    // InternalRouterDsl.g:560:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:564:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalRouterDsl.g:565:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalRouterDsl.g:565:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalRouterDsl.g:566:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalRouterDsl.g:567:3: ( rule__TimeUnit__Alternatives )
            // InternalRouterDsl.g:567:4: rule__TimeUnit__Alternatives
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
    // InternalRouterDsl.g:576:1: ruleTemperatureUnit : ( ( rule__TemperatureUnit__Alternatives ) ) ;
    public final void ruleTemperatureUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:580:1: ( ( ( rule__TemperatureUnit__Alternatives ) ) )
            // InternalRouterDsl.g:581:2: ( ( rule__TemperatureUnit__Alternatives ) )
            {
            // InternalRouterDsl.g:581:2: ( ( rule__TemperatureUnit__Alternatives ) )
            // InternalRouterDsl.g:582:3: ( rule__TemperatureUnit__Alternatives )
            {
             before(grammarAccess.getTemperatureUnitAccess().getAlternatives()); 
            // InternalRouterDsl.g:583:3: ( rule__TemperatureUnit__Alternatives )
            // InternalRouterDsl.g:583:4: rule__TemperatureUnit__Alternatives
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
    // InternalRouterDsl.g:592:1: ruleAlertLevel : ( ( rule__AlertLevel__Alternatives ) ) ;
    public final void ruleAlertLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:596:1: ( ( ( rule__AlertLevel__Alternatives ) ) )
            // InternalRouterDsl.g:597:2: ( ( rule__AlertLevel__Alternatives ) )
            {
            // InternalRouterDsl.g:597:2: ( ( rule__AlertLevel__Alternatives ) )
            // InternalRouterDsl.g:598:3: ( rule__AlertLevel__Alternatives )
            {
             before(grammarAccess.getAlertLevelAccess().getAlternatives()); 
            // InternalRouterDsl.g:599:3: ( rule__AlertLevel__Alternatives )
            // InternalRouterDsl.g:599:4: rule__AlertLevel__Alternatives
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
    // InternalRouterDsl.g:607:1: rule__Decision__Alternatives_0 : ( ( ruleRouteTo ) | ( ruleMessageDecision ) );
    public final void rule__Decision__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:611:1: ( ( ruleRouteTo ) | ( ruleMessageDecision ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==37) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=38 && LA1_0<=39)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRouterDsl.g:612:2: ( ruleRouteTo )
                    {
                    // InternalRouterDsl.g:612:2: ( ruleRouteTo )
                    // InternalRouterDsl.g:613:3: ruleRouteTo
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
                    // InternalRouterDsl.g:618:2: ( ruleMessageDecision )
                    {
                    // InternalRouterDsl.g:618:2: ( ruleMessageDecision )
                    // InternalRouterDsl.g:619:3: ruleMessageDecision
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
    // InternalRouterDsl.g:628:1: rule__MessageDecision__Alternatives : ( ( ruleDropMessage ) | ( ruleAlert ) );
    public final void rule__MessageDecision__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:632:1: ( ( ruleDropMessage ) | ( ruleAlert ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==38) ) {
                alt2=1;
            }
            else if ( (LA2_0==39) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRouterDsl.g:633:2: ( ruleDropMessage )
                    {
                    // InternalRouterDsl.g:633:2: ( ruleDropMessage )
                    // InternalRouterDsl.g:634:3: ruleDropMessage
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
                    // InternalRouterDsl.g:639:2: ( ruleAlert )
                    {
                    // InternalRouterDsl.g:639:2: ( ruleAlert )
                    // InternalRouterDsl.g:640:3: ruleAlert
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
    // InternalRouterDsl.g:649:1: rule__ObjectAccessOrValue__Alternatives : ( ( ruleObjectAccess ) | ( ruleLiteralValue ) | ( ruleThroughtput ) | ( ruleTemperature ) );
    public final void rule__ObjectAccessOrValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:653:1: ( ( ruleObjectAccess ) | ( ruleLiteralValue ) | ( ruleThroughtput ) | ( ruleTemperature ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case 22:
                case 23:
                    {
                    alt3=4;
                    }
                    break;
                case EOF:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 35:
                    {
                    alt3=2;
                    }
                    break;
                case 40:
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
                    // InternalRouterDsl.g:654:2: ( ruleObjectAccess )
                    {
                    // InternalRouterDsl.g:654:2: ( ruleObjectAccess )
                    // InternalRouterDsl.g:655:3: ruleObjectAccess
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
                    // InternalRouterDsl.g:660:2: ( ruleLiteralValue )
                    {
                    // InternalRouterDsl.g:660:2: ( ruleLiteralValue )
                    // InternalRouterDsl.g:661:3: ruleLiteralValue
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
                    // InternalRouterDsl.g:666:2: ( ruleThroughtput )
                    {
                    // InternalRouterDsl.g:666:2: ( ruleThroughtput )
                    // InternalRouterDsl.g:667:3: ruleThroughtput
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
                    // InternalRouterDsl.g:672:2: ( ruleTemperature )
                    {
                    // InternalRouterDsl.g:672:2: ( ruleTemperature )
                    // InternalRouterDsl.g:673:3: ruleTemperature
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
    // InternalRouterDsl.g:682:1: rule__ObjectAccess__Alternatives : ( ( ruleProcessorAccess ) | ( ruleSensorAccess ) | ( ruleSystemAccess ) );
    public final void rule__ObjectAccess__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:686:1: ( ( ruleProcessorAccess ) | ( ruleSensorAccess ) | ( ruleSystemAccess ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 42:
                    {
                    alt4=2;
                    }
                    break;
                case 41:
                    {
                    alt4=1;
                    }
                    break;
                case 43:
                    {
                    alt4=3;
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
                    // InternalRouterDsl.g:687:2: ( ruleProcessorAccess )
                    {
                    // InternalRouterDsl.g:687:2: ( ruleProcessorAccess )
                    // InternalRouterDsl.g:688:3: ruleProcessorAccess
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
                    // InternalRouterDsl.g:693:2: ( ruleSensorAccess )
                    {
                    // InternalRouterDsl.g:693:2: ( ruleSensorAccess )
                    // InternalRouterDsl.g:694:3: ruleSensorAccess
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
                    // InternalRouterDsl.g:699:2: ( ruleSystemAccess )
                    {
                    // InternalRouterDsl.g:699:2: ( ruleSystemAccess )
                    // InternalRouterDsl.g:700:3: ruleSystemAccess
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
    // InternalRouterDsl.g:709:1: rule__ProcessorAttribute__Alternatives : ( ( ( 'capacity' ) ) | ( ( 'load' ) ) | ( ( 'consumption' ) ) );
    public final void rule__ProcessorAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:713:1: ( ( ( 'capacity' ) ) | ( ( 'load' ) ) | ( ( 'consumption' ) ) )
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
                    // InternalRouterDsl.g:714:2: ( ( 'capacity' ) )
                    {
                    // InternalRouterDsl.g:714:2: ( ( 'capacity' ) )
                    // InternalRouterDsl.g:715:3: ( 'capacity' )
                    {
                     before(grammarAccess.getProcessorAttributeAccess().getCapacityEnumLiteralDeclaration_0()); 
                    // InternalRouterDsl.g:716:3: ( 'capacity' )
                    // InternalRouterDsl.g:716:4: 'capacity'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getProcessorAttributeAccess().getCapacityEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:720:2: ( ( 'load' ) )
                    {
                    // InternalRouterDsl.g:720:2: ( ( 'load' ) )
                    // InternalRouterDsl.g:721:3: ( 'load' )
                    {
                     before(grammarAccess.getProcessorAttributeAccess().getLoadEnumLiteralDeclaration_1()); 
                    // InternalRouterDsl.g:722:3: ( 'load' )
                    // InternalRouterDsl.g:722:4: 'load'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getProcessorAttributeAccess().getLoadEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:726:2: ( ( 'consumption' ) )
                    {
                    // InternalRouterDsl.g:726:2: ( ( 'consumption' ) )
                    // InternalRouterDsl.g:727:3: ( 'consumption' )
                    {
                     before(grammarAccess.getProcessorAttributeAccess().getConsumptionEnumLiteralDeclaration_2()); 
                    // InternalRouterDsl.g:728:3: ( 'consumption' )
                    // InternalRouterDsl.g:728:4: 'consumption'
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
    // InternalRouterDsl.g:736:1: rule__Comparison__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );
    public final void rule__Comparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:740:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) )
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
                    // InternalRouterDsl.g:741:2: ( ( '<' ) )
                    {
                    // InternalRouterDsl.g:741:2: ( ( '<' ) )
                    // InternalRouterDsl.g:742:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonAccess().getLOWEREnumLiteralDeclaration_0()); 
                    // InternalRouterDsl.g:743:3: ( '<' )
                    // InternalRouterDsl.g:743:4: '<'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonAccess().getLOWEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:747:2: ( ( '<=' ) )
                    {
                    // InternalRouterDsl.g:747:2: ( ( '<=' ) )
                    // InternalRouterDsl.g:748:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonAccess().getLOWER_EQEnumLiteralDeclaration_1()); 
                    // InternalRouterDsl.g:749:3: ( '<=' )
                    // InternalRouterDsl.g:749:4: '<='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonAccess().getLOWER_EQEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:753:2: ( ( '=' ) )
                    {
                    // InternalRouterDsl.g:753:2: ( ( '=' ) )
                    // InternalRouterDsl.g:754:3: ( '=' )
                    {
                     before(grammarAccess.getComparisonAccess().getEQEnumLiteralDeclaration_2()); 
                    // InternalRouterDsl.g:755:3: ( '=' )
                    // InternalRouterDsl.g:755:4: '='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonAccess().getEQEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRouterDsl.g:759:2: ( ( '>' ) )
                    {
                    // InternalRouterDsl.g:759:2: ( ( '>' ) )
                    // InternalRouterDsl.g:760:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonAccess().getHIGHEREnumLiteralDeclaration_3()); 
                    // InternalRouterDsl.g:761:3: ( '>' )
                    // InternalRouterDsl.g:761:4: '>'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonAccess().getHIGHEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRouterDsl.g:765:2: ( ( '>=' ) )
                    {
                    // InternalRouterDsl.g:765:2: ( ( '>=' ) )
                    // InternalRouterDsl.g:766:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonAccess().getHIGHER_EQEnumLiteralDeclaration_4()); 
                    // InternalRouterDsl.g:767:3: ( '>=' )
                    // InternalRouterDsl.g:767:4: '>='
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
    // InternalRouterDsl.g:775:1: rule__TimeUnit__Alternatives : ( ( ( 'sec' ) ) | ( ( 'msec' ) ) | ( ( 'usec' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:779:1: ( ( ( 'sec' ) ) | ( ( 'msec' ) ) | ( ( 'usec' ) ) )
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
                    // InternalRouterDsl.g:780:2: ( ( 'sec' ) )
                    {
                    // InternalRouterDsl.g:780:2: ( ( 'sec' ) )
                    // InternalRouterDsl.g:781:3: ( 'sec' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_0()); 
                    // InternalRouterDsl.g:782:3: ( 'sec' )
                    // InternalRouterDsl.g:782:4: 'sec'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:786:2: ( ( 'msec' ) )
                    {
                    // InternalRouterDsl.g:786:2: ( ( 'msec' ) )
                    // InternalRouterDsl.g:787:3: ( 'msec' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMillisecondsEnumLiteralDeclaration_1()); 
                    // InternalRouterDsl.g:788:3: ( 'msec' )
                    // InternalRouterDsl.g:788:4: 'msec'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMillisecondsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:792:2: ( ( 'usec' ) )
                    {
                    // InternalRouterDsl.g:792:2: ( ( 'usec' ) )
                    // InternalRouterDsl.g:793:3: ( 'usec' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMicrosecondsEnumLiteralDeclaration_2()); 
                    // InternalRouterDsl.g:794:3: ( 'usec' )
                    // InternalRouterDsl.g:794:4: 'usec'
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
    // InternalRouterDsl.g:802:1: rule__TemperatureUnit__Alternatives : ( ( ( '\\u00B0C' ) ) | ( ( '\\u00B0F' ) ) );
    public final void rule__TemperatureUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:806:1: ( ( ( '\\u00B0C' ) ) | ( ( '\\u00B0F' ) ) )
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
                    // InternalRouterDsl.g:807:2: ( ( '\\u00B0C' ) )
                    {
                    // InternalRouterDsl.g:807:2: ( ( '\\u00B0C' ) )
                    // InternalRouterDsl.g:808:3: ( '\\u00B0C' )
                    {
                     before(grammarAccess.getTemperatureUnitAccess().getCelsiusEnumLiteralDeclaration_0()); 
                    // InternalRouterDsl.g:809:3: ( '\\u00B0C' )
                    // InternalRouterDsl.g:809:4: '\\u00B0C'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemperatureUnitAccess().getCelsiusEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:813:2: ( ( '\\u00B0F' ) )
                    {
                    // InternalRouterDsl.g:813:2: ( ( '\\u00B0F' ) )
                    // InternalRouterDsl.g:814:3: ( '\\u00B0F' )
                    {
                     before(grammarAccess.getTemperatureUnitAccess().getFahrenheitEnumLiteralDeclaration_1()); 
                    // InternalRouterDsl.g:815:3: ( '\\u00B0F' )
                    // InternalRouterDsl.g:815:4: '\\u00B0F'
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
    // InternalRouterDsl.g:823:1: rule__AlertLevel__Alternatives : ( ( ( 'critical' ) ) | ( ( 'major' ) ) | ( ( 'error' ) ) | ( ( 'warning' ) ) );
    public final void rule__AlertLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:827:1: ( ( ( 'critical' ) ) | ( ( 'major' ) ) | ( ( 'error' ) ) | ( ( 'warning' ) ) )
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
                    // InternalRouterDsl.g:828:2: ( ( 'critical' ) )
                    {
                    // InternalRouterDsl.g:828:2: ( ( 'critical' ) )
                    // InternalRouterDsl.g:829:3: ( 'critical' )
                    {
                     before(grammarAccess.getAlertLevelAccess().getCriticalEnumLiteralDeclaration_0()); 
                    // InternalRouterDsl.g:830:3: ( 'critical' )
                    // InternalRouterDsl.g:830:4: 'critical'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlertLevelAccess().getCriticalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRouterDsl.g:834:2: ( ( 'major' ) )
                    {
                    // InternalRouterDsl.g:834:2: ( ( 'major' ) )
                    // InternalRouterDsl.g:835:3: ( 'major' )
                    {
                     before(grammarAccess.getAlertLevelAccess().getMajorEnumLiteralDeclaration_1()); 
                    // InternalRouterDsl.g:836:3: ( 'major' )
                    // InternalRouterDsl.g:836:4: 'major'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlertLevelAccess().getMajorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRouterDsl.g:840:2: ( ( 'error' ) )
                    {
                    // InternalRouterDsl.g:840:2: ( ( 'error' ) )
                    // InternalRouterDsl.g:841:3: ( 'error' )
                    {
                     before(grammarAccess.getAlertLevelAccess().getErrorEnumLiteralDeclaration_2()); 
                    // InternalRouterDsl.g:842:3: ( 'error' )
                    // InternalRouterDsl.g:842:4: 'error'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlertLevelAccess().getErrorEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRouterDsl.g:846:2: ( ( 'warning' ) )
                    {
                    // InternalRouterDsl.g:846:2: ( ( 'warning' ) )
                    // InternalRouterDsl.g:847:3: ( 'warning' )
                    {
                     before(grammarAccess.getAlertLevelAccess().getWarningEnumLiteralDeclaration_3()); 
                    // InternalRouterDsl.g:848:3: ( 'warning' )
                    // InternalRouterDsl.g:848:4: 'warning'
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
    // InternalRouterDsl.g:856:1: rule__RoutingRules__Group__0 : rule__RoutingRules__Group__0__Impl rule__RoutingRules__Group__1 ;
    public final void rule__RoutingRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:860:1: ( rule__RoutingRules__Group__0__Impl rule__RoutingRules__Group__1 )
            // InternalRouterDsl.g:861:2: rule__RoutingRules__Group__0__Impl rule__RoutingRules__Group__1
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
    // InternalRouterDsl.g:868:1: rule__RoutingRules__Group__0__Impl : ( () ) ;
    public final void rule__RoutingRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:872:1: ( ( () ) )
            // InternalRouterDsl.g:873:1: ( () )
            {
            // InternalRouterDsl.g:873:1: ( () )
            // InternalRouterDsl.g:874:2: ()
            {
             before(grammarAccess.getRoutingRulesAccess().getRoutingRuleAction_0()); 
            // InternalRouterDsl.g:875:2: ()
            // InternalRouterDsl.g:875:3: 
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
    // InternalRouterDsl.g:883:1: rule__RoutingRules__Group__1 : rule__RoutingRules__Group__1__Impl rule__RoutingRules__Group__2 ;
    public final void rule__RoutingRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:887:1: ( rule__RoutingRules__Group__1__Impl rule__RoutingRules__Group__2 )
            // InternalRouterDsl.g:888:2: rule__RoutingRules__Group__1__Impl rule__RoutingRules__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalRouterDsl.g:895:1: rule__RoutingRules__Group__1__Impl : ( ( rule__RoutingRules__ProcessorsAssignment_1 )* ) ;
    public final void rule__RoutingRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:899:1: ( ( ( rule__RoutingRules__ProcessorsAssignment_1 )* ) )
            // InternalRouterDsl.g:900:1: ( ( rule__RoutingRules__ProcessorsAssignment_1 )* )
            {
            // InternalRouterDsl.g:900:1: ( ( rule__RoutingRules__ProcessorsAssignment_1 )* )
            // InternalRouterDsl.g:901:2: ( rule__RoutingRules__ProcessorsAssignment_1 )*
            {
             before(grammarAccess.getRoutingRulesAccess().getProcessorsAssignment_1()); 
            // InternalRouterDsl.g:902:2: ( rule__RoutingRules__ProcessorsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRouterDsl.g:902:3: rule__RoutingRules__ProcessorsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RoutingRules__ProcessorsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRoutingRulesAccess().getProcessorsAssignment_1()); 

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
    // InternalRouterDsl.g:910:1: rule__RoutingRules__Group__2 : rule__RoutingRules__Group__2__Impl rule__RoutingRules__Group__3 ;
    public final void rule__RoutingRules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:914:1: ( rule__RoutingRules__Group__2__Impl rule__RoutingRules__Group__3 )
            // InternalRouterDsl.g:915:2: rule__RoutingRules__Group__2__Impl rule__RoutingRules__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__RoutingRules__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoutingRules__Group__3();

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
    // InternalRouterDsl.g:922:1: rule__RoutingRules__Group__2__Impl : ( ( rule__RoutingRules__SensorsAssignment_2 )* ) ;
    public final void rule__RoutingRules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:926:1: ( ( ( rule__RoutingRules__SensorsAssignment_2 )* ) )
            // InternalRouterDsl.g:927:1: ( ( rule__RoutingRules__SensorsAssignment_2 )* )
            {
            // InternalRouterDsl.g:927:1: ( ( rule__RoutingRules__SensorsAssignment_2 )* )
            // InternalRouterDsl.g:928:2: ( rule__RoutingRules__SensorsAssignment_2 )*
            {
             before(grammarAccess.getRoutingRulesAccess().getSensorsAssignment_2()); 
            // InternalRouterDsl.g:929:2: ( rule__RoutingRules__SensorsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRouterDsl.g:929:3: rule__RoutingRules__SensorsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__RoutingRules__SensorsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRoutingRulesAccess().getSensorsAssignment_2()); 

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


    // $ANTLR start "rule__RoutingRules__Group__3"
    // InternalRouterDsl.g:937:1: rule__RoutingRules__Group__3 : rule__RoutingRules__Group__3__Impl rule__RoutingRules__Group__4 ;
    public final void rule__RoutingRules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:941:1: ( rule__RoutingRules__Group__3__Impl rule__RoutingRules__Group__4 )
            // InternalRouterDsl.g:942:2: rule__RoutingRules__Group__3__Impl rule__RoutingRules__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__RoutingRules__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoutingRules__Group__4();

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
    // $ANTLR end "rule__RoutingRules__Group__3"


    // $ANTLR start "rule__RoutingRules__Group__3__Impl"
    // InternalRouterDsl.g:949:1: rule__RoutingRules__Group__3__Impl : ( ( rule__RoutingRules__SystemsAssignment_3 )* ) ;
    public final void rule__RoutingRules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:953:1: ( ( ( rule__RoutingRules__SystemsAssignment_3 )* ) )
            // InternalRouterDsl.g:954:1: ( ( rule__RoutingRules__SystemsAssignment_3 )* )
            {
            // InternalRouterDsl.g:954:1: ( ( rule__RoutingRules__SystemsAssignment_3 )* )
            // InternalRouterDsl.g:955:2: ( rule__RoutingRules__SystemsAssignment_3 )*
            {
             before(grammarAccess.getRoutingRulesAccess().getSystemsAssignment_3()); 
            // InternalRouterDsl.g:956:2: ( rule__RoutingRules__SystemsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRouterDsl.g:956:3: rule__RoutingRules__SystemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RoutingRules__SystemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRoutingRulesAccess().getSystemsAssignment_3()); 

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
    // $ANTLR end "rule__RoutingRules__Group__3__Impl"


    // $ANTLR start "rule__RoutingRules__Group__4"
    // InternalRouterDsl.g:964:1: rule__RoutingRules__Group__4 : rule__RoutingRules__Group__4__Impl rule__RoutingRules__Group__5 ;
    public final void rule__RoutingRules__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:968:1: ( rule__RoutingRules__Group__4__Impl rule__RoutingRules__Group__5 )
            // InternalRouterDsl.g:969:2: rule__RoutingRules__Group__4__Impl rule__RoutingRules__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__RoutingRules__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoutingRules__Group__5();

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
    // $ANTLR end "rule__RoutingRules__Group__4"


    // $ANTLR start "rule__RoutingRules__Group__4__Impl"
    // InternalRouterDsl.g:976:1: rule__RoutingRules__Group__4__Impl : ( '#' ) ;
    public final void rule__RoutingRules__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:980:1: ( ( '#' ) )
            // InternalRouterDsl.g:981:1: ( '#' )
            {
            // InternalRouterDsl.g:981:1: ( '#' )
            // InternalRouterDsl.g:982:2: '#'
            {
             before(grammarAccess.getRoutingRulesAccess().getNumberSignKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRoutingRulesAccess().getNumberSignKeyword_4()); 

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
    // $ANTLR end "rule__RoutingRules__Group__4__Impl"


    // $ANTLR start "rule__RoutingRules__Group__5"
    // InternalRouterDsl.g:991:1: rule__RoutingRules__Group__5 : rule__RoutingRules__Group__5__Impl ;
    public final void rule__RoutingRules__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:995:1: ( rule__RoutingRules__Group__5__Impl )
            // InternalRouterDsl.g:996:2: rule__RoutingRules__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoutingRules__Group__5__Impl();

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
    // $ANTLR end "rule__RoutingRules__Group__5"


    // $ANTLR start "rule__RoutingRules__Group__5__Impl"
    // InternalRouterDsl.g:1002:1: rule__RoutingRules__Group__5__Impl : ( ( rule__RoutingRules__RulesAssignment_5 )* ) ;
    public final void rule__RoutingRules__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1006:1: ( ( ( rule__RoutingRules__RulesAssignment_5 )* ) )
            // InternalRouterDsl.g:1007:1: ( ( rule__RoutingRules__RulesAssignment_5 )* )
            {
            // InternalRouterDsl.g:1007:1: ( ( rule__RoutingRules__RulesAssignment_5 )* )
            // InternalRouterDsl.g:1008:2: ( rule__RoutingRules__RulesAssignment_5 )*
            {
             before(grammarAccess.getRoutingRulesAccess().getRulesAssignment_5()); 
            // InternalRouterDsl.g:1009:2: ( rule__RoutingRules__RulesAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRouterDsl.g:1009:3: rule__RoutingRules__RulesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RoutingRules__RulesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRoutingRulesAccess().getRulesAssignment_5()); 

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
    // $ANTLR end "rule__RoutingRules__Group__5__Impl"


    // $ANTLR start "rule__DataSourceDeclaration__Group__0"
    // InternalRouterDsl.g:1018:1: rule__DataSourceDeclaration__Group__0 : rule__DataSourceDeclaration__Group__0__Impl rule__DataSourceDeclaration__Group__1 ;
    public final void rule__DataSourceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1022:1: ( rule__DataSourceDeclaration__Group__0__Impl rule__DataSourceDeclaration__Group__1 )
            // InternalRouterDsl.g:1023:2: rule__DataSourceDeclaration__Group__0__Impl rule__DataSourceDeclaration__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DataSourceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDeclaration__Group__1();

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
    // $ANTLR end "rule__DataSourceDeclaration__Group__0"


    // $ANTLR start "rule__DataSourceDeclaration__Group__0__Impl"
    // InternalRouterDsl.g:1030:1: rule__DataSourceDeclaration__Group__0__Impl : ( 'sensor' ) ;
    public final void rule__DataSourceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1034:1: ( ( 'sensor' ) )
            // InternalRouterDsl.g:1035:1: ( 'sensor' )
            {
            // InternalRouterDsl.g:1035:1: ( 'sensor' )
            // InternalRouterDsl.g:1036:2: 'sensor'
            {
             before(grammarAccess.getDataSourceDeclarationAccess().getSensorKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDataSourceDeclarationAccess().getSensorKeyword_0()); 

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
    // $ANTLR end "rule__DataSourceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__DataSourceDeclaration__Group__1"
    // InternalRouterDsl.g:1045:1: rule__DataSourceDeclaration__Group__1 : rule__DataSourceDeclaration__Group__1__Impl rule__DataSourceDeclaration__Group__2 ;
    public final void rule__DataSourceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1049:1: ( rule__DataSourceDeclaration__Group__1__Impl rule__DataSourceDeclaration__Group__2 )
            // InternalRouterDsl.g:1050:2: rule__DataSourceDeclaration__Group__1__Impl rule__DataSourceDeclaration__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DataSourceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDeclaration__Group__2();

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
    // $ANTLR end "rule__DataSourceDeclaration__Group__1"


    // $ANTLR start "rule__DataSourceDeclaration__Group__1__Impl"
    // InternalRouterDsl.g:1057:1: rule__DataSourceDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__DataSourceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1061:1: ( ( '(' ) )
            // InternalRouterDsl.g:1062:1: ( '(' )
            {
            // InternalRouterDsl.g:1062:1: ( '(' )
            // InternalRouterDsl.g:1063:2: '('
            {
             before(grammarAccess.getDataSourceDeclarationAccess().getLeftParenthesisKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDataSourceDeclarationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__DataSourceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__DataSourceDeclaration__Group__2"
    // InternalRouterDsl.g:1072:1: rule__DataSourceDeclaration__Group__2 : rule__DataSourceDeclaration__Group__2__Impl rule__DataSourceDeclaration__Group__3 ;
    public final void rule__DataSourceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1076:1: ( rule__DataSourceDeclaration__Group__2__Impl rule__DataSourceDeclaration__Group__3 )
            // InternalRouterDsl.g:1077:2: rule__DataSourceDeclaration__Group__2__Impl rule__DataSourceDeclaration__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__DataSourceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDeclaration__Group__3();

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
    // $ANTLR end "rule__DataSourceDeclaration__Group__2"


    // $ANTLR start "rule__DataSourceDeclaration__Group__2__Impl"
    // InternalRouterDsl.g:1084:1: rule__DataSourceDeclaration__Group__2__Impl : ( ( rule__DataSourceDeclaration__NameAssignment_2 ) ) ;
    public final void rule__DataSourceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1088:1: ( ( ( rule__DataSourceDeclaration__NameAssignment_2 ) ) )
            // InternalRouterDsl.g:1089:1: ( ( rule__DataSourceDeclaration__NameAssignment_2 ) )
            {
            // InternalRouterDsl.g:1089:1: ( ( rule__DataSourceDeclaration__NameAssignment_2 ) )
            // InternalRouterDsl.g:1090:2: ( rule__DataSourceDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getDataSourceDeclarationAccess().getNameAssignment_2()); 
            // InternalRouterDsl.g:1091:2: ( rule__DataSourceDeclaration__NameAssignment_2 )
            // InternalRouterDsl.g:1091:3: rule__DataSourceDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceDeclarationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DataSourceDeclaration__Group__2__Impl"


    // $ANTLR start "rule__DataSourceDeclaration__Group__3"
    // InternalRouterDsl.g:1099:1: rule__DataSourceDeclaration__Group__3 : rule__DataSourceDeclaration__Group__3__Impl ;
    public final void rule__DataSourceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1103:1: ( rule__DataSourceDeclaration__Group__3__Impl )
            // InternalRouterDsl.g:1104:2: rule__DataSourceDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__DataSourceDeclaration__Group__3"


    // $ANTLR start "rule__DataSourceDeclaration__Group__3__Impl"
    // InternalRouterDsl.g:1110:1: rule__DataSourceDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__DataSourceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1114:1: ( ( ')' ) )
            // InternalRouterDsl.g:1115:1: ( ')' )
            {
            // InternalRouterDsl.g:1115:1: ( ')' )
            // InternalRouterDsl.g:1116:2: ')'
            {
             before(grammarAccess.getDataSourceDeclarationAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDataSourceDeclarationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__DataSourceDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ProcessorDeclaration__Group__0"
    // InternalRouterDsl.g:1126:1: rule__ProcessorDeclaration__Group__0 : rule__ProcessorDeclaration__Group__0__Impl rule__ProcessorDeclaration__Group__1 ;
    public final void rule__ProcessorDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1130:1: ( rule__ProcessorDeclaration__Group__0__Impl rule__ProcessorDeclaration__Group__1 )
            // InternalRouterDsl.g:1131:2: rule__ProcessorDeclaration__Group__0__Impl rule__ProcessorDeclaration__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ProcessorDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessorDeclaration__Group__1();

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
    // $ANTLR end "rule__ProcessorDeclaration__Group__0"


    // $ANTLR start "rule__ProcessorDeclaration__Group__0__Impl"
    // InternalRouterDsl.g:1138:1: rule__ProcessorDeclaration__Group__0__Impl : ( 'processor' ) ;
    public final void rule__ProcessorDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1142:1: ( ( 'processor' ) )
            // InternalRouterDsl.g:1143:1: ( 'processor' )
            {
            // InternalRouterDsl.g:1143:1: ( 'processor' )
            // InternalRouterDsl.g:1144:2: 'processor'
            {
             before(grammarAccess.getProcessorDeclarationAccess().getProcessorKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProcessorDeclarationAccess().getProcessorKeyword_0()); 

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
    // $ANTLR end "rule__ProcessorDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ProcessorDeclaration__Group__1"
    // InternalRouterDsl.g:1153:1: rule__ProcessorDeclaration__Group__1 : rule__ProcessorDeclaration__Group__1__Impl rule__ProcessorDeclaration__Group__2 ;
    public final void rule__ProcessorDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1157:1: ( rule__ProcessorDeclaration__Group__1__Impl rule__ProcessorDeclaration__Group__2 )
            // InternalRouterDsl.g:1158:2: rule__ProcessorDeclaration__Group__1__Impl rule__ProcessorDeclaration__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ProcessorDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessorDeclaration__Group__2();

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
    // $ANTLR end "rule__ProcessorDeclaration__Group__1"


    // $ANTLR start "rule__ProcessorDeclaration__Group__1__Impl"
    // InternalRouterDsl.g:1165:1: rule__ProcessorDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__ProcessorDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1169:1: ( ( '(' ) )
            // InternalRouterDsl.g:1170:1: ( '(' )
            {
            // InternalRouterDsl.g:1170:1: ( '(' )
            // InternalRouterDsl.g:1171:2: '('
            {
             before(grammarAccess.getProcessorDeclarationAccess().getLeftParenthesisKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProcessorDeclarationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ProcessorDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ProcessorDeclaration__Group__2"
    // InternalRouterDsl.g:1180:1: rule__ProcessorDeclaration__Group__2 : rule__ProcessorDeclaration__Group__2__Impl rule__ProcessorDeclaration__Group__3 ;
    public final void rule__ProcessorDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1184:1: ( rule__ProcessorDeclaration__Group__2__Impl rule__ProcessorDeclaration__Group__3 )
            // InternalRouterDsl.g:1185:2: rule__ProcessorDeclaration__Group__2__Impl rule__ProcessorDeclaration__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ProcessorDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessorDeclaration__Group__3();

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
    // $ANTLR end "rule__ProcessorDeclaration__Group__2"


    // $ANTLR start "rule__ProcessorDeclaration__Group__2__Impl"
    // InternalRouterDsl.g:1192:1: rule__ProcessorDeclaration__Group__2__Impl : ( ( rule__ProcessorDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ProcessorDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1196:1: ( ( ( rule__ProcessorDeclaration__NameAssignment_2 ) ) )
            // InternalRouterDsl.g:1197:1: ( ( rule__ProcessorDeclaration__NameAssignment_2 ) )
            {
            // InternalRouterDsl.g:1197:1: ( ( rule__ProcessorDeclaration__NameAssignment_2 ) )
            // InternalRouterDsl.g:1198:2: ( rule__ProcessorDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getProcessorDeclarationAccess().getNameAssignment_2()); 
            // InternalRouterDsl.g:1199:2: ( rule__ProcessorDeclaration__NameAssignment_2 )
            // InternalRouterDsl.g:1199:3: rule__ProcessorDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProcessorDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessorDeclarationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ProcessorDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ProcessorDeclaration__Group__3"
    // InternalRouterDsl.g:1207:1: rule__ProcessorDeclaration__Group__3 : rule__ProcessorDeclaration__Group__3__Impl ;
    public final void rule__ProcessorDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1211:1: ( rule__ProcessorDeclaration__Group__3__Impl )
            // InternalRouterDsl.g:1212:2: rule__ProcessorDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProcessorDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__ProcessorDeclaration__Group__3"


    // $ANTLR start "rule__ProcessorDeclaration__Group__3__Impl"
    // InternalRouterDsl.g:1218:1: rule__ProcessorDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__ProcessorDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1222:1: ( ( ')' ) )
            // InternalRouterDsl.g:1223:1: ( ')' )
            {
            // InternalRouterDsl.g:1223:1: ( ')' )
            // InternalRouterDsl.g:1224:2: ')'
            {
             before(grammarAccess.getProcessorDeclarationAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProcessorDeclarationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ProcessorDeclaration__Group__3__Impl"


    // $ANTLR start "rule__SystemDeclaration__Group__0"
    // InternalRouterDsl.g:1234:1: rule__SystemDeclaration__Group__0 : rule__SystemDeclaration__Group__0__Impl rule__SystemDeclaration__Group__1 ;
    public final void rule__SystemDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1238:1: ( rule__SystemDeclaration__Group__0__Impl rule__SystemDeclaration__Group__1 )
            // InternalRouterDsl.g:1239:2: rule__SystemDeclaration__Group__0__Impl rule__SystemDeclaration__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SystemDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDeclaration__Group__1();

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
    // $ANTLR end "rule__SystemDeclaration__Group__0"


    // $ANTLR start "rule__SystemDeclaration__Group__0__Impl"
    // InternalRouterDsl.g:1246:1: rule__SystemDeclaration__Group__0__Impl : ( 'system' ) ;
    public final void rule__SystemDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1250:1: ( ( 'system' ) )
            // InternalRouterDsl.g:1251:1: ( 'system' )
            {
            // InternalRouterDsl.g:1251:1: ( 'system' )
            // InternalRouterDsl.g:1252:2: 'system'
            {
             before(grammarAccess.getSystemDeclarationAccess().getSystemKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSystemDeclarationAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__SystemDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SystemDeclaration__Group__1"
    // InternalRouterDsl.g:1261:1: rule__SystemDeclaration__Group__1 : rule__SystemDeclaration__Group__1__Impl rule__SystemDeclaration__Group__2 ;
    public final void rule__SystemDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1265:1: ( rule__SystemDeclaration__Group__1__Impl rule__SystemDeclaration__Group__2 )
            // InternalRouterDsl.g:1266:2: rule__SystemDeclaration__Group__1__Impl rule__SystemDeclaration__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SystemDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDeclaration__Group__2();

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
    // $ANTLR end "rule__SystemDeclaration__Group__1"


    // $ANTLR start "rule__SystemDeclaration__Group__1__Impl"
    // InternalRouterDsl.g:1273:1: rule__SystemDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__SystemDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1277:1: ( ( '(' ) )
            // InternalRouterDsl.g:1278:1: ( '(' )
            {
            // InternalRouterDsl.g:1278:1: ( '(' )
            // InternalRouterDsl.g:1279:2: '('
            {
             before(grammarAccess.getSystemDeclarationAccess().getLeftParenthesisKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSystemDeclarationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__SystemDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SystemDeclaration__Group__2"
    // InternalRouterDsl.g:1288:1: rule__SystemDeclaration__Group__2 : rule__SystemDeclaration__Group__2__Impl rule__SystemDeclaration__Group__3 ;
    public final void rule__SystemDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1292:1: ( rule__SystemDeclaration__Group__2__Impl rule__SystemDeclaration__Group__3 )
            // InternalRouterDsl.g:1293:2: rule__SystemDeclaration__Group__2__Impl rule__SystemDeclaration__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__SystemDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemDeclaration__Group__3();

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
    // $ANTLR end "rule__SystemDeclaration__Group__2"


    // $ANTLR start "rule__SystemDeclaration__Group__2__Impl"
    // InternalRouterDsl.g:1300:1: rule__SystemDeclaration__Group__2__Impl : ( ( rule__SystemDeclaration__NameAssignment_2 ) ) ;
    public final void rule__SystemDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1304:1: ( ( ( rule__SystemDeclaration__NameAssignment_2 ) ) )
            // InternalRouterDsl.g:1305:1: ( ( rule__SystemDeclaration__NameAssignment_2 ) )
            {
            // InternalRouterDsl.g:1305:1: ( ( rule__SystemDeclaration__NameAssignment_2 ) )
            // InternalRouterDsl.g:1306:2: ( rule__SystemDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getSystemDeclarationAccess().getNameAssignment_2()); 
            // InternalRouterDsl.g:1307:2: ( rule__SystemDeclaration__NameAssignment_2 )
            // InternalRouterDsl.g:1307:3: rule__SystemDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SystemDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemDeclarationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__SystemDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SystemDeclaration__Group__3"
    // InternalRouterDsl.g:1315:1: rule__SystemDeclaration__Group__3 : rule__SystemDeclaration__Group__3__Impl ;
    public final void rule__SystemDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1319:1: ( rule__SystemDeclaration__Group__3__Impl )
            // InternalRouterDsl.g:1320:2: rule__SystemDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__SystemDeclaration__Group__3"


    // $ANTLR start "rule__SystemDeclaration__Group__3__Impl"
    // InternalRouterDsl.g:1326:1: rule__SystemDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__SystemDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1330:1: ( ( ')' ) )
            // InternalRouterDsl.g:1331:1: ( ')' )
            {
            // InternalRouterDsl.g:1331:1: ( ')' )
            // InternalRouterDsl.g:1332:2: ')'
            {
             before(grammarAccess.getSystemDeclarationAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSystemDeclarationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__SystemDeclaration__Group__3__Impl"


    // $ANTLR start "rule__CaseRule__Group__0"
    // InternalRouterDsl.g:1342:1: rule__CaseRule__Group__0 : rule__CaseRule__Group__0__Impl rule__CaseRule__Group__1 ;
    public final void rule__CaseRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1346:1: ( rule__CaseRule__Group__0__Impl rule__CaseRule__Group__1 )
            // InternalRouterDsl.g:1347:2: rule__CaseRule__Group__0__Impl rule__CaseRule__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalRouterDsl.g:1354:1: rule__CaseRule__Group__0__Impl : ( 'Case' ) ;
    public final void rule__CaseRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1358:1: ( ( 'Case' ) )
            // InternalRouterDsl.g:1359:1: ( 'Case' )
            {
            // InternalRouterDsl.g:1359:1: ( 'Case' )
            // InternalRouterDsl.g:1360:2: 'Case'
            {
             before(grammarAccess.getCaseRuleAccess().getCaseKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRouterDsl.g:1369:1: rule__CaseRule__Group__1 : rule__CaseRule__Group__1__Impl rule__CaseRule__Group__2 ;
    public final void rule__CaseRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1373:1: ( rule__CaseRule__Group__1__Impl rule__CaseRule__Group__2 )
            // InternalRouterDsl.g:1374:2: rule__CaseRule__Group__1__Impl rule__CaseRule__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalRouterDsl.g:1381:1: rule__CaseRule__Group__1__Impl : ( ( rule__CaseRule__ConditionAssignment_1 ) ) ;
    public final void rule__CaseRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1385:1: ( ( ( rule__CaseRule__ConditionAssignment_1 ) ) )
            // InternalRouterDsl.g:1386:1: ( ( rule__CaseRule__ConditionAssignment_1 ) )
            {
            // InternalRouterDsl.g:1386:1: ( ( rule__CaseRule__ConditionAssignment_1 ) )
            // InternalRouterDsl.g:1387:2: ( rule__CaseRule__ConditionAssignment_1 )
            {
             before(grammarAccess.getCaseRuleAccess().getConditionAssignment_1()); 
            // InternalRouterDsl.g:1388:2: ( rule__CaseRule__ConditionAssignment_1 )
            // InternalRouterDsl.g:1388:3: rule__CaseRule__ConditionAssignment_1
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
    // InternalRouterDsl.g:1396:1: rule__CaseRule__Group__2 : rule__CaseRule__Group__2__Impl rule__CaseRule__Group__3 ;
    public final void rule__CaseRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1400:1: ( rule__CaseRule__Group__2__Impl rule__CaseRule__Group__3 )
            // InternalRouterDsl.g:1401:2: rule__CaseRule__Group__2__Impl rule__CaseRule__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalRouterDsl.g:1408:1: rule__CaseRule__Group__2__Impl : ( ':' ) ;
    public final void rule__CaseRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1412:1: ( ( ':' ) )
            // InternalRouterDsl.g:1413:1: ( ':' )
            {
            // InternalRouterDsl.g:1413:1: ( ':' )
            // InternalRouterDsl.g:1414:2: ':'
            {
             before(grammarAccess.getCaseRuleAccess().getColonKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRouterDsl.g:1423:1: rule__CaseRule__Group__3 : rule__CaseRule__Group__3__Impl ;
    public final void rule__CaseRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1427:1: ( rule__CaseRule__Group__3__Impl )
            // InternalRouterDsl.g:1428:2: rule__CaseRule__Group__3__Impl
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
    // InternalRouterDsl.g:1434:1: rule__CaseRule__Group__3__Impl : ( ( ( rule__CaseRule__DecisionsAssignment_3 ) ) ( ( rule__CaseRule__DecisionsAssignment_3 )* ) ) ;
    public final void rule__CaseRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1438:1: ( ( ( ( rule__CaseRule__DecisionsAssignment_3 ) ) ( ( rule__CaseRule__DecisionsAssignment_3 )* ) ) )
            // InternalRouterDsl.g:1439:1: ( ( ( rule__CaseRule__DecisionsAssignment_3 ) ) ( ( rule__CaseRule__DecisionsAssignment_3 )* ) )
            {
            // InternalRouterDsl.g:1439:1: ( ( ( rule__CaseRule__DecisionsAssignment_3 ) ) ( ( rule__CaseRule__DecisionsAssignment_3 )* ) )
            // InternalRouterDsl.g:1440:2: ( ( rule__CaseRule__DecisionsAssignment_3 ) ) ( ( rule__CaseRule__DecisionsAssignment_3 )* )
            {
            // InternalRouterDsl.g:1440:2: ( ( rule__CaseRule__DecisionsAssignment_3 ) )
            // InternalRouterDsl.g:1441:3: ( rule__CaseRule__DecisionsAssignment_3 )
            {
             before(grammarAccess.getCaseRuleAccess().getDecisionsAssignment_3()); 
            // InternalRouterDsl.g:1442:3: ( rule__CaseRule__DecisionsAssignment_3 )
            // InternalRouterDsl.g:1442:4: rule__CaseRule__DecisionsAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__CaseRule__DecisionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCaseRuleAccess().getDecisionsAssignment_3()); 

            }

            // InternalRouterDsl.g:1445:2: ( ( rule__CaseRule__DecisionsAssignment_3 )* )
            // InternalRouterDsl.g:1446:3: ( rule__CaseRule__DecisionsAssignment_3 )*
            {
             before(grammarAccess.getCaseRuleAccess().getDecisionsAssignment_3()); 
            // InternalRouterDsl.g:1447:3: ( rule__CaseRule__DecisionsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=37 && LA14_0<=39)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRouterDsl.g:1447:4: rule__CaseRule__DecisionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__CaseRule__DecisionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalRouterDsl.g:1457:1: rule__Decision__Group__0 : rule__Decision__Group__0__Impl rule__Decision__Group__1 ;
    public final void rule__Decision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1461:1: ( rule__Decision__Group__0__Impl rule__Decision__Group__1 )
            // InternalRouterDsl.g:1462:2: rule__Decision__Group__0__Impl rule__Decision__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalRouterDsl.g:1469:1: rule__Decision__Group__0__Impl : ( ( rule__Decision__Alternatives_0 ) ) ;
    public final void rule__Decision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1473:1: ( ( ( rule__Decision__Alternatives_0 ) ) )
            // InternalRouterDsl.g:1474:1: ( ( rule__Decision__Alternatives_0 ) )
            {
            // InternalRouterDsl.g:1474:1: ( ( rule__Decision__Alternatives_0 ) )
            // InternalRouterDsl.g:1475:2: ( rule__Decision__Alternatives_0 )
            {
             before(grammarAccess.getDecisionAccess().getAlternatives_0()); 
            // InternalRouterDsl.g:1476:2: ( rule__Decision__Alternatives_0 )
            // InternalRouterDsl.g:1476:3: rule__Decision__Alternatives_0
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
    // InternalRouterDsl.g:1484:1: rule__Decision__Group__1 : rule__Decision__Group__1__Impl ;
    public final void rule__Decision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1488:1: ( rule__Decision__Group__1__Impl )
            // InternalRouterDsl.g:1489:2: rule__Decision__Group__1__Impl
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
    // InternalRouterDsl.g:1495:1: rule__Decision__Group__1__Impl : ( ';' ) ;
    public final void rule__Decision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1499:1: ( ( ';' ) )
            // InternalRouterDsl.g:1500:1: ( ';' )
            {
            // InternalRouterDsl.g:1500:1: ( ';' )
            // InternalRouterDsl.g:1501:2: ';'
            {
             before(grammarAccess.getDecisionAccess().getSemicolonKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRouterDsl.g:1511:1: rule__RouteTo__Group__0 : rule__RouteTo__Group__0__Impl rule__RouteTo__Group__1 ;
    public final void rule__RouteTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1515:1: ( rule__RouteTo__Group__0__Impl rule__RouteTo__Group__1 )
            // InternalRouterDsl.g:1516:2: rule__RouteTo__Group__0__Impl rule__RouteTo__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRouterDsl.g:1523:1: rule__RouteTo__Group__0__Impl : ( '->' ) ;
    public final void rule__RouteTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1527:1: ( ( '->' ) )
            // InternalRouterDsl.g:1528:1: ( '->' )
            {
            // InternalRouterDsl.g:1528:1: ( '->' )
            // InternalRouterDsl.g:1529:2: '->'
            {
             before(grammarAccess.getRouteToAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRouterDsl.g:1538:1: rule__RouteTo__Group__1 : rule__RouteTo__Group__1__Impl ;
    public final void rule__RouteTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1542:1: ( rule__RouteTo__Group__1__Impl )
            // InternalRouterDsl.g:1543:2: rule__RouteTo__Group__1__Impl
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
    // InternalRouterDsl.g:1549:1: rule__RouteTo__Group__1__Impl : ( ( rule__RouteTo__DestinationAssignment_1 ) ) ;
    public final void rule__RouteTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1553:1: ( ( ( rule__RouteTo__DestinationAssignment_1 ) ) )
            // InternalRouterDsl.g:1554:1: ( ( rule__RouteTo__DestinationAssignment_1 ) )
            {
            // InternalRouterDsl.g:1554:1: ( ( rule__RouteTo__DestinationAssignment_1 ) )
            // InternalRouterDsl.g:1555:2: ( rule__RouteTo__DestinationAssignment_1 )
            {
             before(grammarAccess.getRouteToAccess().getDestinationAssignment_1()); 
            // InternalRouterDsl.g:1556:2: ( rule__RouteTo__DestinationAssignment_1 )
            // InternalRouterDsl.g:1556:3: rule__RouteTo__DestinationAssignment_1
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
    // InternalRouterDsl.g:1565:1: rule__DropMessage__Group__0 : rule__DropMessage__Group__0__Impl rule__DropMessage__Group__1 ;
    public final void rule__DropMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1569:1: ( rule__DropMessage__Group__0__Impl rule__DropMessage__Group__1 )
            // InternalRouterDsl.g:1570:2: rule__DropMessage__Group__0__Impl rule__DropMessage__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRouterDsl.g:1577:1: rule__DropMessage__Group__0__Impl : ( () ) ;
    public final void rule__DropMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1581:1: ( ( () ) )
            // InternalRouterDsl.g:1582:1: ( () )
            {
            // InternalRouterDsl.g:1582:1: ( () )
            // InternalRouterDsl.g:1583:2: ()
            {
             before(grammarAccess.getDropMessageAccess().getDropMessageAction_0()); 
            // InternalRouterDsl.g:1584:2: ()
            // InternalRouterDsl.g:1584:3: 
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
    // InternalRouterDsl.g:1592:1: rule__DropMessage__Group__1 : rule__DropMessage__Group__1__Impl ;
    public final void rule__DropMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1596:1: ( rule__DropMessage__Group__1__Impl )
            // InternalRouterDsl.g:1597:2: rule__DropMessage__Group__1__Impl
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
    // InternalRouterDsl.g:1603:1: rule__DropMessage__Group__1__Impl : ( 'X' ) ;
    public final void rule__DropMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1607:1: ( ( 'X' ) )
            // InternalRouterDsl.g:1608:1: ( 'X' )
            {
            // InternalRouterDsl.g:1608:1: ( 'X' )
            // InternalRouterDsl.g:1609:2: 'X'
            {
             before(grammarAccess.getDropMessageAccess().getXKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRouterDsl.g:1619:1: rule__Alert__Group__0 : rule__Alert__Group__0__Impl rule__Alert__Group__1 ;
    public final void rule__Alert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1623:1: ( rule__Alert__Group__0__Impl rule__Alert__Group__1 )
            // InternalRouterDsl.g:1624:2: rule__Alert__Group__0__Impl rule__Alert__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRouterDsl.g:1631:1: rule__Alert__Group__0__Impl : ( '/!\\\\' ) ;
    public final void rule__Alert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1635:1: ( ( '/!\\\\' ) )
            // InternalRouterDsl.g:1636:1: ( '/!\\\\' )
            {
            // InternalRouterDsl.g:1636:1: ( '/!\\\\' )
            // InternalRouterDsl.g:1637:2: '/!\\\\'
            {
             before(grammarAccess.getAlertAccess().getSolidusExclamationMarkReverseSolidusKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRouterDsl.g:1646:1: rule__Alert__Group__1 : rule__Alert__Group__1__Impl rule__Alert__Group__2 ;
    public final void rule__Alert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1650:1: ( rule__Alert__Group__1__Impl rule__Alert__Group__2 )
            // InternalRouterDsl.g:1651:2: rule__Alert__Group__1__Impl rule__Alert__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalRouterDsl.g:1658:1: rule__Alert__Group__1__Impl : ( ( rule__Alert__LevelAssignment_1 ) ) ;
    public final void rule__Alert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1662:1: ( ( ( rule__Alert__LevelAssignment_1 ) ) )
            // InternalRouterDsl.g:1663:1: ( ( rule__Alert__LevelAssignment_1 ) )
            {
            // InternalRouterDsl.g:1663:1: ( ( rule__Alert__LevelAssignment_1 ) )
            // InternalRouterDsl.g:1664:2: ( rule__Alert__LevelAssignment_1 )
            {
             before(grammarAccess.getAlertAccess().getLevelAssignment_1()); 
            // InternalRouterDsl.g:1665:2: ( rule__Alert__LevelAssignment_1 )
            // InternalRouterDsl.g:1665:3: rule__Alert__LevelAssignment_1
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
    // InternalRouterDsl.g:1673:1: rule__Alert__Group__2 : rule__Alert__Group__2__Impl ;
    public final void rule__Alert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1677:1: ( rule__Alert__Group__2__Impl )
            // InternalRouterDsl.g:1678:2: rule__Alert__Group__2__Impl
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
    // InternalRouterDsl.g:1684:1: rule__Alert__Group__2__Impl : ( '/!\\\\' ) ;
    public final void rule__Alert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1688:1: ( ( '/!\\\\' ) )
            // InternalRouterDsl.g:1689:1: ( '/!\\\\' )
            {
            // InternalRouterDsl.g:1689:1: ( '/!\\\\' )
            // InternalRouterDsl.g:1690:2: '/!\\\\'
            {
             before(grammarAccess.getAlertAccess().getSolidusExclamationMarkReverseSolidusKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRouterDsl.g:1700:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1704:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // InternalRouterDsl.g:1705:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalRouterDsl.g:1712:1: rule__Conditional__Group__0__Impl : ( ( rule__Conditional__LeftAssignment_0 ) ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1716:1: ( ( ( rule__Conditional__LeftAssignment_0 ) ) )
            // InternalRouterDsl.g:1717:1: ( ( rule__Conditional__LeftAssignment_0 ) )
            {
            // InternalRouterDsl.g:1717:1: ( ( rule__Conditional__LeftAssignment_0 ) )
            // InternalRouterDsl.g:1718:2: ( rule__Conditional__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionalAccess().getLeftAssignment_0()); 
            // InternalRouterDsl.g:1719:2: ( rule__Conditional__LeftAssignment_0 )
            // InternalRouterDsl.g:1719:3: rule__Conditional__LeftAssignment_0
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
    // InternalRouterDsl.g:1727:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1731:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // InternalRouterDsl.g:1732:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalRouterDsl.g:1739:1: rule__Conditional__Group__1__Impl : ( ( rule__Conditional__OpAssignment_1 ) ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1743:1: ( ( ( rule__Conditional__OpAssignment_1 ) ) )
            // InternalRouterDsl.g:1744:1: ( ( rule__Conditional__OpAssignment_1 ) )
            {
            // InternalRouterDsl.g:1744:1: ( ( rule__Conditional__OpAssignment_1 ) )
            // InternalRouterDsl.g:1745:2: ( rule__Conditional__OpAssignment_1 )
            {
             before(grammarAccess.getConditionalAccess().getOpAssignment_1()); 
            // InternalRouterDsl.g:1746:2: ( rule__Conditional__OpAssignment_1 )
            // InternalRouterDsl.g:1746:3: rule__Conditional__OpAssignment_1
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
    // InternalRouterDsl.g:1754:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1758:1: ( rule__Conditional__Group__2__Impl )
            // InternalRouterDsl.g:1759:2: rule__Conditional__Group__2__Impl
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
    // InternalRouterDsl.g:1765:1: rule__Conditional__Group__2__Impl : ( ( rule__Conditional__RightAssignment_2 ) ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1769:1: ( ( ( rule__Conditional__RightAssignment_2 ) ) )
            // InternalRouterDsl.g:1770:1: ( ( rule__Conditional__RightAssignment_2 ) )
            {
            // InternalRouterDsl.g:1770:1: ( ( rule__Conditional__RightAssignment_2 ) )
            // InternalRouterDsl.g:1771:2: ( rule__Conditional__RightAssignment_2 )
            {
             before(grammarAccess.getConditionalAccess().getRightAssignment_2()); 
            // InternalRouterDsl.g:1772:2: ( rule__Conditional__RightAssignment_2 )
            // InternalRouterDsl.g:1772:3: rule__Conditional__RightAssignment_2
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
    // InternalRouterDsl.g:1781:1: rule__Throughtput__Group__0 : rule__Throughtput__Group__0__Impl rule__Throughtput__Group__1 ;
    public final void rule__Throughtput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1785:1: ( rule__Throughtput__Group__0__Impl rule__Throughtput__Group__1 )
            // InternalRouterDsl.g:1786:2: rule__Throughtput__Group__0__Impl rule__Throughtput__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalRouterDsl.g:1793:1: rule__Throughtput__Group__0__Impl : ( ( rule__Throughtput__ValueAssignment_0 ) ) ;
    public final void rule__Throughtput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1797:1: ( ( ( rule__Throughtput__ValueAssignment_0 ) ) )
            // InternalRouterDsl.g:1798:1: ( ( rule__Throughtput__ValueAssignment_0 ) )
            {
            // InternalRouterDsl.g:1798:1: ( ( rule__Throughtput__ValueAssignment_0 ) )
            // InternalRouterDsl.g:1799:2: ( rule__Throughtput__ValueAssignment_0 )
            {
             before(grammarAccess.getThroughtputAccess().getValueAssignment_0()); 
            // InternalRouterDsl.g:1800:2: ( rule__Throughtput__ValueAssignment_0 )
            // InternalRouterDsl.g:1800:3: rule__Throughtput__ValueAssignment_0
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
    // InternalRouterDsl.g:1808:1: rule__Throughtput__Group__1 : rule__Throughtput__Group__1__Impl rule__Throughtput__Group__2 ;
    public final void rule__Throughtput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1812:1: ( rule__Throughtput__Group__1__Impl rule__Throughtput__Group__2 )
            // InternalRouterDsl.g:1813:2: rule__Throughtput__Group__1__Impl rule__Throughtput__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalRouterDsl.g:1820:1: rule__Throughtput__Group__1__Impl : ( '/' ) ;
    public final void rule__Throughtput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1824:1: ( ( '/' ) )
            // InternalRouterDsl.g:1825:1: ( '/' )
            {
            // InternalRouterDsl.g:1825:1: ( '/' )
            // InternalRouterDsl.g:1826:2: '/'
            {
             before(grammarAccess.getThroughtputAccess().getSolidusKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRouterDsl.g:1835:1: rule__Throughtput__Group__2 : rule__Throughtput__Group__2__Impl ;
    public final void rule__Throughtput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1839:1: ( rule__Throughtput__Group__2__Impl )
            // InternalRouterDsl.g:1840:2: rule__Throughtput__Group__2__Impl
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
    // InternalRouterDsl.g:1846:1: rule__Throughtput__Group__2__Impl : ( ( rule__Throughtput__UnitAssignment_2 ) ) ;
    public final void rule__Throughtput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1850:1: ( ( ( rule__Throughtput__UnitAssignment_2 ) ) )
            // InternalRouterDsl.g:1851:1: ( ( rule__Throughtput__UnitAssignment_2 ) )
            {
            // InternalRouterDsl.g:1851:1: ( ( rule__Throughtput__UnitAssignment_2 ) )
            // InternalRouterDsl.g:1852:2: ( rule__Throughtput__UnitAssignment_2 )
            {
             before(grammarAccess.getThroughtputAccess().getUnitAssignment_2()); 
            // InternalRouterDsl.g:1853:2: ( rule__Throughtput__UnitAssignment_2 )
            // InternalRouterDsl.g:1853:3: rule__Throughtput__UnitAssignment_2
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
    // InternalRouterDsl.g:1862:1: rule__Temperature__Group__0 : rule__Temperature__Group__0__Impl rule__Temperature__Group__1 ;
    public final void rule__Temperature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1866:1: ( rule__Temperature__Group__0__Impl rule__Temperature__Group__1 )
            // InternalRouterDsl.g:1867:2: rule__Temperature__Group__0__Impl rule__Temperature__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalRouterDsl.g:1874:1: rule__Temperature__Group__0__Impl : ( ( rule__Temperature__ValueAssignment_0 ) ) ;
    public final void rule__Temperature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1878:1: ( ( ( rule__Temperature__ValueAssignment_0 ) ) )
            // InternalRouterDsl.g:1879:1: ( ( rule__Temperature__ValueAssignment_0 ) )
            {
            // InternalRouterDsl.g:1879:1: ( ( rule__Temperature__ValueAssignment_0 ) )
            // InternalRouterDsl.g:1880:2: ( rule__Temperature__ValueAssignment_0 )
            {
             before(grammarAccess.getTemperatureAccess().getValueAssignment_0()); 
            // InternalRouterDsl.g:1881:2: ( rule__Temperature__ValueAssignment_0 )
            // InternalRouterDsl.g:1881:3: rule__Temperature__ValueAssignment_0
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
    // InternalRouterDsl.g:1889:1: rule__Temperature__Group__1 : rule__Temperature__Group__1__Impl ;
    public final void rule__Temperature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1893:1: ( rule__Temperature__Group__1__Impl )
            // InternalRouterDsl.g:1894:2: rule__Temperature__Group__1__Impl
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
    // InternalRouterDsl.g:1900:1: rule__Temperature__Group__1__Impl : ( ( rule__Temperature__UnitAssignment_1 ) ) ;
    public final void rule__Temperature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1904:1: ( ( ( rule__Temperature__UnitAssignment_1 ) ) )
            // InternalRouterDsl.g:1905:1: ( ( rule__Temperature__UnitAssignment_1 ) )
            {
            // InternalRouterDsl.g:1905:1: ( ( rule__Temperature__UnitAssignment_1 ) )
            // InternalRouterDsl.g:1906:2: ( rule__Temperature__UnitAssignment_1 )
            {
             before(grammarAccess.getTemperatureAccess().getUnitAssignment_1()); 
            // InternalRouterDsl.g:1907:2: ( rule__Temperature__UnitAssignment_1 )
            // InternalRouterDsl.g:1907:3: rule__Temperature__UnitAssignment_1
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
    // InternalRouterDsl.g:1916:1: rule__ProcessorAccess__Group__0 : rule__ProcessorAccess__Group__0__Impl rule__ProcessorAccess__Group__1 ;
    public final void rule__ProcessorAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1920:1: ( rule__ProcessorAccess__Group__0__Impl rule__ProcessorAccess__Group__1 )
            // InternalRouterDsl.g:1921:2: rule__ProcessorAccess__Group__0__Impl rule__ProcessorAccess__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalRouterDsl.g:1928:1: rule__ProcessorAccess__Group__0__Impl : ( ( rule__ProcessorAccess__ProcessorAssignment_0 ) ) ;
    public final void rule__ProcessorAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1932:1: ( ( ( rule__ProcessorAccess__ProcessorAssignment_0 ) ) )
            // InternalRouterDsl.g:1933:1: ( ( rule__ProcessorAccess__ProcessorAssignment_0 ) )
            {
            // InternalRouterDsl.g:1933:1: ( ( rule__ProcessorAccess__ProcessorAssignment_0 ) )
            // InternalRouterDsl.g:1934:2: ( rule__ProcessorAccess__ProcessorAssignment_0 )
            {
             before(grammarAccess.getProcessorAccessAccess().getProcessorAssignment_0()); 
            // InternalRouterDsl.g:1935:2: ( rule__ProcessorAccess__ProcessorAssignment_0 )
            // InternalRouterDsl.g:1935:3: rule__ProcessorAccess__ProcessorAssignment_0
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
    // InternalRouterDsl.g:1943:1: rule__ProcessorAccess__Group__1 : rule__ProcessorAccess__Group__1__Impl rule__ProcessorAccess__Group__2 ;
    public final void rule__ProcessorAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1947:1: ( rule__ProcessorAccess__Group__1__Impl rule__ProcessorAccess__Group__2 )
            // InternalRouterDsl.g:1948:2: rule__ProcessorAccess__Group__1__Impl rule__ProcessorAccess__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalRouterDsl.g:1955:1: rule__ProcessorAccess__Group__1__Impl : ( '.' ) ;
    public final void rule__ProcessorAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1959:1: ( ( '.' ) )
            // InternalRouterDsl.g:1960:1: ( '.' )
            {
            // InternalRouterDsl.g:1960:1: ( '.' )
            // InternalRouterDsl.g:1961:2: '.'
            {
             before(grammarAccess.getProcessorAccessAccess().getFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRouterDsl.g:1970:1: rule__ProcessorAccess__Group__2 : rule__ProcessorAccess__Group__2__Impl ;
    public final void rule__ProcessorAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1974:1: ( rule__ProcessorAccess__Group__2__Impl )
            // InternalRouterDsl.g:1975:2: rule__ProcessorAccess__Group__2__Impl
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
    // InternalRouterDsl.g:1981:1: rule__ProcessorAccess__Group__2__Impl : ( ( rule__ProcessorAccess__AttributeAssignment_2 ) ) ;
    public final void rule__ProcessorAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:1985:1: ( ( ( rule__ProcessorAccess__AttributeAssignment_2 ) ) )
            // InternalRouterDsl.g:1986:1: ( ( rule__ProcessorAccess__AttributeAssignment_2 ) )
            {
            // InternalRouterDsl.g:1986:1: ( ( rule__ProcessorAccess__AttributeAssignment_2 ) )
            // InternalRouterDsl.g:1987:2: ( rule__ProcessorAccess__AttributeAssignment_2 )
            {
             before(grammarAccess.getProcessorAccessAccess().getAttributeAssignment_2()); 
            // InternalRouterDsl.g:1988:2: ( rule__ProcessorAccess__AttributeAssignment_2 )
            // InternalRouterDsl.g:1988:3: rule__ProcessorAccess__AttributeAssignment_2
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
    // InternalRouterDsl.g:1997:1: rule__SensorAccess__Group__0 : rule__SensorAccess__Group__0__Impl rule__SensorAccess__Group__1 ;
    public final void rule__SensorAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2001:1: ( rule__SensorAccess__Group__0__Impl rule__SensorAccess__Group__1 )
            // InternalRouterDsl.g:2002:2: rule__SensorAccess__Group__0__Impl rule__SensorAccess__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRouterDsl.g:2009:1: rule__SensorAccess__Group__0__Impl : ( ( rule__SensorAccess__SensorAssignment_0 ) ) ;
    public final void rule__SensorAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2013:1: ( ( ( rule__SensorAccess__SensorAssignment_0 ) ) )
            // InternalRouterDsl.g:2014:1: ( ( rule__SensorAccess__SensorAssignment_0 ) )
            {
            // InternalRouterDsl.g:2014:1: ( ( rule__SensorAccess__SensorAssignment_0 ) )
            // InternalRouterDsl.g:2015:2: ( rule__SensorAccess__SensorAssignment_0 )
            {
             before(grammarAccess.getSensorAccessAccess().getSensorAssignment_0()); 
            // InternalRouterDsl.g:2016:2: ( rule__SensorAccess__SensorAssignment_0 )
            // InternalRouterDsl.g:2016:3: rule__SensorAccess__SensorAssignment_0
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
    // InternalRouterDsl.g:2024:1: rule__SensorAccess__Group__1 : rule__SensorAccess__Group__1__Impl ;
    public final void rule__SensorAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2028:1: ( rule__SensorAccess__Group__1__Impl )
            // InternalRouterDsl.g:2029:2: rule__SensorAccess__Group__1__Impl
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
    // InternalRouterDsl.g:2035:1: rule__SensorAccess__Group__1__Impl : ( '.volume' ) ;
    public final void rule__SensorAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2039:1: ( ( '.volume' ) )
            // InternalRouterDsl.g:2040:1: ( '.volume' )
            {
            // InternalRouterDsl.g:2040:1: ( '.volume' )
            // InternalRouterDsl.g:2041:2: '.volume'
            {
             before(grammarAccess.getSensorAccessAccess().getVolumeKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRouterDsl.g:2051:1: rule__SystemAccess__Group__0 : rule__SystemAccess__Group__0__Impl rule__SystemAccess__Group__1 ;
    public final void rule__SystemAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2055:1: ( rule__SystemAccess__Group__0__Impl rule__SystemAccess__Group__1 )
            // InternalRouterDsl.g:2056:2: rule__SystemAccess__Group__0__Impl rule__SystemAccess__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalRouterDsl.g:2063:1: rule__SystemAccess__Group__0__Impl : ( ( rule__SystemAccess__SystemAssignment_0 ) ) ;
    public final void rule__SystemAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2067:1: ( ( ( rule__SystemAccess__SystemAssignment_0 ) ) )
            // InternalRouterDsl.g:2068:1: ( ( rule__SystemAccess__SystemAssignment_0 ) )
            {
            // InternalRouterDsl.g:2068:1: ( ( rule__SystemAccess__SystemAssignment_0 ) )
            // InternalRouterDsl.g:2069:2: ( rule__SystemAccess__SystemAssignment_0 )
            {
             before(grammarAccess.getSystemAccessAccess().getSystemAssignment_0()); 
            // InternalRouterDsl.g:2070:2: ( rule__SystemAccess__SystemAssignment_0 )
            // InternalRouterDsl.g:2070:3: rule__SystemAccess__SystemAssignment_0
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
    // InternalRouterDsl.g:2078:1: rule__SystemAccess__Group__1 : rule__SystemAccess__Group__1__Impl ;
    public final void rule__SystemAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2082:1: ( rule__SystemAccess__Group__1__Impl )
            // InternalRouterDsl.g:2083:2: rule__SystemAccess__Group__1__Impl
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
    // InternalRouterDsl.g:2089:1: rule__SystemAccess__Group__1__Impl : ( '.temperature' ) ;
    public final void rule__SystemAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2093:1: ( ( '.temperature' ) )
            // InternalRouterDsl.g:2094:1: ( '.temperature' )
            {
            // InternalRouterDsl.g:2094:1: ( '.temperature' )
            // InternalRouterDsl.g:2095:2: '.temperature'
            {
             before(grammarAccess.getSystemAccessAccess().getTemperatureKeyword_1()); 
            match(input,43,FOLLOW_2); 
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


    // $ANTLR start "rule__RoutingRules__ProcessorsAssignment_1"
    // InternalRouterDsl.g:2105:1: rule__RoutingRules__ProcessorsAssignment_1 : ( ruleProcessorDeclaration ) ;
    public final void rule__RoutingRules__ProcessorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2109:1: ( ( ruleProcessorDeclaration ) )
            // InternalRouterDsl.g:2110:2: ( ruleProcessorDeclaration )
            {
            // InternalRouterDsl.g:2110:2: ( ruleProcessorDeclaration )
            // InternalRouterDsl.g:2111:3: ruleProcessorDeclaration
            {
             before(grammarAccess.getRoutingRulesAccess().getProcessorsProcessorDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessorDeclaration();

            state._fsp--;

             after(grammarAccess.getRoutingRulesAccess().getProcessorsProcessorDeclarationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RoutingRules__ProcessorsAssignment_1"


    // $ANTLR start "rule__RoutingRules__SensorsAssignment_2"
    // InternalRouterDsl.g:2120:1: rule__RoutingRules__SensorsAssignment_2 : ( ruleDataSourceDeclaration ) ;
    public final void rule__RoutingRules__SensorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2124:1: ( ( ruleDataSourceDeclaration ) )
            // InternalRouterDsl.g:2125:2: ( ruleDataSourceDeclaration )
            {
            // InternalRouterDsl.g:2125:2: ( ruleDataSourceDeclaration )
            // InternalRouterDsl.g:2126:3: ruleDataSourceDeclaration
            {
             before(grammarAccess.getRoutingRulesAccess().getSensorsDataSourceDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataSourceDeclaration();

            state._fsp--;

             after(grammarAccess.getRoutingRulesAccess().getSensorsDataSourceDeclarationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RoutingRules__SensorsAssignment_2"


    // $ANTLR start "rule__RoutingRules__SystemsAssignment_3"
    // InternalRouterDsl.g:2135:1: rule__RoutingRules__SystemsAssignment_3 : ( ruleSystemDeclaration ) ;
    public final void rule__RoutingRules__SystemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2139:1: ( ( ruleSystemDeclaration ) )
            // InternalRouterDsl.g:2140:2: ( ruleSystemDeclaration )
            {
            // InternalRouterDsl.g:2140:2: ( ruleSystemDeclaration )
            // InternalRouterDsl.g:2141:3: ruleSystemDeclaration
            {
             before(grammarAccess.getRoutingRulesAccess().getSystemsSystemDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemDeclaration();

            state._fsp--;

             after(grammarAccess.getRoutingRulesAccess().getSystemsSystemDeclarationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RoutingRules__SystemsAssignment_3"


    // $ANTLR start "rule__RoutingRules__RulesAssignment_5"
    // InternalRouterDsl.g:2150:1: rule__RoutingRules__RulesAssignment_5 : ( ruleCaseRule ) ;
    public final void rule__RoutingRules__RulesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2154:1: ( ( ruleCaseRule ) )
            // InternalRouterDsl.g:2155:2: ( ruleCaseRule )
            {
            // InternalRouterDsl.g:2155:2: ( ruleCaseRule )
            // InternalRouterDsl.g:2156:3: ruleCaseRule
            {
             before(grammarAccess.getRoutingRulesAccess().getRulesCaseRuleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCaseRule();

            state._fsp--;

             after(grammarAccess.getRoutingRulesAccess().getRulesCaseRuleParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__RoutingRules__RulesAssignment_5"


    // $ANTLR start "rule__DataSourceDeclaration__NameAssignment_2"
    // InternalRouterDsl.g:2165:1: rule__DataSourceDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataSourceDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2169:1: ( ( RULE_ID ) )
            // InternalRouterDsl.g:2170:2: ( RULE_ID )
            {
            // InternalRouterDsl.g:2170:2: ( RULE_ID )
            // InternalRouterDsl.g:2171:3: RULE_ID
            {
             before(grammarAccess.getDataSourceDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSourceDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DataSourceDeclaration__NameAssignment_2"


    // $ANTLR start "rule__ProcessorDeclaration__NameAssignment_2"
    // InternalRouterDsl.g:2180:1: rule__ProcessorDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ProcessorDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2184:1: ( ( RULE_ID ) )
            // InternalRouterDsl.g:2185:2: ( RULE_ID )
            {
            // InternalRouterDsl.g:2185:2: ( RULE_ID )
            // InternalRouterDsl.g:2186:3: RULE_ID
            {
             before(grammarAccess.getProcessorDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessorDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ProcessorDeclaration__NameAssignment_2"


    // $ANTLR start "rule__SystemDeclaration__NameAssignment_2"
    // InternalRouterDsl.g:2195:1: rule__SystemDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SystemDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2199:1: ( ( RULE_ID ) )
            // InternalRouterDsl.g:2200:2: ( RULE_ID )
            {
            // InternalRouterDsl.g:2200:2: ( RULE_ID )
            // InternalRouterDsl.g:2201:3: RULE_ID
            {
             before(grammarAccess.getSystemDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SystemDeclaration__NameAssignment_2"


    // $ANTLR start "rule__CaseRule__ConditionAssignment_1"
    // InternalRouterDsl.g:2210:1: rule__CaseRule__ConditionAssignment_1 : ( ruleConditional ) ;
    public final void rule__CaseRule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2214:1: ( ( ruleConditional ) )
            // InternalRouterDsl.g:2215:2: ( ruleConditional )
            {
            // InternalRouterDsl.g:2215:2: ( ruleConditional )
            // InternalRouterDsl.g:2216:3: ruleConditional
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
    // InternalRouterDsl.g:2225:1: rule__CaseRule__DecisionsAssignment_3 : ( ruleDecision ) ;
    public final void rule__CaseRule__DecisionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2229:1: ( ( ruleDecision ) )
            // InternalRouterDsl.g:2230:2: ( ruleDecision )
            {
            // InternalRouterDsl.g:2230:2: ( ruleDecision )
            // InternalRouterDsl.g:2231:3: ruleDecision
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
    // InternalRouterDsl.g:2240:1: rule__RouteTo__DestinationAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RouteTo__DestinationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2244:1: ( ( ( RULE_ID ) ) )
            // InternalRouterDsl.g:2245:2: ( ( RULE_ID ) )
            {
            // InternalRouterDsl.g:2245:2: ( ( RULE_ID ) )
            // InternalRouterDsl.g:2246:3: ( RULE_ID )
            {
             before(grammarAccess.getRouteToAccess().getDestinationProcessorDeclarationCrossReference_1_0()); 
            // InternalRouterDsl.g:2247:3: ( RULE_ID )
            // InternalRouterDsl.g:2248:4: RULE_ID
            {
             before(grammarAccess.getRouteToAccess().getDestinationProcessorDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRouteToAccess().getDestinationProcessorDeclarationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRouteToAccess().getDestinationProcessorDeclarationCrossReference_1_0()); 

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
    // InternalRouterDsl.g:2259:1: rule__Alert__LevelAssignment_1 : ( ruleAlertLevel ) ;
    public final void rule__Alert__LevelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2263:1: ( ( ruleAlertLevel ) )
            // InternalRouterDsl.g:2264:2: ( ruleAlertLevel )
            {
            // InternalRouterDsl.g:2264:2: ( ruleAlertLevel )
            // InternalRouterDsl.g:2265:3: ruleAlertLevel
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
    // InternalRouterDsl.g:2274:1: rule__Conditional__LeftAssignment_0 : ( ruleObjectAccessOrValue ) ;
    public final void rule__Conditional__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2278:1: ( ( ruleObjectAccessOrValue ) )
            // InternalRouterDsl.g:2279:2: ( ruleObjectAccessOrValue )
            {
            // InternalRouterDsl.g:2279:2: ( ruleObjectAccessOrValue )
            // InternalRouterDsl.g:2280:3: ruleObjectAccessOrValue
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
    // InternalRouterDsl.g:2289:1: rule__Conditional__OpAssignment_1 : ( ruleComparison ) ;
    public final void rule__Conditional__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2293:1: ( ( ruleComparison ) )
            // InternalRouterDsl.g:2294:2: ( ruleComparison )
            {
            // InternalRouterDsl.g:2294:2: ( ruleComparison )
            // InternalRouterDsl.g:2295:3: ruleComparison
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
    // InternalRouterDsl.g:2304:1: rule__Conditional__RightAssignment_2 : ( ruleObjectAccessOrValue ) ;
    public final void rule__Conditional__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2308:1: ( ( ruleObjectAccessOrValue ) )
            // InternalRouterDsl.g:2309:2: ( ruleObjectAccessOrValue )
            {
            // InternalRouterDsl.g:2309:2: ( ruleObjectAccessOrValue )
            // InternalRouterDsl.g:2310:3: ruleObjectAccessOrValue
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
    // InternalRouterDsl.g:2319:1: rule__LiteralValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__LiteralValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2323:1: ( ( RULE_INT ) )
            // InternalRouterDsl.g:2324:2: ( RULE_INT )
            {
            // InternalRouterDsl.g:2324:2: ( RULE_INT )
            // InternalRouterDsl.g:2325:3: RULE_INT
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
    // InternalRouterDsl.g:2334:1: rule__Throughtput__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Throughtput__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2338:1: ( ( RULE_INT ) )
            // InternalRouterDsl.g:2339:2: ( RULE_INT )
            {
            // InternalRouterDsl.g:2339:2: ( RULE_INT )
            // InternalRouterDsl.g:2340:3: RULE_INT
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
    // InternalRouterDsl.g:2349:1: rule__Throughtput__UnitAssignment_2 : ( ruleTimeUnit ) ;
    public final void rule__Throughtput__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2353:1: ( ( ruleTimeUnit ) )
            // InternalRouterDsl.g:2354:2: ( ruleTimeUnit )
            {
            // InternalRouterDsl.g:2354:2: ( ruleTimeUnit )
            // InternalRouterDsl.g:2355:3: ruleTimeUnit
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
    // InternalRouterDsl.g:2364:1: rule__Temperature__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Temperature__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2368:1: ( ( RULE_INT ) )
            // InternalRouterDsl.g:2369:2: ( RULE_INT )
            {
            // InternalRouterDsl.g:2369:2: ( RULE_INT )
            // InternalRouterDsl.g:2370:3: RULE_INT
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
    // InternalRouterDsl.g:2379:1: rule__Temperature__UnitAssignment_1 : ( ruleTemperatureUnit ) ;
    public final void rule__Temperature__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2383:1: ( ( ruleTemperatureUnit ) )
            // InternalRouterDsl.g:2384:2: ( ruleTemperatureUnit )
            {
            // InternalRouterDsl.g:2384:2: ( ruleTemperatureUnit )
            // InternalRouterDsl.g:2385:3: ruleTemperatureUnit
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
    // InternalRouterDsl.g:2394:1: rule__ProcessorAccess__ProcessorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ProcessorAccess__ProcessorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2398:1: ( ( ( RULE_ID ) ) )
            // InternalRouterDsl.g:2399:2: ( ( RULE_ID ) )
            {
            // InternalRouterDsl.g:2399:2: ( ( RULE_ID ) )
            // InternalRouterDsl.g:2400:3: ( RULE_ID )
            {
             before(grammarAccess.getProcessorAccessAccess().getProcessorProcessorDeclarationCrossReference_0_0()); 
            // InternalRouterDsl.g:2401:3: ( RULE_ID )
            // InternalRouterDsl.g:2402:4: RULE_ID
            {
             before(grammarAccess.getProcessorAccessAccess().getProcessorProcessorDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessorAccessAccess().getProcessorProcessorDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getProcessorAccessAccess().getProcessorProcessorDeclarationCrossReference_0_0()); 

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
    // InternalRouterDsl.g:2413:1: rule__ProcessorAccess__AttributeAssignment_2 : ( ruleProcessorAttribute ) ;
    public final void rule__ProcessorAccess__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2417:1: ( ( ruleProcessorAttribute ) )
            // InternalRouterDsl.g:2418:2: ( ruleProcessorAttribute )
            {
            // InternalRouterDsl.g:2418:2: ( ruleProcessorAttribute )
            // InternalRouterDsl.g:2419:3: ruleProcessorAttribute
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
    // InternalRouterDsl.g:2428:1: rule__SensorAccess__SensorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SensorAccess__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2432:1: ( ( ( RULE_ID ) ) )
            // InternalRouterDsl.g:2433:2: ( ( RULE_ID ) )
            {
            // InternalRouterDsl.g:2433:2: ( ( RULE_ID ) )
            // InternalRouterDsl.g:2434:3: ( RULE_ID )
            {
             before(grammarAccess.getSensorAccessAccess().getSensorDataSourceDeclarationCrossReference_0_0()); 
            // InternalRouterDsl.g:2435:3: ( RULE_ID )
            // InternalRouterDsl.g:2436:4: RULE_ID
            {
             before(grammarAccess.getSensorAccessAccess().getSensorDataSourceDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorAccessAccess().getSensorDataSourceDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSensorAccessAccess().getSensorDataSourceDeclarationCrossReference_0_0()); 

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
    // InternalRouterDsl.g:2447:1: rule__SystemAccess__SystemAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SystemAccess__SystemAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRouterDsl.g:2451:1: ( ( ( RULE_ID ) ) )
            // InternalRouterDsl.g:2452:2: ( ( RULE_ID ) )
            {
            // InternalRouterDsl.g:2452:2: ( ( RULE_ID ) )
            // InternalRouterDsl.g:2453:3: ( RULE_ID )
            {
             before(grammarAccess.getSystemAccessAccess().getSystemSystemDeclarationCrossReference_0_0()); 
            // InternalRouterDsl.g:2454:3: ( RULE_ID )
            // InternalRouterDsl.g:2455:4: RULE_ID
            {
             before(grammarAccess.getSystemAccessAccess().getSystemSystemDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemAccessAccess().getSystemSystemDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSystemAccessAccess().getSystemSystemDeclarationCrossReference_0_0()); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000330000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000E000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000000L});

}