/* Generated By:JJTree: Do not edit this line. ASTcallSpecTail.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTcallSpecTail extends SimpleNode {
  public ASTcallSpecTail(int id) {
    super(id);
  }

  public ASTcallSpecTail(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8f525b232955b6cf6826c05f32efebd6 (do not edit this line) */