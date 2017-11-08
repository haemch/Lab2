package at.ac.tuwien.big.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.services.StlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalStlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'", "'area'", "'item'", "'='", "'generator'", "'generates'", "'(cost='", "')'", "'output'", "'conveyor'", "'input'", "'turntable'", "'machine'", "'buffer'", "'productStore'", "',capacity='", "'wasteStore'", "'>'", "':'", "'service'", "',reliability='", "',processingTime='", "'.'", "'-'", "'E'", "'e'"
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


        public InternalStlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStl.g"; }



     	private StlGrammarAccess grammarAccess;

        public InternalStlParser(TokenStream input, StlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "System";
       	}

       	@Override
       	protected StlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalStl.g:64:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalStl.g:64:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalStl.g:65:2: iv_ruleSystem= ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalStl.g:71:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )* ( (lv_areas_4_0= ruleArea ) )* otherlv_5= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_itemTypes_3_0 = null;

        EObject lv_areas_4_0 = null;



        	enterRule();

        try {
            // InternalStl.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )* ( (lv_areas_4_0= ruleArea ) )* otherlv_5= '}' ) )
            // InternalStl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )* ( (lv_areas_4_0= ruleArea ) )* otherlv_5= '}' )
            {
            // InternalStl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )* ( (lv_areas_4_0= ruleArea ) )* otherlv_5= '}' )
            // InternalStl.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )* ( (lv_areas_4_0= ruleArea ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
              		
            }
            // InternalStl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSystemRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalStl.g:105:3: ( (lv_itemTypes_3_0= ruleItemType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStl.g:106:4: (lv_itemTypes_3_0= ruleItemType )
            	    {
            	    // InternalStl.g:106:4: (lv_itemTypes_3_0= ruleItemType )
            	    // InternalStl.g:107:5: lv_itemTypes_3_0= ruleItemType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSystemAccess().getItemTypesItemTypeParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_itemTypes_3_0=ruleItemType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSystemRule());
            	      					}
            	      					add(
            	      						current,
            	      						"itemTypes",
            	      						lv_itemTypes_3_0,
            	      						"at.ac.tuwien.big.Stl.ItemType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalStl.g:124:3: ( (lv_areas_4_0= ruleArea ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStl.g:125:4: (lv_areas_4_0= ruleArea )
            	    {
            	    // InternalStl.g:125:4: (lv_areas_4_0= ruleArea )
            	    // InternalStl.g:126:5: lv_areas_4_0= ruleArea
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSystemAccess().getAreasAreaParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_areas_4_0=ruleArea();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSystemRule());
            	      					}
            	      					add(
            	      						current,
            	      						"areas",
            	      						lv_areas_4_0,
            	      						"at.ac.tuwien.big.Stl.Area");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleArea"
    // InternalStl.g:151:1: entryRuleArea returns [EObject current=null] : iv_ruleArea= ruleArea EOF ;
    public final EObject entryRuleArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArea = null;


        try {
            // InternalStl.g:151:45: (iv_ruleArea= ruleArea EOF )
            // InternalStl.g:152:2: iv_ruleArea= ruleArea EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAreaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArea=ruleArea();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArea; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArea"


    // $ANTLR start "ruleArea"
    // InternalStl.g:158:1: ruleArea returns [EObject current=null] : (otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' ) ;
    public final EObject ruleArea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_components_3_0 = null;

        EObject lv_connectors_4_0 = null;



        	enterRule();

        try {
            // InternalStl.g:164:2: ( (otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' ) )
            // InternalStl.g:165:2: (otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' )
            {
            // InternalStl.g:165:2: (otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' )
            // InternalStl.g:166:3: otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAreaAccess().getAreaKeyword_0());
              		
            }
            // InternalStl.g:170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:171:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:172:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getAreaAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAreaRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAreaAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalStl.g:192:3: ( (lv_components_3_0= ruleComponent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||LA3_0==22||(LA3_0>=24 && LA3_0<=27)||LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStl.g:193:4: (lv_components_3_0= ruleComponent )
            	    {
            	    // InternalStl.g:193:4: (lv_components_3_0= ruleComponent )
            	    // InternalStl.g:194:5: lv_components_3_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAreaAccess().getComponentsComponentParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_components_3_0=ruleComponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAreaRule());
            	      					}
            	      					add(
            	      						current,
            	      						"components",
            	      						lv_components_3_0,
            	      						"at.ac.tuwien.big.Stl.Component");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalStl.g:211:3: ( (lv_connectors_4_0= ruleConnector ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStl.g:212:4: (lv_connectors_4_0= ruleConnector )
            	    {
            	    // InternalStl.g:212:4: (lv_connectors_4_0= ruleConnector )
            	    // InternalStl.g:213:5: lv_connectors_4_0= ruleConnector
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAreaAccess().getConnectorsConnectorParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_connectors_4_0=ruleConnector();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAreaRule());
            	      					}
            	      					add(
            	      						current,
            	      						"connectors",
            	      						lv_connectors_4_0,
            	      						"at.ac.tuwien.big.Stl.Connector");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAreaAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArea"


    // $ANTLR start "entryRuleItemType"
    // InternalStl.g:238:1: entryRuleItemType returns [EObject current=null] : iv_ruleItemType= ruleItemType EOF ;
    public final EObject entryRuleItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemType = null;


        try {
            // InternalStl.g:238:49: (iv_ruleItemType= ruleItemType EOF )
            // InternalStl.g:239:2: iv_ruleItemType= ruleItemType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getItemTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleItemType=ruleItemType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleItemType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleItemType"


    // $ANTLR start "ruleItemType"
    // InternalStl.g:245:1: ruleItemType returns [EObject current=null] : (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ruleEString ) ;
    public final EObject ruleItemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStl.g:251:2: ( (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ruleEString ) )
            // InternalStl.g:252:2: (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ruleEString )
            {
            // InternalStl.g:252:2: (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ruleEString )
            // InternalStl.g:253:3: otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ruleEString
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getItemTypeAccess().getItemKeyword_0());
              		
            }
            // InternalStl.g:257:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:258:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:258:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:259:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getItemTypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getItemTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getItemTypeAccess().getEqualsSignKeyword_2());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getItemTypeAccess().getEStringParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleItemType"


    // $ANTLR start "entryRuleComponent"
    // InternalStl.g:290:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalStl.g:290:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalStl.g:291:2: iv_ruleComponent= ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalStl.g:297:1: ruleComponent returns [EObject current=null] : (this_Store_0= ruleStore | this_ItemGenerator_1= ruleItemGenerator | this_Conveyor_2= ruleConveyor | this_TurnTable_3= ruleTurnTable | this_Machine_4= ruleMachine | this_Buffer_5= ruleBuffer ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Store_0 = null;

        EObject this_ItemGenerator_1 = null;

        EObject this_Conveyor_2 = null;

        EObject this_TurnTable_3 = null;

        EObject this_Machine_4 = null;

        EObject this_Buffer_5 = null;



        	enterRule();

        try {
            // InternalStl.g:303:2: ( (this_Store_0= ruleStore | this_ItemGenerator_1= ruleItemGenerator | this_Conveyor_2= ruleConveyor | this_TurnTable_3= ruleTurnTable | this_Machine_4= ruleMachine | this_Buffer_5= ruleBuffer ) )
            // InternalStl.g:304:2: (this_Store_0= ruleStore | this_ItemGenerator_1= ruleItemGenerator | this_Conveyor_2= ruleConveyor | this_TurnTable_3= ruleTurnTable | this_Machine_4= ruleMachine | this_Buffer_5= ruleBuffer )
            {
            // InternalStl.g:304:2: (this_Store_0= ruleStore | this_ItemGenerator_1= ruleItemGenerator | this_Conveyor_2= ruleConveyor | this_TurnTable_3= ruleTurnTable | this_Machine_4= ruleMachine | this_Buffer_5= ruleBuffer )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 27:
            case 29:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            case 25:
                {
                alt5=5;
                }
                break;
            case 26:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalStl.g:305:3: this_Store_0= ruleStore
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentAccess().getStoreParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Store_0=ruleStore();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Store_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStl.g:314:3: this_ItemGenerator_1= ruleItemGenerator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentAccess().getItemGeneratorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ItemGenerator_1=ruleItemGenerator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ItemGenerator_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalStl.g:323:3: this_Conveyor_2= ruleConveyor
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentAccess().getConveyorParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Conveyor_2=ruleConveyor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Conveyor_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalStl.g:332:3: this_TurnTable_3= ruleTurnTable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentAccess().getTurnTableParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TurnTable_3=ruleTurnTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TurnTable_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalStl.g:341:3: this_Machine_4= ruleMachine
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentAccess().getMachineParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Machine_4=ruleMachine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Machine_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalStl.g:350:3: this_Buffer_5= ruleBuffer
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentAccess().getBufferParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Buffer_5=ruleBuffer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Buffer_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleItemGenerator"
    // InternalStl.g:362:1: entryRuleItemGenerator returns [EObject current=null] : iv_ruleItemGenerator= ruleItemGenerator EOF ;
    public final EObject entryRuleItemGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemGenerator = null;


        try {
            // InternalStl.g:362:54: (iv_ruleItemGenerator= ruleItemGenerator EOF )
            // InternalStl.g:363:2: iv_ruleItemGenerator= ruleItemGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getItemGeneratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleItemGenerator=ruleItemGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleItemGenerator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleItemGenerator"


    // $ANTLR start "ruleItemGenerator"
    // InternalStl.g:369:1: ruleItemGenerator returns [EObject current=null] : (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'generates' ( ( ruleQualifiedName ) ) otherlv_4= '(cost=' ( (lv_cost_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) ;
    public final EObject ruleItemGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_cost_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_outputSlots_9_0 = null;

        EObject lv_services_10_0 = null;



        	enterRule();

        try {
            // InternalStl.g:375:2: ( (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'generates' ( ( ruleQualifiedName ) ) otherlv_4= '(cost=' ( (lv_cost_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) )
            // InternalStl.g:376:2: (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'generates' ( ( ruleQualifiedName ) ) otherlv_4= '(cost=' ( (lv_cost_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            {
            // InternalStl.g:376:2: (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'generates' ( ( ruleQualifiedName ) ) otherlv_4= '(cost=' ( (lv_cost_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            // InternalStl.g:377:3: otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'generates' ( ( ruleQualifiedName ) ) otherlv_4= '(cost=' ( (lv_cost_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getItemGeneratorAccess().getGeneratorKeyword_0());
              		
            }
            // InternalStl.g:381:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:382:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:382:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:383:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getItemGeneratorAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getItemGeneratorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getItemGeneratorAccess().getGeneratesKeyword_2());
              		
            }
            // InternalStl.g:403:3: ( ( ruleQualifiedName ) )
            // InternalStl.g:404:4: ( ruleQualifiedName )
            {
            // InternalStl.g:404:4: ( ruleQualifiedName )
            // InternalStl.g:405:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getItemGeneratorRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getItemGeneratorAccess().getCostKeyword_4());
              		
            }
            // InternalStl.g:423:3: ( (lv_cost_5_0= RULE_INT ) )
            // InternalStl.g:424:4: (lv_cost_5_0= RULE_INT )
            {
            // InternalStl.g:424:4: (lv_cost_5_0= RULE_INT )
            // InternalStl.g:425:5: lv_cost_5_0= RULE_INT
            {
            lv_cost_5_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_cost_5_0, grammarAccess.getItemGeneratorAccess().getCostINTTerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getItemGeneratorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"cost",
              						lv_cost_5_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getItemGeneratorAccess().getRightParenthesisKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,12,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getItemGeneratorAccess().getLeftCurlyBracketKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getItemGeneratorAccess().getOutputKeyword_8());
              		
            }
            // InternalStl.g:453:3: ( (lv_outputSlots_9_0= ruleSlot ) )
            // InternalStl.g:454:4: (lv_outputSlots_9_0= ruleSlot )
            {
            // InternalStl.g:454:4: (lv_outputSlots_9_0= ruleSlot )
            // InternalStl.g:455:5: lv_outputSlots_9_0= ruleSlot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getItemGeneratorAccess().getOutputSlotsSlotParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_outputSlots_9_0=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getItemGeneratorRule());
              					}
              					add(
              						current,
              						"outputSlots",
              						lv_outputSlots_9_0,
              						"at.ac.tuwien.big.Stl.Slot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStl.g:472:3: ( (lv_services_10_0= ruleService ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==32) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStl.g:473:4: (lv_services_10_0= ruleService )
            	    {
            	    // InternalStl.g:473:4: (lv_services_10_0= ruleService )
            	    // InternalStl.g:474:5: lv_services_10_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getItemGeneratorAccess().getServicesServiceParserRuleCall_10_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_services_10_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getItemGeneratorRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_10_0,
            	      						"at.ac.tuwien.big.Stl.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getItemGeneratorAccess().getRightCurlyBracketKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleItemGenerator"


    // $ANTLR start "entryRuleConveyor"
    // InternalStl.g:499:1: entryRuleConveyor returns [EObject current=null] : iv_ruleConveyor= ruleConveyor EOF ;
    public final EObject entryRuleConveyor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConveyor = null;


        try {
            // InternalStl.g:499:49: (iv_ruleConveyor= ruleConveyor EOF )
            // InternalStl.g:500:2: iv_ruleConveyor= ruleConveyor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConveyorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConveyor=ruleConveyor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConveyor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConveyor"


    // $ANTLR start "ruleConveyor"
    // InternalStl.g:506:1: ruleConveyor returns [EObject current=null] : (otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) ;
    public final EObject ruleConveyor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_cost_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_inputSlots_7_0 = null;

        EObject lv_outputSlots_9_0 = null;

        EObject lv_services_10_0 = null;



        	enterRule();

        try {
            // InternalStl.g:512:2: ( (otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) )
            // InternalStl.g:513:2: (otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            {
            // InternalStl.g:513:2: (otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            // InternalStl.g:514:3: otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConveyorAccess().getConveyorKeyword_0());
              		
            }
            // InternalStl.g:518:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:519:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:519:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:520:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getConveyorAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConveyorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConveyorAccess().getCostKeyword_2());
              		
            }
            // InternalStl.g:540:3: ( (lv_cost_3_0= RULE_INT ) )
            // InternalStl.g:541:4: (lv_cost_3_0= RULE_INT )
            {
            // InternalStl.g:541:4: (lv_cost_3_0= RULE_INT )
            // InternalStl.g:542:5: lv_cost_3_0= RULE_INT
            {
            lv_cost_3_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_cost_3_0, grammarAccess.getConveyorAccess().getCostINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConveyorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"cost",
              						lv_cost_3_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConveyorAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,12,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConveyorAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getConveyorAccess().getInputKeyword_6());
              		
            }
            // InternalStl.g:570:3: ( (lv_inputSlots_7_0= ruleSlot ) )
            // InternalStl.g:571:4: (lv_inputSlots_7_0= ruleSlot )
            {
            // InternalStl.g:571:4: (lv_inputSlots_7_0= ruleSlot )
            // InternalStl.g:572:5: lv_inputSlots_7_0= ruleSlot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConveyorAccess().getInputSlotsSlotParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_inputSlots_7_0=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConveyorRule());
              					}
              					add(
              						current,
              						"inputSlots",
              						lv_inputSlots_7_0,
              						"at.ac.tuwien.big.Stl.Slot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getConveyorAccess().getOutputKeyword_8());
              		
            }
            // InternalStl.g:593:3: ( (lv_outputSlots_9_0= ruleSlot ) )
            // InternalStl.g:594:4: (lv_outputSlots_9_0= ruleSlot )
            {
            // InternalStl.g:594:4: (lv_outputSlots_9_0= ruleSlot )
            // InternalStl.g:595:5: lv_outputSlots_9_0= ruleSlot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConveyorAccess().getOutputSlotsSlotParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_outputSlots_9_0=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConveyorRule());
              					}
              					add(
              						current,
              						"outputSlots",
              						lv_outputSlots_9_0,
              						"at.ac.tuwien.big.Stl.Slot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStl.g:612:3: ( (lv_services_10_0= ruleService ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStl.g:613:4: (lv_services_10_0= ruleService )
            	    {
            	    // InternalStl.g:613:4: (lv_services_10_0= ruleService )
            	    // InternalStl.g:614:5: lv_services_10_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConveyorAccess().getServicesServiceParserRuleCall_10_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_services_10_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConveyorRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_10_0,
            	      						"at.ac.tuwien.big.Stl.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getConveyorAccess().getRightCurlyBracketKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConveyor"


    // $ANTLR start "entryRuleTurnTable"
    // InternalStl.g:639:1: entryRuleTurnTable returns [EObject current=null] : iv_ruleTurnTable= ruleTurnTable EOF ;
    public final EObject entryRuleTurnTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnTable = null;


        try {
            // InternalStl.g:639:50: (iv_ruleTurnTable= ruleTurnTable EOF )
            // InternalStl.g:640:2: iv_ruleTurnTable= ruleTurnTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTurnTableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTurnTable=ruleTurnTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTurnTable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTurnTable"


    // $ANTLR start "ruleTurnTable"
    // InternalStl.g:646:1: ruleTurnTable returns [EObject current=null] : (otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' (otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) )+ (otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) )+ ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) ;
    public final EObject ruleTurnTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_cost_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_inputSlots_7_0 = null;

        EObject lv_outputSlots_9_0 = null;

        EObject lv_services_10_0 = null;



        	enterRule();

        try {
            // InternalStl.g:652:2: ( (otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' (otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) )+ (otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) )+ ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) )
            // InternalStl.g:653:2: (otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' (otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) )+ (otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) )+ ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            {
            // InternalStl.g:653:2: (otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' (otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) )+ (otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) )+ ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            // InternalStl.g:654:3: otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' (otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) )+ (otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) )+ ( (lv_services_10_0= ruleService ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTurnTableAccess().getTurntableKeyword_0());
              		
            }
            // InternalStl.g:658:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:659:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:659:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:660:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTurnTableAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTurnTableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTurnTableAccess().getCostKeyword_2());
              		
            }
            // InternalStl.g:680:3: ( (lv_cost_3_0= RULE_INT ) )
            // InternalStl.g:681:4: (lv_cost_3_0= RULE_INT )
            {
            // InternalStl.g:681:4: (lv_cost_3_0= RULE_INT )
            // InternalStl.g:682:5: lv_cost_3_0= RULE_INT
            {
            lv_cost_3_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_cost_3_0, grammarAccess.getTurnTableAccess().getCostINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTurnTableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"cost",
              						lv_cost_3_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTurnTableAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,12,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTurnTableAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalStl.g:706:3: (otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalStl.g:707:4: otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) )
            	    {
            	    otherlv_6=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getTurnTableAccess().getInputKeyword_6_0());
            	      			
            	    }
            	    // InternalStl.g:711:4: ( (lv_inputSlots_7_0= ruleSlot ) )
            	    // InternalStl.g:712:5: (lv_inputSlots_7_0= ruleSlot )
            	    {
            	    // InternalStl.g:712:5: (lv_inputSlots_7_0= ruleSlot )
            	    // InternalStl.g:713:6: lv_inputSlots_7_0= ruleSlot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTurnTableAccess().getInputSlotsSlotParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_inputSlots_7_0=ruleSlot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTurnTableRule());
            	      						}
            	      						add(
            	      							current,
            	      							"inputSlots",
            	      							lv_inputSlots_7_0,
            	      							"at.ac.tuwien.big.Stl.Slot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalStl.g:731:3: (otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalStl.g:732:4: otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) )
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getTurnTableAccess().getOutputKeyword_7_0());
            	      			
            	    }
            	    // InternalStl.g:736:4: ( (lv_outputSlots_9_0= ruleSlot ) )
            	    // InternalStl.g:737:5: (lv_outputSlots_9_0= ruleSlot )
            	    {
            	    // InternalStl.g:737:5: (lv_outputSlots_9_0= ruleSlot )
            	    // InternalStl.g:738:6: lv_outputSlots_9_0= ruleSlot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTurnTableAccess().getOutputSlotsSlotParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_outputSlots_9_0=ruleSlot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTurnTableRule());
            	      						}
            	      						add(
            	      							current,
            	      							"outputSlots",
            	      							lv_outputSlots_9_0,
            	      							"at.ac.tuwien.big.Stl.Slot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalStl.g:756:3: ( (lv_services_10_0= ruleService ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalStl.g:757:4: (lv_services_10_0= ruleService )
            	    {
            	    // InternalStl.g:757:4: (lv_services_10_0= ruleService )
            	    // InternalStl.g:758:5: lv_services_10_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTurnTableAccess().getServicesServiceParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_services_10_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTurnTableRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_10_0,
            	      						"at.ac.tuwien.big.Stl.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTurnTableAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTurnTable"


    // $ANTLR start "entryRuleMachine"
    // InternalStl.g:783:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalStl.g:783:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalStl.g:784:2: iv_ruleMachine= ruleMachine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMachineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMachine; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalStl.g:790:1: ruleMachine returns [EObject current=null] : (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' (otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) )+ (otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) )+ ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_cost_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_inputSlots_7_0 = null;

        EObject lv_outputSlots_9_0 = null;

        EObject lv_services_10_0 = null;



        	enterRule();

        try {
            // InternalStl.g:796:2: ( (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' (otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) )+ (otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) )+ ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) )
            // InternalStl.g:797:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' (otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) )+ (otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) )+ ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            {
            // InternalStl.g:797:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' (otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) )+ (otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) )+ ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            // InternalStl.g:798:3: otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' (otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) )+ (otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) )+ ( (lv_services_10_0= ruleService ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getMachineKeyword_0());
              		
            }
            // InternalStl.g:802:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:803:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:803:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:804:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMachineRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getCostKeyword_2());
              		
            }
            // InternalStl.g:824:3: ( (lv_cost_3_0= RULE_INT ) )
            // InternalStl.g:825:4: (lv_cost_3_0= RULE_INT )
            {
            // InternalStl.g:825:4: (lv_cost_3_0= RULE_INT )
            // InternalStl.g:826:5: lv_cost_3_0= RULE_INT
            {
            lv_cost_3_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_cost_3_0, grammarAccess.getMachineAccess().getCostINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMachineRule());
              					}
              					setWithLastConsumed(
              						current,
              						"cost",
              						lv_cost_3_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,12,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalStl.g:850:3: (otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalStl.g:851:4: otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) )
            	    {
            	    otherlv_6=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getInputKeyword_6_0());
            	      			
            	    }
            	    // InternalStl.g:855:4: ( (lv_inputSlots_7_0= ruleSlot ) )
            	    // InternalStl.g:856:5: (lv_inputSlots_7_0= ruleSlot )
            	    {
            	    // InternalStl.g:856:5: (lv_inputSlots_7_0= ruleSlot )
            	    // InternalStl.g:857:6: lv_inputSlots_7_0= ruleSlot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMachineAccess().getInputSlotsSlotParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_inputSlots_7_0=ruleSlot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMachineRule());
            	      						}
            	      						add(
            	      							current,
            	      							"inputSlots",
            	      							lv_inputSlots_7_0,
            	      							"at.ac.tuwien.big.Stl.Slot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // InternalStl.g:875:3: (otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalStl.g:876:4: otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) )
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getMachineAccess().getOutputKeyword_7_0());
            	      			
            	    }
            	    // InternalStl.g:880:4: ( (lv_outputSlots_9_0= ruleSlot ) )
            	    // InternalStl.g:881:5: (lv_outputSlots_9_0= ruleSlot )
            	    {
            	    // InternalStl.g:881:5: (lv_outputSlots_9_0= ruleSlot )
            	    // InternalStl.g:882:6: lv_outputSlots_9_0= ruleSlot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMachineAccess().getOutputSlotsSlotParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_outputSlots_9_0=ruleSlot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMachineRule());
            	      						}
            	      						add(
            	      							current,
            	      							"outputSlots",
            	      							lv_outputSlots_9_0,
            	      							"at.ac.tuwien.big.Stl.Slot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // InternalStl.g:900:3: ( (lv_services_10_0= ruleService ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalStl.g:901:4: (lv_services_10_0= ruleService )
            	    {
            	    // InternalStl.g:901:4: (lv_services_10_0= ruleService )
            	    // InternalStl.g:902:5: lv_services_10_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMachineAccess().getServicesServiceParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_services_10_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMachineRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_10_0,
            	      						"at.ac.tuwien.big.Stl.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleBuffer"
    // InternalStl.g:927:1: entryRuleBuffer returns [EObject current=null] : iv_ruleBuffer= ruleBuffer EOF ;
    public final EObject entryRuleBuffer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuffer = null;


        try {
            // InternalStl.g:927:47: (iv_ruleBuffer= ruleBuffer EOF )
            // InternalStl.g:928:2: iv_ruleBuffer= ruleBuffer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBufferRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBuffer=ruleBuffer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuffer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBuffer"


    // $ANTLR start "ruleBuffer"
    // InternalStl.g:934:1: ruleBuffer returns [EObject current=null] : (otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) ;
    public final EObject ruleBuffer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_cost_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_inputSlots_7_0 = null;

        EObject lv_outputSlots_9_0 = null;

        EObject lv_services_10_0 = null;



        	enterRule();

        try {
            // InternalStl.g:940:2: ( (otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) )
            // InternalStl.g:941:2: (otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            {
            // InternalStl.g:941:2: (otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            // InternalStl.g:942:3: otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ')' otherlv_5= '{' otherlv_6= 'input' ( (lv_inputSlots_7_0= ruleSlot ) ) otherlv_8= 'output' ( (lv_outputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBufferAccess().getBufferKeyword_0());
              		
            }
            // InternalStl.g:946:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:947:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:947:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:948:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getBufferAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBufferRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBufferAccess().getCostKeyword_2());
              		
            }
            // InternalStl.g:968:3: ( (lv_cost_3_0= RULE_INT ) )
            // InternalStl.g:969:4: (lv_cost_3_0= RULE_INT )
            {
            // InternalStl.g:969:4: (lv_cost_3_0= RULE_INT )
            // InternalStl.g:970:5: lv_cost_3_0= RULE_INT
            {
            lv_cost_3_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_cost_3_0, grammarAccess.getBufferAccess().getCostINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBufferRule());
              					}
              					setWithLastConsumed(
              						current,
              						"cost",
              						lv_cost_3_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBufferAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,12,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBufferAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBufferAccess().getInputKeyword_6());
              		
            }
            // InternalStl.g:998:3: ( (lv_inputSlots_7_0= ruleSlot ) )
            // InternalStl.g:999:4: (lv_inputSlots_7_0= ruleSlot )
            {
            // InternalStl.g:999:4: (lv_inputSlots_7_0= ruleSlot )
            // InternalStl.g:1000:5: lv_inputSlots_7_0= ruleSlot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBufferAccess().getInputSlotsSlotParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_inputSlots_7_0=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBufferRule());
              					}
              					add(
              						current,
              						"inputSlots",
              						lv_inputSlots_7_0,
              						"at.ac.tuwien.big.Stl.Slot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getBufferAccess().getOutputKeyword_8());
              		
            }
            // InternalStl.g:1021:3: ( (lv_outputSlots_9_0= ruleSlot ) )
            // InternalStl.g:1022:4: (lv_outputSlots_9_0= ruleSlot )
            {
            // InternalStl.g:1022:4: (lv_outputSlots_9_0= ruleSlot )
            // InternalStl.g:1023:5: lv_outputSlots_9_0= ruleSlot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBufferAccess().getOutputSlotsSlotParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_outputSlots_9_0=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBufferRule());
              					}
              					add(
              						current,
              						"outputSlots",
              						lv_outputSlots_9_0,
              						"at.ac.tuwien.big.Stl.Slot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStl.g:1040:3: ( (lv_services_10_0= ruleService ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalStl.g:1041:4: (lv_services_10_0= ruleService )
            	    {
            	    // InternalStl.g:1041:4: (lv_services_10_0= ruleService )
            	    // InternalStl.g:1042:5: lv_services_10_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBufferAccess().getServicesServiceParserRuleCall_10_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_services_10_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBufferRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_10_0,
            	      						"at.ac.tuwien.big.Stl.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getBufferAccess().getRightCurlyBracketKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBuffer"


    // $ANTLR start "entryRuleStore"
    // InternalStl.g:1067:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalStl.g:1067:46: (iv_ruleStore= ruleStore EOF )
            // InternalStl.g:1068:2: iv_ruleStore= ruleStore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStore; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalStl.g:1074:1: ruleStore returns [EObject current=null] : (this_ProductStore_0= ruleProductStore | this_WasteStore_1= ruleWasteStore ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        EObject this_ProductStore_0 = null;

        EObject this_WasteStore_1 = null;



        	enterRule();

        try {
            // InternalStl.g:1080:2: ( (this_ProductStore_0= ruleProductStore | this_WasteStore_1= ruleWasteStore ) )
            // InternalStl.g:1081:2: (this_ProductStore_0= ruleProductStore | this_WasteStore_1= ruleWasteStore )
            {
            // InternalStl.g:1081:2: (this_ProductStore_0= ruleProductStore | this_WasteStore_1= ruleWasteStore )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalStl.g:1082:3: this_ProductStore_0= ruleProductStore
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStoreAccess().getProductStoreParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProductStore_0=ruleProductStore();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProductStore_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStl.g:1091:3: this_WasteStore_1= ruleWasteStore
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStoreAccess().getWasteStoreParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WasteStore_1=ruleWasteStore();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WasteStore_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleProductStore"
    // InternalStl.g:1103:1: entryRuleProductStore returns [EObject current=null] : iv_ruleProductStore= ruleProductStore EOF ;
    public final EObject entryRuleProductStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductStore = null;


        try {
            // InternalStl.g:1103:53: (iv_ruleProductStore= ruleProductStore EOF )
            // InternalStl.g:1104:2: iv_ruleProductStore= ruleProductStore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProductStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProductStore=ruleProductStore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProductStore; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProductStore"


    // $ANTLR start "ruleProductStore"
    // InternalStl.g:1110:1: ruleProductStore returns [EObject current=null] : (otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'input' ( (lv_inputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) ;
    public final EObject ruleProductStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_cost_3_0=null;
        Token otherlv_4=null;
        Token lv_capacity_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_inputSlots_9_0 = null;

        EObject lv_services_10_0 = null;



        	enterRule();

        try {
            // InternalStl.g:1116:2: ( (otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'input' ( (lv_inputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) )
            // InternalStl.g:1117:2: (otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'input' ( (lv_inputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            {
            // InternalStl.g:1117:2: (otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'input' ( (lv_inputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            // InternalStl.g:1118:3: otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'input' ( (lv_inputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProductStoreAccess().getProductStoreKeyword_0());
              		
            }
            // InternalStl.g:1122:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:1123:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:1123:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:1124:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getProductStoreAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProductStoreRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProductStoreAccess().getCostKeyword_2());
              		
            }
            // InternalStl.g:1144:3: ( (lv_cost_3_0= RULE_INT ) )
            // InternalStl.g:1145:4: (lv_cost_3_0= RULE_INT )
            {
            // InternalStl.g:1145:4: (lv_cost_3_0= RULE_INT )
            // InternalStl.g:1146:5: lv_cost_3_0= RULE_INT
            {
            lv_cost_3_0=(Token)match(input,RULE_INT,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_cost_3_0, grammarAccess.getProductStoreAccess().getCostINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProductStoreRule());
              					}
              					setWithLastConsumed(
              						current,
              						"cost",
              						lv_cost_3_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProductStoreAccess().getCapacityKeyword_4());
              		
            }
            // InternalStl.g:1166:3: ( (lv_capacity_5_0= RULE_INT ) )
            // InternalStl.g:1167:4: (lv_capacity_5_0= RULE_INT )
            {
            // InternalStl.g:1167:4: (lv_capacity_5_0= RULE_INT )
            // InternalStl.g:1168:5: lv_capacity_5_0= RULE_INT
            {
            lv_capacity_5_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_capacity_5_0, grammarAccess.getProductStoreAccess().getCapacityINTTerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProductStoreRule());
              					}
              					setWithLastConsumed(
              						current,
              						"capacity",
              						lv_capacity_5_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getProductStoreAccess().getRightParenthesisKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,12,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getProductStoreAccess().getLeftCurlyBracketKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getProductStoreAccess().getInputKeyword_8());
              		
            }
            // InternalStl.g:1196:3: ( (lv_inputSlots_9_0= ruleSlot ) )
            // InternalStl.g:1197:4: (lv_inputSlots_9_0= ruleSlot )
            {
            // InternalStl.g:1197:4: (lv_inputSlots_9_0= ruleSlot )
            // InternalStl.g:1198:5: lv_inputSlots_9_0= ruleSlot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProductStoreAccess().getInputSlotsSlotParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_inputSlots_9_0=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProductStoreRule());
              					}
              					add(
              						current,
              						"inputSlots",
              						lv_inputSlots_9_0,
              						"at.ac.tuwien.big.Stl.Slot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStl.g:1215:3: ( (lv_services_10_0= ruleService ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalStl.g:1216:4: (lv_services_10_0= ruleService )
            	    {
            	    // InternalStl.g:1216:4: (lv_services_10_0= ruleService )
            	    // InternalStl.g:1217:5: lv_services_10_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProductStoreAccess().getServicesServiceParserRuleCall_10_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_services_10_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProductStoreRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_10_0,
            	      						"at.ac.tuwien.big.Stl.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getProductStoreAccess().getRightCurlyBracketKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProductStore"


    // $ANTLR start "entryRuleWasteStore"
    // InternalStl.g:1242:1: entryRuleWasteStore returns [EObject current=null] : iv_ruleWasteStore= ruleWasteStore EOF ;
    public final EObject entryRuleWasteStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWasteStore = null;


        try {
            // InternalStl.g:1242:51: (iv_ruleWasteStore= ruleWasteStore EOF )
            // InternalStl.g:1243:2: iv_ruleWasteStore= ruleWasteStore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWasteStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWasteStore=ruleWasteStore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWasteStore; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWasteStore"


    // $ANTLR start "ruleWasteStore"
    // InternalStl.g:1249:1: ruleWasteStore returns [EObject current=null] : (otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'input' ( (lv_inputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) ;
    public final EObject ruleWasteStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_cost_3_0=null;
        Token otherlv_4=null;
        Token lv_capacity_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_inputSlots_9_0 = null;

        EObject lv_services_10_0 = null;



        	enterRule();

        try {
            // InternalStl.g:1255:2: ( (otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'input' ( (lv_inputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' ) )
            // InternalStl.g:1256:2: (otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'input' ( (lv_inputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            {
            // InternalStl.g:1256:2: (otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'input' ( (lv_inputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}' )
            // InternalStl.g:1257:3: otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= RULE_INT ) ) otherlv_6= ')' otherlv_7= '{' otherlv_8= 'input' ( (lv_inputSlots_9_0= ruleSlot ) ) ( (lv_services_10_0= ruleService ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWasteStoreAccess().getWasteStoreKeyword_0());
              		
            }
            // InternalStl.g:1261:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:1262:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:1262:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:1263:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getWasteStoreAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWasteStoreRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWasteStoreAccess().getCostKeyword_2());
              		
            }
            // InternalStl.g:1283:3: ( (lv_cost_3_0= RULE_INT ) )
            // InternalStl.g:1284:4: (lv_cost_3_0= RULE_INT )
            {
            // InternalStl.g:1284:4: (lv_cost_3_0= RULE_INT )
            // InternalStl.g:1285:5: lv_cost_3_0= RULE_INT
            {
            lv_cost_3_0=(Token)match(input,RULE_INT,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_cost_3_0, grammarAccess.getWasteStoreAccess().getCostINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWasteStoreRule());
              					}
              					setWithLastConsumed(
              						current,
              						"cost",
              						lv_cost_3_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWasteStoreAccess().getCapacityKeyword_4());
              		
            }
            // InternalStl.g:1305:3: ( (lv_capacity_5_0= RULE_INT ) )
            // InternalStl.g:1306:4: (lv_capacity_5_0= RULE_INT )
            {
            // InternalStl.g:1306:4: (lv_capacity_5_0= RULE_INT )
            // InternalStl.g:1307:5: lv_capacity_5_0= RULE_INT
            {
            lv_capacity_5_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_capacity_5_0, grammarAccess.getWasteStoreAccess().getCapacityINTTerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWasteStoreRule());
              					}
              					setWithLastConsumed(
              						current,
              						"capacity",
              						lv_capacity_5_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getWasteStoreAccess().getRightParenthesisKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,12,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getWasteStoreAccess().getLeftCurlyBracketKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getWasteStoreAccess().getInputKeyword_8());
              		
            }
            // InternalStl.g:1335:3: ( (lv_inputSlots_9_0= ruleSlot ) )
            // InternalStl.g:1336:4: (lv_inputSlots_9_0= ruleSlot )
            {
            // InternalStl.g:1336:4: (lv_inputSlots_9_0= ruleSlot )
            // InternalStl.g:1337:5: lv_inputSlots_9_0= ruleSlot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWasteStoreAccess().getInputSlotsSlotParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_inputSlots_9_0=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWasteStoreRule());
              					}
              					add(
              						current,
              						"inputSlots",
              						lv_inputSlots_9_0,
              						"at.ac.tuwien.big.Stl.Slot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStl.g:1354:3: ( (lv_services_10_0= ruleService ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalStl.g:1355:4: (lv_services_10_0= ruleService )
            	    {
            	    // InternalStl.g:1355:4: (lv_services_10_0= ruleService )
            	    // InternalStl.g:1356:5: lv_services_10_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWasteStoreAccess().getServicesServiceParserRuleCall_10_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_services_10_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWasteStoreRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_10_0,
            	      						"at.ac.tuwien.big.Stl.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getWasteStoreAccess().getRightCurlyBracketKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWasteStore"


    // $ANTLR start "entryRuleConnector"
    // InternalStl.g:1381:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalStl.g:1381:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalStl.g:1382:2: iv_ruleConnector= ruleConnector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalStl.g:1388:1: ruleConnector returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '>' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalStl.g:1394:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '>' ( ( ruleQualifiedName ) ) ) )
            // InternalStl.g:1395:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '>' ( ( ruleQualifiedName ) ) )
            {
            // InternalStl.g:1395:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '>' ( ( ruleQualifiedName ) ) )
            // InternalStl.g:1396:3: ( ( ruleQualifiedName ) ) otherlv_1= '>' ( ( ruleQualifiedName ) )
            {
            // InternalStl.g:1396:3: ( ( ruleQualifiedName ) )
            // InternalStl.g:1397:4: ( ruleQualifiedName )
            {
            // InternalStl.g:1397:4: ( ruleQualifiedName )
            // InternalStl.g:1398:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectorRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectorAccess().getEntrySlotCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectorAccess().getGreaterThanSignKeyword_1());
              		
            }
            // InternalStl.g:1416:3: ( ( ruleQualifiedName ) )
            // InternalStl.g:1417:4: ( ruleQualifiedName )
            {
            // InternalStl.g:1417:4: ( ruleQualifiedName )
            // InternalStl.g:1418:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectorRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectorAccess().getExitSlotCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleSlot"
    // InternalStl.g:1436:1: entryRuleSlot returns [EObject current=null] : iv_ruleSlot= ruleSlot EOF ;
    public final EObject entryRuleSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlot = null;


        try {
            // InternalStl.g:1436:45: (iv_ruleSlot= ruleSlot EOF )
            // InternalStl.g:1437:2: iv_ruleSlot= ruleSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSlot=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSlot"


    // $ANTLR start "ruleSlot"
    // InternalStl.g:1443:1: ruleSlot returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSlot() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalStl.g:1449:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalStl.g:1450:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalStl.g:1450:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalStl.g:1451:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalStl.g:1451:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalStl.g:1452:4: (lv_name_0_0= RULE_ID )
            {
            // InternalStl.g:1452:4: (lv_name_0_0= RULE_ID )
            // InternalStl.g:1453:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getSlotAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSlotRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlotAccess().getColonKeyword_1());
              		
            }
            // InternalStl.g:1473:3: ( ( ruleQualifiedName ) )
            // InternalStl.g:1474:4: ( ruleQualifiedName )
            {
            // InternalStl.g:1474:4: ( ruleQualifiedName )
            // InternalStl.g:1475:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSlotRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlotAccess().getRequiredTypeItemTypeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSlot"


    // $ANTLR start "entryRuleService"
    // InternalStl.g:1493:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalStl.g:1493:48: (iv_ruleService= ruleService EOF )
            // InternalStl.g:1494:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalStl.g:1500:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',reliability=' ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ',processingTime=' ( (lv_processingTime_7_0= RULE_INT ) ) otherlv_8= ')' (otherlv_9= '{' (otherlv_10= 'input' ( (lv_parameters_11_0= ruleParameter ) ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_cost_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_processingTime_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_reliability_5_0 = null;

        EObject lv_parameters_11_0 = null;



        	enterRule();

        try {
            // InternalStl.g:1506:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',reliability=' ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ',processingTime=' ( (lv_processingTime_7_0= RULE_INT ) ) otherlv_8= ')' (otherlv_9= '{' (otherlv_10= 'input' ( (lv_parameters_11_0= ruleParameter ) ) )* otherlv_12= '}' )? ) )
            // InternalStl.g:1507:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',reliability=' ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ',processingTime=' ( (lv_processingTime_7_0= RULE_INT ) ) otherlv_8= ')' (otherlv_9= '{' (otherlv_10= 'input' ( (lv_parameters_11_0= ruleParameter ) ) )* otherlv_12= '}' )? )
            {
            // InternalStl.g:1507:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',reliability=' ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ',processingTime=' ( (lv_processingTime_7_0= RULE_INT ) ) otherlv_8= ')' (otherlv_9= '{' (otherlv_10= 'input' ( (lv_parameters_11_0= ruleParameter ) ) )* otherlv_12= '}' )? )
            // InternalStl.g:1508:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= RULE_INT ) ) otherlv_4= ',reliability=' ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ',processingTime=' ( (lv_processingTime_7_0= RULE_INT ) ) otherlv_8= ')' (otherlv_9= '{' (otherlv_10= 'input' ( (lv_parameters_11_0= ruleParameter ) ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
              		
            }
            // InternalStl.g:1512:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:1513:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:1513:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:1514:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getServiceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getCostKeyword_2());
              		
            }
            // InternalStl.g:1534:3: ( (lv_cost_3_0= RULE_INT ) )
            // InternalStl.g:1535:4: (lv_cost_3_0= RULE_INT )
            {
            // InternalStl.g:1535:4: (lv_cost_3_0= RULE_INT )
            // InternalStl.g:1536:5: lv_cost_3_0= RULE_INT
            {
            lv_cost_3_0=(Token)match(input,RULE_INT,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_cost_3_0, grammarAccess.getServiceAccess().getCostINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getServiceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"cost",
              						lv_cost_3_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getReliabilityKeyword_4());
              		
            }
            // InternalStl.g:1556:3: ( (lv_reliability_5_0= ruleEDouble ) )
            // InternalStl.g:1557:4: (lv_reliability_5_0= ruleEDouble )
            {
            // InternalStl.g:1557:4: (lv_reliability_5_0= ruleEDouble )
            // InternalStl.g:1558:5: lv_reliability_5_0= ruleEDouble
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getServiceAccess().getReliabilityEDoubleParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_reliability_5_0=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getServiceRule());
              					}
              					set(
              						current,
              						"reliability",
              						lv_reliability_5_0,
              						"at.ac.tuwien.big.Stl.EDouble");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getProcessingTimeKeyword_6());
              		
            }
            // InternalStl.g:1579:3: ( (lv_processingTime_7_0= RULE_INT ) )
            // InternalStl.g:1580:4: (lv_processingTime_7_0= RULE_INT )
            {
            // InternalStl.g:1580:4: (lv_processingTime_7_0= RULE_INT )
            // InternalStl.g:1581:5: lv_processingTime_7_0= RULE_INT
            {
            lv_processingTime_7_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_processingTime_7_0, grammarAccess.getServiceAccess().getProcessingTimeINTTerminalRuleCall_7_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getServiceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"processingTime",
              						lv_processingTime_7_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getRightParenthesisKeyword_8());
              		
            }
            // InternalStl.g:1601:3: (otherlv_9= '{' (otherlv_10= 'input' ( (lv_parameters_11_0= ruleParameter ) ) )* otherlv_12= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalStl.g:1602:4: otherlv_9= '{' (otherlv_10= 'input' ( (lv_parameters_11_0= ruleParameter ) ) )* otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,12,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_9_0());
                      			
                    }
                    // InternalStl.g:1606:4: (otherlv_10= 'input' ( (lv_parameters_11_0= ruleParameter ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==23) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalStl.g:1607:5: otherlv_10= 'input' ( (lv_parameters_11_0= ruleParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getInputKeyword_9_1_0());
                    	      				
                    	    }
                    	    // InternalStl.g:1611:5: ( (lv_parameters_11_0= ruleParameter ) )
                    	    // InternalStl.g:1612:6: (lv_parameters_11_0= ruleParameter )
                    	    {
                    	    // InternalStl.g:1612:6: (lv_parameters_11_0= ruleParameter )
                    	    // InternalStl.g:1613:7: lv_parameters_11_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getServiceAccess().getParametersParameterParserRuleCall_9_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_27);
                    	    lv_parameters_11_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getServiceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_11_0,
                    	      								"at.ac.tuwien.big.Stl.Parameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleParameter"
    // InternalStl.g:1640:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalStl.g:1640:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalStl.g:1641:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalStl.g:1647:1: ruleParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStl.g:1653:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStl.g:1654:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStl.g:1654:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStl.g:1655:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStl.g:1655:3: (lv_name_0_0= RULE_ID )
            // InternalStl.g:1656:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getParameterRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalStl.g:1675:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalStl.g:1675:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalStl.g:1676:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalStl.g:1682:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalStl.g:1688:2: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalStl.g:1689:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalStl.g:1689:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalStl.g:1690:3: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalStl.g:1697:3: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) && (synpred1_InternalStl())) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalStl.g:1698:4: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalStl.g:1698:4: ( ( '.' )=>kw= '.' )
            	    // InternalStl.g:1699:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEDouble"
    // InternalStl.g:1718:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalStl.g:1718:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalStl.g:1719:2: iv_ruleEDouble= ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDouble.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalStl.g:1725:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalStl.g:1731:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalStl.g:1732:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalStl.g:1732:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalStl.g:1733:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalStl.g:1733:3: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalStl.g:1734:4: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalStl.g:1740:3: (this_INT_1= RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalStl.g:1741:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,35,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
              		
            }
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
              		
            }
            // InternalStl.g:1761:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=37 && LA25_0<=38)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalStl.g:1762:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalStl.g:1762:4: (kw= 'E' | kw= 'e' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==37) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==38) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalStl.g:1763:5: kw= 'E'
                            {
                            kw=(Token)match(input,37,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalStl.g:1769:5: kw= 'e'
                            {
                            kw=(Token)match(input,38,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalStl.g:1775:4: (kw= '-' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==36) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalStl.g:1776:5: kw= '-'
                            {
                            kw=(Token)match(input,36,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                              				
                            }

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // InternalStl.g:1794:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalStl.g:1794:47: (iv_ruleEString= ruleEString EOF )
            // InternalStl.g:1795:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalStl.g:1801:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalStl.g:1807:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalStl.g:1808:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalStl.g:1808:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalStl.g:1809:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStl.g:1817:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEString"

    // $ANTLR start synpred1_InternalStl
    public final void synpred1_InternalStl_fragment() throws RecognitionException {   
        // InternalStl.g:1699:5: ( '.' )
        // InternalStl.g:1699:6: '.'
        {
        match(input,35,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalStl

    // Delegated rules

    public final boolean synpred1_InternalStl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalStl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000002F422010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100202000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001800000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000020L});

}