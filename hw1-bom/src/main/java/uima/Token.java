

/* First created by JCasGen Thu Sep 12 01:39:59 EDT 2013 */
package uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This kind of type is the smallest type in the document. The system will annotate each token span in each question and answer (break on whitespace and punctuation).
 * Updated by JCasGen Thu Sep 12 01:40:01 EDT 2013
 * XML source: /Users/mabodx/code/java/hw1-bom/src/main/resources/hw1-bom-typesystem.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: baseAnnotation

  /** getter for baseAnnotation - gets This kind of feature is to inherited from the BaseAnnotation to get the feature of casProcessorId and confidence, so we can get the annotation where it is generated.
   * @generated */
  public BaseAnnotationType getBaseAnnotation() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_baseAnnotation == null)
      jcasType.jcas.throwFeatMissing("baseAnnotation", "uima.Token");
    return (BaseAnnotationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Token_Type)jcasType).casFeatCode_baseAnnotation)));}
    
  /** setter for baseAnnotation - sets This kind of feature is to inherited from the BaseAnnotation to get the feature of casProcessorId and confidence, so we can get the annotation where it is generated. 
   * @generated */
  public void setBaseAnnotation(BaseAnnotationType v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_baseAnnotation == null)
      jcasType.jcas.throwFeatMissing("baseAnnotation", "uima.Token");
    jcasType.ll_cas.ll_setRefValue(addr, ((Token_Type)jcasType).casFeatCode_baseAnnotation, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    