package com.sample.twitter.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.sample.twitter.dbflute.cbean.*;
import com.sample.twitter.dbflute.cbean.cq.bs.*;
import com.sample.twitter.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of relationship.
 * @author DBFlute(AutoGenerator)
 */
public class RelationshipCIQ extends AbstractBsRelationshipCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsRelationshipCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public RelationshipCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsRelationshipCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq) {
        String msg = "InlineView must not need UNION method: " + bq + " : " + uq;
        throw new IllegalConditionBeanOperationException(msg);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col) {
        regIQ(k, v, cv, col);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op) {
        regIQ(k, v, cv, col, op);
    }

    @Override
    protected void registerWhereClause(String wc) {
        registerInlineWhereClause(wc);
    }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) {
            throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported.");
        }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueId() { return _myCQ.getId(); }
    protected ConditionValue getCValueFollowId() { return _myCQ.getFollowId(); }
    public String keepFollowId_InScopeRelation_UserByFollowId(UserCQ sq)
    { return _myCQ.keepFollowId_InScopeRelation_UserByFollowId(sq); }
    public String keepFollowId_NotInScopeRelation_UserByFollowId(UserCQ sq)
    { return _myCQ.keepFollowId_NotInScopeRelation_UserByFollowId(sq); }
    protected ConditionValue getCValueFollowedId() { return _myCQ.getFollowedId(); }
    public String keepFollowedId_InScopeRelation_UserByFollowedId(UserCQ sq)
    { return _myCQ.keepFollowedId_InScopeRelation_UserByFollowedId(sq); }
    public String keepFollowedId_NotInScopeRelation_UserByFollowedId(UserCQ sq)
    { return _myCQ.keepFollowedId_NotInScopeRelation_UserByFollowedId(sq); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) { return null; }
    public String keepScalarCondition(RelationshipCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(RelationshipCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(RelationshipCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(RelationshipCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(RelationshipCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return RelationshipCB.class.getName(); }
    protected String xinCQ() { return RelationshipCQ.class.getName(); }
}
