package com.sample.twitter.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.sample.twitter.dbflute.allcommon.*;
import com.sample.twitter.dbflute.cbean.*;
import com.sample.twitter.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of relationship.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsRelationshipCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsRelationshipCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "relationship";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param id The value of id as equal. (NullAllowed: if null, no condition)
     */
    public void setId_Equal(Integer id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param id The value of id as notEqual. (NullAllowed: if null, no condition)
     */
    public void setId_NotEqual(Integer id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(Integer id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param id The value of id as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setId_GreaterThan(Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param id The value of id as lessThan. (NullAllowed: if null, no condition)
     */
    public void setId_LessThan(Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param id The value of id as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setId_GreaterEqual(Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param id The value of id as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setId_LessEqual(Integer id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of id. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of id. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueId(), "id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param idList The collection of id as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setId_InScope(Collection<Integer> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Integer> idList) {
        regINS(CK_INS, cTL(idList), getCValueId(), "id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param idList The collection of id as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setId_NotInScope(Collection<Integer> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Integer> idList) {
        regINS(CK_NINS, cTL(idList), getCValueId(), "id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey k, Object v) { regQ(k, v, getCValueId(), "id"); }
    abstract protected ConditionValue getCValueId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * follow_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param followId The value of followId as equal. (NullAllowed: if null, no condition)
     */
    public void setFollowId_Equal(Integer followId) {
        doSetFollowId_Equal(followId);
    }

    protected void doSetFollowId_Equal(Integer followId) {
        regFollowId(CK_EQ, followId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * follow_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param followId The value of followId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setFollowId_NotEqual(Integer followId) {
        doSetFollowId_NotEqual(followId);
    }

    protected void doSetFollowId_NotEqual(Integer followId) {
        regFollowId(CK_NES, followId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * follow_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param followId The value of followId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFollowId_GreaterThan(Integer followId) {
        regFollowId(CK_GT, followId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * follow_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param followId The value of followId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFollowId_LessThan(Integer followId) {
        regFollowId(CK_LT, followId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * follow_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param followId The value of followId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFollowId_GreaterEqual(Integer followId) {
        regFollowId(CK_GE, followId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * follow_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param followId The value of followId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFollowId_LessEqual(Integer followId) {
        regFollowId(CK_LE, followId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * follow_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param minNumber The min number of followId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of followId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFollowId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueFollowId(), "follow_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * follow_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param followIdList The collection of followId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFollowId_InScope(Collection<Integer> followIdList) {
        doSetFollowId_InScope(followIdList);
    }

    protected void doSetFollowId_InScope(Collection<Integer> followIdList) {
        regINS(CK_INS, cTL(followIdList), getCValueFollowId(), "follow_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * follow_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @param followIdList The collection of followId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFollowId_NotInScope(Collection<Integer> followIdList) {
        doSetFollowId_NotInScope(followIdList);
    }

    protected void doSetFollowId_NotInScope(Collection<Integer> followIdList) {
        regINS(CK_NINS, cTL(followIdList), getCValueFollowId(), "follow_id");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select follow_id from user where ...)} <br />
     * user by my follow_id, named 'userByFollowId'.
     * @param subQuery The sub-query of UserByFollowId for 'in-scope'. (NotNull)
     */
    public void inScopeUserByFollowId(SubQuery<UserCB> subQuery) {
        assertObjectNotNull("subQuery<UserCB>", subQuery);
        UserCB cb = new UserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepFollowId_InScopeRelation_UserByFollowId(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "follow_id", "id", subQueryPropertyName, "userByFollowId");
    }
    public abstract String keepFollowId_InScopeRelation_UserByFollowId(UserCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select follow_id from user where ...)} <br />
     * user by my follow_id, named 'userByFollowId'.
     * @param subQuery The sub-query of UserByFollowId for 'not in-scope'. (NotNull)
     */
    public void notInScopeUserByFollowId(SubQuery<UserCB> subQuery) {
        assertObjectNotNull("subQuery<UserCB>", subQuery);
        UserCB cb = new UserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepFollowId_NotInScopeRelation_UserByFollowId(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "follow_id", "id", subQueryPropertyName, "userByFollowId");
    }
    public abstract String keepFollowId_NotInScopeRelation_UserByFollowId(UserCQ subQuery);

    protected void regFollowId(ConditionKey k, Object v) { regQ(k, v, getCValueFollowId(), "follow_id"); }
    abstract protected ConditionValue getCValueFollowId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * followed_id: {UQ+, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param followedId The value of followedId as equal. (NullAllowed: if null, no condition)
     */
    public void setFollowedId_Equal(Integer followedId) {
        doSetFollowedId_Equal(followedId);
    }

    protected void doSetFollowedId_Equal(Integer followedId) {
        regFollowedId(CK_EQ, followedId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * followed_id: {UQ+, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param followedId The value of followedId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setFollowedId_NotEqual(Integer followedId) {
        doSetFollowedId_NotEqual(followedId);
    }

    protected void doSetFollowedId_NotEqual(Integer followedId) {
        regFollowedId(CK_NES, followedId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * followed_id: {UQ+, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param followedId The value of followedId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFollowedId_GreaterThan(Integer followedId) {
        regFollowedId(CK_GT, followedId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * followed_id: {UQ+, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param followedId The value of followedId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFollowedId_LessThan(Integer followedId) {
        regFollowedId(CK_LT, followedId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * followed_id: {UQ+, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param followedId The value of followedId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFollowedId_GreaterEqual(Integer followedId) {
        regFollowedId(CK_GE, followedId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * followed_id: {UQ+, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param followedId The value of followedId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFollowedId_LessEqual(Integer followedId) {
        regFollowedId(CK_LE, followedId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * followed_id: {UQ+, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param minNumber The min number of followedId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of followedId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFollowedId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueFollowedId(), "followed_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * followed_id: {UQ+, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param followedIdList The collection of followedId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFollowedId_InScope(Collection<Integer> followedIdList) {
        doSetFollowedId_InScope(followedIdList);
    }

    protected void doSetFollowedId_InScope(Collection<Integer> followedIdList) {
        regINS(CK_INS, cTL(followedIdList), getCValueFollowedId(), "followed_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * followed_id: {UQ+, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param followedIdList The collection of followedId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFollowedId_NotInScope(Collection<Integer> followedIdList) {
        doSetFollowedId_NotInScope(followedIdList);
    }

    protected void doSetFollowedId_NotInScope(Collection<Integer> followedIdList) {
        regINS(CK_NINS, cTL(followedIdList), getCValueFollowedId(), "followed_id");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select followed_id from user where ...)} <br />
     * user by my followed_id, named 'userByFollowedId'.
     * @param subQuery The sub-query of UserByFollowedId for 'in-scope'. (NotNull)
     */
    public void inScopeUserByFollowedId(SubQuery<UserCB> subQuery) {
        assertObjectNotNull("subQuery<UserCB>", subQuery);
        UserCB cb = new UserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepFollowedId_InScopeRelation_UserByFollowedId(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "followed_id", "id", subQueryPropertyName, "userByFollowedId");
    }
    public abstract String keepFollowedId_InScopeRelation_UserByFollowedId(UserCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select followed_id from user where ...)} <br />
     * user by my followed_id, named 'userByFollowedId'.
     * @param subQuery The sub-query of UserByFollowedId for 'not in-scope'. (NotNull)
     */
    public void notInScopeUserByFollowedId(SubQuery<UserCB> subQuery) {
        assertObjectNotNull("subQuery<UserCB>", subQuery);
        UserCB cb = new UserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepFollowedId_NotInScopeRelation_UserByFollowedId(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "followed_id", "id", subQueryPropertyName, "userByFollowedId");
    }
    public abstract String keepFollowedId_NotInScopeRelation_UserByFollowedId(UserCQ subQuery);

    protected void regFollowedId(ConditionKey k, Object v) { regQ(k, v, getCValueFollowedId(), "followed_id"); }
    abstract protected ConditionValue getCValueFollowedId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;RelationshipCB&gt;() {
     *     public void query(RelationshipCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RelationshipCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;RelationshipCB&gt;() {
     *     public void query(RelationshipCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RelationshipCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;RelationshipCB&gt;() {
     *     public void query(RelationshipCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RelationshipCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;RelationshipCB&gt;() {
     *     public void query(RelationshipCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RelationshipCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;RelationshipCB&gt;() {
     *     public void query(RelationshipCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RelationshipCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;RelationshipCB&gt;() {
     *     public void query(RelationshipCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<RelationshipCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<RelationshipCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<RelationshipCB>(new HpSSQSetupper<RelationshipCB>() {
            public void setup(String function, SubQuery<RelationshipCB> subQuery, HpSSQOption<RelationshipCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<RelationshipCB> subQuery, String operand, HpSSQOption<RelationshipCB> option) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(RelationshipCQ subQuery);

    protected RelationshipCB xcreateScalarConditionCB() {
        RelationshipCB cb = new RelationshipCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected RelationshipCB xcreateScalarConditionPartitionByCB() {
        RelationshipCB cb = new RelationshipCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<RelationshipCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(RelationshipCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<RelationshipCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<RelationshipCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<RelationshipCB>(new HpQDRSetupper<RelationshipCB>() {
            public void setup(String function, SubQuery<RelationshipCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<RelationshipCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(RelationshipCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<RelationshipCB> subQuery) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(RelationshipCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<RelationshipCB> subQuery) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(RelationshipCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return RelationshipCB.class.getName(); }
    protected String xabCQ() { return RelationshipCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
