package at.ac.tuwien.big.ide.contentassist.antlr.internal;

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
import at.ac.tuwien.big.services.StlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalStlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'system'", "'{'", "'}'", "'area'", "'item'", "'='", "'generator'", "'generates'", "'(cost='", "')'", "'output'", "'conveyor'", "'input'", "'turntable'", "'machine'", "'buffer'", "'productStore'", "',capacity='", "'wasteStore'", "'>'", "':'", "'service'", "',reliability='", "',processingTime='", "'.'", "'-'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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


        public InternalStlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStl.g"; }


    	private StlGrammarAccess grammarAccess;

    	public void setGrammarAccess(StlGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSystem"
    // InternalStl.g:54:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalStl.g:55:1: ( ruleSystem EOF )
            // InternalStl.g:56:1: ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalStl.g:63:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:67:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalStl.g:68:2: ( ( rule__System__Group__0 ) )
            {
            // InternalStl.g:68:2: ( ( rule__System__Group__0 ) )
            // InternalStl.g:69:3: ( rule__System__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup()); 
            }
            // InternalStl.g:70:3: ( rule__System__Group__0 )
            // InternalStl.g:70:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getGroup()); 
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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleArea"
    // InternalStl.g:79:1: entryRuleArea : ruleArea EOF ;
    public final void entryRuleArea() throws RecognitionException {
        try {
            // InternalStl.g:80:1: ( ruleArea EOF )
            // InternalStl.g:81:1: ruleArea EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArea();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArea"


    // $ANTLR start "ruleArea"
    // InternalStl.g:88:1: ruleArea : ( ( rule__Area__Group__0 ) ) ;
    public final void ruleArea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:92:2: ( ( ( rule__Area__Group__0 ) ) )
            // InternalStl.g:93:2: ( ( rule__Area__Group__0 ) )
            {
            // InternalStl.g:93:2: ( ( rule__Area__Group__0 ) )
            // InternalStl.g:94:3: ( rule__Area__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getGroup()); 
            }
            // InternalStl.g:95:3: ( rule__Area__Group__0 )
            // InternalStl.g:95:4: rule__Area__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getGroup()); 
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
    // $ANTLR end "ruleArea"


    // $ANTLR start "entryRuleItemType"
    // InternalStl.g:104:1: entryRuleItemType : ruleItemType EOF ;
    public final void entryRuleItemType() throws RecognitionException {
        try {
            // InternalStl.g:105:1: ( ruleItemType EOF )
            // InternalStl.g:106:1: ruleItemType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleItemType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleItemType"


    // $ANTLR start "ruleItemType"
    // InternalStl.g:113:1: ruleItemType : ( ( rule__ItemType__Group__0 ) ) ;
    public final void ruleItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:117:2: ( ( ( rule__ItemType__Group__0 ) ) )
            // InternalStl.g:118:2: ( ( rule__ItemType__Group__0 ) )
            {
            // InternalStl.g:118:2: ( ( rule__ItemType__Group__0 ) )
            // InternalStl.g:119:3: ( rule__ItemType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getGroup()); 
            }
            // InternalStl.g:120:3: ( rule__ItemType__Group__0 )
            // InternalStl.g:120:4: rule__ItemType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getGroup()); 
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
    // $ANTLR end "ruleItemType"


    // $ANTLR start "entryRuleComponent"
    // InternalStl.g:129:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalStl.g:130:1: ( ruleComponent EOF )
            // InternalStl.g:131:1: ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalStl.g:138:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:142:2: ( ( ( rule__Component__Alternatives ) ) )
            // InternalStl.g:143:2: ( ( rule__Component__Alternatives ) )
            {
            // InternalStl.g:143:2: ( ( rule__Component__Alternatives ) )
            // InternalStl.g:144:3: ( rule__Component__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getAlternatives()); 
            }
            // InternalStl.g:145:3: ( rule__Component__Alternatives )
            // InternalStl.g:145:4: rule__Component__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getAlternatives()); 
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleItemGenerator"
    // InternalStl.g:154:1: entryRuleItemGenerator : ruleItemGenerator EOF ;
    public final void entryRuleItemGenerator() throws RecognitionException {
        try {
            // InternalStl.g:155:1: ( ruleItemGenerator EOF )
            // InternalStl.g:156:1: ruleItemGenerator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleItemGenerator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleItemGenerator"


    // $ANTLR start "ruleItemGenerator"
    // InternalStl.g:163:1: ruleItemGenerator : ( ( rule__ItemGenerator__Group__0 ) ) ;
    public final void ruleItemGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:167:2: ( ( ( rule__ItemGenerator__Group__0 ) ) )
            // InternalStl.g:168:2: ( ( rule__ItemGenerator__Group__0 ) )
            {
            // InternalStl.g:168:2: ( ( rule__ItemGenerator__Group__0 ) )
            // InternalStl.g:169:3: ( rule__ItemGenerator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGroup()); 
            }
            // InternalStl.g:170:3: ( rule__ItemGenerator__Group__0 )
            // InternalStl.g:170:4: rule__ItemGenerator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGroup()); 
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
    // $ANTLR end "ruleItemGenerator"


    // $ANTLR start "entryRuleConveyor"
    // InternalStl.g:179:1: entryRuleConveyor : ruleConveyor EOF ;
    public final void entryRuleConveyor() throws RecognitionException {
        try {
            // InternalStl.g:180:1: ( ruleConveyor EOF )
            // InternalStl.g:181:1: ruleConveyor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConveyor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConveyor"


    // $ANTLR start "ruleConveyor"
    // InternalStl.g:188:1: ruleConveyor : ( ( rule__Conveyor__Group__0 ) ) ;
    public final void ruleConveyor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:192:2: ( ( ( rule__Conveyor__Group__0 ) ) )
            // InternalStl.g:193:2: ( ( rule__Conveyor__Group__0 ) )
            {
            // InternalStl.g:193:2: ( ( rule__Conveyor__Group__0 ) )
            // InternalStl.g:194:3: ( rule__Conveyor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getGroup()); 
            }
            // InternalStl.g:195:3: ( rule__Conveyor__Group__0 )
            // InternalStl.g:195:4: rule__Conveyor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getGroup()); 
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
    // $ANTLR end "ruleConveyor"


    // $ANTLR start "entryRuleTurnTable"
    // InternalStl.g:204:1: entryRuleTurnTable : ruleTurnTable EOF ;
    public final void entryRuleTurnTable() throws RecognitionException {
        try {
            // InternalStl.g:205:1: ( ruleTurnTable EOF )
            // InternalStl.g:206:1: ruleTurnTable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTurnTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTurnTable"


    // $ANTLR start "ruleTurnTable"
    // InternalStl.g:213:1: ruleTurnTable : ( ( rule__TurnTable__Group__0 ) ) ;
    public final void ruleTurnTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:217:2: ( ( ( rule__TurnTable__Group__0 ) ) )
            // InternalStl.g:218:2: ( ( rule__TurnTable__Group__0 ) )
            {
            // InternalStl.g:218:2: ( ( rule__TurnTable__Group__0 ) )
            // InternalStl.g:219:3: ( rule__TurnTable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getGroup()); 
            }
            // InternalStl.g:220:3: ( rule__TurnTable__Group__0 )
            // InternalStl.g:220:4: rule__TurnTable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getGroup()); 
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
    // $ANTLR end "ruleTurnTable"


    // $ANTLR start "entryRuleMachine"
    // InternalStl.g:229:1: entryRuleMachine : ruleMachine EOF ;
    public final void entryRuleMachine() throws RecognitionException {
        try {
            // InternalStl.g:230:1: ( ruleMachine EOF )
            // InternalStl.g:231:1: ruleMachine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMachine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalStl.g:238:1: ruleMachine : ( ( rule__Machine__Group__0 ) ) ;
    public final void ruleMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:242:2: ( ( ( rule__Machine__Group__0 ) ) )
            // InternalStl.g:243:2: ( ( rule__Machine__Group__0 ) )
            {
            // InternalStl.g:243:2: ( ( rule__Machine__Group__0 ) )
            // InternalStl.g:244:3: ( rule__Machine__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup()); 
            }
            // InternalStl.g:245:3: ( rule__Machine__Group__0 )
            // InternalStl.g:245:4: rule__Machine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup()); 
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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleBuffer"
    // InternalStl.g:254:1: entryRuleBuffer : ruleBuffer EOF ;
    public final void entryRuleBuffer() throws RecognitionException {
        try {
            // InternalStl.g:255:1: ( ruleBuffer EOF )
            // InternalStl.g:256:1: ruleBuffer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBuffer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBuffer"


    // $ANTLR start "ruleBuffer"
    // InternalStl.g:263:1: ruleBuffer : ( ( rule__Buffer__Group__0 ) ) ;
    public final void ruleBuffer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:267:2: ( ( ( rule__Buffer__Group__0 ) ) )
            // InternalStl.g:268:2: ( ( rule__Buffer__Group__0 ) )
            {
            // InternalStl.g:268:2: ( ( rule__Buffer__Group__0 ) )
            // InternalStl.g:269:3: ( rule__Buffer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getGroup()); 
            }
            // InternalStl.g:270:3: ( rule__Buffer__Group__0 )
            // InternalStl.g:270:4: rule__Buffer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getGroup()); 
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
    // $ANTLR end "ruleBuffer"


    // $ANTLR start "entryRuleStore"
    // InternalStl.g:279:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalStl.g:280:1: ( ruleStore EOF )
            // InternalStl.g:281:1: ruleStore EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStore();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStoreRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalStl.g:288:1: ruleStore : ( ( rule__Store__Alternatives ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:292:2: ( ( ( rule__Store__Alternatives ) ) )
            // InternalStl.g:293:2: ( ( rule__Store__Alternatives ) )
            {
            // InternalStl.g:293:2: ( ( rule__Store__Alternatives ) )
            // InternalStl.g:294:3: ( rule__Store__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStoreAccess().getAlternatives()); 
            }
            // InternalStl.g:295:3: ( rule__Store__Alternatives )
            // InternalStl.g:295:4: rule__Store__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Store__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStoreAccess().getAlternatives()); 
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
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleProductStore"
    // InternalStl.g:304:1: entryRuleProductStore : ruleProductStore EOF ;
    public final void entryRuleProductStore() throws RecognitionException {
        try {
            // InternalStl.g:305:1: ( ruleProductStore EOF )
            // InternalStl.g:306:1: ruleProductStore EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProductStore();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProductStore"


    // $ANTLR start "ruleProductStore"
    // InternalStl.g:313:1: ruleProductStore : ( ( rule__ProductStore__Group__0 ) ) ;
    public final void ruleProductStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:317:2: ( ( ( rule__ProductStore__Group__0 ) ) )
            // InternalStl.g:318:2: ( ( rule__ProductStore__Group__0 ) )
            {
            // InternalStl.g:318:2: ( ( rule__ProductStore__Group__0 ) )
            // InternalStl.g:319:3: ( rule__ProductStore__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getGroup()); 
            }
            // InternalStl.g:320:3: ( rule__ProductStore__Group__0 )
            // InternalStl.g:320:4: rule__ProductStore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getGroup()); 
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
    // $ANTLR end "ruleProductStore"


    // $ANTLR start "entryRuleWasteStore"
    // InternalStl.g:329:1: entryRuleWasteStore : ruleWasteStore EOF ;
    public final void entryRuleWasteStore() throws RecognitionException {
        try {
            // InternalStl.g:330:1: ( ruleWasteStore EOF )
            // InternalStl.g:331:1: ruleWasteStore EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWasteStore();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWasteStore"


    // $ANTLR start "ruleWasteStore"
    // InternalStl.g:338:1: ruleWasteStore : ( ( rule__WasteStore__Group__0 ) ) ;
    public final void ruleWasteStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:342:2: ( ( ( rule__WasteStore__Group__0 ) ) )
            // InternalStl.g:343:2: ( ( rule__WasteStore__Group__0 ) )
            {
            // InternalStl.g:343:2: ( ( rule__WasteStore__Group__0 ) )
            // InternalStl.g:344:3: ( rule__WasteStore__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getGroup()); 
            }
            // InternalStl.g:345:3: ( rule__WasteStore__Group__0 )
            // InternalStl.g:345:4: rule__WasteStore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getGroup()); 
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
    // $ANTLR end "ruleWasteStore"


    // $ANTLR start "entryRuleConnector"
    // InternalStl.g:354:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalStl.g:355:1: ( ruleConnector EOF )
            // InternalStl.g:356:1: ruleConnector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConnector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalStl.g:363:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:367:2: ( ( ( rule__Connector__Group__0 ) ) )
            // InternalStl.g:368:2: ( ( rule__Connector__Group__0 ) )
            {
            // InternalStl.g:368:2: ( ( rule__Connector__Group__0 ) )
            // InternalStl.g:369:3: ( rule__Connector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getGroup()); 
            }
            // InternalStl.g:370:3: ( rule__Connector__Group__0 )
            // InternalStl.g:370:4: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getGroup()); 
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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleSlot"
    // InternalStl.g:379:1: entryRuleSlot : ruleSlot EOF ;
    public final void entryRuleSlot() throws RecognitionException {
        try {
            // InternalStl.g:380:1: ( ruleSlot EOF )
            // InternalStl.g:381:1: ruleSlot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSlot"


    // $ANTLR start "ruleSlot"
    // InternalStl.g:388:1: ruleSlot : ( ( rule__Slot__Group__0 ) ) ;
    public final void ruleSlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:392:2: ( ( ( rule__Slot__Group__0 ) ) )
            // InternalStl.g:393:2: ( ( rule__Slot__Group__0 ) )
            {
            // InternalStl.g:393:2: ( ( rule__Slot__Group__0 ) )
            // InternalStl.g:394:3: ( rule__Slot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getGroup()); 
            }
            // InternalStl.g:395:3: ( rule__Slot__Group__0 )
            // InternalStl.g:395:4: rule__Slot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Slot__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getGroup()); 
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
    // $ANTLR end "ruleSlot"


    // $ANTLR start "entryRuleService"
    // InternalStl.g:404:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalStl.g:405:1: ( ruleService EOF )
            // InternalStl.g:406:1: ruleService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalStl.g:413:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:417:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalStl.g:418:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalStl.g:418:2: ( ( rule__Service__Group__0 ) )
            // InternalStl.g:419:3: ( rule__Service__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup()); 
            }
            // InternalStl.g:420:3: ( rule__Service__Group__0 )
            // InternalStl.g:420:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getGroup()); 
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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleParameter"
    // InternalStl.g:429:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalStl.g:430:1: ( ruleParameter EOF )
            // InternalStl.g:431:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalStl.g:438:1: ruleParameter : ( ( rule__Parameter__NameAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:442:2: ( ( ( rule__Parameter__NameAssignment ) ) )
            // InternalStl.g:443:2: ( ( rule__Parameter__NameAssignment ) )
            {
            // InternalStl.g:443:2: ( ( rule__Parameter__NameAssignment ) )
            // InternalStl.g:444:3: ( rule__Parameter__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment()); 
            }
            // InternalStl.g:445:3: ( rule__Parameter__NameAssignment )
            // InternalStl.g:445:4: rule__Parameter__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment()); 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalStl.g:454:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalStl.g:455:1: ( ruleQualifiedName EOF )
            // InternalStl.g:456:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalStl.g:463:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:467:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalStl.g:468:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalStl.g:468:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalStl.g:469:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalStl.g:470:3: ( rule__QualifiedName__Group__0 )
            // InternalStl.g:470:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEDouble"
    // InternalStl.g:479:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalStl.g:480:1: ( ruleEDouble EOF )
            // InternalStl.g:481:1: ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalStl.g:488:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:492:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalStl.g:493:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalStl.g:493:2: ( ( rule__EDouble__Group__0 ) )
            // InternalStl.g:494:3: ( rule__EDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getGroup()); 
            }
            // InternalStl.g:495:3: ( rule__EDouble__Group__0 )
            // InternalStl.g:495:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getGroup()); 
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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // InternalStl.g:504:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalStl.g:505:1: ( ruleEString EOF )
            // InternalStl.g:506:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalStl.g:513:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:517:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalStl.g:518:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalStl.g:518:2: ( ( rule__EString__Alternatives ) )
            // InternalStl.g:519:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalStl.g:520:3: ( rule__EString__Alternatives )
            // InternalStl.g:520:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Component__Alternatives"
    // InternalStl.g:528:1: rule__Component__Alternatives : ( ( ruleStore ) | ( ruleItemGenerator ) | ( ruleConveyor ) | ( ruleTurnTable ) | ( ruleMachine ) | ( ruleBuffer ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:532:1: ( ( ruleStore ) | ( ruleItemGenerator ) | ( ruleConveyor ) | ( ruleTurnTable ) | ( ruleMachine ) | ( ruleBuffer ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 29:
            case 31:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=4;
                }
                break;
            case 27:
                {
                alt1=5;
                }
                break;
            case 28:
                {
                alt1=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalStl.g:533:2: ( ruleStore )
                    {
                    // InternalStl.g:533:2: ( ruleStore )
                    // InternalStl.g:534:3: ruleStore
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getStoreParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStore();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getStoreParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStl.g:539:2: ( ruleItemGenerator )
                    {
                    // InternalStl.g:539:2: ( ruleItemGenerator )
                    // InternalStl.g:540:3: ruleItemGenerator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getItemGeneratorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleItemGenerator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getItemGeneratorParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalStl.g:545:2: ( ruleConveyor )
                    {
                    // InternalStl.g:545:2: ( ruleConveyor )
                    // InternalStl.g:546:3: ruleConveyor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getConveyorParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConveyor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getConveyorParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalStl.g:551:2: ( ruleTurnTable )
                    {
                    // InternalStl.g:551:2: ( ruleTurnTable )
                    // InternalStl.g:552:3: ruleTurnTable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getTurnTableParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTurnTable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getTurnTableParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalStl.g:557:2: ( ruleMachine )
                    {
                    // InternalStl.g:557:2: ( ruleMachine )
                    // InternalStl.g:558:3: ruleMachine
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getMachineParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMachine();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getMachineParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalStl.g:563:2: ( ruleBuffer )
                    {
                    // InternalStl.g:563:2: ( ruleBuffer )
                    // InternalStl.g:564:3: ruleBuffer
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentAccess().getBufferParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBuffer();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentAccess().getBufferParserRuleCall_5()); 
                    }

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
    // $ANTLR end "rule__Component__Alternatives"


    // $ANTLR start "rule__Store__Alternatives"
    // InternalStl.g:573:1: rule__Store__Alternatives : ( ( ruleProductStore ) | ( ruleWasteStore ) );
    public final void rule__Store__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:577:1: ( ( ruleProductStore ) | ( ruleWasteStore ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==31) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalStl.g:578:2: ( ruleProductStore )
                    {
                    // InternalStl.g:578:2: ( ruleProductStore )
                    // InternalStl.g:579:3: ruleProductStore
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStoreAccess().getProductStoreParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleProductStore();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStoreAccess().getProductStoreParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStl.g:584:2: ( ruleWasteStore )
                    {
                    // InternalStl.g:584:2: ( ruleWasteStore )
                    // InternalStl.g:585:3: ruleWasteStore
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStoreAccess().getWasteStoreParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWasteStore();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStoreAccess().getWasteStoreParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Store__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalStl.g:594:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:598:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalStl.g:599:2: ( 'E' )
                    {
                    // InternalStl.g:599:2: ( 'E' )
                    // InternalStl.g:600:3: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStl.g:605:2: ( 'e' )
                    {
                    // InternalStl.g:605:2: ( 'e' )
                    // InternalStl.g:606:3: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    }

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalStl.g:615:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:619:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalStl.g:620:2: ( RULE_STRING )
                    {
                    // InternalStl.g:620:2: ( RULE_STRING )
                    // InternalStl.g:621:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStl.g:626:2: ( RULE_ID )
                    {
                    // InternalStl.g:626:2: ( RULE_ID )
                    // InternalStl.g:627:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__System__Group__0"
    // InternalStl.g:636:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:640:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalStl.g:641:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__System__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalStl.g:648:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:652:1: ( ( 'system' ) )
            // InternalStl.g:653:1: ( 'system' )
            {
            // InternalStl.g:653:1: ( 'system' )
            // InternalStl.g:654:2: 'system'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
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
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalStl.g:663:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:667:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalStl.g:668:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalStl.g:675:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:679:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // InternalStl.g:680:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // InternalStl.g:680:1: ( ( rule__System__NameAssignment_1 ) )
            // InternalStl.g:681:2: ( rule__System__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:682:2: ( rule__System__NameAssignment_1 )
            // InternalStl.g:682:3: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__System__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalStl.g:690:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:694:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalStl.g:695:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalStl.g:702:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:706:1: ( ( '{' ) )
            // InternalStl.g:707:1: ( '{' )
            {
            // InternalStl.g:707:1: ( '{' )
            // InternalStl.g:708:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalStl.g:717:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:721:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalStl.g:722:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalStl.g:729:1: rule__System__Group__3__Impl : ( ( rule__System__ItemTypesAssignment_3 )* ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:733:1: ( ( ( rule__System__ItemTypesAssignment_3 )* ) )
            // InternalStl.g:734:1: ( ( rule__System__ItemTypesAssignment_3 )* )
            {
            // InternalStl.g:734:1: ( ( rule__System__ItemTypesAssignment_3 )* )
            // InternalStl.g:735:2: ( rule__System__ItemTypesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getItemTypesAssignment_3()); 
            }
            // InternalStl.g:736:2: ( rule__System__ItemTypesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStl.g:736:3: rule__System__ItemTypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__System__ItemTypesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getItemTypesAssignment_3()); 
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
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // InternalStl.g:744:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:748:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalStl.g:749:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__System__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // InternalStl.g:756:1: rule__System__Group__4__Impl : ( ( rule__System__AreasAssignment_4 )* ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:760:1: ( ( ( rule__System__AreasAssignment_4 )* ) )
            // InternalStl.g:761:1: ( ( rule__System__AreasAssignment_4 )* )
            {
            // InternalStl.g:761:1: ( ( rule__System__AreasAssignment_4 )* )
            // InternalStl.g:762:2: ( rule__System__AreasAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getAreasAssignment_4()); 
            }
            // InternalStl.g:763:2: ( rule__System__AreasAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStl.g:763:3: rule__System__AreasAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__System__AreasAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getAreasAssignment_4()); 
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
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // InternalStl.g:771:1: rule__System__Group__5 : rule__System__Group__5__Impl ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:775:1: ( rule__System__Group__5__Impl )
            // InternalStl.g:776:2: rule__System__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // InternalStl.g:782:1: rule__System__Group__5__Impl : ( '}' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:786:1: ( ( '}' ) )
            // InternalStl.g:787:1: ( '}' )
            {
            // InternalStl.g:787:1: ( '}' )
            // InternalStl.g:788:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__Area__Group__0"
    // InternalStl.g:798:1: rule__Area__Group__0 : rule__Area__Group__0__Impl rule__Area__Group__1 ;
    public final void rule__Area__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:802:1: ( rule__Area__Group__0__Impl rule__Area__Group__1 )
            // InternalStl.g:803:2: rule__Area__Group__0__Impl rule__Area__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Area__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Area__Group__0"


    // $ANTLR start "rule__Area__Group__0__Impl"
    // InternalStl.g:810:1: rule__Area__Group__0__Impl : ( 'area' ) ;
    public final void rule__Area__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:814:1: ( ( 'area' ) )
            // InternalStl.g:815:1: ( 'area' )
            {
            // InternalStl.g:815:1: ( 'area' )
            // InternalStl.g:816:2: 'area'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getAreaKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getAreaKeyword_0()); 
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
    // $ANTLR end "rule__Area__Group__0__Impl"


    // $ANTLR start "rule__Area__Group__1"
    // InternalStl.g:825:1: rule__Area__Group__1 : rule__Area__Group__1__Impl rule__Area__Group__2 ;
    public final void rule__Area__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:829:1: ( rule__Area__Group__1__Impl rule__Area__Group__2 )
            // InternalStl.g:830:2: rule__Area__Group__1__Impl rule__Area__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Area__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Area__Group__1"


    // $ANTLR start "rule__Area__Group__1__Impl"
    // InternalStl.g:837:1: rule__Area__Group__1__Impl : ( ( rule__Area__NameAssignment_1 ) ) ;
    public final void rule__Area__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:841:1: ( ( ( rule__Area__NameAssignment_1 ) ) )
            // InternalStl.g:842:1: ( ( rule__Area__NameAssignment_1 ) )
            {
            // InternalStl.g:842:1: ( ( rule__Area__NameAssignment_1 ) )
            // InternalStl.g:843:2: ( rule__Area__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:844:2: ( rule__Area__NameAssignment_1 )
            // InternalStl.g:844:3: rule__Area__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Area__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Area__Group__1__Impl"


    // $ANTLR start "rule__Area__Group__2"
    // InternalStl.g:852:1: rule__Area__Group__2 : rule__Area__Group__2__Impl rule__Area__Group__3 ;
    public final void rule__Area__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:856:1: ( rule__Area__Group__2__Impl rule__Area__Group__3 )
            // InternalStl.g:857:2: rule__Area__Group__2__Impl rule__Area__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Area__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Area__Group__2"


    // $ANTLR start "rule__Area__Group__2__Impl"
    // InternalStl.g:864:1: rule__Area__Group__2__Impl : ( '{' ) ;
    public final void rule__Area__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:868:1: ( ( '{' ) )
            // InternalStl.g:869:1: ( '{' )
            {
            // InternalStl.g:869:1: ( '{' )
            // InternalStl.g:870:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Area__Group__2__Impl"


    // $ANTLR start "rule__Area__Group__3"
    // InternalStl.g:879:1: rule__Area__Group__3 : rule__Area__Group__3__Impl rule__Area__Group__4 ;
    public final void rule__Area__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:883:1: ( rule__Area__Group__3__Impl rule__Area__Group__4 )
            // InternalStl.g:884:2: rule__Area__Group__3__Impl rule__Area__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Area__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Area__Group__3"


    // $ANTLR start "rule__Area__Group__3__Impl"
    // InternalStl.g:891:1: rule__Area__Group__3__Impl : ( ( rule__Area__ComponentsAssignment_3 )* ) ;
    public final void rule__Area__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:895:1: ( ( ( rule__Area__ComponentsAssignment_3 )* ) )
            // InternalStl.g:896:1: ( ( rule__Area__ComponentsAssignment_3 )* )
            {
            // InternalStl.g:896:1: ( ( rule__Area__ComponentsAssignment_3 )* )
            // InternalStl.g:897:2: ( rule__Area__ComponentsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getComponentsAssignment_3()); 
            }
            // InternalStl.g:898:2: ( rule__Area__ComponentsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19||LA7_0==24||(LA7_0>=26 && LA7_0<=29)||LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStl.g:898:3: rule__Area__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Area__ComponentsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getComponentsAssignment_3()); 
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
    // $ANTLR end "rule__Area__Group__3__Impl"


    // $ANTLR start "rule__Area__Group__4"
    // InternalStl.g:906:1: rule__Area__Group__4 : rule__Area__Group__4__Impl rule__Area__Group__5 ;
    public final void rule__Area__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:910:1: ( rule__Area__Group__4__Impl rule__Area__Group__5 )
            // InternalStl.g:911:2: rule__Area__Group__4__Impl rule__Area__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Area__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Area__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Area__Group__4"


    // $ANTLR start "rule__Area__Group__4__Impl"
    // InternalStl.g:918:1: rule__Area__Group__4__Impl : ( ( rule__Area__ConnectorsAssignment_4 )* ) ;
    public final void rule__Area__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:922:1: ( ( ( rule__Area__ConnectorsAssignment_4 )* ) )
            // InternalStl.g:923:1: ( ( rule__Area__ConnectorsAssignment_4 )* )
            {
            // InternalStl.g:923:1: ( ( rule__Area__ConnectorsAssignment_4 )* )
            // InternalStl.g:924:2: ( rule__Area__ConnectorsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getConnectorsAssignment_4()); 
            }
            // InternalStl.g:925:2: ( rule__Area__ConnectorsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalStl.g:925:3: rule__Area__ConnectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Area__ConnectorsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getConnectorsAssignment_4()); 
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
    // $ANTLR end "rule__Area__Group__4__Impl"


    // $ANTLR start "rule__Area__Group__5"
    // InternalStl.g:933:1: rule__Area__Group__5 : rule__Area__Group__5__Impl ;
    public final void rule__Area__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:937:1: ( rule__Area__Group__5__Impl )
            // InternalStl.g:938:2: rule__Area__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Area__Group__5"


    // $ANTLR start "rule__Area__Group__5__Impl"
    // InternalStl.g:944:1: rule__Area__Group__5__Impl : ( '}' ) ;
    public final void rule__Area__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:948:1: ( ( '}' ) )
            // InternalStl.g:949:1: ( '}' )
            {
            // InternalStl.g:949:1: ( '}' )
            // InternalStl.g:950:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Area__Group__5__Impl"


    // $ANTLR start "rule__ItemType__Group__0"
    // InternalStl.g:960:1: rule__ItemType__Group__0 : rule__ItemType__Group__0__Impl rule__ItemType__Group__1 ;
    public final void rule__ItemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:964:1: ( rule__ItemType__Group__0__Impl rule__ItemType__Group__1 )
            // InternalStl.g:965:2: rule__ItemType__Group__0__Impl rule__ItemType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ItemType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemType__Group__0"


    // $ANTLR start "rule__ItemType__Group__0__Impl"
    // InternalStl.g:972:1: rule__ItemType__Group__0__Impl : ( 'item' ) ;
    public final void rule__ItemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:976:1: ( ( 'item' ) )
            // InternalStl.g:977:1: ( 'item' )
            {
            // InternalStl.g:977:1: ( 'item' )
            // InternalStl.g:978:2: 'item'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getItemKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getItemKeyword_0()); 
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
    // $ANTLR end "rule__ItemType__Group__0__Impl"


    // $ANTLR start "rule__ItemType__Group__1"
    // InternalStl.g:987:1: rule__ItemType__Group__1 : rule__ItemType__Group__1__Impl rule__ItemType__Group__2 ;
    public final void rule__ItemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:991:1: ( rule__ItemType__Group__1__Impl rule__ItemType__Group__2 )
            // InternalStl.g:992:2: rule__ItemType__Group__1__Impl rule__ItemType__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ItemType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemType__Group__1"


    // $ANTLR start "rule__ItemType__Group__1__Impl"
    // InternalStl.g:999:1: rule__ItemType__Group__1__Impl : ( ( rule__ItemType__NameAssignment_1 ) ) ;
    public final void rule__ItemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1003:1: ( ( ( rule__ItemType__NameAssignment_1 ) ) )
            // InternalStl.g:1004:1: ( ( rule__ItemType__NameAssignment_1 ) )
            {
            // InternalStl.g:1004:1: ( ( rule__ItemType__NameAssignment_1 ) )
            // InternalStl.g:1005:2: ( rule__ItemType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:1006:2: ( rule__ItemType__NameAssignment_1 )
            // InternalStl.g:1006:3: rule__ItemType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ItemType__Group__1__Impl"


    // $ANTLR start "rule__ItemType__Group__2"
    // InternalStl.g:1014:1: rule__ItemType__Group__2 : rule__ItemType__Group__2__Impl rule__ItemType__Group__3 ;
    public final void rule__ItemType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1018:1: ( rule__ItemType__Group__2__Impl rule__ItemType__Group__3 )
            // InternalStl.g:1019:2: rule__ItemType__Group__2__Impl rule__ItemType__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ItemType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemType__Group__2"


    // $ANTLR start "rule__ItemType__Group__2__Impl"
    // InternalStl.g:1026:1: rule__ItemType__Group__2__Impl : ( '=' ) ;
    public final void rule__ItemType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1030:1: ( ( '=' ) )
            // InternalStl.g:1031:1: ( '=' )
            {
            // InternalStl.g:1031:1: ( '=' )
            // InternalStl.g:1032:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getEqualsSignKeyword_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__ItemType__Group__2__Impl"


    // $ANTLR start "rule__ItemType__Group__3"
    // InternalStl.g:1041:1: rule__ItemType__Group__3 : rule__ItemType__Group__3__Impl ;
    public final void rule__ItemType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1045:1: ( rule__ItemType__Group__3__Impl )
            // InternalStl.g:1046:2: rule__ItemType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemType__Group__3"


    // $ANTLR start "rule__ItemType__Group__3__Impl"
    // InternalStl.g:1052:1: rule__ItemType__Group__3__Impl : ( ruleEString ) ;
    public final void rule__ItemType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1056:1: ( ( ruleEString ) )
            // InternalStl.g:1057:1: ( ruleEString )
            {
            // InternalStl.g:1057:1: ( ruleEString )
            // InternalStl.g:1058:2: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getEStringParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getEStringParserRuleCall_3()); 
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
    // $ANTLR end "rule__ItemType__Group__3__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__0"
    // InternalStl.g:1068:1: rule__ItemGenerator__Group__0 : rule__ItemGenerator__Group__0__Impl rule__ItemGenerator__Group__1 ;
    public final void rule__ItemGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1072:1: ( rule__ItemGenerator__Group__0__Impl rule__ItemGenerator__Group__1 )
            // InternalStl.g:1073:2: rule__ItemGenerator__Group__0__Impl rule__ItemGenerator__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ItemGenerator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemGenerator__Group__0"


    // $ANTLR start "rule__ItemGenerator__Group__0__Impl"
    // InternalStl.g:1080:1: rule__ItemGenerator__Group__0__Impl : ( 'generator' ) ;
    public final void rule__ItemGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1084:1: ( ( 'generator' ) )
            // InternalStl.g:1085:1: ( 'generator' )
            {
            // InternalStl.g:1085:1: ( 'generator' )
            // InternalStl.g:1086:2: 'generator'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratorKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratorKeyword_0()); 
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
    // $ANTLR end "rule__ItemGenerator__Group__0__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__1"
    // InternalStl.g:1095:1: rule__ItemGenerator__Group__1 : rule__ItemGenerator__Group__1__Impl rule__ItemGenerator__Group__2 ;
    public final void rule__ItemGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1099:1: ( rule__ItemGenerator__Group__1__Impl rule__ItemGenerator__Group__2 )
            // InternalStl.g:1100:2: rule__ItemGenerator__Group__1__Impl rule__ItemGenerator__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ItemGenerator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemGenerator__Group__1"


    // $ANTLR start "rule__ItemGenerator__Group__1__Impl"
    // InternalStl.g:1107:1: rule__ItemGenerator__Group__1__Impl : ( ( rule__ItemGenerator__NameAssignment_1 ) ) ;
    public final void rule__ItemGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1111:1: ( ( ( rule__ItemGenerator__NameAssignment_1 ) ) )
            // InternalStl.g:1112:1: ( ( rule__ItemGenerator__NameAssignment_1 ) )
            {
            // InternalStl.g:1112:1: ( ( rule__ItemGenerator__NameAssignment_1 ) )
            // InternalStl.g:1113:2: ( rule__ItemGenerator__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:1114:2: ( rule__ItemGenerator__NameAssignment_1 )
            // InternalStl.g:1114:3: rule__ItemGenerator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ItemGenerator__Group__1__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__2"
    // InternalStl.g:1122:1: rule__ItemGenerator__Group__2 : rule__ItemGenerator__Group__2__Impl rule__ItemGenerator__Group__3 ;
    public final void rule__ItemGenerator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1126:1: ( rule__ItemGenerator__Group__2__Impl rule__ItemGenerator__Group__3 )
            // InternalStl.g:1127:2: rule__ItemGenerator__Group__2__Impl rule__ItemGenerator__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ItemGenerator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemGenerator__Group__2"


    // $ANTLR start "rule__ItemGenerator__Group__2__Impl"
    // InternalStl.g:1134:1: rule__ItemGenerator__Group__2__Impl : ( 'generates' ) ;
    public final void rule__ItemGenerator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1138:1: ( ( 'generates' ) )
            // InternalStl.g:1139:1: ( 'generates' )
            {
            // InternalStl.g:1139:1: ( 'generates' )
            // InternalStl.g:1140:2: 'generates'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratesKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratesKeyword_2()); 
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
    // $ANTLR end "rule__ItemGenerator__Group__2__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__3"
    // InternalStl.g:1149:1: rule__ItemGenerator__Group__3 : rule__ItemGenerator__Group__3__Impl rule__ItemGenerator__Group__4 ;
    public final void rule__ItemGenerator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1153:1: ( rule__ItemGenerator__Group__3__Impl rule__ItemGenerator__Group__4 )
            // InternalStl.g:1154:2: rule__ItemGenerator__Group__3__Impl rule__ItemGenerator__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ItemGenerator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemGenerator__Group__3"


    // $ANTLR start "rule__ItemGenerator__Group__3__Impl"
    // InternalStl.g:1161:1: rule__ItemGenerator__Group__3__Impl : ( ( rule__ItemGenerator__GeneratedTypeAssignment_3 ) ) ;
    public final void rule__ItemGenerator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1165:1: ( ( ( rule__ItemGenerator__GeneratedTypeAssignment_3 ) ) )
            // InternalStl.g:1166:1: ( ( rule__ItemGenerator__GeneratedTypeAssignment_3 ) )
            {
            // InternalStl.g:1166:1: ( ( rule__ItemGenerator__GeneratedTypeAssignment_3 ) )
            // InternalStl.g:1167:2: ( rule__ItemGenerator__GeneratedTypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratedTypeAssignment_3()); 
            }
            // InternalStl.g:1168:2: ( rule__ItemGenerator__GeneratedTypeAssignment_3 )
            // InternalStl.g:1168:3: rule__ItemGenerator__GeneratedTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__GeneratedTypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratedTypeAssignment_3()); 
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
    // $ANTLR end "rule__ItemGenerator__Group__3__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__4"
    // InternalStl.g:1176:1: rule__ItemGenerator__Group__4 : rule__ItemGenerator__Group__4__Impl rule__ItemGenerator__Group__5 ;
    public final void rule__ItemGenerator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1180:1: ( rule__ItemGenerator__Group__4__Impl rule__ItemGenerator__Group__5 )
            // InternalStl.g:1181:2: rule__ItemGenerator__Group__4__Impl rule__ItemGenerator__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ItemGenerator__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemGenerator__Group__4"


    // $ANTLR start "rule__ItemGenerator__Group__4__Impl"
    // InternalStl.g:1188:1: rule__ItemGenerator__Group__4__Impl : ( '(cost=' ) ;
    public final void rule__ItemGenerator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1192:1: ( ( '(cost=' ) )
            // InternalStl.g:1193:1: ( '(cost=' )
            {
            // InternalStl.g:1193:1: ( '(cost=' )
            // InternalStl.g:1194:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getCostKeyword_4()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getCostKeyword_4()); 
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
    // $ANTLR end "rule__ItemGenerator__Group__4__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__5"
    // InternalStl.g:1203:1: rule__ItemGenerator__Group__5 : rule__ItemGenerator__Group__5__Impl rule__ItemGenerator__Group__6 ;
    public final void rule__ItemGenerator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1207:1: ( rule__ItemGenerator__Group__5__Impl rule__ItemGenerator__Group__6 )
            // InternalStl.g:1208:2: rule__ItemGenerator__Group__5__Impl rule__ItemGenerator__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ItemGenerator__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemGenerator__Group__5"


    // $ANTLR start "rule__ItemGenerator__Group__5__Impl"
    // InternalStl.g:1215:1: rule__ItemGenerator__Group__5__Impl : ( ( rule__ItemGenerator__CostAssignment_5 ) ) ;
    public final void rule__ItemGenerator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1219:1: ( ( ( rule__ItemGenerator__CostAssignment_5 ) ) )
            // InternalStl.g:1220:1: ( ( rule__ItemGenerator__CostAssignment_5 ) )
            {
            // InternalStl.g:1220:1: ( ( rule__ItemGenerator__CostAssignment_5 ) )
            // InternalStl.g:1221:2: ( rule__ItemGenerator__CostAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getCostAssignment_5()); 
            }
            // InternalStl.g:1222:2: ( rule__ItemGenerator__CostAssignment_5 )
            // InternalStl.g:1222:3: rule__ItemGenerator__CostAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__CostAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getCostAssignment_5()); 
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
    // $ANTLR end "rule__ItemGenerator__Group__5__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__6"
    // InternalStl.g:1230:1: rule__ItemGenerator__Group__6 : rule__ItemGenerator__Group__6__Impl rule__ItemGenerator__Group__7 ;
    public final void rule__ItemGenerator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1234:1: ( rule__ItemGenerator__Group__6__Impl rule__ItemGenerator__Group__7 )
            // InternalStl.g:1235:2: rule__ItemGenerator__Group__6__Impl rule__ItemGenerator__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__ItemGenerator__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemGenerator__Group__6"


    // $ANTLR start "rule__ItemGenerator__Group__6__Impl"
    // InternalStl.g:1242:1: rule__ItemGenerator__Group__6__Impl : ( ')' ) ;
    public final void rule__ItemGenerator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1246:1: ( ( ')' ) )
            // InternalStl.g:1247:1: ( ')' )
            {
            // InternalStl.g:1247:1: ( ')' )
            // InternalStl.g:1248:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getRightParenthesisKeyword_6()); 
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
    // $ANTLR end "rule__ItemGenerator__Group__6__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__7"
    // InternalStl.g:1257:1: rule__ItemGenerator__Group__7 : rule__ItemGenerator__Group__7__Impl rule__ItemGenerator__Group__8 ;
    public final void rule__ItemGenerator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1261:1: ( rule__ItemGenerator__Group__7__Impl rule__ItemGenerator__Group__8 )
            // InternalStl.g:1262:2: rule__ItemGenerator__Group__7__Impl rule__ItemGenerator__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__ItemGenerator__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemGenerator__Group__7"


    // $ANTLR start "rule__ItemGenerator__Group__7__Impl"
    // InternalStl.g:1269:1: rule__ItemGenerator__Group__7__Impl : ( '{' ) ;
    public final void rule__ItemGenerator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1273:1: ( ( '{' ) )
            // InternalStl.g:1274:1: ( '{' )
            {
            // InternalStl.g:1274:1: ( '{' )
            // InternalStl.g:1275:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getLeftCurlyBracketKeyword_7()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getLeftCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__ItemGenerator__Group__7__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__8"
    // InternalStl.g:1284:1: rule__ItemGenerator__Group__8 : rule__ItemGenerator__Group__8__Impl rule__ItemGenerator__Group__9 ;
    public final void rule__ItemGenerator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1288:1: ( rule__ItemGenerator__Group__8__Impl rule__ItemGenerator__Group__9 )
            // InternalStl.g:1289:2: rule__ItemGenerator__Group__8__Impl rule__ItemGenerator__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__ItemGenerator__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemGenerator__Group__8"


    // $ANTLR start "rule__ItemGenerator__Group__8__Impl"
    // InternalStl.g:1296:1: rule__ItemGenerator__Group__8__Impl : ( 'output' ) ;
    public final void rule__ItemGenerator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1300:1: ( ( 'output' ) )
            // InternalStl.g:1301:1: ( 'output' )
            {
            // InternalStl.g:1301:1: ( 'output' )
            // InternalStl.g:1302:2: 'output'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getOutputKeyword_8()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getOutputKeyword_8()); 
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
    // $ANTLR end "rule__ItemGenerator__Group__8__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__9"
    // InternalStl.g:1311:1: rule__ItemGenerator__Group__9 : rule__ItemGenerator__Group__9__Impl rule__ItemGenerator__Group__10 ;
    public final void rule__ItemGenerator__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1315:1: ( rule__ItemGenerator__Group__9__Impl rule__ItemGenerator__Group__10 )
            // InternalStl.g:1316:2: rule__ItemGenerator__Group__9__Impl rule__ItemGenerator__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__ItemGenerator__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__10();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemGenerator__Group__9"


    // $ANTLR start "rule__ItemGenerator__Group__9__Impl"
    // InternalStl.g:1323:1: rule__ItemGenerator__Group__9__Impl : ( ( rule__ItemGenerator__OutputSlotsAssignment_9 ) ) ;
    public final void rule__ItemGenerator__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1327:1: ( ( ( rule__ItemGenerator__OutputSlotsAssignment_9 ) ) )
            // InternalStl.g:1328:1: ( ( rule__ItemGenerator__OutputSlotsAssignment_9 ) )
            {
            // InternalStl.g:1328:1: ( ( rule__ItemGenerator__OutputSlotsAssignment_9 ) )
            // InternalStl.g:1329:2: ( rule__ItemGenerator__OutputSlotsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getOutputSlotsAssignment_9()); 
            }
            // InternalStl.g:1330:2: ( rule__ItemGenerator__OutputSlotsAssignment_9 )
            // InternalStl.g:1330:3: rule__ItemGenerator__OutputSlotsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__OutputSlotsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getOutputSlotsAssignment_9()); 
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
    // $ANTLR end "rule__ItemGenerator__Group__9__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__10"
    // InternalStl.g:1338:1: rule__ItemGenerator__Group__10 : rule__ItemGenerator__Group__10__Impl rule__ItemGenerator__Group__11 ;
    public final void rule__ItemGenerator__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1342:1: ( rule__ItemGenerator__Group__10__Impl rule__ItemGenerator__Group__11 )
            // InternalStl.g:1343:2: rule__ItemGenerator__Group__10__Impl rule__ItemGenerator__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__ItemGenerator__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__11();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemGenerator__Group__10"


    // $ANTLR start "rule__ItemGenerator__Group__10__Impl"
    // InternalStl.g:1350:1: rule__ItemGenerator__Group__10__Impl : ( ( rule__ItemGenerator__ServicesAssignment_10 )* ) ;
    public final void rule__ItemGenerator__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1354:1: ( ( ( rule__ItemGenerator__ServicesAssignment_10 )* ) )
            // InternalStl.g:1355:1: ( ( rule__ItemGenerator__ServicesAssignment_10 )* )
            {
            // InternalStl.g:1355:1: ( ( rule__ItemGenerator__ServicesAssignment_10 )* )
            // InternalStl.g:1356:2: ( rule__ItemGenerator__ServicesAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getServicesAssignment_10()); 
            }
            // InternalStl.g:1357:2: ( rule__ItemGenerator__ServicesAssignment_10 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalStl.g:1357:3: rule__ItemGenerator__ServicesAssignment_10
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ItemGenerator__ServicesAssignment_10();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getServicesAssignment_10()); 
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
    // $ANTLR end "rule__ItemGenerator__Group__10__Impl"


    // $ANTLR start "rule__ItemGenerator__Group__11"
    // InternalStl.g:1365:1: rule__ItemGenerator__Group__11 : rule__ItemGenerator__Group__11__Impl ;
    public final void rule__ItemGenerator__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1369:1: ( rule__ItemGenerator__Group__11__Impl )
            // InternalStl.g:1370:2: rule__ItemGenerator__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemGenerator__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ItemGenerator__Group__11"


    // $ANTLR start "rule__ItemGenerator__Group__11__Impl"
    // InternalStl.g:1376:1: rule__ItemGenerator__Group__11__Impl : ( '}' ) ;
    public final void rule__ItemGenerator__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1380:1: ( ( '}' ) )
            // InternalStl.g:1381:1: ( '}' )
            {
            // InternalStl.g:1381:1: ( '}' )
            // InternalStl.g:1382:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getRightCurlyBracketKeyword_11()); 
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
    // $ANTLR end "rule__ItemGenerator__Group__11__Impl"


    // $ANTLR start "rule__Conveyor__Group__0"
    // InternalStl.g:1392:1: rule__Conveyor__Group__0 : rule__Conveyor__Group__0__Impl rule__Conveyor__Group__1 ;
    public final void rule__Conveyor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1396:1: ( rule__Conveyor__Group__0__Impl rule__Conveyor__Group__1 )
            // InternalStl.g:1397:2: rule__Conveyor__Group__0__Impl rule__Conveyor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Conveyor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conveyor__Group__0"


    // $ANTLR start "rule__Conveyor__Group__0__Impl"
    // InternalStl.g:1404:1: rule__Conveyor__Group__0__Impl : ( 'conveyor' ) ;
    public final void rule__Conveyor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1408:1: ( ( 'conveyor' ) )
            // InternalStl.g:1409:1: ( 'conveyor' )
            {
            // InternalStl.g:1409:1: ( 'conveyor' )
            // InternalStl.g:1410:2: 'conveyor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getConveyorKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getConveyorKeyword_0()); 
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
    // $ANTLR end "rule__Conveyor__Group__0__Impl"


    // $ANTLR start "rule__Conveyor__Group__1"
    // InternalStl.g:1419:1: rule__Conveyor__Group__1 : rule__Conveyor__Group__1__Impl rule__Conveyor__Group__2 ;
    public final void rule__Conveyor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1423:1: ( rule__Conveyor__Group__1__Impl rule__Conveyor__Group__2 )
            // InternalStl.g:1424:2: rule__Conveyor__Group__1__Impl rule__Conveyor__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Conveyor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conveyor__Group__1"


    // $ANTLR start "rule__Conveyor__Group__1__Impl"
    // InternalStl.g:1431:1: rule__Conveyor__Group__1__Impl : ( ( rule__Conveyor__NameAssignment_1 ) ) ;
    public final void rule__Conveyor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1435:1: ( ( ( rule__Conveyor__NameAssignment_1 ) ) )
            // InternalStl.g:1436:1: ( ( rule__Conveyor__NameAssignment_1 ) )
            {
            // InternalStl.g:1436:1: ( ( rule__Conveyor__NameAssignment_1 ) )
            // InternalStl.g:1437:2: ( rule__Conveyor__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:1438:2: ( rule__Conveyor__NameAssignment_1 )
            // InternalStl.g:1438:3: rule__Conveyor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Conveyor__Group__1__Impl"


    // $ANTLR start "rule__Conveyor__Group__2"
    // InternalStl.g:1446:1: rule__Conveyor__Group__2 : rule__Conveyor__Group__2__Impl rule__Conveyor__Group__3 ;
    public final void rule__Conveyor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1450:1: ( rule__Conveyor__Group__2__Impl rule__Conveyor__Group__3 )
            // InternalStl.g:1451:2: rule__Conveyor__Group__2__Impl rule__Conveyor__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Conveyor__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conveyor__Group__2"


    // $ANTLR start "rule__Conveyor__Group__2__Impl"
    // InternalStl.g:1458:1: rule__Conveyor__Group__2__Impl : ( '(cost=' ) ;
    public final void rule__Conveyor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1462:1: ( ( '(cost=' ) )
            // InternalStl.g:1463:1: ( '(cost=' )
            {
            // InternalStl.g:1463:1: ( '(cost=' )
            // InternalStl.g:1464:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getCostKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getCostKeyword_2()); 
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
    // $ANTLR end "rule__Conveyor__Group__2__Impl"


    // $ANTLR start "rule__Conveyor__Group__3"
    // InternalStl.g:1473:1: rule__Conveyor__Group__3 : rule__Conveyor__Group__3__Impl rule__Conveyor__Group__4 ;
    public final void rule__Conveyor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1477:1: ( rule__Conveyor__Group__3__Impl rule__Conveyor__Group__4 )
            // InternalStl.g:1478:2: rule__Conveyor__Group__3__Impl rule__Conveyor__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Conveyor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conveyor__Group__3"


    // $ANTLR start "rule__Conveyor__Group__3__Impl"
    // InternalStl.g:1485:1: rule__Conveyor__Group__3__Impl : ( ( rule__Conveyor__CostAssignment_3 ) ) ;
    public final void rule__Conveyor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1489:1: ( ( ( rule__Conveyor__CostAssignment_3 ) ) )
            // InternalStl.g:1490:1: ( ( rule__Conveyor__CostAssignment_3 ) )
            {
            // InternalStl.g:1490:1: ( ( rule__Conveyor__CostAssignment_3 ) )
            // InternalStl.g:1491:2: ( rule__Conveyor__CostAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getCostAssignment_3()); 
            }
            // InternalStl.g:1492:2: ( rule__Conveyor__CostAssignment_3 )
            // InternalStl.g:1492:3: rule__Conveyor__CostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__CostAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getCostAssignment_3()); 
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
    // $ANTLR end "rule__Conveyor__Group__3__Impl"


    // $ANTLR start "rule__Conveyor__Group__4"
    // InternalStl.g:1500:1: rule__Conveyor__Group__4 : rule__Conveyor__Group__4__Impl rule__Conveyor__Group__5 ;
    public final void rule__Conveyor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1504:1: ( rule__Conveyor__Group__4__Impl rule__Conveyor__Group__5 )
            // InternalStl.g:1505:2: rule__Conveyor__Group__4__Impl rule__Conveyor__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Conveyor__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conveyor__Group__4"


    // $ANTLR start "rule__Conveyor__Group__4__Impl"
    // InternalStl.g:1512:1: rule__Conveyor__Group__4__Impl : ( ')' ) ;
    public final void rule__Conveyor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1516:1: ( ( ')' ) )
            // InternalStl.g:1517:1: ( ')' )
            {
            // InternalStl.g:1517:1: ( ')' )
            // InternalStl.g:1518:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Conveyor__Group__4__Impl"


    // $ANTLR start "rule__Conveyor__Group__5"
    // InternalStl.g:1527:1: rule__Conveyor__Group__5 : rule__Conveyor__Group__5__Impl rule__Conveyor__Group__6 ;
    public final void rule__Conveyor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1531:1: ( rule__Conveyor__Group__5__Impl rule__Conveyor__Group__6 )
            // InternalStl.g:1532:2: rule__Conveyor__Group__5__Impl rule__Conveyor__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Conveyor__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conveyor__Group__5"


    // $ANTLR start "rule__Conveyor__Group__5__Impl"
    // InternalStl.g:1539:1: rule__Conveyor__Group__5__Impl : ( '{' ) ;
    public final void rule__Conveyor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1543:1: ( ( '{' ) )
            // InternalStl.g:1544:1: ( '{' )
            {
            // InternalStl.g:1544:1: ( '{' )
            // InternalStl.g:1545:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getLeftCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Conveyor__Group__5__Impl"


    // $ANTLR start "rule__Conveyor__Group__6"
    // InternalStl.g:1554:1: rule__Conveyor__Group__6 : rule__Conveyor__Group__6__Impl rule__Conveyor__Group__7 ;
    public final void rule__Conveyor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1558:1: ( rule__Conveyor__Group__6__Impl rule__Conveyor__Group__7 )
            // InternalStl.g:1559:2: rule__Conveyor__Group__6__Impl rule__Conveyor__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Conveyor__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conveyor__Group__6"


    // $ANTLR start "rule__Conveyor__Group__6__Impl"
    // InternalStl.g:1566:1: rule__Conveyor__Group__6__Impl : ( 'input' ) ;
    public final void rule__Conveyor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1570:1: ( ( 'input' ) )
            // InternalStl.g:1571:1: ( 'input' )
            {
            // InternalStl.g:1571:1: ( 'input' )
            // InternalStl.g:1572:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getInputKeyword_6()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getInputKeyword_6()); 
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
    // $ANTLR end "rule__Conveyor__Group__6__Impl"


    // $ANTLR start "rule__Conveyor__Group__7"
    // InternalStl.g:1581:1: rule__Conveyor__Group__7 : rule__Conveyor__Group__7__Impl rule__Conveyor__Group__8 ;
    public final void rule__Conveyor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1585:1: ( rule__Conveyor__Group__7__Impl rule__Conveyor__Group__8 )
            // InternalStl.g:1586:2: rule__Conveyor__Group__7__Impl rule__Conveyor__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Conveyor__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conveyor__Group__7"


    // $ANTLR start "rule__Conveyor__Group__7__Impl"
    // InternalStl.g:1593:1: rule__Conveyor__Group__7__Impl : ( ( rule__Conveyor__InputSlotsAssignment_7 ) ) ;
    public final void rule__Conveyor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1597:1: ( ( ( rule__Conveyor__InputSlotsAssignment_7 ) ) )
            // InternalStl.g:1598:1: ( ( rule__Conveyor__InputSlotsAssignment_7 ) )
            {
            // InternalStl.g:1598:1: ( ( rule__Conveyor__InputSlotsAssignment_7 ) )
            // InternalStl.g:1599:2: ( rule__Conveyor__InputSlotsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getInputSlotsAssignment_7()); 
            }
            // InternalStl.g:1600:2: ( rule__Conveyor__InputSlotsAssignment_7 )
            // InternalStl.g:1600:3: rule__Conveyor__InputSlotsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__InputSlotsAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getInputSlotsAssignment_7()); 
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
    // $ANTLR end "rule__Conveyor__Group__7__Impl"


    // $ANTLR start "rule__Conveyor__Group__8"
    // InternalStl.g:1608:1: rule__Conveyor__Group__8 : rule__Conveyor__Group__8__Impl rule__Conveyor__Group__9 ;
    public final void rule__Conveyor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1612:1: ( rule__Conveyor__Group__8__Impl rule__Conveyor__Group__9 )
            // InternalStl.g:1613:2: rule__Conveyor__Group__8__Impl rule__Conveyor__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Conveyor__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conveyor__Group__8"


    // $ANTLR start "rule__Conveyor__Group__8__Impl"
    // InternalStl.g:1620:1: rule__Conveyor__Group__8__Impl : ( 'output' ) ;
    public final void rule__Conveyor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1624:1: ( ( 'output' ) )
            // InternalStl.g:1625:1: ( 'output' )
            {
            // InternalStl.g:1625:1: ( 'output' )
            // InternalStl.g:1626:2: 'output'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getOutputKeyword_8()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getOutputKeyword_8()); 
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
    // $ANTLR end "rule__Conveyor__Group__8__Impl"


    // $ANTLR start "rule__Conveyor__Group__9"
    // InternalStl.g:1635:1: rule__Conveyor__Group__9 : rule__Conveyor__Group__9__Impl rule__Conveyor__Group__10 ;
    public final void rule__Conveyor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1639:1: ( rule__Conveyor__Group__9__Impl rule__Conveyor__Group__10 )
            // InternalStl.g:1640:2: rule__Conveyor__Group__9__Impl rule__Conveyor__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Conveyor__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__10();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conveyor__Group__9"


    // $ANTLR start "rule__Conveyor__Group__9__Impl"
    // InternalStl.g:1647:1: rule__Conveyor__Group__9__Impl : ( ( rule__Conveyor__OutputSlotsAssignment_9 ) ) ;
    public final void rule__Conveyor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1651:1: ( ( ( rule__Conveyor__OutputSlotsAssignment_9 ) ) )
            // InternalStl.g:1652:1: ( ( rule__Conveyor__OutputSlotsAssignment_9 ) )
            {
            // InternalStl.g:1652:1: ( ( rule__Conveyor__OutputSlotsAssignment_9 ) )
            // InternalStl.g:1653:2: ( rule__Conveyor__OutputSlotsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getOutputSlotsAssignment_9()); 
            }
            // InternalStl.g:1654:2: ( rule__Conveyor__OutputSlotsAssignment_9 )
            // InternalStl.g:1654:3: rule__Conveyor__OutputSlotsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__OutputSlotsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getOutputSlotsAssignment_9()); 
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
    // $ANTLR end "rule__Conveyor__Group__9__Impl"


    // $ANTLR start "rule__Conveyor__Group__10"
    // InternalStl.g:1662:1: rule__Conveyor__Group__10 : rule__Conveyor__Group__10__Impl rule__Conveyor__Group__11 ;
    public final void rule__Conveyor__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1666:1: ( rule__Conveyor__Group__10__Impl rule__Conveyor__Group__11 )
            // InternalStl.g:1667:2: rule__Conveyor__Group__10__Impl rule__Conveyor__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__Conveyor__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__11();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conveyor__Group__10"


    // $ANTLR start "rule__Conveyor__Group__10__Impl"
    // InternalStl.g:1674:1: rule__Conveyor__Group__10__Impl : ( ( rule__Conveyor__ServicesAssignment_10 )* ) ;
    public final void rule__Conveyor__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1678:1: ( ( ( rule__Conveyor__ServicesAssignment_10 )* ) )
            // InternalStl.g:1679:1: ( ( rule__Conveyor__ServicesAssignment_10 )* )
            {
            // InternalStl.g:1679:1: ( ( rule__Conveyor__ServicesAssignment_10 )* )
            // InternalStl.g:1680:2: ( rule__Conveyor__ServicesAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getServicesAssignment_10()); 
            }
            // InternalStl.g:1681:2: ( rule__Conveyor__ServicesAssignment_10 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalStl.g:1681:3: rule__Conveyor__ServicesAssignment_10
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Conveyor__ServicesAssignment_10();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getServicesAssignment_10()); 
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
    // $ANTLR end "rule__Conveyor__Group__10__Impl"


    // $ANTLR start "rule__Conveyor__Group__11"
    // InternalStl.g:1689:1: rule__Conveyor__Group__11 : rule__Conveyor__Group__11__Impl ;
    public final void rule__Conveyor__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1693:1: ( rule__Conveyor__Group__11__Impl )
            // InternalStl.g:1694:2: rule__Conveyor__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conveyor__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conveyor__Group__11"


    // $ANTLR start "rule__Conveyor__Group__11__Impl"
    // InternalStl.g:1700:1: rule__Conveyor__Group__11__Impl : ( '}' ) ;
    public final void rule__Conveyor__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1704:1: ( ( '}' ) )
            // InternalStl.g:1705:1: ( '}' )
            {
            // InternalStl.g:1705:1: ( '}' )
            // InternalStl.g:1706:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getRightCurlyBracketKeyword_11()); 
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
    // $ANTLR end "rule__Conveyor__Group__11__Impl"


    // $ANTLR start "rule__TurnTable__Group__0"
    // InternalStl.g:1716:1: rule__TurnTable__Group__0 : rule__TurnTable__Group__0__Impl rule__TurnTable__Group__1 ;
    public final void rule__TurnTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1720:1: ( rule__TurnTable__Group__0__Impl rule__TurnTable__Group__1 )
            // InternalStl.g:1721:2: rule__TurnTable__Group__0__Impl rule__TurnTable__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TurnTable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TurnTable__Group__0"


    // $ANTLR start "rule__TurnTable__Group__0__Impl"
    // InternalStl.g:1728:1: rule__TurnTable__Group__0__Impl : ( 'turntable' ) ;
    public final void rule__TurnTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1732:1: ( ( 'turntable' ) )
            // InternalStl.g:1733:1: ( 'turntable' )
            {
            // InternalStl.g:1733:1: ( 'turntable' )
            // InternalStl.g:1734:2: 'turntable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getTurntableKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getTurntableKeyword_0()); 
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
    // $ANTLR end "rule__TurnTable__Group__0__Impl"


    // $ANTLR start "rule__TurnTable__Group__1"
    // InternalStl.g:1743:1: rule__TurnTable__Group__1 : rule__TurnTable__Group__1__Impl rule__TurnTable__Group__2 ;
    public final void rule__TurnTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1747:1: ( rule__TurnTable__Group__1__Impl rule__TurnTable__Group__2 )
            // InternalStl.g:1748:2: rule__TurnTable__Group__1__Impl rule__TurnTable__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TurnTable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TurnTable__Group__1"


    // $ANTLR start "rule__TurnTable__Group__1__Impl"
    // InternalStl.g:1755:1: rule__TurnTable__Group__1__Impl : ( ( rule__TurnTable__NameAssignment_1 ) ) ;
    public final void rule__TurnTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1759:1: ( ( ( rule__TurnTable__NameAssignment_1 ) ) )
            // InternalStl.g:1760:1: ( ( rule__TurnTable__NameAssignment_1 ) )
            {
            // InternalStl.g:1760:1: ( ( rule__TurnTable__NameAssignment_1 ) )
            // InternalStl.g:1761:2: ( rule__TurnTable__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:1762:2: ( rule__TurnTable__NameAssignment_1 )
            // InternalStl.g:1762:3: rule__TurnTable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__TurnTable__Group__1__Impl"


    // $ANTLR start "rule__TurnTable__Group__2"
    // InternalStl.g:1770:1: rule__TurnTable__Group__2 : rule__TurnTable__Group__2__Impl rule__TurnTable__Group__3 ;
    public final void rule__TurnTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1774:1: ( rule__TurnTable__Group__2__Impl rule__TurnTable__Group__3 )
            // InternalStl.g:1775:2: rule__TurnTable__Group__2__Impl rule__TurnTable__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__TurnTable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TurnTable__Group__2"


    // $ANTLR start "rule__TurnTable__Group__2__Impl"
    // InternalStl.g:1782:1: rule__TurnTable__Group__2__Impl : ( '(cost=' ) ;
    public final void rule__TurnTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1786:1: ( ( '(cost=' ) )
            // InternalStl.g:1787:1: ( '(cost=' )
            {
            // InternalStl.g:1787:1: ( '(cost=' )
            // InternalStl.g:1788:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getCostKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getCostKeyword_2()); 
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
    // $ANTLR end "rule__TurnTable__Group__2__Impl"


    // $ANTLR start "rule__TurnTable__Group__3"
    // InternalStl.g:1797:1: rule__TurnTable__Group__3 : rule__TurnTable__Group__3__Impl rule__TurnTable__Group__4 ;
    public final void rule__TurnTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1801:1: ( rule__TurnTable__Group__3__Impl rule__TurnTable__Group__4 )
            // InternalStl.g:1802:2: rule__TurnTable__Group__3__Impl rule__TurnTable__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__TurnTable__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TurnTable__Group__3"


    // $ANTLR start "rule__TurnTable__Group__3__Impl"
    // InternalStl.g:1809:1: rule__TurnTable__Group__3__Impl : ( ( rule__TurnTable__CostAssignment_3 ) ) ;
    public final void rule__TurnTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1813:1: ( ( ( rule__TurnTable__CostAssignment_3 ) ) )
            // InternalStl.g:1814:1: ( ( rule__TurnTable__CostAssignment_3 ) )
            {
            // InternalStl.g:1814:1: ( ( rule__TurnTable__CostAssignment_3 ) )
            // InternalStl.g:1815:2: ( rule__TurnTable__CostAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getCostAssignment_3()); 
            }
            // InternalStl.g:1816:2: ( rule__TurnTable__CostAssignment_3 )
            // InternalStl.g:1816:3: rule__TurnTable__CostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__CostAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getCostAssignment_3()); 
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
    // $ANTLR end "rule__TurnTable__Group__3__Impl"


    // $ANTLR start "rule__TurnTable__Group__4"
    // InternalStl.g:1824:1: rule__TurnTable__Group__4 : rule__TurnTable__Group__4__Impl rule__TurnTable__Group__5 ;
    public final void rule__TurnTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1828:1: ( rule__TurnTable__Group__4__Impl rule__TurnTable__Group__5 )
            // InternalStl.g:1829:2: rule__TurnTable__Group__4__Impl rule__TurnTable__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__TurnTable__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TurnTable__Group__4"


    // $ANTLR start "rule__TurnTable__Group__4__Impl"
    // InternalStl.g:1836:1: rule__TurnTable__Group__4__Impl : ( ')' ) ;
    public final void rule__TurnTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1840:1: ( ( ')' ) )
            // InternalStl.g:1841:1: ( ')' )
            {
            // InternalStl.g:1841:1: ( ')' )
            // InternalStl.g:1842:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__TurnTable__Group__4__Impl"


    // $ANTLR start "rule__TurnTable__Group__5"
    // InternalStl.g:1851:1: rule__TurnTable__Group__5 : rule__TurnTable__Group__5__Impl rule__TurnTable__Group__6 ;
    public final void rule__TurnTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1855:1: ( rule__TurnTable__Group__5__Impl rule__TurnTable__Group__6 )
            // InternalStl.g:1856:2: rule__TurnTable__Group__5__Impl rule__TurnTable__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__TurnTable__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TurnTable__Group__5"


    // $ANTLR start "rule__TurnTable__Group__5__Impl"
    // InternalStl.g:1863:1: rule__TurnTable__Group__5__Impl : ( '{' ) ;
    public final void rule__TurnTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1867:1: ( ( '{' ) )
            // InternalStl.g:1868:1: ( '{' )
            {
            // InternalStl.g:1868:1: ( '{' )
            // InternalStl.g:1869:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getLeftCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__TurnTable__Group__5__Impl"


    // $ANTLR start "rule__TurnTable__Group__6"
    // InternalStl.g:1878:1: rule__TurnTable__Group__6 : rule__TurnTable__Group__6__Impl rule__TurnTable__Group__7 ;
    public final void rule__TurnTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1882:1: ( rule__TurnTable__Group__6__Impl rule__TurnTable__Group__7 )
            // InternalStl.g:1883:2: rule__TurnTable__Group__6__Impl rule__TurnTable__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__TurnTable__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TurnTable__Group__6"


    // $ANTLR start "rule__TurnTable__Group__6__Impl"
    // InternalStl.g:1890:1: rule__TurnTable__Group__6__Impl : ( ( ( rule__TurnTable__Group_6__0 ) ) ( ( rule__TurnTable__Group_6__0 )* ) ) ;
    public final void rule__TurnTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1894:1: ( ( ( ( rule__TurnTable__Group_6__0 ) ) ( ( rule__TurnTable__Group_6__0 )* ) ) )
            // InternalStl.g:1895:1: ( ( ( rule__TurnTable__Group_6__0 ) ) ( ( rule__TurnTable__Group_6__0 )* ) )
            {
            // InternalStl.g:1895:1: ( ( ( rule__TurnTable__Group_6__0 ) ) ( ( rule__TurnTable__Group_6__0 )* ) )
            // InternalStl.g:1896:2: ( ( rule__TurnTable__Group_6__0 ) ) ( ( rule__TurnTable__Group_6__0 )* )
            {
            // InternalStl.g:1896:2: ( ( rule__TurnTable__Group_6__0 ) )
            // InternalStl.g:1897:3: ( rule__TurnTable__Group_6__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getGroup_6()); 
            }
            // InternalStl.g:1898:3: ( rule__TurnTable__Group_6__0 )
            // InternalStl.g:1898:4: rule__TurnTable__Group_6__0
            {
            pushFollow(FOLLOW_21);
            rule__TurnTable__Group_6__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getGroup_6()); 
            }

            }

            // InternalStl.g:1901:2: ( ( rule__TurnTable__Group_6__0 )* )
            // InternalStl.g:1902:3: ( rule__TurnTable__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getGroup_6()); 
            }
            // InternalStl.g:1903:3: ( rule__TurnTable__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalStl.g:1903:4: rule__TurnTable__Group_6__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__TurnTable__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getGroup_6()); 
            }

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
    // $ANTLR end "rule__TurnTable__Group__6__Impl"


    // $ANTLR start "rule__TurnTable__Group__7"
    // InternalStl.g:1912:1: rule__TurnTable__Group__7 : rule__TurnTable__Group__7__Impl rule__TurnTable__Group__8 ;
    public final void rule__TurnTable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1916:1: ( rule__TurnTable__Group__7__Impl rule__TurnTable__Group__8 )
            // InternalStl.g:1917:2: rule__TurnTable__Group__7__Impl rule__TurnTable__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__TurnTable__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TurnTable__Group__7"


    // $ANTLR start "rule__TurnTable__Group__7__Impl"
    // InternalStl.g:1924:1: rule__TurnTable__Group__7__Impl : ( ( ( rule__TurnTable__Group_7__0 ) ) ( ( rule__TurnTable__Group_7__0 )* ) ) ;
    public final void rule__TurnTable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1928:1: ( ( ( ( rule__TurnTable__Group_7__0 ) ) ( ( rule__TurnTable__Group_7__0 )* ) ) )
            // InternalStl.g:1929:1: ( ( ( rule__TurnTable__Group_7__0 ) ) ( ( rule__TurnTable__Group_7__0 )* ) )
            {
            // InternalStl.g:1929:1: ( ( ( rule__TurnTable__Group_7__0 ) ) ( ( rule__TurnTable__Group_7__0 )* ) )
            // InternalStl.g:1930:2: ( ( rule__TurnTable__Group_7__0 ) ) ( ( rule__TurnTable__Group_7__0 )* )
            {
            // InternalStl.g:1930:2: ( ( rule__TurnTable__Group_7__0 ) )
            // InternalStl.g:1931:3: ( rule__TurnTable__Group_7__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getGroup_7()); 
            }
            // InternalStl.g:1932:3: ( rule__TurnTable__Group_7__0 )
            // InternalStl.g:1932:4: rule__TurnTable__Group_7__0
            {
            pushFollow(FOLLOW_22);
            rule__TurnTable__Group_7__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getGroup_7()); 
            }

            }

            // InternalStl.g:1935:2: ( ( rule__TurnTable__Group_7__0 )* )
            // InternalStl.g:1936:3: ( rule__TurnTable__Group_7__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getGroup_7()); 
            }
            // InternalStl.g:1937:3: ( rule__TurnTable__Group_7__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalStl.g:1937:4: rule__TurnTable__Group_7__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__TurnTable__Group_7__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getGroup_7()); 
            }

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
    // $ANTLR end "rule__TurnTable__Group__7__Impl"


    // $ANTLR start "rule__TurnTable__Group__8"
    // InternalStl.g:1946:1: rule__TurnTable__Group__8 : rule__TurnTable__Group__8__Impl rule__TurnTable__Group__9 ;
    public final void rule__TurnTable__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1950:1: ( rule__TurnTable__Group__8__Impl rule__TurnTable__Group__9 )
            // InternalStl.g:1951:2: rule__TurnTable__Group__8__Impl rule__TurnTable__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__TurnTable__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TurnTable__Group__8"


    // $ANTLR start "rule__TurnTable__Group__8__Impl"
    // InternalStl.g:1958:1: rule__TurnTable__Group__8__Impl : ( ( rule__TurnTable__ServicesAssignment_8 )* ) ;
    public final void rule__TurnTable__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1962:1: ( ( ( rule__TurnTable__ServicesAssignment_8 )* ) )
            // InternalStl.g:1963:1: ( ( rule__TurnTable__ServicesAssignment_8 )* )
            {
            // InternalStl.g:1963:1: ( ( rule__TurnTable__ServicesAssignment_8 )* )
            // InternalStl.g:1964:2: ( rule__TurnTable__ServicesAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getServicesAssignment_8()); 
            }
            // InternalStl.g:1965:2: ( rule__TurnTable__ServicesAssignment_8 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalStl.g:1965:3: rule__TurnTable__ServicesAssignment_8
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__TurnTable__ServicesAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getServicesAssignment_8()); 
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
    // $ANTLR end "rule__TurnTable__Group__8__Impl"


    // $ANTLR start "rule__TurnTable__Group__9"
    // InternalStl.g:1973:1: rule__TurnTable__Group__9 : rule__TurnTable__Group__9__Impl ;
    public final void rule__TurnTable__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1977:1: ( rule__TurnTable__Group__9__Impl )
            // InternalStl.g:1978:2: rule__TurnTable__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TurnTable__Group__9"


    // $ANTLR start "rule__TurnTable__Group__9__Impl"
    // InternalStl.g:1984:1: rule__TurnTable__Group__9__Impl : ( '}' ) ;
    public final void rule__TurnTable__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:1988:1: ( ( '}' ) )
            // InternalStl.g:1989:1: ( '}' )
            {
            // InternalStl.g:1989:1: ( '}' )
            // InternalStl.g:1990:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getRightCurlyBracketKeyword_9()); 
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
    // $ANTLR end "rule__TurnTable__Group__9__Impl"


    // $ANTLR start "rule__TurnTable__Group_6__0"
    // InternalStl.g:2000:1: rule__TurnTable__Group_6__0 : rule__TurnTable__Group_6__0__Impl rule__TurnTable__Group_6__1 ;
    public final void rule__TurnTable__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2004:1: ( rule__TurnTable__Group_6__0__Impl rule__TurnTable__Group_6__1 )
            // InternalStl.g:2005:2: rule__TurnTable__Group_6__0__Impl rule__TurnTable__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__TurnTable__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TurnTable__Group_6__0"


    // $ANTLR start "rule__TurnTable__Group_6__0__Impl"
    // InternalStl.g:2012:1: rule__TurnTable__Group_6__0__Impl : ( 'input' ) ;
    public final void rule__TurnTable__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2016:1: ( ( 'input' ) )
            // InternalStl.g:2017:1: ( 'input' )
            {
            // InternalStl.g:2017:1: ( 'input' )
            // InternalStl.g:2018:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getInputKeyword_6_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getInputKeyword_6_0()); 
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
    // $ANTLR end "rule__TurnTable__Group_6__0__Impl"


    // $ANTLR start "rule__TurnTable__Group_6__1"
    // InternalStl.g:2027:1: rule__TurnTable__Group_6__1 : rule__TurnTable__Group_6__1__Impl ;
    public final void rule__TurnTable__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2031:1: ( rule__TurnTable__Group_6__1__Impl )
            // InternalStl.g:2032:2: rule__TurnTable__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TurnTable__Group_6__1"


    // $ANTLR start "rule__TurnTable__Group_6__1__Impl"
    // InternalStl.g:2038:1: rule__TurnTable__Group_6__1__Impl : ( ( rule__TurnTable__InputSlotsAssignment_6_1 ) ) ;
    public final void rule__TurnTable__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2042:1: ( ( ( rule__TurnTable__InputSlotsAssignment_6_1 ) ) )
            // InternalStl.g:2043:1: ( ( rule__TurnTable__InputSlotsAssignment_6_1 ) )
            {
            // InternalStl.g:2043:1: ( ( rule__TurnTable__InputSlotsAssignment_6_1 ) )
            // InternalStl.g:2044:2: ( rule__TurnTable__InputSlotsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getInputSlotsAssignment_6_1()); 
            }
            // InternalStl.g:2045:2: ( rule__TurnTable__InputSlotsAssignment_6_1 )
            // InternalStl.g:2045:3: rule__TurnTable__InputSlotsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__InputSlotsAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getInputSlotsAssignment_6_1()); 
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
    // $ANTLR end "rule__TurnTable__Group_6__1__Impl"


    // $ANTLR start "rule__TurnTable__Group_7__0"
    // InternalStl.g:2054:1: rule__TurnTable__Group_7__0 : rule__TurnTable__Group_7__0__Impl rule__TurnTable__Group_7__1 ;
    public final void rule__TurnTable__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2058:1: ( rule__TurnTable__Group_7__0__Impl rule__TurnTable__Group_7__1 )
            // InternalStl.g:2059:2: rule__TurnTable__Group_7__0__Impl rule__TurnTable__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__TurnTable__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TurnTable__Group_7__0"


    // $ANTLR start "rule__TurnTable__Group_7__0__Impl"
    // InternalStl.g:2066:1: rule__TurnTable__Group_7__0__Impl : ( 'output' ) ;
    public final void rule__TurnTable__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2070:1: ( ( 'output' ) )
            // InternalStl.g:2071:1: ( 'output' )
            {
            // InternalStl.g:2071:1: ( 'output' )
            // InternalStl.g:2072:2: 'output'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getOutputKeyword_7_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getOutputKeyword_7_0()); 
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
    // $ANTLR end "rule__TurnTable__Group_7__0__Impl"


    // $ANTLR start "rule__TurnTable__Group_7__1"
    // InternalStl.g:2081:1: rule__TurnTable__Group_7__1 : rule__TurnTable__Group_7__1__Impl ;
    public final void rule__TurnTable__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2085:1: ( rule__TurnTable__Group_7__1__Impl )
            // InternalStl.g:2086:2: rule__TurnTable__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__TurnTable__Group_7__1"


    // $ANTLR start "rule__TurnTable__Group_7__1__Impl"
    // InternalStl.g:2092:1: rule__TurnTable__Group_7__1__Impl : ( ( rule__TurnTable__OutputSlotsAssignment_7_1 ) ) ;
    public final void rule__TurnTable__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2096:1: ( ( ( rule__TurnTable__OutputSlotsAssignment_7_1 ) ) )
            // InternalStl.g:2097:1: ( ( rule__TurnTable__OutputSlotsAssignment_7_1 ) )
            {
            // InternalStl.g:2097:1: ( ( rule__TurnTable__OutputSlotsAssignment_7_1 ) )
            // InternalStl.g:2098:2: ( rule__TurnTable__OutputSlotsAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getOutputSlotsAssignment_7_1()); 
            }
            // InternalStl.g:2099:2: ( rule__TurnTable__OutputSlotsAssignment_7_1 )
            // InternalStl.g:2099:3: rule__TurnTable__OutputSlotsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__TurnTable__OutputSlotsAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getOutputSlotsAssignment_7_1()); 
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
    // $ANTLR end "rule__TurnTable__Group_7__1__Impl"


    // $ANTLR start "rule__Machine__Group__0"
    // InternalStl.g:2108:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2112:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalStl.g:2113:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Machine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Machine__Group__0"


    // $ANTLR start "rule__Machine__Group__0__Impl"
    // InternalStl.g:2120:1: rule__Machine__Group__0__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2124:1: ( ( 'machine' ) )
            // InternalStl.g:2125:1: ( 'machine' )
            {
            // InternalStl.g:2125:1: ( 'machine' )
            // InternalStl.g:2126:2: 'machine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getMachineKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getMachineKeyword_0()); 
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
    // $ANTLR end "rule__Machine__Group__0__Impl"


    // $ANTLR start "rule__Machine__Group__1"
    // InternalStl.g:2135:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2139:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalStl.g:2140:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Machine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Machine__Group__1"


    // $ANTLR start "rule__Machine__Group__1__Impl"
    // InternalStl.g:2147:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__NameAssignment_1 ) ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2151:1: ( ( ( rule__Machine__NameAssignment_1 ) ) )
            // InternalStl.g:2152:1: ( ( rule__Machine__NameAssignment_1 ) )
            {
            // InternalStl.g:2152:1: ( ( rule__Machine__NameAssignment_1 ) )
            // InternalStl.g:2153:2: ( rule__Machine__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:2154:2: ( rule__Machine__NameAssignment_1 )
            // InternalStl.g:2154:3: rule__Machine__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Machine__Group__1__Impl"


    // $ANTLR start "rule__Machine__Group__2"
    // InternalStl.g:2162:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2166:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalStl.g:2167:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Machine__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Machine__Group__2"


    // $ANTLR start "rule__Machine__Group__2__Impl"
    // InternalStl.g:2174:1: rule__Machine__Group__2__Impl : ( '(cost=' ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2178:1: ( ( '(cost=' ) )
            // InternalStl.g:2179:1: ( '(cost=' )
            {
            // InternalStl.g:2179:1: ( '(cost=' )
            // InternalStl.g:2180:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getCostKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getCostKeyword_2()); 
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
    // $ANTLR end "rule__Machine__Group__2__Impl"


    // $ANTLR start "rule__Machine__Group__3"
    // InternalStl.g:2189:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2193:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalStl.g:2194:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Machine__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Machine__Group__3"


    // $ANTLR start "rule__Machine__Group__3__Impl"
    // InternalStl.g:2201:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__CostAssignment_3 ) ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2205:1: ( ( ( rule__Machine__CostAssignment_3 ) ) )
            // InternalStl.g:2206:1: ( ( rule__Machine__CostAssignment_3 ) )
            {
            // InternalStl.g:2206:1: ( ( rule__Machine__CostAssignment_3 ) )
            // InternalStl.g:2207:2: ( rule__Machine__CostAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getCostAssignment_3()); 
            }
            // InternalStl.g:2208:2: ( rule__Machine__CostAssignment_3 )
            // InternalStl.g:2208:3: rule__Machine__CostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Machine__CostAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getCostAssignment_3()); 
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
    // $ANTLR end "rule__Machine__Group__3__Impl"


    // $ANTLR start "rule__Machine__Group__4"
    // InternalStl.g:2216:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2220:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // InternalStl.g:2221:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Machine__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Machine__Group__4"


    // $ANTLR start "rule__Machine__Group__4__Impl"
    // InternalStl.g:2228:1: rule__Machine__Group__4__Impl : ( ')' ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2232:1: ( ( ')' ) )
            // InternalStl.g:2233:1: ( ')' )
            {
            // InternalStl.g:2233:1: ( ')' )
            // InternalStl.g:2234:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Machine__Group__4__Impl"


    // $ANTLR start "rule__Machine__Group__5"
    // InternalStl.g:2243:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2247:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // InternalStl.g:2248:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Machine__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Machine__Group__5"


    // $ANTLR start "rule__Machine__Group__5__Impl"
    // InternalStl.g:2255:1: rule__Machine__Group__5__Impl : ( '{' ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2259:1: ( ( '{' ) )
            // InternalStl.g:2260:1: ( '{' )
            {
            // InternalStl.g:2260:1: ( '{' )
            // InternalStl.g:2261:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Machine__Group__5__Impl"


    // $ANTLR start "rule__Machine__Group__6"
    // InternalStl.g:2270:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2274:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // InternalStl.g:2275:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Machine__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Machine__Group__6"


    // $ANTLR start "rule__Machine__Group__6__Impl"
    // InternalStl.g:2282:1: rule__Machine__Group__6__Impl : ( ( ( rule__Machine__Group_6__0 ) ) ( ( rule__Machine__Group_6__0 )* ) ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2286:1: ( ( ( ( rule__Machine__Group_6__0 ) ) ( ( rule__Machine__Group_6__0 )* ) ) )
            // InternalStl.g:2287:1: ( ( ( rule__Machine__Group_6__0 ) ) ( ( rule__Machine__Group_6__0 )* ) )
            {
            // InternalStl.g:2287:1: ( ( ( rule__Machine__Group_6__0 ) ) ( ( rule__Machine__Group_6__0 )* ) )
            // InternalStl.g:2288:2: ( ( rule__Machine__Group_6__0 ) ) ( ( rule__Machine__Group_6__0 )* )
            {
            // InternalStl.g:2288:2: ( ( rule__Machine__Group_6__0 ) )
            // InternalStl.g:2289:3: ( rule__Machine__Group_6__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_6()); 
            }
            // InternalStl.g:2290:3: ( rule__Machine__Group_6__0 )
            // InternalStl.g:2290:4: rule__Machine__Group_6__0
            {
            pushFollow(FOLLOW_21);
            rule__Machine__Group_6__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_6()); 
            }

            }

            // InternalStl.g:2293:2: ( ( rule__Machine__Group_6__0 )* )
            // InternalStl.g:2294:3: ( rule__Machine__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_6()); 
            }
            // InternalStl.g:2295:3: ( rule__Machine__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalStl.g:2295:4: rule__Machine__Group_6__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Machine__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_6()); 
            }

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
    // $ANTLR end "rule__Machine__Group__6__Impl"


    // $ANTLR start "rule__Machine__Group__7"
    // InternalStl.g:2304:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2308:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // InternalStl.g:2309:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Machine__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Machine__Group__7"


    // $ANTLR start "rule__Machine__Group__7__Impl"
    // InternalStl.g:2316:1: rule__Machine__Group__7__Impl : ( ( ( rule__Machine__Group_7__0 ) ) ( ( rule__Machine__Group_7__0 )* ) ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2320:1: ( ( ( ( rule__Machine__Group_7__0 ) ) ( ( rule__Machine__Group_7__0 )* ) ) )
            // InternalStl.g:2321:1: ( ( ( rule__Machine__Group_7__0 ) ) ( ( rule__Machine__Group_7__0 )* ) )
            {
            // InternalStl.g:2321:1: ( ( ( rule__Machine__Group_7__0 ) ) ( ( rule__Machine__Group_7__0 )* ) )
            // InternalStl.g:2322:2: ( ( rule__Machine__Group_7__0 ) ) ( ( rule__Machine__Group_7__0 )* )
            {
            // InternalStl.g:2322:2: ( ( rule__Machine__Group_7__0 ) )
            // InternalStl.g:2323:3: ( rule__Machine__Group_7__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_7()); 
            }
            // InternalStl.g:2324:3: ( rule__Machine__Group_7__0 )
            // InternalStl.g:2324:4: rule__Machine__Group_7__0
            {
            pushFollow(FOLLOW_22);
            rule__Machine__Group_7__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_7()); 
            }

            }

            // InternalStl.g:2327:2: ( ( rule__Machine__Group_7__0 )* )
            // InternalStl.g:2328:3: ( rule__Machine__Group_7__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getGroup_7()); 
            }
            // InternalStl.g:2329:3: ( rule__Machine__Group_7__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalStl.g:2329:4: rule__Machine__Group_7__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Machine__Group_7__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getGroup_7()); 
            }

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
    // $ANTLR end "rule__Machine__Group__7__Impl"


    // $ANTLR start "rule__Machine__Group__8"
    // InternalStl.g:2338:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl rule__Machine__Group__9 ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2342:1: ( rule__Machine__Group__8__Impl rule__Machine__Group__9 )
            // InternalStl.g:2343:2: rule__Machine__Group__8__Impl rule__Machine__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Machine__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Machine__Group__8"


    // $ANTLR start "rule__Machine__Group__8__Impl"
    // InternalStl.g:2350:1: rule__Machine__Group__8__Impl : ( ( rule__Machine__ServicesAssignment_8 )* ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2354:1: ( ( ( rule__Machine__ServicesAssignment_8 )* ) )
            // InternalStl.g:2355:1: ( ( rule__Machine__ServicesAssignment_8 )* )
            {
            // InternalStl.g:2355:1: ( ( rule__Machine__ServicesAssignment_8 )* )
            // InternalStl.g:2356:2: ( rule__Machine__ServicesAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getServicesAssignment_8()); 
            }
            // InternalStl.g:2357:2: ( rule__Machine__ServicesAssignment_8 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalStl.g:2357:3: rule__Machine__ServicesAssignment_8
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Machine__ServicesAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getServicesAssignment_8()); 
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
    // $ANTLR end "rule__Machine__Group__8__Impl"


    // $ANTLR start "rule__Machine__Group__9"
    // InternalStl.g:2365:1: rule__Machine__Group__9 : rule__Machine__Group__9__Impl ;
    public final void rule__Machine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2369:1: ( rule__Machine__Group__9__Impl )
            // InternalStl.g:2370:2: rule__Machine__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Machine__Group__9"


    // $ANTLR start "rule__Machine__Group__9__Impl"
    // InternalStl.g:2376:1: rule__Machine__Group__9__Impl : ( '}' ) ;
    public final void rule__Machine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2380:1: ( ( '}' ) )
            // InternalStl.g:2381:1: ( '}' )
            {
            // InternalStl.g:2381:1: ( '}' )
            // InternalStl.g:2382:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_9()); 
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
    // $ANTLR end "rule__Machine__Group__9__Impl"


    // $ANTLR start "rule__Machine__Group_6__0"
    // InternalStl.g:2392:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2396:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // InternalStl.g:2397:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Machine__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Machine__Group_6__0"


    // $ANTLR start "rule__Machine__Group_6__0__Impl"
    // InternalStl.g:2404:1: rule__Machine__Group_6__0__Impl : ( 'input' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2408:1: ( ( 'input' ) )
            // InternalStl.g:2409:1: ( 'input' )
            {
            // InternalStl.g:2409:1: ( 'input' )
            // InternalStl.g:2410:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInputKeyword_6_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInputKeyword_6_0()); 
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
    // $ANTLR end "rule__Machine__Group_6__0__Impl"


    // $ANTLR start "rule__Machine__Group_6__1"
    // InternalStl.g:2419:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2423:1: ( rule__Machine__Group_6__1__Impl )
            // InternalStl.g:2424:2: rule__Machine__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Machine__Group_6__1"


    // $ANTLR start "rule__Machine__Group_6__1__Impl"
    // InternalStl.g:2430:1: rule__Machine__Group_6__1__Impl : ( ( rule__Machine__InputSlotsAssignment_6_1 ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2434:1: ( ( ( rule__Machine__InputSlotsAssignment_6_1 ) ) )
            // InternalStl.g:2435:1: ( ( rule__Machine__InputSlotsAssignment_6_1 ) )
            {
            // InternalStl.g:2435:1: ( ( rule__Machine__InputSlotsAssignment_6_1 ) )
            // InternalStl.g:2436:2: ( rule__Machine__InputSlotsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInputSlotsAssignment_6_1()); 
            }
            // InternalStl.g:2437:2: ( rule__Machine__InputSlotsAssignment_6_1 )
            // InternalStl.g:2437:3: rule__Machine__InputSlotsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__InputSlotsAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInputSlotsAssignment_6_1()); 
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
    // $ANTLR end "rule__Machine__Group_6__1__Impl"


    // $ANTLR start "rule__Machine__Group_7__0"
    // InternalStl.g:2446:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2450:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // InternalStl.g:2451:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Machine__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Machine__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Machine__Group_7__0"


    // $ANTLR start "rule__Machine__Group_7__0__Impl"
    // InternalStl.g:2458:1: rule__Machine__Group_7__0__Impl : ( 'output' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2462:1: ( ( 'output' ) )
            // InternalStl.g:2463:1: ( 'output' )
            {
            // InternalStl.g:2463:1: ( 'output' )
            // InternalStl.g:2464:2: 'output'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOutputKeyword_7_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOutputKeyword_7_0()); 
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
    // $ANTLR end "rule__Machine__Group_7__0__Impl"


    // $ANTLR start "rule__Machine__Group_7__1"
    // InternalStl.g:2473:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2477:1: ( rule__Machine__Group_7__1__Impl )
            // InternalStl.g:2478:2: rule__Machine__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Machine__Group_7__1"


    // $ANTLR start "rule__Machine__Group_7__1__Impl"
    // InternalStl.g:2484:1: rule__Machine__Group_7__1__Impl : ( ( rule__Machine__OutputSlotsAssignment_7_1 ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2488:1: ( ( ( rule__Machine__OutputSlotsAssignment_7_1 ) ) )
            // InternalStl.g:2489:1: ( ( rule__Machine__OutputSlotsAssignment_7_1 ) )
            {
            // InternalStl.g:2489:1: ( ( rule__Machine__OutputSlotsAssignment_7_1 ) )
            // InternalStl.g:2490:2: ( rule__Machine__OutputSlotsAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOutputSlotsAssignment_7_1()); 
            }
            // InternalStl.g:2491:2: ( rule__Machine__OutputSlotsAssignment_7_1 )
            // InternalStl.g:2491:3: rule__Machine__OutputSlotsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__OutputSlotsAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOutputSlotsAssignment_7_1()); 
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
    // $ANTLR end "rule__Machine__Group_7__1__Impl"


    // $ANTLR start "rule__Buffer__Group__0"
    // InternalStl.g:2500:1: rule__Buffer__Group__0 : rule__Buffer__Group__0__Impl rule__Buffer__Group__1 ;
    public final void rule__Buffer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2504:1: ( rule__Buffer__Group__0__Impl rule__Buffer__Group__1 )
            // InternalStl.g:2505:2: rule__Buffer__Group__0__Impl rule__Buffer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Buffer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Buffer__Group__0"


    // $ANTLR start "rule__Buffer__Group__0__Impl"
    // InternalStl.g:2512:1: rule__Buffer__Group__0__Impl : ( 'buffer' ) ;
    public final void rule__Buffer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2516:1: ( ( 'buffer' ) )
            // InternalStl.g:2517:1: ( 'buffer' )
            {
            // InternalStl.g:2517:1: ( 'buffer' )
            // InternalStl.g:2518:2: 'buffer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getBufferKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getBufferKeyword_0()); 
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
    // $ANTLR end "rule__Buffer__Group__0__Impl"


    // $ANTLR start "rule__Buffer__Group__1"
    // InternalStl.g:2527:1: rule__Buffer__Group__1 : rule__Buffer__Group__1__Impl rule__Buffer__Group__2 ;
    public final void rule__Buffer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2531:1: ( rule__Buffer__Group__1__Impl rule__Buffer__Group__2 )
            // InternalStl.g:2532:2: rule__Buffer__Group__1__Impl rule__Buffer__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Buffer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Buffer__Group__1"


    // $ANTLR start "rule__Buffer__Group__1__Impl"
    // InternalStl.g:2539:1: rule__Buffer__Group__1__Impl : ( ( rule__Buffer__NameAssignment_1 ) ) ;
    public final void rule__Buffer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2543:1: ( ( ( rule__Buffer__NameAssignment_1 ) ) )
            // InternalStl.g:2544:1: ( ( rule__Buffer__NameAssignment_1 ) )
            {
            // InternalStl.g:2544:1: ( ( rule__Buffer__NameAssignment_1 ) )
            // InternalStl.g:2545:2: ( rule__Buffer__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:2546:2: ( rule__Buffer__NameAssignment_1 )
            // InternalStl.g:2546:3: rule__Buffer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Buffer__Group__1__Impl"


    // $ANTLR start "rule__Buffer__Group__2"
    // InternalStl.g:2554:1: rule__Buffer__Group__2 : rule__Buffer__Group__2__Impl rule__Buffer__Group__3 ;
    public final void rule__Buffer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2558:1: ( rule__Buffer__Group__2__Impl rule__Buffer__Group__3 )
            // InternalStl.g:2559:2: rule__Buffer__Group__2__Impl rule__Buffer__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Buffer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Buffer__Group__2"


    // $ANTLR start "rule__Buffer__Group__2__Impl"
    // InternalStl.g:2566:1: rule__Buffer__Group__2__Impl : ( '(cost=' ) ;
    public final void rule__Buffer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2570:1: ( ( '(cost=' ) )
            // InternalStl.g:2571:1: ( '(cost=' )
            {
            // InternalStl.g:2571:1: ( '(cost=' )
            // InternalStl.g:2572:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getCostKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getCostKeyword_2()); 
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
    // $ANTLR end "rule__Buffer__Group__2__Impl"


    // $ANTLR start "rule__Buffer__Group__3"
    // InternalStl.g:2581:1: rule__Buffer__Group__3 : rule__Buffer__Group__3__Impl rule__Buffer__Group__4 ;
    public final void rule__Buffer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2585:1: ( rule__Buffer__Group__3__Impl rule__Buffer__Group__4 )
            // InternalStl.g:2586:2: rule__Buffer__Group__3__Impl rule__Buffer__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Buffer__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Buffer__Group__3"


    // $ANTLR start "rule__Buffer__Group__3__Impl"
    // InternalStl.g:2593:1: rule__Buffer__Group__3__Impl : ( ( rule__Buffer__CostAssignment_3 ) ) ;
    public final void rule__Buffer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2597:1: ( ( ( rule__Buffer__CostAssignment_3 ) ) )
            // InternalStl.g:2598:1: ( ( rule__Buffer__CostAssignment_3 ) )
            {
            // InternalStl.g:2598:1: ( ( rule__Buffer__CostAssignment_3 ) )
            // InternalStl.g:2599:2: ( rule__Buffer__CostAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getCostAssignment_3()); 
            }
            // InternalStl.g:2600:2: ( rule__Buffer__CostAssignment_3 )
            // InternalStl.g:2600:3: rule__Buffer__CostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__CostAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getCostAssignment_3()); 
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
    // $ANTLR end "rule__Buffer__Group__3__Impl"


    // $ANTLR start "rule__Buffer__Group__4"
    // InternalStl.g:2608:1: rule__Buffer__Group__4 : rule__Buffer__Group__4__Impl rule__Buffer__Group__5 ;
    public final void rule__Buffer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2612:1: ( rule__Buffer__Group__4__Impl rule__Buffer__Group__5 )
            // InternalStl.g:2613:2: rule__Buffer__Group__4__Impl rule__Buffer__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Buffer__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Buffer__Group__4"


    // $ANTLR start "rule__Buffer__Group__4__Impl"
    // InternalStl.g:2620:1: rule__Buffer__Group__4__Impl : ( ')' ) ;
    public final void rule__Buffer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2624:1: ( ( ')' ) )
            // InternalStl.g:2625:1: ( ')' )
            {
            // InternalStl.g:2625:1: ( ')' )
            // InternalStl.g:2626:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Buffer__Group__4__Impl"


    // $ANTLR start "rule__Buffer__Group__5"
    // InternalStl.g:2635:1: rule__Buffer__Group__5 : rule__Buffer__Group__5__Impl rule__Buffer__Group__6 ;
    public final void rule__Buffer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2639:1: ( rule__Buffer__Group__5__Impl rule__Buffer__Group__6 )
            // InternalStl.g:2640:2: rule__Buffer__Group__5__Impl rule__Buffer__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Buffer__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Buffer__Group__5"


    // $ANTLR start "rule__Buffer__Group__5__Impl"
    // InternalStl.g:2647:1: rule__Buffer__Group__5__Impl : ( '{' ) ;
    public final void rule__Buffer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2651:1: ( ( '{' ) )
            // InternalStl.g:2652:1: ( '{' )
            {
            // InternalStl.g:2652:1: ( '{' )
            // InternalStl.g:2653:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getLeftCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Buffer__Group__5__Impl"


    // $ANTLR start "rule__Buffer__Group__6"
    // InternalStl.g:2662:1: rule__Buffer__Group__6 : rule__Buffer__Group__6__Impl rule__Buffer__Group__7 ;
    public final void rule__Buffer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2666:1: ( rule__Buffer__Group__6__Impl rule__Buffer__Group__7 )
            // InternalStl.g:2667:2: rule__Buffer__Group__6__Impl rule__Buffer__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Buffer__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Buffer__Group__6"


    // $ANTLR start "rule__Buffer__Group__6__Impl"
    // InternalStl.g:2674:1: rule__Buffer__Group__6__Impl : ( 'input' ) ;
    public final void rule__Buffer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2678:1: ( ( 'input' ) )
            // InternalStl.g:2679:1: ( 'input' )
            {
            // InternalStl.g:2679:1: ( 'input' )
            // InternalStl.g:2680:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getInputKeyword_6()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getInputKeyword_6()); 
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
    // $ANTLR end "rule__Buffer__Group__6__Impl"


    // $ANTLR start "rule__Buffer__Group__7"
    // InternalStl.g:2689:1: rule__Buffer__Group__7 : rule__Buffer__Group__7__Impl rule__Buffer__Group__8 ;
    public final void rule__Buffer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2693:1: ( rule__Buffer__Group__7__Impl rule__Buffer__Group__8 )
            // InternalStl.g:2694:2: rule__Buffer__Group__7__Impl rule__Buffer__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Buffer__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Buffer__Group__7"


    // $ANTLR start "rule__Buffer__Group__7__Impl"
    // InternalStl.g:2701:1: rule__Buffer__Group__7__Impl : ( ( rule__Buffer__InputSlotsAssignment_7 ) ) ;
    public final void rule__Buffer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2705:1: ( ( ( rule__Buffer__InputSlotsAssignment_7 ) ) )
            // InternalStl.g:2706:1: ( ( rule__Buffer__InputSlotsAssignment_7 ) )
            {
            // InternalStl.g:2706:1: ( ( rule__Buffer__InputSlotsAssignment_7 ) )
            // InternalStl.g:2707:2: ( rule__Buffer__InputSlotsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getInputSlotsAssignment_7()); 
            }
            // InternalStl.g:2708:2: ( rule__Buffer__InputSlotsAssignment_7 )
            // InternalStl.g:2708:3: rule__Buffer__InputSlotsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__InputSlotsAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getInputSlotsAssignment_7()); 
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
    // $ANTLR end "rule__Buffer__Group__7__Impl"


    // $ANTLR start "rule__Buffer__Group__8"
    // InternalStl.g:2716:1: rule__Buffer__Group__8 : rule__Buffer__Group__8__Impl rule__Buffer__Group__9 ;
    public final void rule__Buffer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2720:1: ( rule__Buffer__Group__8__Impl rule__Buffer__Group__9 )
            // InternalStl.g:2721:2: rule__Buffer__Group__8__Impl rule__Buffer__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Buffer__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Buffer__Group__8"


    // $ANTLR start "rule__Buffer__Group__8__Impl"
    // InternalStl.g:2728:1: rule__Buffer__Group__8__Impl : ( 'output' ) ;
    public final void rule__Buffer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2732:1: ( ( 'output' ) )
            // InternalStl.g:2733:1: ( 'output' )
            {
            // InternalStl.g:2733:1: ( 'output' )
            // InternalStl.g:2734:2: 'output'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getOutputKeyword_8()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getOutputKeyword_8()); 
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
    // $ANTLR end "rule__Buffer__Group__8__Impl"


    // $ANTLR start "rule__Buffer__Group__9"
    // InternalStl.g:2743:1: rule__Buffer__Group__9 : rule__Buffer__Group__9__Impl rule__Buffer__Group__10 ;
    public final void rule__Buffer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2747:1: ( rule__Buffer__Group__9__Impl rule__Buffer__Group__10 )
            // InternalStl.g:2748:2: rule__Buffer__Group__9__Impl rule__Buffer__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Buffer__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__10();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Buffer__Group__9"


    // $ANTLR start "rule__Buffer__Group__9__Impl"
    // InternalStl.g:2755:1: rule__Buffer__Group__9__Impl : ( ( rule__Buffer__OutputSlotsAssignment_9 ) ) ;
    public final void rule__Buffer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2759:1: ( ( ( rule__Buffer__OutputSlotsAssignment_9 ) ) )
            // InternalStl.g:2760:1: ( ( rule__Buffer__OutputSlotsAssignment_9 ) )
            {
            // InternalStl.g:2760:1: ( ( rule__Buffer__OutputSlotsAssignment_9 ) )
            // InternalStl.g:2761:2: ( rule__Buffer__OutputSlotsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getOutputSlotsAssignment_9()); 
            }
            // InternalStl.g:2762:2: ( rule__Buffer__OutputSlotsAssignment_9 )
            // InternalStl.g:2762:3: rule__Buffer__OutputSlotsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__OutputSlotsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getOutputSlotsAssignment_9()); 
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
    // $ANTLR end "rule__Buffer__Group__9__Impl"


    // $ANTLR start "rule__Buffer__Group__10"
    // InternalStl.g:2770:1: rule__Buffer__Group__10 : rule__Buffer__Group__10__Impl rule__Buffer__Group__11 ;
    public final void rule__Buffer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2774:1: ( rule__Buffer__Group__10__Impl rule__Buffer__Group__11 )
            // InternalStl.g:2775:2: rule__Buffer__Group__10__Impl rule__Buffer__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__Buffer__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__11();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Buffer__Group__10"


    // $ANTLR start "rule__Buffer__Group__10__Impl"
    // InternalStl.g:2782:1: rule__Buffer__Group__10__Impl : ( ( rule__Buffer__ServicesAssignment_10 )* ) ;
    public final void rule__Buffer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2786:1: ( ( ( rule__Buffer__ServicesAssignment_10 )* ) )
            // InternalStl.g:2787:1: ( ( rule__Buffer__ServicesAssignment_10 )* )
            {
            // InternalStl.g:2787:1: ( ( rule__Buffer__ServicesAssignment_10 )* )
            // InternalStl.g:2788:2: ( rule__Buffer__ServicesAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getServicesAssignment_10()); 
            }
            // InternalStl.g:2789:2: ( rule__Buffer__ServicesAssignment_10 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalStl.g:2789:3: rule__Buffer__ServicesAssignment_10
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Buffer__ServicesAssignment_10();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getServicesAssignment_10()); 
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
    // $ANTLR end "rule__Buffer__Group__10__Impl"


    // $ANTLR start "rule__Buffer__Group__11"
    // InternalStl.g:2797:1: rule__Buffer__Group__11 : rule__Buffer__Group__11__Impl ;
    public final void rule__Buffer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2801:1: ( rule__Buffer__Group__11__Impl )
            // InternalStl.g:2802:2: rule__Buffer__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Buffer__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Buffer__Group__11"


    // $ANTLR start "rule__Buffer__Group__11__Impl"
    // InternalStl.g:2808:1: rule__Buffer__Group__11__Impl : ( '}' ) ;
    public final void rule__Buffer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2812:1: ( ( '}' ) )
            // InternalStl.g:2813:1: ( '}' )
            {
            // InternalStl.g:2813:1: ( '}' )
            // InternalStl.g:2814:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getRightCurlyBracketKeyword_11()); 
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
    // $ANTLR end "rule__Buffer__Group__11__Impl"


    // $ANTLR start "rule__ProductStore__Group__0"
    // InternalStl.g:2824:1: rule__ProductStore__Group__0 : rule__ProductStore__Group__0__Impl rule__ProductStore__Group__1 ;
    public final void rule__ProductStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2828:1: ( rule__ProductStore__Group__0__Impl rule__ProductStore__Group__1 )
            // InternalStl.g:2829:2: rule__ProductStore__Group__0__Impl rule__ProductStore__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ProductStore__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ProductStore__Group__0"


    // $ANTLR start "rule__ProductStore__Group__0__Impl"
    // InternalStl.g:2836:1: rule__ProductStore__Group__0__Impl : ( 'productStore' ) ;
    public final void rule__ProductStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2840:1: ( ( 'productStore' ) )
            // InternalStl.g:2841:1: ( 'productStore' )
            {
            // InternalStl.g:2841:1: ( 'productStore' )
            // InternalStl.g:2842:2: 'productStore'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getProductStoreKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getProductStoreKeyword_0()); 
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
    // $ANTLR end "rule__ProductStore__Group__0__Impl"


    // $ANTLR start "rule__ProductStore__Group__1"
    // InternalStl.g:2851:1: rule__ProductStore__Group__1 : rule__ProductStore__Group__1__Impl rule__ProductStore__Group__2 ;
    public final void rule__ProductStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2855:1: ( rule__ProductStore__Group__1__Impl rule__ProductStore__Group__2 )
            // InternalStl.g:2856:2: rule__ProductStore__Group__1__Impl rule__ProductStore__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ProductStore__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ProductStore__Group__1"


    // $ANTLR start "rule__ProductStore__Group__1__Impl"
    // InternalStl.g:2863:1: rule__ProductStore__Group__1__Impl : ( ( rule__ProductStore__NameAssignment_1 ) ) ;
    public final void rule__ProductStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2867:1: ( ( ( rule__ProductStore__NameAssignment_1 ) ) )
            // InternalStl.g:2868:1: ( ( rule__ProductStore__NameAssignment_1 ) )
            {
            // InternalStl.g:2868:1: ( ( rule__ProductStore__NameAssignment_1 ) )
            // InternalStl.g:2869:2: ( rule__ProductStore__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:2870:2: ( rule__ProductStore__NameAssignment_1 )
            // InternalStl.g:2870:3: rule__ProductStore__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ProductStore__Group__1__Impl"


    // $ANTLR start "rule__ProductStore__Group__2"
    // InternalStl.g:2878:1: rule__ProductStore__Group__2 : rule__ProductStore__Group__2__Impl rule__ProductStore__Group__3 ;
    public final void rule__ProductStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2882:1: ( rule__ProductStore__Group__2__Impl rule__ProductStore__Group__3 )
            // InternalStl.g:2883:2: rule__ProductStore__Group__2__Impl rule__ProductStore__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ProductStore__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ProductStore__Group__2"


    // $ANTLR start "rule__ProductStore__Group__2__Impl"
    // InternalStl.g:2890:1: rule__ProductStore__Group__2__Impl : ( '(cost=' ) ;
    public final void rule__ProductStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2894:1: ( ( '(cost=' ) )
            // InternalStl.g:2895:1: ( '(cost=' )
            {
            // InternalStl.g:2895:1: ( '(cost=' )
            // InternalStl.g:2896:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getCostKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getCostKeyword_2()); 
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
    // $ANTLR end "rule__ProductStore__Group__2__Impl"


    // $ANTLR start "rule__ProductStore__Group__3"
    // InternalStl.g:2905:1: rule__ProductStore__Group__3 : rule__ProductStore__Group__3__Impl rule__ProductStore__Group__4 ;
    public final void rule__ProductStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2909:1: ( rule__ProductStore__Group__3__Impl rule__ProductStore__Group__4 )
            // InternalStl.g:2910:2: rule__ProductStore__Group__3__Impl rule__ProductStore__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ProductStore__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ProductStore__Group__3"


    // $ANTLR start "rule__ProductStore__Group__3__Impl"
    // InternalStl.g:2917:1: rule__ProductStore__Group__3__Impl : ( ( rule__ProductStore__CostAssignment_3 ) ) ;
    public final void rule__ProductStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2921:1: ( ( ( rule__ProductStore__CostAssignment_3 ) ) )
            // InternalStl.g:2922:1: ( ( rule__ProductStore__CostAssignment_3 ) )
            {
            // InternalStl.g:2922:1: ( ( rule__ProductStore__CostAssignment_3 ) )
            // InternalStl.g:2923:2: ( rule__ProductStore__CostAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getCostAssignment_3()); 
            }
            // InternalStl.g:2924:2: ( rule__ProductStore__CostAssignment_3 )
            // InternalStl.g:2924:3: rule__ProductStore__CostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__CostAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getCostAssignment_3()); 
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
    // $ANTLR end "rule__ProductStore__Group__3__Impl"


    // $ANTLR start "rule__ProductStore__Group__4"
    // InternalStl.g:2932:1: rule__ProductStore__Group__4 : rule__ProductStore__Group__4__Impl rule__ProductStore__Group__5 ;
    public final void rule__ProductStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2936:1: ( rule__ProductStore__Group__4__Impl rule__ProductStore__Group__5 )
            // InternalStl.g:2937:2: rule__ProductStore__Group__4__Impl rule__ProductStore__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ProductStore__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ProductStore__Group__4"


    // $ANTLR start "rule__ProductStore__Group__4__Impl"
    // InternalStl.g:2944:1: rule__ProductStore__Group__4__Impl : ( ',capacity=' ) ;
    public final void rule__ProductStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2948:1: ( ( ',capacity=' ) )
            // InternalStl.g:2949:1: ( ',capacity=' )
            {
            // InternalStl.g:2949:1: ( ',capacity=' )
            // InternalStl.g:2950:2: ',capacity='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getCapacityKeyword_4()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getCapacityKeyword_4()); 
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
    // $ANTLR end "rule__ProductStore__Group__4__Impl"


    // $ANTLR start "rule__ProductStore__Group__5"
    // InternalStl.g:2959:1: rule__ProductStore__Group__5 : rule__ProductStore__Group__5__Impl rule__ProductStore__Group__6 ;
    public final void rule__ProductStore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2963:1: ( rule__ProductStore__Group__5__Impl rule__ProductStore__Group__6 )
            // InternalStl.g:2964:2: rule__ProductStore__Group__5__Impl rule__ProductStore__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ProductStore__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ProductStore__Group__5"


    // $ANTLR start "rule__ProductStore__Group__5__Impl"
    // InternalStl.g:2971:1: rule__ProductStore__Group__5__Impl : ( ( rule__ProductStore__CapacityAssignment_5 ) ) ;
    public final void rule__ProductStore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2975:1: ( ( ( rule__ProductStore__CapacityAssignment_5 ) ) )
            // InternalStl.g:2976:1: ( ( rule__ProductStore__CapacityAssignment_5 ) )
            {
            // InternalStl.g:2976:1: ( ( rule__ProductStore__CapacityAssignment_5 ) )
            // InternalStl.g:2977:2: ( rule__ProductStore__CapacityAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getCapacityAssignment_5()); 
            }
            // InternalStl.g:2978:2: ( rule__ProductStore__CapacityAssignment_5 )
            // InternalStl.g:2978:3: rule__ProductStore__CapacityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__CapacityAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getCapacityAssignment_5()); 
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
    // $ANTLR end "rule__ProductStore__Group__5__Impl"


    // $ANTLR start "rule__ProductStore__Group__6"
    // InternalStl.g:2986:1: rule__ProductStore__Group__6 : rule__ProductStore__Group__6__Impl rule__ProductStore__Group__7 ;
    public final void rule__ProductStore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:2990:1: ( rule__ProductStore__Group__6__Impl rule__ProductStore__Group__7 )
            // InternalStl.g:2991:2: rule__ProductStore__Group__6__Impl rule__ProductStore__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__ProductStore__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ProductStore__Group__6"


    // $ANTLR start "rule__ProductStore__Group__6__Impl"
    // InternalStl.g:2998:1: rule__ProductStore__Group__6__Impl : ( ')' ) ;
    public final void rule__ProductStore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3002:1: ( ( ')' ) )
            // InternalStl.g:3003:1: ( ')' )
            {
            // InternalStl.g:3003:1: ( ')' )
            // InternalStl.g:3004:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getRightParenthesisKeyword_6()); 
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
    // $ANTLR end "rule__ProductStore__Group__6__Impl"


    // $ANTLR start "rule__ProductStore__Group__7"
    // InternalStl.g:3013:1: rule__ProductStore__Group__7 : rule__ProductStore__Group__7__Impl rule__ProductStore__Group__8 ;
    public final void rule__ProductStore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3017:1: ( rule__ProductStore__Group__7__Impl rule__ProductStore__Group__8 )
            // InternalStl.g:3018:2: rule__ProductStore__Group__7__Impl rule__ProductStore__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__ProductStore__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ProductStore__Group__7"


    // $ANTLR start "rule__ProductStore__Group__7__Impl"
    // InternalStl.g:3025:1: rule__ProductStore__Group__7__Impl : ( '{' ) ;
    public final void rule__ProductStore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3029:1: ( ( '{' ) )
            // InternalStl.g:3030:1: ( '{' )
            {
            // InternalStl.g:3030:1: ( '{' )
            // InternalStl.g:3031:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getLeftCurlyBracketKeyword_7()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getLeftCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__ProductStore__Group__7__Impl"


    // $ANTLR start "rule__ProductStore__Group__8"
    // InternalStl.g:3040:1: rule__ProductStore__Group__8 : rule__ProductStore__Group__8__Impl rule__ProductStore__Group__9 ;
    public final void rule__ProductStore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3044:1: ( rule__ProductStore__Group__8__Impl rule__ProductStore__Group__9 )
            // InternalStl.g:3045:2: rule__ProductStore__Group__8__Impl rule__ProductStore__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__ProductStore__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ProductStore__Group__8"


    // $ANTLR start "rule__ProductStore__Group__8__Impl"
    // InternalStl.g:3052:1: rule__ProductStore__Group__8__Impl : ( 'input' ) ;
    public final void rule__ProductStore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3056:1: ( ( 'input' ) )
            // InternalStl.g:3057:1: ( 'input' )
            {
            // InternalStl.g:3057:1: ( 'input' )
            // InternalStl.g:3058:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getInputKeyword_8()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getInputKeyword_8()); 
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
    // $ANTLR end "rule__ProductStore__Group__8__Impl"


    // $ANTLR start "rule__ProductStore__Group__9"
    // InternalStl.g:3067:1: rule__ProductStore__Group__9 : rule__ProductStore__Group__9__Impl rule__ProductStore__Group__10 ;
    public final void rule__ProductStore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3071:1: ( rule__ProductStore__Group__9__Impl rule__ProductStore__Group__10 )
            // InternalStl.g:3072:2: rule__ProductStore__Group__9__Impl rule__ProductStore__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__ProductStore__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__10();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ProductStore__Group__9"


    // $ANTLR start "rule__ProductStore__Group__9__Impl"
    // InternalStl.g:3079:1: rule__ProductStore__Group__9__Impl : ( ( rule__ProductStore__InputSlotsAssignment_9 ) ) ;
    public final void rule__ProductStore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3083:1: ( ( ( rule__ProductStore__InputSlotsAssignment_9 ) ) )
            // InternalStl.g:3084:1: ( ( rule__ProductStore__InputSlotsAssignment_9 ) )
            {
            // InternalStl.g:3084:1: ( ( rule__ProductStore__InputSlotsAssignment_9 ) )
            // InternalStl.g:3085:2: ( rule__ProductStore__InputSlotsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getInputSlotsAssignment_9()); 
            }
            // InternalStl.g:3086:2: ( rule__ProductStore__InputSlotsAssignment_9 )
            // InternalStl.g:3086:3: rule__ProductStore__InputSlotsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__InputSlotsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getInputSlotsAssignment_9()); 
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
    // $ANTLR end "rule__ProductStore__Group__9__Impl"


    // $ANTLR start "rule__ProductStore__Group__10"
    // InternalStl.g:3094:1: rule__ProductStore__Group__10 : rule__ProductStore__Group__10__Impl rule__ProductStore__Group__11 ;
    public final void rule__ProductStore__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3098:1: ( rule__ProductStore__Group__10__Impl rule__ProductStore__Group__11 )
            // InternalStl.g:3099:2: rule__ProductStore__Group__10__Impl rule__ProductStore__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__ProductStore__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__11();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ProductStore__Group__10"


    // $ANTLR start "rule__ProductStore__Group__10__Impl"
    // InternalStl.g:3106:1: rule__ProductStore__Group__10__Impl : ( ( rule__ProductStore__ServicesAssignment_10 )* ) ;
    public final void rule__ProductStore__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3110:1: ( ( ( rule__ProductStore__ServicesAssignment_10 )* ) )
            // InternalStl.g:3111:1: ( ( rule__ProductStore__ServicesAssignment_10 )* )
            {
            // InternalStl.g:3111:1: ( ( rule__ProductStore__ServicesAssignment_10 )* )
            // InternalStl.g:3112:2: ( rule__ProductStore__ServicesAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getServicesAssignment_10()); 
            }
            // InternalStl.g:3113:2: ( rule__ProductStore__ServicesAssignment_10 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalStl.g:3113:3: rule__ProductStore__ServicesAssignment_10
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ProductStore__ServicesAssignment_10();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getServicesAssignment_10()); 
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
    // $ANTLR end "rule__ProductStore__Group__10__Impl"


    // $ANTLR start "rule__ProductStore__Group__11"
    // InternalStl.g:3121:1: rule__ProductStore__Group__11 : rule__ProductStore__Group__11__Impl ;
    public final void rule__ProductStore__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3125:1: ( rule__ProductStore__Group__11__Impl )
            // InternalStl.g:3126:2: rule__ProductStore__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProductStore__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ProductStore__Group__11"


    // $ANTLR start "rule__ProductStore__Group__11__Impl"
    // InternalStl.g:3132:1: rule__ProductStore__Group__11__Impl : ( '}' ) ;
    public final void rule__ProductStore__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3136:1: ( ( '}' ) )
            // InternalStl.g:3137:1: ( '}' )
            {
            // InternalStl.g:3137:1: ( '}' )
            // InternalStl.g:3138:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getRightCurlyBracketKeyword_11()); 
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
    // $ANTLR end "rule__ProductStore__Group__11__Impl"


    // $ANTLR start "rule__WasteStore__Group__0"
    // InternalStl.g:3148:1: rule__WasteStore__Group__0 : rule__WasteStore__Group__0__Impl rule__WasteStore__Group__1 ;
    public final void rule__WasteStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3152:1: ( rule__WasteStore__Group__0__Impl rule__WasteStore__Group__1 )
            // InternalStl.g:3153:2: rule__WasteStore__Group__0__Impl rule__WasteStore__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WasteStore__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WasteStore__Group__0"


    // $ANTLR start "rule__WasteStore__Group__0__Impl"
    // InternalStl.g:3160:1: rule__WasteStore__Group__0__Impl : ( 'wasteStore' ) ;
    public final void rule__WasteStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3164:1: ( ( 'wasteStore' ) )
            // InternalStl.g:3165:1: ( 'wasteStore' )
            {
            // InternalStl.g:3165:1: ( 'wasteStore' )
            // InternalStl.g:3166:2: 'wasteStore'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getWasteStoreKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getWasteStoreKeyword_0()); 
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
    // $ANTLR end "rule__WasteStore__Group__0__Impl"


    // $ANTLR start "rule__WasteStore__Group__1"
    // InternalStl.g:3175:1: rule__WasteStore__Group__1 : rule__WasteStore__Group__1__Impl rule__WasteStore__Group__2 ;
    public final void rule__WasteStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3179:1: ( rule__WasteStore__Group__1__Impl rule__WasteStore__Group__2 )
            // InternalStl.g:3180:2: rule__WasteStore__Group__1__Impl rule__WasteStore__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__WasteStore__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WasteStore__Group__1"


    // $ANTLR start "rule__WasteStore__Group__1__Impl"
    // InternalStl.g:3187:1: rule__WasteStore__Group__1__Impl : ( ( rule__WasteStore__NameAssignment_1 ) ) ;
    public final void rule__WasteStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3191:1: ( ( ( rule__WasteStore__NameAssignment_1 ) ) )
            // InternalStl.g:3192:1: ( ( rule__WasteStore__NameAssignment_1 ) )
            {
            // InternalStl.g:3192:1: ( ( rule__WasteStore__NameAssignment_1 ) )
            // InternalStl.g:3193:2: ( rule__WasteStore__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:3194:2: ( rule__WasteStore__NameAssignment_1 )
            // InternalStl.g:3194:3: rule__WasteStore__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__WasteStore__Group__1__Impl"


    // $ANTLR start "rule__WasteStore__Group__2"
    // InternalStl.g:3202:1: rule__WasteStore__Group__2 : rule__WasteStore__Group__2__Impl rule__WasteStore__Group__3 ;
    public final void rule__WasteStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3206:1: ( rule__WasteStore__Group__2__Impl rule__WasteStore__Group__3 )
            // InternalStl.g:3207:2: rule__WasteStore__Group__2__Impl rule__WasteStore__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__WasteStore__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WasteStore__Group__2"


    // $ANTLR start "rule__WasteStore__Group__2__Impl"
    // InternalStl.g:3214:1: rule__WasteStore__Group__2__Impl : ( '(cost=' ) ;
    public final void rule__WasteStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3218:1: ( ( '(cost=' ) )
            // InternalStl.g:3219:1: ( '(cost=' )
            {
            // InternalStl.g:3219:1: ( '(cost=' )
            // InternalStl.g:3220:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getCostKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getCostKeyword_2()); 
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
    // $ANTLR end "rule__WasteStore__Group__2__Impl"


    // $ANTLR start "rule__WasteStore__Group__3"
    // InternalStl.g:3229:1: rule__WasteStore__Group__3 : rule__WasteStore__Group__3__Impl rule__WasteStore__Group__4 ;
    public final void rule__WasteStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3233:1: ( rule__WasteStore__Group__3__Impl rule__WasteStore__Group__4 )
            // InternalStl.g:3234:2: rule__WasteStore__Group__3__Impl rule__WasteStore__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__WasteStore__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WasteStore__Group__3"


    // $ANTLR start "rule__WasteStore__Group__3__Impl"
    // InternalStl.g:3241:1: rule__WasteStore__Group__3__Impl : ( ( rule__WasteStore__CostAssignment_3 ) ) ;
    public final void rule__WasteStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3245:1: ( ( ( rule__WasteStore__CostAssignment_3 ) ) )
            // InternalStl.g:3246:1: ( ( rule__WasteStore__CostAssignment_3 ) )
            {
            // InternalStl.g:3246:1: ( ( rule__WasteStore__CostAssignment_3 ) )
            // InternalStl.g:3247:2: ( rule__WasteStore__CostAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getCostAssignment_3()); 
            }
            // InternalStl.g:3248:2: ( rule__WasteStore__CostAssignment_3 )
            // InternalStl.g:3248:3: rule__WasteStore__CostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__CostAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getCostAssignment_3()); 
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
    // $ANTLR end "rule__WasteStore__Group__3__Impl"


    // $ANTLR start "rule__WasteStore__Group__4"
    // InternalStl.g:3256:1: rule__WasteStore__Group__4 : rule__WasteStore__Group__4__Impl rule__WasteStore__Group__5 ;
    public final void rule__WasteStore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3260:1: ( rule__WasteStore__Group__4__Impl rule__WasteStore__Group__5 )
            // InternalStl.g:3261:2: rule__WasteStore__Group__4__Impl rule__WasteStore__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__WasteStore__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WasteStore__Group__4"


    // $ANTLR start "rule__WasteStore__Group__4__Impl"
    // InternalStl.g:3268:1: rule__WasteStore__Group__4__Impl : ( ',capacity=' ) ;
    public final void rule__WasteStore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3272:1: ( ( ',capacity=' ) )
            // InternalStl.g:3273:1: ( ',capacity=' )
            {
            // InternalStl.g:3273:1: ( ',capacity=' )
            // InternalStl.g:3274:2: ',capacity='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getCapacityKeyword_4()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getCapacityKeyword_4()); 
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
    // $ANTLR end "rule__WasteStore__Group__4__Impl"


    // $ANTLR start "rule__WasteStore__Group__5"
    // InternalStl.g:3283:1: rule__WasteStore__Group__5 : rule__WasteStore__Group__5__Impl rule__WasteStore__Group__6 ;
    public final void rule__WasteStore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3287:1: ( rule__WasteStore__Group__5__Impl rule__WasteStore__Group__6 )
            // InternalStl.g:3288:2: rule__WasteStore__Group__5__Impl rule__WasteStore__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__WasteStore__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WasteStore__Group__5"


    // $ANTLR start "rule__WasteStore__Group__5__Impl"
    // InternalStl.g:3295:1: rule__WasteStore__Group__5__Impl : ( ( rule__WasteStore__CapacityAssignment_5 ) ) ;
    public final void rule__WasteStore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3299:1: ( ( ( rule__WasteStore__CapacityAssignment_5 ) ) )
            // InternalStl.g:3300:1: ( ( rule__WasteStore__CapacityAssignment_5 ) )
            {
            // InternalStl.g:3300:1: ( ( rule__WasteStore__CapacityAssignment_5 ) )
            // InternalStl.g:3301:2: ( rule__WasteStore__CapacityAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getCapacityAssignment_5()); 
            }
            // InternalStl.g:3302:2: ( rule__WasteStore__CapacityAssignment_5 )
            // InternalStl.g:3302:3: rule__WasteStore__CapacityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__CapacityAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getCapacityAssignment_5()); 
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
    // $ANTLR end "rule__WasteStore__Group__5__Impl"


    // $ANTLR start "rule__WasteStore__Group__6"
    // InternalStl.g:3310:1: rule__WasteStore__Group__6 : rule__WasteStore__Group__6__Impl rule__WasteStore__Group__7 ;
    public final void rule__WasteStore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3314:1: ( rule__WasteStore__Group__6__Impl rule__WasteStore__Group__7 )
            // InternalStl.g:3315:2: rule__WasteStore__Group__6__Impl rule__WasteStore__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__WasteStore__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WasteStore__Group__6"


    // $ANTLR start "rule__WasteStore__Group__6__Impl"
    // InternalStl.g:3322:1: rule__WasteStore__Group__6__Impl : ( ')' ) ;
    public final void rule__WasteStore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3326:1: ( ( ')' ) )
            // InternalStl.g:3327:1: ( ')' )
            {
            // InternalStl.g:3327:1: ( ')' )
            // InternalStl.g:3328:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getRightParenthesisKeyword_6()); 
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
    // $ANTLR end "rule__WasteStore__Group__6__Impl"


    // $ANTLR start "rule__WasteStore__Group__7"
    // InternalStl.g:3337:1: rule__WasteStore__Group__7 : rule__WasteStore__Group__7__Impl rule__WasteStore__Group__8 ;
    public final void rule__WasteStore__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3341:1: ( rule__WasteStore__Group__7__Impl rule__WasteStore__Group__8 )
            // InternalStl.g:3342:2: rule__WasteStore__Group__7__Impl rule__WasteStore__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__WasteStore__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WasteStore__Group__7"


    // $ANTLR start "rule__WasteStore__Group__7__Impl"
    // InternalStl.g:3349:1: rule__WasteStore__Group__7__Impl : ( '{' ) ;
    public final void rule__WasteStore__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3353:1: ( ( '{' ) )
            // InternalStl.g:3354:1: ( '{' )
            {
            // InternalStl.g:3354:1: ( '{' )
            // InternalStl.g:3355:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getLeftCurlyBracketKeyword_7()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getLeftCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__WasteStore__Group__7__Impl"


    // $ANTLR start "rule__WasteStore__Group__8"
    // InternalStl.g:3364:1: rule__WasteStore__Group__8 : rule__WasteStore__Group__8__Impl rule__WasteStore__Group__9 ;
    public final void rule__WasteStore__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3368:1: ( rule__WasteStore__Group__8__Impl rule__WasteStore__Group__9 )
            // InternalStl.g:3369:2: rule__WasteStore__Group__8__Impl rule__WasteStore__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__WasteStore__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WasteStore__Group__8"


    // $ANTLR start "rule__WasteStore__Group__8__Impl"
    // InternalStl.g:3376:1: rule__WasteStore__Group__8__Impl : ( 'input' ) ;
    public final void rule__WasteStore__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3380:1: ( ( 'input' ) )
            // InternalStl.g:3381:1: ( 'input' )
            {
            // InternalStl.g:3381:1: ( 'input' )
            // InternalStl.g:3382:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getInputKeyword_8()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getInputKeyword_8()); 
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
    // $ANTLR end "rule__WasteStore__Group__8__Impl"


    // $ANTLR start "rule__WasteStore__Group__9"
    // InternalStl.g:3391:1: rule__WasteStore__Group__9 : rule__WasteStore__Group__9__Impl rule__WasteStore__Group__10 ;
    public final void rule__WasteStore__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3395:1: ( rule__WasteStore__Group__9__Impl rule__WasteStore__Group__10 )
            // InternalStl.g:3396:2: rule__WasteStore__Group__9__Impl rule__WasteStore__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__WasteStore__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__10();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WasteStore__Group__9"


    // $ANTLR start "rule__WasteStore__Group__9__Impl"
    // InternalStl.g:3403:1: rule__WasteStore__Group__9__Impl : ( ( rule__WasteStore__InputSlotsAssignment_9 ) ) ;
    public final void rule__WasteStore__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3407:1: ( ( ( rule__WasteStore__InputSlotsAssignment_9 ) ) )
            // InternalStl.g:3408:1: ( ( rule__WasteStore__InputSlotsAssignment_9 ) )
            {
            // InternalStl.g:3408:1: ( ( rule__WasteStore__InputSlotsAssignment_9 ) )
            // InternalStl.g:3409:2: ( rule__WasteStore__InputSlotsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getInputSlotsAssignment_9()); 
            }
            // InternalStl.g:3410:2: ( rule__WasteStore__InputSlotsAssignment_9 )
            // InternalStl.g:3410:3: rule__WasteStore__InputSlotsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__InputSlotsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getInputSlotsAssignment_9()); 
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
    // $ANTLR end "rule__WasteStore__Group__9__Impl"


    // $ANTLR start "rule__WasteStore__Group__10"
    // InternalStl.g:3418:1: rule__WasteStore__Group__10 : rule__WasteStore__Group__10__Impl rule__WasteStore__Group__11 ;
    public final void rule__WasteStore__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3422:1: ( rule__WasteStore__Group__10__Impl rule__WasteStore__Group__11 )
            // InternalStl.g:3423:2: rule__WasteStore__Group__10__Impl rule__WasteStore__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__WasteStore__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__11();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WasteStore__Group__10"


    // $ANTLR start "rule__WasteStore__Group__10__Impl"
    // InternalStl.g:3430:1: rule__WasteStore__Group__10__Impl : ( ( rule__WasteStore__ServicesAssignment_10 )* ) ;
    public final void rule__WasteStore__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3434:1: ( ( ( rule__WasteStore__ServicesAssignment_10 )* ) )
            // InternalStl.g:3435:1: ( ( rule__WasteStore__ServicesAssignment_10 )* )
            {
            // InternalStl.g:3435:1: ( ( rule__WasteStore__ServicesAssignment_10 )* )
            // InternalStl.g:3436:2: ( rule__WasteStore__ServicesAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getServicesAssignment_10()); 
            }
            // InternalStl.g:3437:2: ( rule__WasteStore__ServicesAssignment_10 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalStl.g:3437:3: rule__WasteStore__ServicesAssignment_10
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__WasteStore__ServicesAssignment_10();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getServicesAssignment_10()); 
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
    // $ANTLR end "rule__WasteStore__Group__10__Impl"


    // $ANTLR start "rule__WasteStore__Group__11"
    // InternalStl.g:3445:1: rule__WasteStore__Group__11 : rule__WasteStore__Group__11__Impl ;
    public final void rule__WasteStore__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3449:1: ( rule__WasteStore__Group__11__Impl )
            // InternalStl.g:3450:2: rule__WasteStore__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WasteStore__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__WasteStore__Group__11"


    // $ANTLR start "rule__WasteStore__Group__11__Impl"
    // InternalStl.g:3456:1: rule__WasteStore__Group__11__Impl : ( '}' ) ;
    public final void rule__WasteStore__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3460:1: ( ( '}' ) )
            // InternalStl.g:3461:1: ( '}' )
            {
            // InternalStl.g:3461:1: ( '}' )
            // InternalStl.g:3462:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getRightCurlyBracketKeyword_11()); 
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
    // $ANTLR end "rule__WasteStore__Group__11__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // InternalStl.g:3472:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3476:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalStl.g:3477:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Connector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Connector__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Connector__Group__0"


    // $ANTLR start "rule__Connector__Group__0__Impl"
    // InternalStl.g:3484:1: rule__Connector__Group__0__Impl : ( ( rule__Connector__EntryAssignment_0 ) ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3488:1: ( ( ( rule__Connector__EntryAssignment_0 ) ) )
            // InternalStl.g:3489:1: ( ( rule__Connector__EntryAssignment_0 ) )
            {
            // InternalStl.g:3489:1: ( ( rule__Connector__EntryAssignment_0 ) )
            // InternalStl.g:3490:2: ( rule__Connector__EntryAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getEntryAssignment_0()); 
            }
            // InternalStl.g:3491:2: ( rule__Connector__EntryAssignment_0 )
            // InternalStl.g:3491:3: rule__Connector__EntryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__EntryAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getEntryAssignment_0()); 
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
    // $ANTLR end "rule__Connector__Group__0__Impl"


    // $ANTLR start "rule__Connector__Group__1"
    // InternalStl.g:3499:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3503:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalStl.g:3504:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Connector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Connector__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Connector__Group__1"


    // $ANTLR start "rule__Connector__Group__1__Impl"
    // InternalStl.g:3511:1: rule__Connector__Group__1__Impl : ( '>' ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3515:1: ( ( '>' ) )
            // InternalStl.g:3516:1: ( '>' )
            {
            // InternalStl.g:3516:1: ( '>' )
            // InternalStl.g:3517:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getGreaterThanSignKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getGreaterThanSignKeyword_1()); 
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
    // $ANTLR end "rule__Connector__Group__1__Impl"


    // $ANTLR start "rule__Connector__Group__2"
    // InternalStl.g:3526:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3530:1: ( rule__Connector__Group__2__Impl )
            // InternalStl.g:3531:2: rule__Connector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Connector__Group__2"


    // $ANTLR start "rule__Connector__Group__2__Impl"
    // InternalStl.g:3537:1: rule__Connector__Group__2__Impl : ( ( rule__Connector__ExitAssignment_2 ) ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3541:1: ( ( ( rule__Connector__ExitAssignment_2 ) ) )
            // InternalStl.g:3542:1: ( ( rule__Connector__ExitAssignment_2 ) )
            {
            // InternalStl.g:3542:1: ( ( rule__Connector__ExitAssignment_2 ) )
            // InternalStl.g:3543:2: ( rule__Connector__ExitAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getExitAssignment_2()); 
            }
            // InternalStl.g:3544:2: ( rule__Connector__ExitAssignment_2 )
            // InternalStl.g:3544:3: rule__Connector__ExitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Connector__ExitAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getExitAssignment_2()); 
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
    // $ANTLR end "rule__Connector__Group__2__Impl"


    // $ANTLR start "rule__Slot__Group__0"
    // InternalStl.g:3553:1: rule__Slot__Group__0 : rule__Slot__Group__0__Impl rule__Slot__Group__1 ;
    public final void rule__Slot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3557:1: ( rule__Slot__Group__0__Impl rule__Slot__Group__1 )
            // InternalStl.g:3558:2: rule__Slot__Group__0__Impl rule__Slot__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Slot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Slot__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Slot__Group__0"


    // $ANTLR start "rule__Slot__Group__0__Impl"
    // InternalStl.g:3565:1: rule__Slot__Group__0__Impl : ( ( rule__Slot__NameAssignment_0 ) ) ;
    public final void rule__Slot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3569:1: ( ( ( rule__Slot__NameAssignment_0 ) ) )
            // InternalStl.g:3570:1: ( ( rule__Slot__NameAssignment_0 ) )
            {
            // InternalStl.g:3570:1: ( ( rule__Slot__NameAssignment_0 ) )
            // InternalStl.g:3571:2: ( rule__Slot__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getNameAssignment_0()); 
            }
            // InternalStl.g:3572:2: ( rule__Slot__NameAssignment_0 )
            // InternalStl.g:3572:3: rule__Slot__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Slot__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Slot__Group__0__Impl"


    // $ANTLR start "rule__Slot__Group__1"
    // InternalStl.g:3580:1: rule__Slot__Group__1 : rule__Slot__Group__1__Impl rule__Slot__Group__2 ;
    public final void rule__Slot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3584:1: ( rule__Slot__Group__1__Impl rule__Slot__Group__2 )
            // InternalStl.g:3585:2: rule__Slot__Group__1__Impl rule__Slot__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Slot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Slot__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Slot__Group__1"


    // $ANTLR start "rule__Slot__Group__1__Impl"
    // InternalStl.g:3592:1: rule__Slot__Group__1__Impl : ( ':' ) ;
    public final void rule__Slot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3596:1: ( ( ':' ) )
            // InternalStl.g:3597:1: ( ':' )
            {
            // InternalStl.g:3597:1: ( ':' )
            // InternalStl.g:3598:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getColonKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__Slot__Group__1__Impl"


    // $ANTLR start "rule__Slot__Group__2"
    // InternalStl.g:3607:1: rule__Slot__Group__2 : rule__Slot__Group__2__Impl ;
    public final void rule__Slot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3611:1: ( rule__Slot__Group__2__Impl )
            // InternalStl.g:3612:2: rule__Slot__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Slot__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Slot__Group__2"


    // $ANTLR start "rule__Slot__Group__2__Impl"
    // InternalStl.g:3618:1: rule__Slot__Group__2__Impl : ( ( rule__Slot__RequiredTypeAssignment_2 ) ) ;
    public final void rule__Slot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3622:1: ( ( ( rule__Slot__RequiredTypeAssignment_2 ) ) )
            // InternalStl.g:3623:1: ( ( rule__Slot__RequiredTypeAssignment_2 ) )
            {
            // InternalStl.g:3623:1: ( ( rule__Slot__RequiredTypeAssignment_2 ) )
            // InternalStl.g:3624:2: ( rule__Slot__RequiredTypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getRequiredTypeAssignment_2()); 
            }
            // InternalStl.g:3625:2: ( rule__Slot__RequiredTypeAssignment_2 )
            // InternalStl.g:3625:3: rule__Slot__RequiredTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Slot__RequiredTypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getRequiredTypeAssignment_2()); 
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
    // $ANTLR end "rule__Slot__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalStl.g:3634:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3638:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalStl.g:3639:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalStl.g:3646:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3650:1: ( ( 'service' ) )
            // InternalStl.g:3651:1: ( 'service' )
            {
            // InternalStl.g:3651:1: ( 'service' )
            // InternalStl.g:3652:2: 'service'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
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
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalStl.g:3661:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3665:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalStl.g:3666:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Service__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalStl.g:3673:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3677:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // InternalStl.g:3678:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // InternalStl.g:3678:1: ( ( rule__Service__NameAssignment_1 ) )
            // InternalStl.g:3679:2: ( rule__Service__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            }
            // InternalStl.g:3680:2: ( rule__Service__NameAssignment_1 )
            // InternalStl.g:3680:3: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalStl.g:3688:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3692:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalStl.g:3693:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Service__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalStl.g:3700:1: rule__Service__Group__2__Impl : ( '(cost=' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3704:1: ( ( '(cost=' ) )
            // InternalStl.g:3705:1: ( '(cost=' )
            {
            // InternalStl.g:3705:1: ( '(cost=' )
            // InternalStl.g:3706:2: '(cost='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getCostKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getCostKeyword_2()); 
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
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalStl.g:3715:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3719:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalStl.g:3720:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Service__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalStl.g:3727:1: rule__Service__Group__3__Impl : ( ( rule__Service__CostAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3731:1: ( ( ( rule__Service__CostAssignment_3 ) ) )
            // InternalStl.g:3732:1: ( ( rule__Service__CostAssignment_3 ) )
            {
            // InternalStl.g:3732:1: ( ( rule__Service__CostAssignment_3 ) )
            // InternalStl.g:3733:2: ( rule__Service__CostAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getCostAssignment_3()); 
            }
            // InternalStl.g:3734:2: ( rule__Service__CostAssignment_3 )
            // InternalStl.g:3734:3: rule__Service__CostAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Service__CostAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getCostAssignment_3()); 
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
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalStl.g:3742:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3746:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalStl.g:3747:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Service__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalStl.g:3754:1: rule__Service__Group__4__Impl : ( ',reliability=' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3758:1: ( ( ',reliability=' ) )
            // InternalStl.g:3759:1: ( ',reliability=' )
            {
            // InternalStl.g:3759:1: ( ',reliability=' )
            // InternalStl.g:3760:2: ',reliability='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getReliabilityKeyword_4()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getReliabilityKeyword_4()); 
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
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalStl.g:3769:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3773:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalStl.g:3774:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Service__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalStl.g:3781:1: rule__Service__Group__5__Impl : ( ( rule__Service__ReliabilityAssignment_5 ) ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3785:1: ( ( ( rule__Service__ReliabilityAssignment_5 ) ) )
            // InternalStl.g:3786:1: ( ( rule__Service__ReliabilityAssignment_5 ) )
            {
            // InternalStl.g:3786:1: ( ( rule__Service__ReliabilityAssignment_5 ) )
            // InternalStl.g:3787:2: ( rule__Service__ReliabilityAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getReliabilityAssignment_5()); 
            }
            // InternalStl.g:3788:2: ( rule__Service__ReliabilityAssignment_5 )
            // InternalStl.g:3788:3: rule__Service__ReliabilityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Service__ReliabilityAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getReliabilityAssignment_5()); 
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
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalStl.g:3796:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3800:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalStl.g:3801:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Service__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalStl.g:3808:1: rule__Service__Group__6__Impl : ( ',processingTime=' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3812:1: ( ( ',processingTime=' ) )
            // InternalStl.g:3813:1: ( ',processingTime=' )
            {
            // InternalStl.g:3813:1: ( ',processingTime=' )
            // InternalStl.g:3814:2: ',processingTime='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getProcessingTimeKeyword_6()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getProcessingTimeKeyword_6()); 
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
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // InternalStl.g:3823:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3827:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalStl.g:3828:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Service__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // InternalStl.g:3835:1: rule__Service__Group__7__Impl : ( ( rule__Service__ProcessingTimeAssignment_7 ) ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3839:1: ( ( ( rule__Service__ProcessingTimeAssignment_7 ) ) )
            // InternalStl.g:3840:1: ( ( rule__Service__ProcessingTimeAssignment_7 ) )
            {
            // InternalStl.g:3840:1: ( ( rule__Service__ProcessingTimeAssignment_7 ) )
            // InternalStl.g:3841:2: ( rule__Service__ProcessingTimeAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getProcessingTimeAssignment_7()); 
            }
            // InternalStl.g:3842:2: ( rule__Service__ProcessingTimeAssignment_7 )
            // InternalStl.g:3842:3: rule__Service__ProcessingTimeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Service__ProcessingTimeAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getProcessingTimeAssignment_7()); 
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
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group__8"
    // InternalStl.g:3850:1: rule__Service__Group__8 : rule__Service__Group__8__Impl rule__Service__Group__9 ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3854:1: ( rule__Service__Group__8__Impl rule__Service__Group__9 )
            // InternalStl.g:3855:2: rule__Service__Group__8__Impl rule__Service__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group__8"


    // $ANTLR start "rule__Service__Group__8__Impl"
    // InternalStl.g:3862:1: rule__Service__Group__8__Impl : ( ')' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3866:1: ( ( ')' ) )
            // InternalStl.g:3867:1: ( ')' )
            {
            // InternalStl.g:3867:1: ( ')' )
            // InternalStl.g:3868:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRightParenthesisKeyword_8()); 
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
    // $ANTLR end "rule__Service__Group__8__Impl"


    // $ANTLR start "rule__Service__Group__9"
    // InternalStl.g:3877:1: rule__Service__Group__9 : rule__Service__Group__9__Impl ;
    public final void rule__Service__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3881:1: ( rule__Service__Group__9__Impl )
            // InternalStl.g:3882:2: rule__Service__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group__9"


    // $ANTLR start "rule__Service__Group__9__Impl"
    // InternalStl.g:3888:1: rule__Service__Group__9__Impl : ( ( rule__Service__Group_9__0 )? ) ;
    public final void rule__Service__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3892:1: ( ( ( rule__Service__Group_9__0 )? ) )
            // InternalStl.g:3893:1: ( ( rule__Service__Group_9__0 )? )
            {
            // InternalStl.g:3893:1: ( ( rule__Service__Group_9__0 )? )
            // InternalStl.g:3894:2: ( rule__Service__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup_9()); 
            }
            // InternalStl.g:3895:2: ( rule__Service__Group_9__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==14) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalStl.g:3895:3: rule__Service__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getGroup_9()); 
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
    // $ANTLR end "rule__Service__Group__9__Impl"


    // $ANTLR start "rule__Service__Group_9__0"
    // InternalStl.g:3904:1: rule__Service__Group_9__0 : rule__Service__Group_9__0__Impl rule__Service__Group_9__1 ;
    public final void rule__Service__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3908:1: ( rule__Service__Group_9__0__Impl rule__Service__Group_9__1 )
            // InternalStl.g:3909:2: rule__Service__Group_9__0__Impl rule__Service__Group_9__1
            {
            pushFollow(FOLLOW_29);
            rule__Service__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group_9__0"


    // $ANTLR start "rule__Service__Group_9__0__Impl"
    // InternalStl.g:3916:1: rule__Service__Group_9__0__Impl : ( '{' ) ;
    public final void rule__Service__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3920:1: ( ( '{' ) )
            // InternalStl.g:3921:1: ( '{' )
            {
            // InternalStl.g:3921:1: ( '{' )
            // InternalStl.g:3922:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_9_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_9_0()); 
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
    // $ANTLR end "rule__Service__Group_9__0__Impl"


    // $ANTLR start "rule__Service__Group_9__1"
    // InternalStl.g:3931:1: rule__Service__Group_9__1 : rule__Service__Group_9__1__Impl rule__Service__Group_9__2 ;
    public final void rule__Service__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3935:1: ( rule__Service__Group_9__1__Impl rule__Service__Group_9__2 )
            // InternalStl.g:3936:2: rule__Service__Group_9__1__Impl rule__Service__Group_9__2
            {
            pushFollow(FOLLOW_29);
            rule__Service__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_9__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group_9__1"


    // $ANTLR start "rule__Service__Group_9__1__Impl"
    // InternalStl.g:3943:1: rule__Service__Group_9__1__Impl : ( ( rule__Service__Group_9_1__0 )* ) ;
    public final void rule__Service__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3947:1: ( ( ( rule__Service__Group_9_1__0 )* ) )
            // InternalStl.g:3948:1: ( ( rule__Service__Group_9_1__0 )* )
            {
            // InternalStl.g:3948:1: ( ( rule__Service__Group_9_1__0 )* )
            // InternalStl.g:3949:2: ( rule__Service__Group_9_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getGroup_9_1()); 
            }
            // InternalStl.g:3950:2: ( rule__Service__Group_9_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalStl.g:3950:3: rule__Service__Group_9_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Service__Group_9_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getGroup_9_1()); 
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
    // $ANTLR end "rule__Service__Group_9__1__Impl"


    // $ANTLR start "rule__Service__Group_9__2"
    // InternalStl.g:3958:1: rule__Service__Group_9__2 : rule__Service__Group_9__2__Impl ;
    public final void rule__Service__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3962:1: ( rule__Service__Group_9__2__Impl )
            // InternalStl.g:3963:2: rule__Service__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group_9__2"


    // $ANTLR start "rule__Service__Group_9__2__Impl"
    // InternalStl.g:3969:1: rule__Service__Group_9__2__Impl : ( '}' ) ;
    public final void rule__Service__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3973:1: ( ( '}' ) )
            // InternalStl.g:3974:1: ( '}' )
            {
            // InternalStl.g:3974:1: ( '}' )
            // InternalStl.g:3975:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9_2()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9_2()); 
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
    // $ANTLR end "rule__Service__Group_9__2__Impl"


    // $ANTLR start "rule__Service__Group_9_1__0"
    // InternalStl.g:3985:1: rule__Service__Group_9_1__0 : rule__Service__Group_9_1__0__Impl rule__Service__Group_9_1__1 ;
    public final void rule__Service__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:3989:1: ( rule__Service__Group_9_1__0__Impl rule__Service__Group_9_1__1 )
            // InternalStl.g:3990:2: rule__Service__Group_9_1__0__Impl rule__Service__Group_9_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group_9_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Service__Group_9_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group_9_1__0"


    // $ANTLR start "rule__Service__Group_9_1__0__Impl"
    // InternalStl.g:3997:1: rule__Service__Group_9_1__0__Impl : ( 'input' ) ;
    public final void rule__Service__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4001:1: ( ( 'input' ) )
            // InternalStl.g:4002:1: ( 'input' )
            {
            // InternalStl.g:4002:1: ( 'input' )
            // InternalStl.g:4003:2: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getInputKeyword_9_1_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getInputKeyword_9_1_0()); 
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
    // $ANTLR end "rule__Service__Group_9_1__0__Impl"


    // $ANTLR start "rule__Service__Group_9_1__1"
    // InternalStl.g:4012:1: rule__Service__Group_9_1__1 : rule__Service__Group_9_1__1__Impl ;
    public final void rule__Service__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4016:1: ( rule__Service__Group_9_1__1__Impl )
            // InternalStl.g:4017:2: rule__Service__Group_9_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_9_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Service__Group_9_1__1"


    // $ANTLR start "rule__Service__Group_9_1__1__Impl"
    // InternalStl.g:4023:1: rule__Service__Group_9_1__1__Impl : ( ( rule__Service__ParametersAssignment_9_1_1 ) ) ;
    public final void rule__Service__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4027:1: ( ( ( rule__Service__ParametersAssignment_9_1_1 ) ) )
            // InternalStl.g:4028:1: ( ( rule__Service__ParametersAssignment_9_1_1 ) )
            {
            // InternalStl.g:4028:1: ( ( rule__Service__ParametersAssignment_9_1_1 ) )
            // InternalStl.g:4029:2: ( rule__Service__ParametersAssignment_9_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getParametersAssignment_9_1_1()); 
            }
            // InternalStl.g:4030:2: ( rule__Service__ParametersAssignment_9_1_1 )
            // InternalStl.g:4030:3: rule__Service__ParametersAssignment_9_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__ParametersAssignment_9_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getParametersAssignment_9_1_1()); 
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
    // $ANTLR end "rule__Service__Group_9_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalStl.g:4039:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4043:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalStl.g:4044:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalStl.g:4051:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4055:1: ( ( RULE_ID ) )
            // InternalStl.g:4056:1: ( RULE_ID )
            {
            // InternalStl.g:4056:1: ( RULE_ID )
            // InternalStl.g:4057:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalStl.g:4066:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4070:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalStl.g:4071:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalStl.g:4077:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4081:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalStl.g:4082:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalStl.g:4082:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalStl.g:4083:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalStl.g:4084:2: ( rule__QualifiedName__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalStl.g:4084:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalStl.g:4093:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4097:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalStl.g:4098:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalStl.g:4105:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4109:1: ( ( ( '.' ) ) )
            // InternalStl.g:4110:1: ( ( '.' ) )
            {
            // InternalStl.g:4110:1: ( ( '.' ) )
            // InternalStl.g:4111:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalStl.g:4112:2: ( '.' )
            // InternalStl.g:4112:3: '.'
            {
            match(input,37,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalStl.g:4120:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4124:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalStl.g:4125:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalStl.g:4131:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4135:1: ( ( RULE_ID ) )
            // InternalStl.g:4136:1: ( RULE_ID )
            {
            // InternalStl.g:4136:1: ( RULE_ID )
            // InternalStl.g:4137:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalStl.g:4147:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4151:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalStl.g:4152:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalStl.g:4159:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4163:1: ( ( ( '-' )? ) )
            // InternalStl.g:4164:1: ( ( '-' )? )
            {
            // InternalStl.g:4164:1: ( ( '-' )? )
            // InternalStl.g:4165:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalStl.g:4166:2: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalStl.g:4166:3: '-'
                    {
                    match(input,38,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalStl.g:4174:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4178:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalStl.g:4179:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalStl.g:4186:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4190:1: ( ( ( RULE_INT )? ) )
            // InternalStl.g:4191:1: ( ( RULE_INT )? )
            {
            // InternalStl.g:4191:1: ( ( RULE_INT )? )
            // InternalStl.g:4192:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            }
            // InternalStl.g:4193:2: ( RULE_INT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalStl.g:4193:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalStl.g:4201:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4205:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalStl.g:4206:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__EDouble__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalStl.g:4213:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4217:1: ( ( '.' ) )
            // InternalStl.g:4218:1: ( '.' )
            {
            // InternalStl.g:4218:1: ( '.' )
            // InternalStl.g:4219:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalStl.g:4228:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4232:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalStl.g:4233:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__EDouble__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalStl.g:4240:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4244:1: ( ( RULE_INT ) )
            // InternalStl.g:4245:1: ( RULE_INT )
            {
            // InternalStl.g:4245:1: ( RULE_INT )
            // InternalStl.g:4246:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalStl.g:4255:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4259:1: ( rule__EDouble__Group__4__Impl )
            // InternalStl.g:4260:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalStl.g:4266:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4270:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalStl.g:4271:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalStl.g:4271:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalStl.g:4272:2: ( rule__EDouble__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            }
            // InternalStl.g:4273:2: ( rule__EDouble__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=11 && LA25_0<=12)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalStl.g:4273:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getGroup_4()); 
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
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalStl.g:4282:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4286:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalStl.g:4287:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_33);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalStl.g:4294:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4298:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalStl.g:4299:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalStl.g:4299:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalStl.g:4300:2: ( rule__EDouble__Alternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            }
            // InternalStl.g:4301:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalStl.g:4301:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
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
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalStl.g:4309:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4313:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalStl.g:4314:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_33);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalStl.g:4321:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4325:1: ( ( ( '-' )? ) )
            // InternalStl.g:4326:1: ( ( '-' )? )
            {
            // InternalStl.g:4326:1: ( ( '-' )? )
            // InternalStl.g:4327:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            }
            // InternalStl.g:4328:2: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalStl.g:4328:3: '-'
                    {
                    match(input,38,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
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
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalStl.g:4336:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4340:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalStl.g:4341:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalStl.g:4347:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4351:1: ( ( RULE_INT ) )
            // InternalStl.g:4352:1: ( RULE_INT )
            {
            // InternalStl.g:4352:1: ( RULE_INT )
            // InternalStl.g:4353:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
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
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__System__NameAssignment_1"
    // InternalStl.g:4363:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4367:1: ( ( RULE_ID ) )
            // InternalStl.g:4368:2: ( RULE_ID )
            {
            // InternalStl.g:4368:2: ( RULE_ID )
            // InternalStl.g:4369:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__ItemTypesAssignment_3"
    // InternalStl.g:4378:1: rule__System__ItemTypesAssignment_3 : ( ruleItemType ) ;
    public final void rule__System__ItemTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4382:1: ( ( ruleItemType ) )
            // InternalStl.g:4383:2: ( ruleItemType )
            {
            // InternalStl.g:4383:2: ( ruleItemType )
            // InternalStl.g:4384:3: ruleItemType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getItemTypesItemTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleItemType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getItemTypesItemTypeParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__System__ItemTypesAssignment_3"


    // $ANTLR start "rule__System__AreasAssignment_4"
    // InternalStl.g:4393:1: rule__System__AreasAssignment_4 : ( ruleArea ) ;
    public final void rule__System__AreasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4397:1: ( ( ruleArea ) )
            // InternalStl.g:4398:2: ( ruleArea )
            {
            // InternalStl.g:4398:2: ( ruleArea )
            // InternalStl.g:4399:3: ruleArea
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getAreasAreaParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArea();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getAreasAreaParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__System__AreasAssignment_4"


    // $ANTLR start "rule__Area__NameAssignment_1"
    // InternalStl.g:4408:1: rule__Area__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Area__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4412:1: ( ( RULE_ID ) )
            // InternalStl.g:4413:2: ( RULE_ID )
            {
            // InternalStl.g:4413:2: ( RULE_ID )
            // InternalStl.g:4414:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Area__NameAssignment_1"


    // $ANTLR start "rule__Area__ComponentsAssignment_3"
    // InternalStl.g:4423:1: rule__Area__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__Area__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4427:1: ( ( ruleComponent ) )
            // InternalStl.g:4428:2: ( ruleComponent )
            {
            // InternalStl.g:4428:2: ( ruleComponent )
            // InternalStl.g:4429:3: ruleComponent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getComponentsComponentParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getComponentsComponentParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Area__ComponentsAssignment_3"


    // $ANTLR start "rule__Area__ConnectorsAssignment_4"
    // InternalStl.g:4438:1: rule__Area__ConnectorsAssignment_4 : ( ruleConnector ) ;
    public final void rule__Area__ConnectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4442:1: ( ( ruleConnector ) )
            // InternalStl.g:4443:2: ( ruleConnector )
            {
            // InternalStl.g:4443:2: ( ruleConnector )
            // InternalStl.g:4444:3: ruleConnector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAreaAccess().getConnectorsConnectorParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAreaAccess().getConnectorsConnectorParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Area__ConnectorsAssignment_4"


    // $ANTLR start "rule__ItemType__NameAssignment_1"
    // InternalStl.g:4453:1: rule__ItemType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ItemType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4457:1: ( ( RULE_ID ) )
            // InternalStl.g:4458:2: ( RULE_ID )
            {
            // InternalStl.g:4458:2: ( RULE_ID )
            // InternalStl.g:4459:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ItemType__NameAssignment_1"


    // $ANTLR start "rule__ItemGenerator__NameAssignment_1"
    // InternalStl.g:4468:1: rule__ItemGenerator__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ItemGenerator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4472:1: ( ( RULE_ID ) )
            // InternalStl.g:4473:2: ( RULE_ID )
            {
            // InternalStl.g:4473:2: ( RULE_ID )
            // InternalStl.g:4474:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ItemGenerator__NameAssignment_1"


    // $ANTLR start "rule__ItemGenerator__GeneratedTypeAssignment_3"
    // InternalStl.g:4483:1: rule__ItemGenerator__GeneratedTypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ItemGenerator__GeneratedTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4487:1: ( ( ( ruleQualifiedName ) ) )
            // InternalStl.g:4488:2: ( ( ruleQualifiedName ) )
            {
            // InternalStl.g:4488:2: ( ( ruleQualifiedName ) )
            // InternalStl.g:4489:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeCrossReference_3_0()); 
            }
            // InternalStl.g:4490:3: ( ruleQualifiedName )
            // InternalStl.g:4491:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeQualifiedNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeCrossReference_3_0()); 
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
    // $ANTLR end "rule__ItemGenerator__GeneratedTypeAssignment_3"


    // $ANTLR start "rule__ItemGenerator__CostAssignment_5"
    // InternalStl.g:4502:1: rule__ItemGenerator__CostAssignment_5 : ( RULE_INT ) ;
    public final void rule__ItemGenerator__CostAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4506:1: ( ( RULE_INT ) )
            // InternalStl.g:4507:2: ( RULE_INT )
            {
            // InternalStl.g:4507:2: ( RULE_INT )
            // InternalStl.g:4508:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getCostINTTerminalRuleCall_5_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getCostINTTerminalRuleCall_5_0()); 
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
    // $ANTLR end "rule__ItemGenerator__CostAssignment_5"


    // $ANTLR start "rule__ItemGenerator__OutputSlotsAssignment_9"
    // InternalStl.g:4517:1: rule__ItemGenerator__OutputSlotsAssignment_9 : ( ruleSlot ) ;
    public final void rule__ItemGenerator__OutputSlotsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4521:1: ( ( ruleSlot ) )
            // InternalStl.g:4522:2: ( ruleSlot )
            {
            // InternalStl.g:4522:2: ( ruleSlot )
            // InternalStl.g:4523:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getOutputSlotsSlotParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getOutputSlotsSlotParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__ItemGenerator__OutputSlotsAssignment_9"


    // $ANTLR start "rule__ItemGenerator__ServicesAssignment_10"
    // InternalStl.g:4532:1: rule__ItemGenerator__ServicesAssignment_10 : ( ruleService ) ;
    public final void rule__ItemGenerator__ServicesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4536:1: ( ( ruleService ) )
            // InternalStl.g:4537:2: ( ruleService )
            {
            // InternalStl.g:4537:2: ( ruleService )
            // InternalStl.g:4538:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemGeneratorAccess().getServicesServiceParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemGeneratorAccess().getServicesServiceParserRuleCall_10_0()); 
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
    // $ANTLR end "rule__ItemGenerator__ServicesAssignment_10"


    // $ANTLR start "rule__Conveyor__NameAssignment_1"
    // InternalStl.g:4547:1: rule__Conveyor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Conveyor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4551:1: ( ( RULE_ID ) )
            // InternalStl.g:4552:2: ( RULE_ID )
            {
            // InternalStl.g:4552:2: ( RULE_ID )
            // InternalStl.g:4553:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Conveyor__NameAssignment_1"


    // $ANTLR start "rule__Conveyor__CostAssignment_3"
    // InternalStl.g:4562:1: rule__Conveyor__CostAssignment_3 : ( RULE_INT ) ;
    public final void rule__Conveyor__CostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4566:1: ( ( RULE_INT ) )
            // InternalStl.g:4567:2: ( RULE_INT )
            {
            // InternalStl.g:4567:2: ( RULE_INT )
            // InternalStl.g:4568:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getCostINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getCostINTTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Conveyor__CostAssignment_3"


    // $ANTLR start "rule__Conveyor__InputSlotsAssignment_7"
    // InternalStl.g:4577:1: rule__Conveyor__InputSlotsAssignment_7 : ( ruleSlot ) ;
    public final void rule__Conveyor__InputSlotsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4581:1: ( ( ruleSlot ) )
            // InternalStl.g:4582:2: ( ruleSlot )
            {
            // InternalStl.g:4582:2: ( ruleSlot )
            // InternalStl.g:4583:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getInputSlotsSlotParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getInputSlotsSlotParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Conveyor__InputSlotsAssignment_7"


    // $ANTLR start "rule__Conveyor__OutputSlotsAssignment_9"
    // InternalStl.g:4592:1: rule__Conveyor__OutputSlotsAssignment_9 : ( ruleSlot ) ;
    public final void rule__Conveyor__OutputSlotsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4596:1: ( ( ruleSlot ) )
            // InternalStl.g:4597:2: ( ruleSlot )
            {
            // InternalStl.g:4597:2: ( ruleSlot )
            // InternalStl.g:4598:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getOutputSlotsSlotParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getOutputSlotsSlotParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__Conveyor__OutputSlotsAssignment_9"


    // $ANTLR start "rule__Conveyor__ServicesAssignment_10"
    // InternalStl.g:4607:1: rule__Conveyor__ServicesAssignment_10 : ( ruleService ) ;
    public final void rule__Conveyor__ServicesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4611:1: ( ( ruleService ) )
            // InternalStl.g:4612:2: ( ruleService )
            {
            // InternalStl.g:4612:2: ( ruleService )
            // InternalStl.g:4613:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConveyorAccess().getServicesServiceParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConveyorAccess().getServicesServiceParserRuleCall_10_0()); 
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
    // $ANTLR end "rule__Conveyor__ServicesAssignment_10"


    // $ANTLR start "rule__TurnTable__NameAssignment_1"
    // InternalStl.g:4622:1: rule__TurnTable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TurnTable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4626:1: ( ( RULE_ID ) )
            // InternalStl.g:4627:2: ( RULE_ID )
            {
            // InternalStl.g:4627:2: ( RULE_ID )
            // InternalStl.g:4628:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__TurnTable__NameAssignment_1"


    // $ANTLR start "rule__TurnTable__CostAssignment_3"
    // InternalStl.g:4637:1: rule__TurnTable__CostAssignment_3 : ( RULE_INT ) ;
    public final void rule__TurnTable__CostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4641:1: ( ( RULE_INT ) )
            // InternalStl.g:4642:2: ( RULE_INT )
            {
            // InternalStl.g:4642:2: ( RULE_INT )
            // InternalStl.g:4643:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getCostINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getCostINTTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__TurnTable__CostAssignment_3"


    // $ANTLR start "rule__TurnTable__InputSlotsAssignment_6_1"
    // InternalStl.g:4652:1: rule__TurnTable__InputSlotsAssignment_6_1 : ( ruleSlot ) ;
    public final void rule__TurnTable__InputSlotsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4656:1: ( ( ruleSlot ) )
            // InternalStl.g:4657:2: ( ruleSlot )
            {
            // InternalStl.g:4657:2: ( ruleSlot )
            // InternalStl.g:4658:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getInputSlotsSlotParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getInputSlotsSlotParserRuleCall_6_1_0()); 
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
    // $ANTLR end "rule__TurnTable__InputSlotsAssignment_6_1"


    // $ANTLR start "rule__TurnTable__OutputSlotsAssignment_7_1"
    // InternalStl.g:4667:1: rule__TurnTable__OutputSlotsAssignment_7_1 : ( ruleSlot ) ;
    public final void rule__TurnTable__OutputSlotsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4671:1: ( ( ruleSlot ) )
            // InternalStl.g:4672:2: ( ruleSlot )
            {
            // InternalStl.g:4672:2: ( ruleSlot )
            // InternalStl.g:4673:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getOutputSlotsSlotParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getOutputSlotsSlotParserRuleCall_7_1_0()); 
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
    // $ANTLR end "rule__TurnTable__OutputSlotsAssignment_7_1"


    // $ANTLR start "rule__TurnTable__ServicesAssignment_8"
    // InternalStl.g:4682:1: rule__TurnTable__ServicesAssignment_8 : ( ruleService ) ;
    public final void rule__TurnTable__ServicesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4686:1: ( ( ruleService ) )
            // InternalStl.g:4687:2: ( ruleService )
            {
            // InternalStl.g:4687:2: ( ruleService )
            // InternalStl.g:4688:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnTableAccess().getServicesServiceParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnTableAccess().getServicesServiceParserRuleCall_8_0()); 
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
    // $ANTLR end "rule__TurnTable__ServicesAssignment_8"


    // $ANTLR start "rule__Machine__NameAssignment_1"
    // InternalStl.g:4697:1: rule__Machine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4701:1: ( ( RULE_ID ) )
            // InternalStl.g:4702:2: ( RULE_ID )
            {
            // InternalStl.g:4702:2: ( RULE_ID )
            // InternalStl.g:4703:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Machine__NameAssignment_1"


    // $ANTLR start "rule__Machine__CostAssignment_3"
    // InternalStl.g:4712:1: rule__Machine__CostAssignment_3 : ( RULE_INT ) ;
    public final void rule__Machine__CostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4716:1: ( ( RULE_INT ) )
            // InternalStl.g:4717:2: ( RULE_INT )
            {
            // InternalStl.g:4717:2: ( RULE_INT )
            // InternalStl.g:4718:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getCostINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getCostINTTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Machine__CostAssignment_3"


    // $ANTLR start "rule__Machine__InputSlotsAssignment_6_1"
    // InternalStl.g:4727:1: rule__Machine__InputSlotsAssignment_6_1 : ( ruleSlot ) ;
    public final void rule__Machine__InputSlotsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4731:1: ( ( ruleSlot ) )
            // InternalStl.g:4732:2: ( ruleSlot )
            {
            // InternalStl.g:4732:2: ( ruleSlot )
            // InternalStl.g:4733:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getInputSlotsSlotParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getInputSlotsSlotParserRuleCall_6_1_0()); 
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
    // $ANTLR end "rule__Machine__InputSlotsAssignment_6_1"


    // $ANTLR start "rule__Machine__OutputSlotsAssignment_7_1"
    // InternalStl.g:4742:1: rule__Machine__OutputSlotsAssignment_7_1 : ( ruleSlot ) ;
    public final void rule__Machine__OutputSlotsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4746:1: ( ( ruleSlot ) )
            // InternalStl.g:4747:2: ( ruleSlot )
            {
            // InternalStl.g:4747:2: ( ruleSlot )
            // InternalStl.g:4748:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getOutputSlotsSlotParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getOutputSlotsSlotParserRuleCall_7_1_0()); 
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
    // $ANTLR end "rule__Machine__OutputSlotsAssignment_7_1"


    // $ANTLR start "rule__Machine__ServicesAssignment_8"
    // InternalStl.g:4757:1: rule__Machine__ServicesAssignment_8 : ( ruleService ) ;
    public final void rule__Machine__ServicesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4761:1: ( ( ruleService ) )
            // InternalStl.g:4762:2: ( ruleService )
            {
            // InternalStl.g:4762:2: ( ruleService )
            // InternalStl.g:4763:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMachineAccess().getServicesServiceParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMachineAccess().getServicesServiceParserRuleCall_8_0()); 
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
    // $ANTLR end "rule__Machine__ServicesAssignment_8"


    // $ANTLR start "rule__Buffer__NameAssignment_1"
    // InternalStl.g:4772:1: rule__Buffer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Buffer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4776:1: ( ( RULE_ID ) )
            // InternalStl.g:4777:2: ( RULE_ID )
            {
            // InternalStl.g:4777:2: ( RULE_ID )
            // InternalStl.g:4778:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Buffer__NameAssignment_1"


    // $ANTLR start "rule__Buffer__CostAssignment_3"
    // InternalStl.g:4787:1: rule__Buffer__CostAssignment_3 : ( RULE_INT ) ;
    public final void rule__Buffer__CostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4791:1: ( ( RULE_INT ) )
            // InternalStl.g:4792:2: ( RULE_INT )
            {
            // InternalStl.g:4792:2: ( RULE_INT )
            // InternalStl.g:4793:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getCostINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getCostINTTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Buffer__CostAssignment_3"


    // $ANTLR start "rule__Buffer__InputSlotsAssignment_7"
    // InternalStl.g:4802:1: rule__Buffer__InputSlotsAssignment_7 : ( ruleSlot ) ;
    public final void rule__Buffer__InputSlotsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4806:1: ( ( ruleSlot ) )
            // InternalStl.g:4807:2: ( ruleSlot )
            {
            // InternalStl.g:4807:2: ( ruleSlot )
            // InternalStl.g:4808:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getInputSlotsSlotParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getInputSlotsSlotParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Buffer__InputSlotsAssignment_7"


    // $ANTLR start "rule__Buffer__OutputSlotsAssignment_9"
    // InternalStl.g:4817:1: rule__Buffer__OutputSlotsAssignment_9 : ( ruleSlot ) ;
    public final void rule__Buffer__OutputSlotsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4821:1: ( ( ruleSlot ) )
            // InternalStl.g:4822:2: ( ruleSlot )
            {
            // InternalStl.g:4822:2: ( ruleSlot )
            // InternalStl.g:4823:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getOutputSlotsSlotParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getOutputSlotsSlotParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__Buffer__OutputSlotsAssignment_9"


    // $ANTLR start "rule__Buffer__ServicesAssignment_10"
    // InternalStl.g:4832:1: rule__Buffer__ServicesAssignment_10 : ( ruleService ) ;
    public final void rule__Buffer__ServicesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4836:1: ( ( ruleService ) )
            // InternalStl.g:4837:2: ( ruleService )
            {
            // InternalStl.g:4837:2: ( ruleService )
            // InternalStl.g:4838:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBufferAccess().getServicesServiceParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBufferAccess().getServicesServiceParserRuleCall_10_0()); 
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
    // $ANTLR end "rule__Buffer__ServicesAssignment_10"


    // $ANTLR start "rule__ProductStore__NameAssignment_1"
    // InternalStl.g:4847:1: rule__ProductStore__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProductStore__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4851:1: ( ( RULE_ID ) )
            // InternalStl.g:4852:2: ( RULE_ID )
            {
            // InternalStl.g:4852:2: ( RULE_ID )
            // InternalStl.g:4853:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ProductStore__NameAssignment_1"


    // $ANTLR start "rule__ProductStore__CostAssignment_3"
    // InternalStl.g:4862:1: rule__ProductStore__CostAssignment_3 : ( RULE_INT ) ;
    public final void rule__ProductStore__CostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4866:1: ( ( RULE_INT ) )
            // InternalStl.g:4867:2: ( RULE_INT )
            {
            // InternalStl.g:4867:2: ( RULE_INT )
            // InternalStl.g:4868:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getCostINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getCostINTTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__ProductStore__CostAssignment_3"


    // $ANTLR start "rule__ProductStore__CapacityAssignment_5"
    // InternalStl.g:4877:1: rule__ProductStore__CapacityAssignment_5 : ( RULE_INT ) ;
    public final void rule__ProductStore__CapacityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4881:1: ( ( RULE_INT ) )
            // InternalStl.g:4882:2: ( RULE_INT )
            {
            // InternalStl.g:4882:2: ( RULE_INT )
            // InternalStl.g:4883:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getCapacityINTTerminalRuleCall_5_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getCapacityINTTerminalRuleCall_5_0()); 
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
    // $ANTLR end "rule__ProductStore__CapacityAssignment_5"


    // $ANTLR start "rule__ProductStore__InputSlotsAssignment_9"
    // InternalStl.g:4892:1: rule__ProductStore__InputSlotsAssignment_9 : ( ruleSlot ) ;
    public final void rule__ProductStore__InputSlotsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4896:1: ( ( ruleSlot ) )
            // InternalStl.g:4897:2: ( ruleSlot )
            {
            // InternalStl.g:4897:2: ( ruleSlot )
            // InternalStl.g:4898:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getInputSlotsSlotParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getInputSlotsSlotParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__ProductStore__InputSlotsAssignment_9"


    // $ANTLR start "rule__ProductStore__ServicesAssignment_10"
    // InternalStl.g:4907:1: rule__ProductStore__ServicesAssignment_10 : ( ruleService ) ;
    public final void rule__ProductStore__ServicesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4911:1: ( ( ruleService ) )
            // InternalStl.g:4912:2: ( ruleService )
            {
            // InternalStl.g:4912:2: ( ruleService )
            // InternalStl.g:4913:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProductStoreAccess().getServicesServiceParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProductStoreAccess().getServicesServiceParserRuleCall_10_0()); 
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
    // $ANTLR end "rule__ProductStore__ServicesAssignment_10"


    // $ANTLR start "rule__WasteStore__NameAssignment_1"
    // InternalStl.g:4922:1: rule__WasteStore__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WasteStore__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4926:1: ( ( RULE_ID ) )
            // InternalStl.g:4927:2: ( RULE_ID )
            {
            // InternalStl.g:4927:2: ( RULE_ID )
            // InternalStl.g:4928:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__WasteStore__NameAssignment_1"


    // $ANTLR start "rule__WasteStore__CostAssignment_3"
    // InternalStl.g:4937:1: rule__WasteStore__CostAssignment_3 : ( RULE_INT ) ;
    public final void rule__WasteStore__CostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4941:1: ( ( RULE_INT ) )
            // InternalStl.g:4942:2: ( RULE_INT )
            {
            // InternalStl.g:4942:2: ( RULE_INT )
            // InternalStl.g:4943:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getCostINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getCostINTTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__WasteStore__CostAssignment_3"


    // $ANTLR start "rule__WasteStore__CapacityAssignment_5"
    // InternalStl.g:4952:1: rule__WasteStore__CapacityAssignment_5 : ( RULE_INT ) ;
    public final void rule__WasteStore__CapacityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4956:1: ( ( RULE_INT ) )
            // InternalStl.g:4957:2: ( RULE_INT )
            {
            // InternalStl.g:4957:2: ( RULE_INT )
            // InternalStl.g:4958:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getCapacityINTTerminalRuleCall_5_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getCapacityINTTerminalRuleCall_5_0()); 
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
    // $ANTLR end "rule__WasteStore__CapacityAssignment_5"


    // $ANTLR start "rule__WasteStore__InputSlotsAssignment_9"
    // InternalStl.g:4967:1: rule__WasteStore__InputSlotsAssignment_9 : ( ruleSlot ) ;
    public final void rule__WasteStore__InputSlotsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4971:1: ( ( ruleSlot ) )
            // InternalStl.g:4972:2: ( ruleSlot )
            {
            // InternalStl.g:4972:2: ( ruleSlot )
            // InternalStl.g:4973:3: ruleSlot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getInputSlotsSlotParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSlot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getInputSlotsSlotParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__WasteStore__InputSlotsAssignment_9"


    // $ANTLR start "rule__WasteStore__ServicesAssignment_10"
    // InternalStl.g:4982:1: rule__WasteStore__ServicesAssignment_10 : ( ruleService ) ;
    public final void rule__WasteStore__ServicesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:4986:1: ( ( ruleService ) )
            // InternalStl.g:4987:2: ( ruleService )
            {
            // InternalStl.g:4987:2: ( ruleService )
            // InternalStl.g:4988:3: ruleService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWasteStoreAccess().getServicesServiceParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWasteStoreAccess().getServicesServiceParserRuleCall_10_0()); 
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
    // $ANTLR end "rule__WasteStore__ServicesAssignment_10"


    // $ANTLR start "rule__Connector__EntryAssignment_0"
    // InternalStl.g:4997:1: rule__Connector__EntryAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connector__EntryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5001:1: ( ( ( ruleQualifiedName ) ) )
            // InternalStl.g:5002:2: ( ( ruleQualifiedName ) )
            {
            // InternalStl.g:5002:2: ( ( ruleQualifiedName ) )
            // InternalStl.g:5003:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getEntrySlotCrossReference_0_0()); 
            }
            // InternalStl.g:5004:3: ( ruleQualifiedName )
            // InternalStl.g:5005:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getEntrySlotQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getEntrySlotQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getEntrySlotCrossReference_0_0()); 
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
    // $ANTLR end "rule__Connector__EntryAssignment_0"


    // $ANTLR start "rule__Connector__ExitAssignment_2"
    // InternalStl.g:5016:1: rule__Connector__ExitAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connector__ExitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5020:1: ( ( ( ruleQualifiedName ) ) )
            // InternalStl.g:5021:2: ( ( ruleQualifiedName ) )
            {
            // InternalStl.g:5021:2: ( ( ruleQualifiedName ) )
            // InternalStl.g:5022:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getExitSlotCrossReference_2_0()); 
            }
            // InternalStl.g:5023:3: ( ruleQualifiedName )
            // InternalStl.g:5024:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectorAccess().getExitSlotQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getExitSlotQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectorAccess().getExitSlotCrossReference_2_0()); 
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
    // $ANTLR end "rule__Connector__ExitAssignment_2"


    // $ANTLR start "rule__Slot__NameAssignment_0"
    // InternalStl.g:5035:1: rule__Slot__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Slot__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5039:1: ( ( RULE_ID ) )
            // InternalStl.g:5040:2: ( RULE_ID )
            {
            // InternalStl.g:5040:2: ( RULE_ID )
            // InternalStl.g:5041:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Slot__NameAssignment_0"


    // $ANTLR start "rule__Slot__RequiredTypeAssignment_2"
    // InternalStl.g:5050:1: rule__Slot__RequiredTypeAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Slot__RequiredTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5054:1: ( ( ( ruleQualifiedName ) ) )
            // InternalStl.g:5055:2: ( ( ruleQualifiedName ) )
            {
            // InternalStl.g:5055:2: ( ( ruleQualifiedName ) )
            // InternalStl.g:5056:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getRequiredTypeItemTypeCrossReference_2_0()); 
            }
            // InternalStl.g:5057:3: ( ruleQualifiedName )
            // InternalStl.g:5058:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSlotAccess().getRequiredTypeItemTypeQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getRequiredTypeItemTypeQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSlotAccess().getRequiredTypeItemTypeCrossReference_2_0()); 
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
    // $ANTLR end "rule__Slot__RequiredTypeAssignment_2"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // InternalStl.g:5069:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5073:1: ( ( RULE_ID ) )
            // InternalStl.g:5074:2: ( RULE_ID )
            {
            // InternalStl.g:5074:2: ( RULE_ID )
            // InternalStl.g:5075:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__CostAssignment_3"
    // InternalStl.g:5084:1: rule__Service__CostAssignment_3 : ( RULE_INT ) ;
    public final void rule__Service__CostAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5088:1: ( ( RULE_INT ) )
            // InternalStl.g:5089:2: ( RULE_INT )
            {
            // InternalStl.g:5089:2: ( RULE_INT )
            // InternalStl.g:5090:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getCostINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getCostINTTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Service__CostAssignment_3"


    // $ANTLR start "rule__Service__ReliabilityAssignment_5"
    // InternalStl.g:5099:1: rule__Service__ReliabilityAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Service__ReliabilityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5103:1: ( ( ruleEDouble ) )
            // InternalStl.g:5104:2: ( ruleEDouble )
            {
            // InternalStl.g:5104:2: ( ruleEDouble )
            // InternalStl.g:5105:3: ruleEDouble
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getReliabilityEDoubleParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getReliabilityEDoubleParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Service__ReliabilityAssignment_5"


    // $ANTLR start "rule__Service__ProcessingTimeAssignment_7"
    // InternalStl.g:5114:1: rule__Service__ProcessingTimeAssignment_7 : ( RULE_INT ) ;
    public final void rule__Service__ProcessingTimeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5118:1: ( ( RULE_INT ) )
            // InternalStl.g:5119:2: ( RULE_INT )
            {
            // InternalStl.g:5119:2: ( RULE_INT )
            // InternalStl.g:5120:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getProcessingTimeINTTerminalRuleCall_7_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getProcessingTimeINTTerminalRuleCall_7_0()); 
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
    // $ANTLR end "rule__Service__ProcessingTimeAssignment_7"


    // $ANTLR start "rule__Service__ParametersAssignment_9_1_1"
    // InternalStl.g:5129:1: rule__Service__ParametersAssignment_9_1_1 : ( ruleParameter ) ;
    public final void rule__Service__ParametersAssignment_9_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5133:1: ( ( ruleParameter ) )
            // InternalStl.g:5134:2: ( ruleParameter )
            {
            // InternalStl.g:5134:2: ( ruleParameter )
            // InternalStl.g:5135:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceAccess().getParametersParameterParserRuleCall_9_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceAccess().getParametersParameterParserRuleCall_9_1_1_0()); 
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
    // $ANTLR end "rule__Service__ParametersAssignment_9_1_1"


    // $ANTLR start "rule__Parameter__NameAssignment"
    // InternalStl.g:5144:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStl.g:5148:1: ( ( RULE_ID ) )
            // InternalStl.g:5149:2: ( RULE_ID )
            {
            // InternalStl.g:5149:2: ( RULE_ID )
            // InternalStl.g:5150:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Parameter__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000BD088020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000BD080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000006000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000040L});

}