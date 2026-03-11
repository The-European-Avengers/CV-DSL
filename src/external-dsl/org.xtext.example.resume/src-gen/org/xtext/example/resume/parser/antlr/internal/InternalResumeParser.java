package org.xtext.example.resume.parser.antlr.internal;

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
import org.xtext.example.resume.services.ResumeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalResumeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Metadata'", "'style:'", "'font:'", "'imgPath:'", "'Userdata'", "'name:'", "'email:'", "'telephoneNumber:'", "'direction:'", "'city:'", "'country:'", "'Experience'", "'language:'", "'title:'", "'description:'", "'company:'", "'startDate:'", "'endDate:'", "'tags:'", "'Projects'", "'technologies:'", "'link:'", "'Education'", "'institution:'", "'graduationDate:'", "'Skills'", "'Interests'", "'Languages'", "'Customization'", "'include'", "'Profile'", "'where'", "'language'", "'tags'", "'startDate'", "'after'", "'endDate'", "'before'", "'['", "','", "']'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalResumeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalResumeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalResumeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalResume.g"; }



     	private ResumeGrammarAccess grammarAccess;

        public InternalResumeParser(TokenStream input, ResumeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Profile";
       	}

       	@Override
       	protected ResumeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProfile"
    // InternalResume.g:65:1: entryRuleProfile returns [EObject current=null] : iv_ruleProfile= ruleProfile EOF ;
    public final EObject entryRuleProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfile = null;


        try {
            // InternalResume.g:65:48: (iv_ruleProfile= ruleProfile EOF )
            // InternalResume.g:66:2: iv_ruleProfile= ruleProfile EOF
            {
             newCompositeNode(grammarAccess.getProfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfile=ruleProfile();

            state._fsp--;

             current =iv_ruleProfile; 
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
    // $ANTLR end "entryRuleProfile"


    // $ANTLR start "ruleProfile"
    // InternalResume.g:72:1: ruleProfile returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) ) ) ;
    public final EObject ruleProfile() throws RecognitionException {
        EObject current = null;

        EObject lv_metadata_0_0 = null;

        EObject lv_userdata_1_0 = null;

        EObject lv_sections_2_0 = null;

        EObject lv_customization_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:78:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) ) ) )
            // InternalResume.g:79:2: ( ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) ) )
            {
            // InternalResume.g:79:2: ( ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) ) )
            // InternalResume.g:80:3: ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) )
            {
            // InternalResume.g:80:3: ( (lv_metadata_0_0= ruleMetadata ) )
            // InternalResume.g:81:4: (lv_metadata_0_0= ruleMetadata )
            {
            // InternalResume.g:81:4: (lv_metadata_0_0= ruleMetadata )
            // InternalResume.g:82:5: lv_metadata_0_0= ruleMetadata
            {

            					newCompositeNode(grammarAccess.getProfileAccess().getMetadataMetadataParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_metadata_0_0=ruleMetadata();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileRule());
            					}
            					set(
            						current,
            						"metadata",
            						lv_metadata_0_0,
            						"org.xtext.example.resume.Resume.Metadata");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalResume.g:99:3: ( (lv_userdata_1_0= ruleUserdata ) )
            // InternalResume.g:100:4: (lv_userdata_1_0= ruleUserdata )
            {
            // InternalResume.g:100:4: (lv_userdata_1_0= ruleUserdata )
            // InternalResume.g:101:5: lv_userdata_1_0= ruleUserdata
            {

            					newCompositeNode(grammarAccess.getProfileAccess().getUserdataUserdataParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_userdata_1_0=ruleUserdata();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileRule());
            					}
            					set(
            						current,
            						"userdata",
            						lv_userdata_1_0,
            						"org.xtext.example.resume.Resume.Userdata");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalResume.g:118:3: ( (lv_sections_2_0= ruleSection ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22||LA1_0==30||LA1_0==33||(LA1_0>=36 && LA1_0<=38)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalResume.g:119:4: (lv_sections_2_0= ruleSection )
            	    {
            	    // InternalResume.g:119:4: (lv_sections_2_0= ruleSection )
            	    // InternalResume.g:120:5: lv_sections_2_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getProfileAccess().getSectionsSectionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_sections_2_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_2_0,
            	    						"org.xtext.example.resume.Resume.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalResume.g:137:3: ( (lv_customization_3_0= ruleCustomization ) )
            // InternalResume.g:138:4: (lv_customization_3_0= ruleCustomization )
            {
            // InternalResume.g:138:4: (lv_customization_3_0= ruleCustomization )
            // InternalResume.g:139:5: lv_customization_3_0= ruleCustomization
            {

            					newCompositeNode(grammarAccess.getProfileAccess().getCustomizationCustomizationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_customization_3_0=ruleCustomization();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileRule());
            					}
            					set(
            						current,
            						"customization",
            						lv_customization_3_0,
            						"org.xtext.example.resume.Resume.Customization");
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
    // $ANTLR end "ruleProfile"


    // $ANTLR start "entryRuleMetadata"
    // InternalResume.g:160:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // InternalResume.g:160:49: (iv_ruleMetadata= ruleMetadata EOF )
            // InternalResume.g:161:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
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
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // InternalResume.g:167:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_style_2_0=null;
        Token otherlv_3=null;
        Token lv_font_4_0=null;
        Token otherlv_5=null;
        Token lv_imgPath_6_0=null;


        	enterRule();

        try {
            // InternalResume.g:173:2: ( (otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) ) ) )
            // InternalResume.g:174:2: (otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) ) )
            {
            // InternalResume.g:174:2: (otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) ) )
            // InternalResume.g:175:3: otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getMetadataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMetadataAccess().getStyleKeyword_1());
            		
            // InternalResume.g:183:3: ( (lv_style_2_0= RULE_STRING ) )
            // InternalResume.g:184:4: (lv_style_2_0= RULE_STRING )
            {
            // InternalResume.g:184:4: (lv_style_2_0= RULE_STRING )
            // InternalResume.g:185:5: lv_style_2_0= RULE_STRING
            {
            lv_style_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_style_2_0, grammarAccess.getMetadataAccess().getStyleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetadataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"style",
            						lv_style_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMetadataAccess().getFontKeyword_3());
            		
            // InternalResume.g:205:3: ( (lv_font_4_0= RULE_STRING ) )
            // InternalResume.g:206:4: (lv_font_4_0= RULE_STRING )
            {
            // InternalResume.g:206:4: (lv_font_4_0= RULE_STRING )
            // InternalResume.g:207:5: lv_font_4_0= RULE_STRING
            {
            lv_font_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_font_4_0, grammarAccess.getMetadataAccess().getFontSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetadataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"font",
            						lv_font_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getMetadataAccess().getImgPathKeyword_5());
            		
            // InternalResume.g:227:3: ( (lv_imgPath_6_0= RULE_STRING ) )
            // InternalResume.g:228:4: (lv_imgPath_6_0= RULE_STRING )
            {
            // InternalResume.g:228:4: (lv_imgPath_6_0= RULE_STRING )
            // InternalResume.g:229:5: lv_imgPath_6_0= RULE_STRING
            {
            lv_imgPath_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_imgPath_6_0, grammarAccess.getMetadataAccess().getImgPathSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetadataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"imgPath",
            						lv_imgPath_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleUserdata"
    // InternalResume.g:249:1: entryRuleUserdata returns [EObject current=null] : iv_ruleUserdata= ruleUserdata EOF ;
    public final EObject entryRuleUserdata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserdata = null;


        try {
            // InternalResume.g:249:49: (iv_ruleUserdata= ruleUserdata EOF )
            // InternalResume.g:250:2: iv_ruleUserdata= ruleUserdata EOF
            {
             newCompositeNode(grammarAccess.getUserdataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserdata=ruleUserdata();

            state._fsp--;

             current =iv_ruleUserdata; 
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
    // $ANTLR end "entryRuleUserdata"


    // $ANTLR start "ruleUserdata"
    // InternalResume.g:256:1: ruleUserdata returns [EObject current=null] : (otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) ) ) ;
    public final EObject ruleUserdata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_email_4_0=null;
        Token otherlv_5=null;
        Token lv_telephoneNumber_6_0=null;
        Token otherlv_7=null;
        Token lv_direction_8_0=null;
        Token otherlv_9=null;
        Token lv_city_10_0=null;
        Token otherlv_11=null;
        Token lv_country_12_0=null;


        	enterRule();

        try {
            // InternalResume.g:262:2: ( (otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) ) ) )
            // InternalResume.g:263:2: (otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) ) )
            {
            // InternalResume.g:263:2: (otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) ) )
            // InternalResume.g:264:3: otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUserdataAccess().getUserdataKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getUserdataAccess().getNameKeyword_1());
            		
            // InternalResume.g:272:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalResume.g:273:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalResume.g:273:4: (lv_name_2_0= RULE_STRING )
            // InternalResume.g:274:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getUserdataAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getUserdataAccess().getEmailKeyword_3());
            		
            // InternalResume.g:294:3: ( (lv_email_4_0= RULE_STRING ) )
            // InternalResume.g:295:4: (lv_email_4_0= RULE_STRING )
            {
            // InternalResume.g:295:4: (lv_email_4_0= RULE_STRING )
            // InternalResume.g:296:5: lv_email_4_0= RULE_STRING
            {
            lv_email_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_email_4_0, grammarAccess.getUserdataAccess().getEmailSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"email",
            						lv_email_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getUserdataAccess().getTelephoneNumberKeyword_5());
            		
            // InternalResume.g:316:3: ( (lv_telephoneNumber_6_0= RULE_STRING ) )
            // InternalResume.g:317:4: (lv_telephoneNumber_6_0= RULE_STRING )
            {
            // InternalResume.g:317:4: (lv_telephoneNumber_6_0= RULE_STRING )
            // InternalResume.g:318:5: lv_telephoneNumber_6_0= RULE_STRING
            {
            lv_telephoneNumber_6_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_telephoneNumber_6_0, grammarAccess.getUserdataAccess().getTelephoneNumberSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"telephoneNumber",
            						lv_telephoneNumber_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getUserdataAccess().getDirectionKeyword_7());
            		
            // InternalResume.g:338:3: ( (lv_direction_8_0= RULE_STRING ) )
            // InternalResume.g:339:4: (lv_direction_8_0= RULE_STRING )
            {
            // InternalResume.g:339:4: (lv_direction_8_0= RULE_STRING )
            // InternalResume.g:340:5: lv_direction_8_0= RULE_STRING
            {
            lv_direction_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_direction_8_0, grammarAccess.getUserdataAccess().getDirectionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"direction",
            						lv_direction_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getUserdataAccess().getCityKeyword_9());
            		
            // InternalResume.g:360:3: ( (lv_city_10_0= RULE_STRING ) )
            // InternalResume.g:361:4: (lv_city_10_0= RULE_STRING )
            {
            // InternalResume.g:361:4: (lv_city_10_0= RULE_STRING )
            // InternalResume.g:362:5: lv_city_10_0= RULE_STRING
            {
            lv_city_10_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_city_10_0, grammarAccess.getUserdataAccess().getCitySTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"city",
            						lv_city_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getUserdataAccess().getCountryKeyword_11());
            		
            // InternalResume.g:382:3: ( (lv_country_12_0= RULE_STRING ) )
            // InternalResume.g:383:4: (lv_country_12_0= RULE_STRING )
            {
            // InternalResume.g:383:4: (lv_country_12_0= RULE_STRING )
            // InternalResume.g:384:5: lv_country_12_0= RULE_STRING
            {
            lv_country_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_country_12_0, grammarAccess.getUserdataAccess().getCountrySTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"country",
            						lv_country_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleUserdata"


    // $ANTLR start "entryRuleSection"
    // InternalResume.g:404:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalResume.g:404:48: (iv_ruleSection= ruleSection EOF )
            // InternalResume.g:405:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalResume.g:411:1: ruleSection returns [EObject current=null] : (this_Experience_0= ruleExperience | this_Projects_1= ruleProjects | this_Education_2= ruleEducation | this_Skills_3= ruleSkills | this_Interests_4= ruleInterests | this_Languages_5= ruleLanguages ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        EObject this_Experience_0 = null;

        EObject this_Projects_1 = null;

        EObject this_Education_2 = null;

        EObject this_Skills_3 = null;

        EObject this_Interests_4 = null;

        EObject this_Languages_5 = null;



        	enterRule();

        try {
            // InternalResume.g:417:2: ( (this_Experience_0= ruleExperience | this_Projects_1= ruleProjects | this_Education_2= ruleEducation | this_Skills_3= ruleSkills | this_Interests_4= ruleInterests | this_Languages_5= ruleLanguages ) )
            // InternalResume.g:418:2: (this_Experience_0= ruleExperience | this_Projects_1= ruleProjects | this_Education_2= ruleEducation | this_Skills_3= ruleSkills | this_Interests_4= ruleInterests | this_Languages_5= ruleLanguages )
            {
            // InternalResume.g:418:2: (this_Experience_0= ruleExperience | this_Projects_1= ruleProjects | this_Education_2= ruleEducation | this_Skills_3= ruleSkills | this_Interests_4= ruleInterests | this_Languages_5= ruleLanguages )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
                }
                break;
            case 36:
                {
                alt2=4;
                }
                break;
            case 37:
                {
                alt2=5;
                }
                break;
            case 38:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalResume.g:419:3: this_Experience_0= ruleExperience
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getExperienceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Experience_0=ruleExperience();

                    state._fsp--;


                    			current = this_Experience_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalResume.g:428:3: this_Projects_1= ruleProjects
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getProjectsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Projects_1=ruleProjects();

                    state._fsp--;


                    			current = this_Projects_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalResume.g:437:3: this_Education_2= ruleEducation
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getEducationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Education_2=ruleEducation();

                    state._fsp--;


                    			current = this_Education_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalResume.g:446:3: this_Skills_3= ruleSkills
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getSkillsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Skills_3=ruleSkills();

                    state._fsp--;


                    			current = this_Skills_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalResume.g:455:3: this_Interests_4= ruleInterests
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getInterestsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interests_4=ruleInterests();

                    state._fsp--;


                    			current = this_Interests_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalResume.g:464:3: this_Languages_5= ruleLanguages
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getLanguagesParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Languages_5=ruleLanguages();

                    state._fsp--;


                    			current = this_Languages_5;
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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleExperience"
    // InternalResume.g:476:1: entryRuleExperience returns [EObject current=null] : iv_ruleExperience= ruleExperience EOF ;
    public final EObject entryRuleExperience() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperience = null;


        try {
            // InternalResume.g:476:51: (iv_ruleExperience= ruleExperience EOF )
            // InternalResume.g:477:2: iv_ruleExperience= ruleExperience EOF
            {
             newCompositeNode(grammarAccess.getExperienceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperience=ruleExperience();

            state._fsp--;

             current =iv_ruleExperience; 
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
    // $ANTLR end "entryRuleExperience"


    // $ANTLR start "ruleExperience"
    // InternalResume.g:483:1: ruleExperience returns [EObject current=null] : (otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+ ) ;
    public final EObject ruleExperience() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        EObject lv_jobs_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:489:2: ( (otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+ ) )
            // InternalResume.g:490:2: (otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+ )
            {
            // InternalResume.g:490:2: (otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+ )
            // InternalResume.g:491:3: otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getExperienceAccess().getExperienceKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExperienceAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:499:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:500:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:500:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:501:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_language_2_0, grammarAccess.getExperienceAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperienceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:517:3: ( (lv_jobs_3_0= ruleJob ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalResume.g:518:4: (lv_jobs_3_0= ruleJob )
            	    {
            	    // InternalResume.g:518:4: (lv_jobs_3_0= ruleJob )
            	    // InternalResume.g:519:5: lv_jobs_3_0= ruleJob
            	    {

            	    					newCompositeNode(grammarAccess.getExperienceAccess().getJobsJobParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_jobs_3_0=ruleJob();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExperienceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"jobs",
            	    						lv_jobs_3_0,
            	    						"org.xtext.example.resume.Resume.Job");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleExperience"


    // $ANTLR start "entryRuleJob"
    // InternalResume.g:540:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalResume.g:540:44: (iv_ruleJob= ruleJob EOF )
            // InternalResume.g:541:2: iv_ruleJob= ruleJob EOF
            {
             newCompositeNode(grammarAccess.getJobRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJob=ruleJob();

            state._fsp--;

             current =iv_ruleJob; 
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
    // $ANTLR end "entryRuleJob"


    // $ANTLR start "ruleJob"
    // InternalResume.g:547:1: ruleJob returns [EObject current=null] : (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) ) ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_company_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_description_3_0 = null;

        AntlrDatatypeRuleToken lv_startDate_7_0 = null;

        AntlrDatatypeRuleToken lv_endDate_9_0 = null;

        EObject lv_tags_11_0 = null;



        	enterRule();

        try {
            // InternalResume.g:553:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) ) ) )
            // InternalResume.g:554:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) ) )
            {
            // InternalResume.g:554:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) ) )
            // InternalResume.g:555:3: otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getJobAccess().getTitleKeyword_0());
            		
            // InternalResume.g:559:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalResume.g:560:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalResume.g:560:4: (lv_title_1_0= RULE_STRING )
            // InternalResume.g:561:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_title_1_0, grammarAccess.getJobAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJobRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getJobAccess().getDescriptionKeyword_2());
            		
            // InternalResume.g:581:3: ( (lv_description_3_0= ruleStringList ) )
            // InternalResume.g:582:4: (lv_description_3_0= ruleStringList )
            {
            // InternalResume.g:582:4: (lv_description_3_0= ruleStringList )
            // InternalResume.g:583:5: lv_description_3_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getJobAccess().getDescriptionStringListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_description_3_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getJobAccess().getCompanyKeyword_4());
            		
            // InternalResume.g:604:3: ( (lv_company_5_0= RULE_STRING ) )
            // InternalResume.g:605:4: (lv_company_5_0= RULE_STRING )
            {
            // InternalResume.g:605:4: (lv_company_5_0= RULE_STRING )
            // InternalResume.g:606:5: lv_company_5_0= RULE_STRING
            {
            lv_company_5_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_company_5_0, grammarAccess.getJobAccess().getCompanySTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJobRule());
            					}
            					setWithLastConsumed(
            						current,
            						"company",
            						lv_company_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getJobAccess().getStartDateKeyword_6());
            		
            // InternalResume.g:626:3: ( (lv_startDate_7_0= ruleDate ) )
            // InternalResume.g:627:4: (lv_startDate_7_0= ruleDate )
            {
            // InternalResume.g:627:4: (lv_startDate_7_0= ruleDate )
            // InternalResume.g:628:5: lv_startDate_7_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getJobAccess().getStartDateDateParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
            lv_startDate_7_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"startDate",
            						lv_startDate_7_0,
            						"org.xtext.example.resume.Resume.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getJobAccess().getEndDateKeyword_8());
            		
            // InternalResume.g:649:3: ( (lv_endDate_9_0= ruleDate ) )
            // InternalResume.g:650:4: (lv_endDate_9_0= ruleDate )
            {
            // InternalResume.g:650:4: (lv_endDate_9_0= ruleDate )
            // InternalResume.g:651:5: lv_endDate_9_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getJobAccess().getEndDateDateParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_24);
            lv_endDate_9_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"endDate",
            						lv_endDate_9_0,
            						"org.xtext.example.resume.Resume.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getJobAccess().getTagsKeyword_10());
            		
            // InternalResume.g:672:3: ( (lv_tags_11_0= ruleStringList ) )
            // InternalResume.g:673:4: (lv_tags_11_0= ruleStringList )
            {
            // InternalResume.g:673:4: (lv_tags_11_0= ruleStringList )
            // InternalResume.g:674:5: lv_tags_11_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getJobAccess().getTagsStringListParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_11_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_11_0,
            						"org.xtext.example.resume.Resume.StringList");
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
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleProjects"
    // InternalResume.g:695:1: entryRuleProjects returns [EObject current=null] : iv_ruleProjects= ruleProjects EOF ;
    public final EObject entryRuleProjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjects = null;


        try {
            // InternalResume.g:695:49: (iv_ruleProjects= ruleProjects EOF )
            // InternalResume.g:696:2: iv_ruleProjects= ruleProjects EOF
            {
             newCompositeNode(grammarAccess.getProjectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjects=ruleProjects();

            state._fsp--;

             current =iv_ruleProjects; 
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
    // $ANTLR end "entryRuleProjects"


    // $ANTLR start "ruleProjects"
    // InternalResume.g:702:1: ruleProjects returns [EObject current=null] : (otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+ ) ;
    public final EObject ruleProjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        EObject lv_projects_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:708:2: ( (otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+ ) )
            // InternalResume.g:709:2: (otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+ )
            {
            // InternalResume.g:709:2: (otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+ )
            // InternalResume.g:710:3: otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+
            {
            otherlv_0=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectsAccess().getProjectsKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectsAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:718:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:719:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:719:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:720:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_language_2_0, grammarAccess.getProjectsAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:736:3: ( (lv_projects_3_0= ruleProject ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalResume.g:737:4: (lv_projects_3_0= ruleProject )
            	    {
            	    // InternalResume.g:737:4: (lv_projects_3_0= ruleProject )
            	    // InternalResume.g:738:5: lv_projects_3_0= ruleProject
            	    {

            	    					newCompositeNode(grammarAccess.getProjectsAccess().getProjectsProjectParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_projects_3_0=ruleProject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"projects",
            	    						lv_projects_3_0,
            	    						"org.xtext.example.resume.Resume.Project");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ruleProjects"


    // $ANTLR start "entryRuleProject"
    // InternalResume.g:759:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalResume.g:759:48: (iv_ruleProject= ruleProject EOF )
            // InternalResume.g:760:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalResume.g:766:1: ruleProject returns [EObject current=null] : (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_link_7_0=null;
        Token otherlv_8=null;
        EObject lv_description_3_0 = null;

        EObject lv_technologies_5_0 = null;

        EObject lv_tags_9_0 = null;



        	enterRule();

        try {
            // InternalResume.g:772:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) ) )
            // InternalResume.g:773:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) )
            {
            // InternalResume.g:773:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) )
            // InternalResume.g:774:3: otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getTitleKeyword_0());
            		
            // InternalResume.g:778:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalResume.g:779:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalResume.g:779:4: (lv_title_1_0= RULE_STRING )
            // InternalResume.g:780:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_title_1_0, grammarAccess.getProjectAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getDescriptionKeyword_2());
            		
            // InternalResume.g:800:3: ( (lv_description_3_0= ruleStringList ) )
            // InternalResume.g:801:4: (lv_description_3_0= ruleStringList )
            {
            // InternalResume.g:801:4: (lv_description_3_0= ruleStringList )
            // InternalResume.g:802:5: lv_description_3_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getDescriptionStringListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_description_3_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getTechnologiesKeyword_4());
            		
            // InternalResume.g:823:3: ( (lv_technologies_5_0= ruleStringList ) )
            // InternalResume.g:824:4: (lv_technologies_5_0= ruleStringList )
            {
            // InternalResume.g:824:4: (lv_technologies_5_0= ruleStringList )
            // InternalResume.g:825:5: lv_technologies_5_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getTechnologiesStringListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
            lv_technologies_5_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"technologies",
            						lv_technologies_5_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getLinkKeyword_6());
            		
            // InternalResume.g:846:3: ( (lv_link_7_0= RULE_STRING ) )
            // InternalResume.g:847:4: (lv_link_7_0= RULE_STRING )
            {
            // InternalResume.g:847:4: (lv_link_7_0= RULE_STRING )
            // InternalResume.g:848:5: lv_link_7_0= RULE_STRING
            {
            lv_link_7_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_link_7_0, grammarAccess.getProjectAccess().getLinkSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"link",
            						lv_link_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getProjectAccess().getTagsKeyword_8());
            		
            // InternalResume.g:868:3: ( (lv_tags_9_0= ruleStringList ) )
            // InternalResume.g:869:4: (lv_tags_9_0= ruleStringList )
            {
            // InternalResume.g:869:4: (lv_tags_9_0= ruleStringList )
            // InternalResume.g:870:5: lv_tags_9_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getTagsStringListParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_9_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_9_0,
            						"org.xtext.example.resume.Resume.StringList");
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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleEducation"
    // InternalResume.g:891:1: entryRuleEducation returns [EObject current=null] : iv_ruleEducation= ruleEducation EOF ;
    public final EObject entryRuleEducation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEducation = null;


        try {
            // InternalResume.g:891:50: (iv_ruleEducation= ruleEducation EOF )
            // InternalResume.g:892:2: iv_ruleEducation= ruleEducation EOF
            {
             newCompositeNode(grammarAccess.getEducationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEducation=ruleEducation();

            state._fsp--;

             current =iv_ruleEducation; 
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
    // $ANTLR end "entryRuleEducation"


    // $ANTLR start "ruleEducation"
    // InternalResume.g:898:1: ruleEducation returns [EObject current=null] : (otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )* ) ;
    public final EObject ruleEducation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        EObject lv_degrees_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:904:2: ( (otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )* ) )
            // InternalResume.g:905:2: (otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )* )
            {
            // InternalResume.g:905:2: (otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )* )
            // InternalResume.g:906:3: otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEducationAccess().getEducationKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getEducationAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:914:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:915:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:915:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:916:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_language_2_0, grammarAccess.getEducationAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEducationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:932:3: ( (lv_degrees_3_0= ruleDegree ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalResume.g:933:4: (lv_degrees_3_0= ruleDegree )
            	    {
            	    // InternalResume.g:933:4: (lv_degrees_3_0= ruleDegree )
            	    // InternalResume.g:934:5: lv_degrees_3_0= ruleDegree
            	    {

            	    					newCompositeNode(grammarAccess.getEducationAccess().getDegreesDegreeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_degrees_3_0=ruleDegree();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEducationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"degrees",
            	    						lv_degrees_3_0,
            	    						"org.xtext.example.resume.Resume.Degree");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleEducation"


    // $ANTLR start "entryRuleDegree"
    // InternalResume.g:955:1: entryRuleDegree returns [EObject current=null] : iv_ruleDegree= ruleDegree EOF ;
    public final EObject entryRuleDegree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDegree = null;


        try {
            // InternalResume.g:955:47: (iv_ruleDegree= ruleDegree EOF )
            // InternalResume.g:956:2: iv_ruleDegree= ruleDegree EOF
            {
             newCompositeNode(grammarAccess.getDegreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDegree=ruleDegree();

            state._fsp--;

             current =iv_ruleDegree; 
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
    // $ANTLR end "entryRuleDegree"


    // $ANTLR start "ruleDegree"
    // InternalResume.g:962:1: ruleDegree returns [EObject current=null] : (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) ) ;
    public final EObject ruleDegree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token lv_institution_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_country_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_graduationDate_5_0 = null;

        EObject lv_tags_9_0 = null;



        	enterRule();

        try {
            // InternalResume.g:968:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) ) )
            // InternalResume.g:969:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) )
            {
            // InternalResume.g:969:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) )
            // InternalResume.g:970:3: otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDegreeAccess().getTitleKeyword_0());
            		
            // InternalResume.g:974:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalResume.g:975:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalResume.g:975:4: (lv_title_1_0= RULE_STRING )
            // InternalResume.g:976:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_title_1_0, grammarAccess.getDegreeAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDegreeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDegreeAccess().getInstitutionKeyword_2());
            		
            // InternalResume.g:996:3: ( (lv_institution_3_0= RULE_STRING ) )
            // InternalResume.g:997:4: (lv_institution_3_0= RULE_STRING )
            {
            // InternalResume.g:997:4: (lv_institution_3_0= RULE_STRING )
            // InternalResume.g:998:5: lv_institution_3_0= RULE_STRING
            {
            lv_institution_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_institution_3_0, grammarAccess.getDegreeAccess().getInstitutionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDegreeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"institution",
            						lv_institution_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDegreeAccess().getGraduationDateKeyword_4());
            		
            // InternalResume.g:1018:3: ( (lv_graduationDate_5_0= ruleDate ) )
            // InternalResume.g:1019:4: (lv_graduationDate_5_0= ruleDate )
            {
            // InternalResume.g:1019:4: (lv_graduationDate_5_0= ruleDate )
            // InternalResume.g:1020:5: lv_graduationDate_5_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getDegreeAccess().getGraduationDateDateParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_graduationDate_5_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDegreeRule());
            					}
            					set(
            						current,
            						"graduationDate",
            						lv_graduationDate_5_0,
            						"org.xtext.example.resume.Resume.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDegreeAccess().getCountryKeyword_6());
            		
            // InternalResume.g:1041:3: ( (lv_country_7_0= RULE_STRING ) )
            // InternalResume.g:1042:4: (lv_country_7_0= RULE_STRING )
            {
            // InternalResume.g:1042:4: (lv_country_7_0= RULE_STRING )
            // InternalResume.g:1043:5: lv_country_7_0= RULE_STRING
            {
            lv_country_7_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_country_7_0, grammarAccess.getDegreeAccess().getCountrySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDegreeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"country",
            						lv_country_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getDegreeAccess().getTagsKeyword_8());
            		
            // InternalResume.g:1063:3: ( (lv_tags_9_0= ruleStringList ) )
            // InternalResume.g:1064:4: (lv_tags_9_0= ruleStringList )
            {
            // InternalResume.g:1064:4: (lv_tags_9_0= ruleStringList )
            // InternalResume.g:1065:5: lv_tags_9_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getDegreeAccess().getTagsStringListParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_9_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDegreeRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_9_0,
            						"org.xtext.example.resume.Resume.StringList");
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
    // $ANTLR end "ruleDegree"


    // $ANTLR start "entryRuleSkills"
    // InternalResume.g:1086:1: entryRuleSkills returns [EObject current=null] : iv_ruleSkills= ruleSkills EOF ;
    public final EObject entryRuleSkills() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkills = null;


        try {
            // InternalResume.g:1086:47: (iv_ruleSkills= ruleSkills EOF )
            // InternalResume.g:1087:2: iv_ruleSkills= ruleSkills EOF
            {
             newCompositeNode(grammarAccess.getSkillsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkills=ruleSkills();

            state._fsp--;

             current =iv_ruleSkills; 
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
    // $ANTLR end "entryRuleSkills"


    // $ANTLR start "ruleSkills"
    // InternalResume.g:1093:1: ruleSkills returns [EObject current=null] : (otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+ ) ;
    public final EObject ruleSkills() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        EObject lv_skills_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1099:2: ( (otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+ ) )
            // InternalResume.g:1100:2: (otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+ )
            {
            // InternalResume.g:1100:2: (otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+ )
            // InternalResume.g:1101:3: otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+
            {
            otherlv_0=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillsAccess().getSkillsKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSkillsAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:1109:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:1110:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:1110:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:1111:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_language_2_0, grammarAccess.getSkillsAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:1127:3: ( (lv_skills_3_0= ruleSkill ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalResume.g:1128:4: (lv_skills_3_0= ruleSkill )
            	    {
            	    // InternalResume.g:1128:4: (lv_skills_3_0= ruleSkill )
            	    // InternalResume.g:1129:5: lv_skills_3_0= ruleSkill
            	    {

            	    					newCompositeNode(grammarAccess.getSkillsAccess().getSkillsSkillParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_skills_3_0=ruleSkill();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSkillsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"skills",
            	    						lv_skills_3_0,
            	    						"org.xtext.example.resume.Resume.Skill");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "ruleSkills"


    // $ANTLR start "entryRuleSkill"
    // InternalResume.g:1150:1: entryRuleSkill returns [EObject current=null] : iv_ruleSkill= ruleSkill EOF ;
    public final EObject entryRuleSkill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkill = null;


        try {
            // InternalResume.g:1150:46: (iv_ruleSkill= ruleSkill EOF )
            // InternalResume.g:1151:2: iv_ruleSkill= ruleSkill EOF
            {
             newCompositeNode(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkill=ruleSkill();

            state._fsp--;

             current =iv_ruleSkill; 
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
    // $ANTLR end "entryRuleSkill"


    // $ANTLR start "ruleSkill"
    // InternalResume.g:1157:1: ruleSkill returns [EObject current=null] : (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'tags:' ( (lv_tags_3_0= ruleStringList ) ) ) ;
    public final EObject ruleSkill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        EObject lv_tags_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1163:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'tags:' ( (lv_tags_3_0= ruleStringList ) ) ) )
            // InternalResume.g:1164:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'tags:' ( (lv_tags_3_0= ruleStringList ) ) )
            {
            // InternalResume.g:1164:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'tags:' ( (lv_tags_3_0= ruleStringList ) ) )
            // InternalResume.g:1165:3: otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'tags:' ( (lv_tags_3_0= ruleStringList ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillAccess().getTitleKeyword_0());
            		
            // InternalResume.g:1169:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalResume.g:1170:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalResume.g:1170:4: (lv_title_1_0= RULE_STRING )
            // InternalResume.g:1171:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_title_1_0, grammarAccess.getSkillAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSkillAccess().getTagsKeyword_2());
            		
            // InternalResume.g:1191:3: ( (lv_tags_3_0= ruleStringList ) )
            // InternalResume.g:1192:4: (lv_tags_3_0= ruleStringList )
            {
            // InternalResume.g:1192:4: (lv_tags_3_0= ruleStringList )
            // InternalResume.g:1193:5: lv_tags_3_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getSkillAccess().getTagsStringListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_3_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSkillRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_3_0,
            						"org.xtext.example.resume.Resume.StringList");
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
    // $ANTLR end "ruleSkill"


    // $ANTLR start "entryRuleInterests"
    // InternalResume.g:1214:1: entryRuleInterests returns [EObject current=null] : iv_ruleInterests= ruleInterests EOF ;
    public final EObject entryRuleInterests() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterests = null;


        try {
            // InternalResume.g:1214:50: (iv_ruleInterests= ruleInterests EOF )
            // InternalResume.g:1215:2: iv_ruleInterests= ruleInterests EOF
            {
             newCompositeNode(grammarAccess.getInterestsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterests=ruleInterests();

            state._fsp--;

             current =iv_ruleInterests; 
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
    // $ANTLR end "entryRuleInterests"


    // $ANTLR start "ruleInterests"
    // InternalResume.g:1221:1: ruleInterests returns [EObject current=null] : (otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) ;
    public final EObject ruleInterests() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        Token otherlv_3=null;
        EObject lv_tags_4_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1227:2: ( (otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) )
            // InternalResume.g:1228:2: (otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            {
            // InternalResume.g:1228:2: (otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            // InternalResume.g:1229:3: otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getInterestsAccess().getInterestsKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getInterestsAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:1237:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:1238:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:1238:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:1239:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_language_2_0, grammarAccess.getInterestsAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterestsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getInterestsAccess().getTagsKeyword_3());
            		
            // InternalResume.g:1259:3: ( (lv_tags_4_0= ruleStringList ) )
            // InternalResume.g:1260:4: (lv_tags_4_0= ruleStringList )
            {
            // InternalResume.g:1260:4: (lv_tags_4_0= ruleStringList )
            // InternalResume.g:1261:5: lv_tags_4_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getInterestsAccess().getTagsStringListParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_4_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterestsRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_4_0,
            						"org.xtext.example.resume.Resume.StringList");
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
    // $ANTLR end "ruleInterests"


    // $ANTLR start "entryRuleLanguages"
    // InternalResume.g:1282:1: entryRuleLanguages returns [EObject current=null] : iv_ruleLanguages= ruleLanguages EOF ;
    public final EObject entryRuleLanguages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguages = null;


        try {
            // InternalResume.g:1282:50: (iv_ruleLanguages= ruleLanguages EOF )
            // InternalResume.g:1283:2: iv_ruleLanguages= ruleLanguages EOF
            {
             newCompositeNode(grammarAccess.getLanguagesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguages=ruleLanguages();

            state._fsp--;

             current =iv_ruleLanguages; 
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
    // $ANTLR end "entryRuleLanguages"


    // $ANTLR start "ruleLanguages"
    // InternalResume.g:1289:1: ruleLanguages returns [EObject current=null] : (otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) ;
    public final EObject ruleLanguages() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        Token otherlv_3=null;
        EObject lv_tags_4_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1295:2: ( (otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) )
            // InternalResume.g:1296:2: (otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            {
            // InternalResume.g:1296:2: (otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            // InternalResume.g:1297:3: otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getLanguagesAccess().getLanguagesKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLanguagesAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:1305:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:1306:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:1306:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:1307:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_language_2_0, grammarAccess.getLanguagesAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguagesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getLanguagesAccess().getTagsKeyword_3());
            		
            // InternalResume.g:1327:3: ( (lv_tags_4_0= ruleStringList ) )
            // InternalResume.g:1328:4: (lv_tags_4_0= ruleStringList )
            {
            // InternalResume.g:1328:4: (lv_tags_4_0= ruleStringList )
            // InternalResume.g:1329:5: lv_tags_4_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getLanguagesAccess().getTagsStringListParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_4_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLanguagesRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_4_0,
            						"org.xtext.example.resume.Resume.StringList");
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
    // $ANTLR end "ruleLanguages"


    // $ANTLR start "entryRuleCustomization"
    // InternalResume.g:1350:1: entryRuleCustomization returns [EObject current=null] : iv_ruleCustomization= ruleCustomization EOF ;
    public final EObject entryRuleCustomization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomization = null;


        try {
            // InternalResume.g:1350:54: (iv_ruleCustomization= ruleCustomization EOF )
            // InternalResume.g:1351:2: iv_ruleCustomization= ruleCustomization EOF
            {
             newCompositeNode(grammarAccess.getCustomizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomization=ruleCustomization();

            state._fsp--;

             current =iv_ruleCustomization; 
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
    // $ANTLR end "entryRuleCustomization"


    // $ANTLR start "ruleCustomization"
    // InternalResume.g:1357:1: ruleCustomization returns [EObject current=null] : (otherlv_0= 'Customization' otherlv_1= 'include' otherlv_2= 'Profile' otherlv_3= 'where' otherlv_4= 'language' ( (lv_language_5_0= RULE_STRING ) ) ( (lv_rules_6_0= ruleRule ) )* ) ;
    public final EObject ruleCustomization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_language_5_0=null;
        EObject lv_rules_6_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1363:2: ( (otherlv_0= 'Customization' otherlv_1= 'include' otherlv_2= 'Profile' otherlv_3= 'where' otherlv_4= 'language' ( (lv_language_5_0= RULE_STRING ) ) ( (lv_rules_6_0= ruleRule ) )* ) )
            // InternalResume.g:1364:2: (otherlv_0= 'Customization' otherlv_1= 'include' otherlv_2= 'Profile' otherlv_3= 'where' otherlv_4= 'language' ( (lv_language_5_0= RULE_STRING ) ) ( (lv_rules_6_0= ruleRule ) )* )
            {
            // InternalResume.g:1364:2: (otherlv_0= 'Customization' otherlv_1= 'include' otherlv_2= 'Profile' otherlv_3= 'where' otherlv_4= 'language' ( (lv_language_5_0= RULE_STRING ) ) ( (lv_rules_6_0= ruleRule ) )* )
            // InternalResume.g:1365:3: otherlv_0= 'Customization' otherlv_1= 'include' otherlv_2= 'Profile' otherlv_3= 'where' otherlv_4= 'language' ( (lv_language_5_0= RULE_STRING ) ) ( (lv_rules_6_0= ruleRule ) )*
            {
            otherlv_0=(Token)match(input,39,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomizationAccess().getCustomizationKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomizationAccess().getIncludeKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomizationAccess().getProfileKeyword_2());
            		
            otherlv_3=(Token)match(input,42,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomizationAccess().getWhereKeyword_3());
            		
            otherlv_4=(Token)match(input,43,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomizationAccess().getLanguageKeyword_4());
            		
            // InternalResume.g:1385:3: ( (lv_language_5_0= RULE_STRING ) )
            // InternalResume.g:1386:4: (lv_language_5_0= RULE_STRING )
            {
            // InternalResume.g:1386:4: (lv_language_5_0= RULE_STRING )
            // InternalResume.g:1387:5: lv_language_5_0= RULE_STRING
            {
            lv_language_5_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_language_5_0, grammarAccess.getCustomizationAccess().getLanguageSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomizationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:1403:3: ( (lv_rules_6_0= ruleRule ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==40) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalResume.g:1404:4: (lv_rules_6_0= ruleRule )
            	    {
            	    // InternalResume.g:1404:4: (lv_rules_6_0= ruleRule )
            	    // InternalResume.g:1405:5: lv_rules_6_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getCustomizationAccess().getRulesRuleParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_rules_6_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomizationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_6_0,
            	    						"org.xtext.example.resume.Resume.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleCustomization"


    // $ANTLR start "entryRuleRule"
    // InternalResume.g:1426:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalResume.g:1426:45: (iv_ruleRule= ruleRule EOF )
            // InternalResume.g:1427:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalResume.g:1433:1: ruleRule returns [EObject current=null] : (otherlv_0= 'include' ( (lv_sectionType_1_0= ruleSectionType ) ) otherlv_2= 'where' ( (lv_filter_3_0= ruleFilter ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_sectionType_1_0 = null;

        EObject lv_filter_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1439:2: ( (otherlv_0= 'include' ( (lv_sectionType_1_0= ruleSectionType ) ) otherlv_2= 'where' ( (lv_filter_3_0= ruleFilter ) ) ) )
            // InternalResume.g:1440:2: (otherlv_0= 'include' ( (lv_sectionType_1_0= ruleSectionType ) ) otherlv_2= 'where' ( (lv_filter_3_0= ruleFilter ) ) )
            {
            // InternalResume.g:1440:2: (otherlv_0= 'include' ( (lv_sectionType_1_0= ruleSectionType ) ) otherlv_2= 'where' ( (lv_filter_3_0= ruleFilter ) ) )
            // InternalResume.g:1441:3: otherlv_0= 'include' ( (lv_sectionType_1_0= ruleSectionType ) ) otherlv_2= 'where' ( (lv_filter_3_0= ruleFilter ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIncludeKeyword_0());
            		
            // InternalResume.g:1445:3: ( (lv_sectionType_1_0= ruleSectionType ) )
            // InternalResume.g:1446:4: (lv_sectionType_1_0= ruleSectionType )
            {
            // InternalResume.g:1446:4: (lv_sectionType_1_0= ruleSectionType )
            // InternalResume.g:1447:5: lv_sectionType_1_0= ruleSectionType
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getSectionTypeSectionTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_sectionType_1_0=ruleSectionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"sectionType",
            						lv_sectionType_1_0,
            						"org.xtext.example.resume.Resume.SectionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getWhereKeyword_2());
            		
            // InternalResume.g:1468:3: ( (lv_filter_3_0= ruleFilter ) )
            // InternalResume.g:1469:4: (lv_filter_3_0= ruleFilter )
            {
            // InternalResume.g:1469:4: (lv_filter_3_0= ruleFilter )
            // InternalResume.g:1470:5: lv_filter_3_0= ruleFilter
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getFilterFilterParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_filter_3_0=ruleFilter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"filter",
            						lv_filter_3_0,
            						"org.xtext.example.resume.Resume.Filter");
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleFilter"
    // InternalResume.g:1491:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalResume.g:1491:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalResume.g:1492:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalResume.g:1498:1: ruleFilter returns [EObject current=null] : (this_GeneralFilter_0= ruleGeneralFilter | this_TemporalFilter_1= ruleTemporalFilter ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_GeneralFilter_0 = null;

        EObject this_TemporalFilter_1 = null;



        	enterRule();

        try {
            // InternalResume.g:1504:2: ( (this_GeneralFilter_0= ruleGeneralFilter | this_TemporalFilter_1= ruleTemporalFilter ) )
            // InternalResume.g:1505:2: (this_GeneralFilter_0= ruleGeneralFilter | this_TemporalFilter_1= ruleTemporalFilter )
            {
            // InternalResume.g:1505:2: (this_GeneralFilter_0= ruleGeneralFilter | this_TemporalFilter_1= ruleTemporalFilter )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==44) ) {
                alt8=1;
            }
            else if ( (LA8_0==45||LA8_0==47) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalResume.g:1506:3: this_GeneralFilter_0= ruleGeneralFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getGeneralFilterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneralFilter_0=ruleGeneralFilter();

                    state._fsp--;


                    			current = this_GeneralFilter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalResume.g:1515:3: this_TemporalFilter_1= ruleTemporalFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getTemporalFilterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemporalFilter_1=ruleTemporalFilter();

                    state._fsp--;


                    			current = this_TemporalFilter_1;
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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleGeneralFilter"
    // InternalResume.g:1527:1: entryRuleGeneralFilter returns [EObject current=null] : iv_ruleGeneralFilter= ruleGeneralFilter EOF ;
    public final EObject entryRuleGeneralFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralFilter = null;


        try {
            // InternalResume.g:1527:54: (iv_ruleGeneralFilter= ruleGeneralFilter EOF )
            // InternalResume.g:1528:2: iv_ruleGeneralFilter= ruleGeneralFilter EOF
            {
             newCompositeNode(grammarAccess.getGeneralFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralFilter=ruleGeneralFilter();

            state._fsp--;

             current =iv_ruleGeneralFilter; 
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
    // $ANTLR end "entryRuleGeneralFilter"


    // $ANTLR start "ruleGeneralFilter"
    // InternalResume.g:1534:1: ruleGeneralFilter returns [EObject current=null] : (otherlv_0= 'tags' otherlv_1= 'include' ( (lv_tag_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGeneralFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tag_2_0=null;


        	enterRule();

        try {
            // InternalResume.g:1540:2: ( (otherlv_0= 'tags' otherlv_1= 'include' ( (lv_tag_2_0= RULE_STRING ) ) ) )
            // InternalResume.g:1541:2: (otherlv_0= 'tags' otherlv_1= 'include' ( (lv_tag_2_0= RULE_STRING ) ) )
            {
            // InternalResume.g:1541:2: (otherlv_0= 'tags' otherlv_1= 'include' ( (lv_tag_2_0= RULE_STRING ) ) )
            // InternalResume.g:1542:3: otherlv_0= 'tags' otherlv_1= 'include' ( (lv_tag_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralFilterAccess().getTagsKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralFilterAccess().getIncludeKeyword_1());
            		
            // InternalResume.g:1550:3: ( (lv_tag_2_0= RULE_STRING ) )
            // InternalResume.g:1551:4: (lv_tag_2_0= RULE_STRING )
            {
            // InternalResume.g:1551:4: (lv_tag_2_0= RULE_STRING )
            // InternalResume.g:1552:5: lv_tag_2_0= RULE_STRING
            {
            lv_tag_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_tag_2_0, grammarAccess.getGeneralFilterAccess().getTagSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralFilterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tag",
            						lv_tag_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleGeneralFilter"


    // $ANTLR start "entryRuleTemporalFilter"
    // InternalResume.g:1572:1: entryRuleTemporalFilter returns [EObject current=null] : iv_ruleTemporalFilter= ruleTemporalFilter EOF ;
    public final EObject entryRuleTemporalFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalFilter = null;


        try {
            // InternalResume.g:1572:55: (iv_ruleTemporalFilter= ruleTemporalFilter EOF )
            // InternalResume.g:1573:2: iv_ruleTemporalFilter= ruleTemporalFilter EOF
            {
             newCompositeNode(grammarAccess.getTemporalFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalFilter=ruleTemporalFilter();

            state._fsp--;

             current =iv_ruleTemporalFilter; 
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
    // $ANTLR end "entryRuleTemporalFilter"


    // $ANTLR start "ruleTemporalFilter"
    // InternalResume.g:1579:1: ruleTemporalFilter returns [EObject current=null] : ( (otherlv_0= 'startDate' otherlv_1= 'after' ( (lv_startDate_2_0= ruleDate ) ) ) | (otherlv_3= 'endDate' otherlv_4= 'before' ( (lv_endDate_5_0= ruleDate ) ) ) ) ;
    public final EObject ruleTemporalFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_startDate_2_0 = null;

        AntlrDatatypeRuleToken lv_endDate_5_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1585:2: ( ( (otherlv_0= 'startDate' otherlv_1= 'after' ( (lv_startDate_2_0= ruleDate ) ) ) | (otherlv_3= 'endDate' otherlv_4= 'before' ( (lv_endDate_5_0= ruleDate ) ) ) ) )
            // InternalResume.g:1586:2: ( (otherlv_0= 'startDate' otherlv_1= 'after' ( (lv_startDate_2_0= ruleDate ) ) ) | (otherlv_3= 'endDate' otherlv_4= 'before' ( (lv_endDate_5_0= ruleDate ) ) ) )
            {
            // InternalResume.g:1586:2: ( (otherlv_0= 'startDate' otherlv_1= 'after' ( (lv_startDate_2_0= ruleDate ) ) ) | (otherlv_3= 'endDate' otherlv_4= 'before' ( (lv_endDate_5_0= ruleDate ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==45) ) {
                alt9=1;
            }
            else if ( (LA9_0==47) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalResume.g:1587:3: (otherlv_0= 'startDate' otherlv_1= 'after' ( (lv_startDate_2_0= ruleDate ) ) )
                    {
                    // InternalResume.g:1587:3: (otherlv_0= 'startDate' otherlv_1= 'after' ( (lv_startDate_2_0= ruleDate ) ) )
                    // InternalResume.g:1588:4: otherlv_0= 'startDate' otherlv_1= 'after' ( (lv_startDate_2_0= ruleDate ) )
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_35); 

                    				newLeafNode(otherlv_0, grammarAccess.getTemporalFilterAccess().getStartDateKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,46,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getTemporalFilterAccess().getAfterKeyword_0_1());
                    			
                    // InternalResume.g:1596:4: ( (lv_startDate_2_0= ruleDate ) )
                    // InternalResume.g:1597:5: (lv_startDate_2_0= ruleDate )
                    {
                    // InternalResume.g:1597:5: (lv_startDate_2_0= ruleDate )
                    // InternalResume.g:1598:6: lv_startDate_2_0= ruleDate
                    {

                    						newCompositeNode(grammarAccess.getTemporalFilterAccess().getStartDateDateParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_startDate_2_0=ruleDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalFilterRule());
                    						}
                    						set(
                    							current,
                    							"startDate",
                    							lv_startDate_2_0,
                    							"org.xtext.example.resume.Resume.Date");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalResume.g:1617:3: (otherlv_3= 'endDate' otherlv_4= 'before' ( (lv_endDate_5_0= ruleDate ) ) )
                    {
                    // InternalResume.g:1617:3: (otherlv_3= 'endDate' otherlv_4= 'before' ( (lv_endDate_5_0= ruleDate ) ) )
                    // InternalResume.g:1618:4: otherlv_3= 'endDate' otherlv_4= 'before' ( (lv_endDate_5_0= ruleDate ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemporalFilterAccess().getEndDateKeyword_1_0());
                    			
                    otherlv_4=(Token)match(input,48,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getTemporalFilterAccess().getBeforeKeyword_1_1());
                    			
                    // InternalResume.g:1626:4: ( (lv_endDate_5_0= ruleDate ) )
                    // InternalResume.g:1627:5: (lv_endDate_5_0= ruleDate )
                    {
                    // InternalResume.g:1627:5: (lv_endDate_5_0= ruleDate )
                    // InternalResume.g:1628:6: lv_endDate_5_0= ruleDate
                    {

                    						newCompositeNode(grammarAccess.getTemporalFilterAccess().getEndDateDateParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_endDate_5_0=ruleDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemporalFilterRule());
                    						}
                    						set(
                    							current,
                    							"endDate",
                    							lv_endDate_5_0,
                    							"org.xtext.example.resume.Resume.Date");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleTemporalFilter"


    // $ANTLR start "entryRuleStringList"
    // InternalResume.g:1650:1: entryRuleStringList returns [EObject current=null] : iv_ruleStringList= ruleStringList EOF ;
    public final EObject entryRuleStringList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringList = null;


        try {
            // InternalResume.g:1650:51: (iv_ruleStringList= ruleStringList EOF )
            // InternalResume.g:1651:2: iv_ruleStringList= ruleStringList EOF
            {
             newCompositeNode(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringList=ruleStringList();

            state._fsp--;

             current =iv_ruleStringList; 
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
    // $ANTLR end "entryRuleStringList"


    // $ANTLR start "ruleStringList"
    // InternalResume.g:1657:1: ruleStringList returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleStringList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalResume.g:1663:2: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) )
            // InternalResume.g:1664:2: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            {
            // InternalResume.g:1664:2: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            // InternalResume.g:1665:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalResume.g:1669:3: ( (lv_values_1_0= RULE_STRING ) )
            // InternalResume.g:1670:4: (lv_values_1_0= RULE_STRING )
            {
            // InternalResume.g:1670:4: (lv_values_1_0= RULE_STRING )
            // InternalResume.g:1671:5: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            					newLeafNode(lv_values_1_0, grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringListRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:1687:3: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==50) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalResume.g:1688:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,50,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStringListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalResume.g:1692:4: ( (lv_values_3_0= RULE_STRING ) )
            	    // InternalResume.g:1693:5: (lv_values_3_0= RULE_STRING )
            	    {
            	    // InternalResume.g:1693:5: (lv_values_3_0= RULE_STRING )
            	    // InternalResume.g:1694:6: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            	    						newLeafNode(lv_values_3_0, grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStringListRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,51,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStringListAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleStringList"


    // $ANTLR start "entryRuleDate"
    // InternalResume.g:1719:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // InternalResume.g:1719:44: (iv_ruleDate= ruleDate EOF )
            // InternalResume.g:1720:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate.getText(); 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalResume.g:1726:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalResume.g:1732:2: (this_STRING_0= RULE_STRING )
            // InternalResume.g:1733:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getDateAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "ruleSectionType"
    // InternalResume.g:1743:1: ruleSectionType returns [Enumerator current=null] : ( (enumLiteral_0= 'Experience' ) | (enumLiteral_1= 'Projects' ) | (enumLiteral_2= 'Education' ) | (enumLiteral_3= 'Skills' ) | (enumLiteral_4= 'Interests' ) | (enumLiteral_5= 'Languages' ) ) ;
    public final Enumerator ruleSectionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalResume.g:1749:2: ( ( (enumLiteral_0= 'Experience' ) | (enumLiteral_1= 'Projects' ) | (enumLiteral_2= 'Education' ) | (enumLiteral_3= 'Skills' ) | (enumLiteral_4= 'Interests' ) | (enumLiteral_5= 'Languages' ) ) )
            // InternalResume.g:1750:2: ( (enumLiteral_0= 'Experience' ) | (enumLiteral_1= 'Projects' ) | (enumLiteral_2= 'Education' ) | (enumLiteral_3= 'Skills' ) | (enumLiteral_4= 'Interests' ) | (enumLiteral_5= 'Languages' ) )
            {
            // InternalResume.g:1750:2: ( (enumLiteral_0= 'Experience' ) | (enumLiteral_1= 'Projects' ) | (enumLiteral_2= 'Education' ) | (enumLiteral_3= 'Skills' ) | (enumLiteral_4= 'Interests' ) | (enumLiteral_5= 'Languages' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 33:
                {
                alt11=3;
                }
                break;
            case 36:
                {
                alt11=4;
                }
                break;
            case 37:
                {
                alt11=5;
                }
                break;
            case 38:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalResume.g:1751:3: (enumLiteral_0= 'Experience' )
                    {
                    // InternalResume.g:1751:3: (enumLiteral_0= 'Experience' )
                    // InternalResume.g:1752:4: enumLiteral_0= 'Experience'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getEXPERIENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSectionTypeAccess().getEXPERIENCEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalResume.g:1759:3: (enumLiteral_1= 'Projects' )
                    {
                    // InternalResume.g:1759:3: (enumLiteral_1= 'Projects' )
                    // InternalResume.g:1760:4: enumLiteral_1= 'Projects'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getPROJECTSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSectionTypeAccess().getPROJECTSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalResume.g:1767:3: (enumLiteral_2= 'Education' )
                    {
                    // InternalResume.g:1767:3: (enumLiteral_2= 'Education' )
                    // InternalResume.g:1768:4: enumLiteral_2= 'Education'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getEDUCATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSectionTypeAccess().getEDUCATIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalResume.g:1775:3: (enumLiteral_3= 'Skills' )
                    {
                    // InternalResume.g:1775:3: (enumLiteral_3= 'Skills' )
                    // InternalResume.g:1776:4: enumLiteral_3= 'Skills'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getSKILLSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSectionTypeAccess().getSKILLSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalResume.g:1783:3: (enumLiteral_4= 'Interests' )
                    {
                    // InternalResume.g:1783:3: (enumLiteral_4= 'Interests' )
                    // InternalResume.g:1784:4: enumLiteral_4= 'Interests'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getINTERESTSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSectionTypeAccess().getINTERESTSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalResume.g:1791:3: (enumLiteral_5= 'Languages' )
                    {
                    // InternalResume.g:1791:3: (enumLiteral_5= 'Languages' )
                    // InternalResume.g:1792:4: enumLiteral_5= 'Languages'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getLANGUAGESEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSectionTypeAccess().getLANGUAGESEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleSectionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000007240400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000F240400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000B00000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000C000000000000L});

}