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
 * The abstract condition-query of user.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUserCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "user";
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
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select follow_id from relationship where ...)} <br />
     * relationship by follow_id, named 'relationshipByFollowIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsRelationshipByFollowIdList</span>(new SubQuery&lt;RelationshipCB&gt;() {
     *     public void query(RelationshipCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of RelationshipByFollowIdList for 'exists'. (NotNull)
     */
    public void existsRelationshipByFollowIdList(SubQuery<RelationshipCB> subQuery) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_ExistsReferrer_RelationshipByFollowIdList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "id", "follow_id", subQueryPropertyName, "relationshipByFollowIdList");
    }
    public abstract String keepId_ExistsReferrer_RelationshipByFollowIdList(RelationshipCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select followed_id from relationship where ...)} <br />
     * relationship by followed_id, named 'relationshipByFollowedIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsRelationshipByFollowedIdList</span>(new SubQuery&lt;RelationshipCB&gt;() {
     *     public void query(RelationshipCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of RelationshipByFollowedIdList for 'exists'. (NotNull)
     */
    public void existsRelationshipByFollowedIdList(SubQuery<RelationshipCB> subQuery) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_ExistsReferrer_RelationshipByFollowedIdList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "id", "followed_id", subQueryPropertyName, "relationshipByFollowedIdList");
    }
    public abstract String keepId_ExistsReferrer_RelationshipByFollowedIdList(RelationshipCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select user_id from tweet where ...)} <br />
     * tweet by user_id, named 'tweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsTweetList</span>(new SubQuery&lt;TweetCB&gt;() {
     *     public void query(TweetCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of TweetList for 'exists'. (NotNull)
     */
    public void existsTweetList(SubQuery<TweetCB> subQuery) {
        assertObjectNotNull("subQuery<TweetCB>", subQuery);
        TweetCB cb = new TweetCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_ExistsReferrer_TweetList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "id", "user_id", subQueryPropertyName, "tweetList");
    }
    public abstract String keepId_ExistsReferrer_TweetList(TweetCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select follow_id from relationship where ...)} <br />
     * relationship by follow_id, named 'relationshipByFollowIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsRelationshipByFollowIdList</span>(new SubQuery&lt;RelationshipCB&gt;() {
     *     public void query(RelationshipCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of Id_NotExistsReferrer_RelationshipByFollowIdList for 'not exists'. (NotNull)
     */
    public void notExistsRelationshipByFollowIdList(SubQuery<RelationshipCB> subQuery) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_NotExistsReferrer_RelationshipByFollowIdList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "id", "follow_id", subQueryPropertyName, "relationshipByFollowIdList");
    }
    public abstract String keepId_NotExistsReferrer_RelationshipByFollowIdList(RelationshipCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select followed_id from relationship where ...)} <br />
     * relationship by followed_id, named 'relationshipByFollowedIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsRelationshipByFollowedIdList</span>(new SubQuery&lt;RelationshipCB&gt;() {
     *     public void query(RelationshipCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of Id_NotExistsReferrer_RelationshipByFollowedIdList for 'not exists'. (NotNull)
     */
    public void notExistsRelationshipByFollowedIdList(SubQuery<RelationshipCB> subQuery) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_NotExistsReferrer_RelationshipByFollowedIdList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "id", "followed_id", subQueryPropertyName, "relationshipByFollowedIdList");
    }
    public abstract String keepId_NotExistsReferrer_RelationshipByFollowedIdList(RelationshipCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select user_id from tweet where ...)} <br />
     * tweet by user_id, named 'tweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsTweetList</span>(new SubQuery&lt;TweetCB&gt;() {
     *     public void query(TweetCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of Id_NotExistsReferrer_TweetList for 'not exists'. (NotNull)
     */
    public void notExistsTweetList(SubQuery<TweetCB> subQuery) {
        assertObjectNotNull("subQuery<TweetCB>", subQuery);
        TweetCB cb = new TweetCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_NotExistsReferrer_TweetList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "id", "user_id", subQueryPropertyName, "tweetList");
    }
    public abstract String keepId_NotExistsReferrer_TweetList(TweetCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select follow_id from relationship where ...)} <br />
     * relationship by follow_id, named 'relationshipByFollowIdAsOne'.
     * @param subQuery The sub-query of RelationshipByFollowIdList for 'in-scope'. (NotNull)
     */
    public void inScopeRelationshipByFollowIdList(SubQuery<RelationshipCB> subQuery) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_InScopeRelation_RelationshipByFollowIdList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "id", "follow_id", subQueryPropertyName, "relationshipByFollowIdList");
    }
    public abstract String keepId_InScopeRelation_RelationshipByFollowIdList(RelationshipCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select followed_id from relationship where ...)} <br />
     * relationship by followed_id, named 'relationshipByFollowedIdAsOne'.
     * @param subQuery The sub-query of RelationshipByFollowedIdList for 'in-scope'. (NotNull)
     */
    public void inScopeRelationshipByFollowedIdList(SubQuery<RelationshipCB> subQuery) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_InScopeRelation_RelationshipByFollowedIdList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "id", "followed_id", subQueryPropertyName, "relationshipByFollowedIdList");
    }
    public abstract String keepId_InScopeRelation_RelationshipByFollowedIdList(RelationshipCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select user_id from tweet where ...)} <br />
     * tweet by user_id, named 'tweetAsOne'.
     * @param subQuery The sub-query of TweetList for 'in-scope'. (NotNull)
     */
    public void inScopeTweetList(SubQuery<TweetCB> subQuery) {
        assertObjectNotNull("subQuery<TweetCB>", subQuery);
        TweetCB cb = new TweetCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_InScopeRelation_TweetList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "id", "user_id", subQueryPropertyName, "tweetList");
    }
    public abstract String keepId_InScopeRelation_TweetList(TweetCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select follow_id from relationship where ...)} <br />
     * relationship by follow_id, named 'relationshipByFollowIdAsOne'.
     * @param subQuery The sub-query of RelationshipByFollowIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeRelationshipByFollowIdList(SubQuery<RelationshipCB> subQuery) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_NotInScopeRelation_RelationshipByFollowIdList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "id", "follow_id", subQueryPropertyName, "relationshipByFollowIdList");
    }
    public abstract String keepId_NotInScopeRelation_RelationshipByFollowIdList(RelationshipCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select followed_id from relationship where ...)} <br />
     * relationship by followed_id, named 'relationshipByFollowedIdAsOne'.
     * @param subQuery The sub-query of RelationshipByFollowedIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeRelationshipByFollowedIdList(SubQuery<RelationshipCB> subQuery) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_NotInScopeRelation_RelationshipByFollowedIdList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "id", "followed_id", subQueryPropertyName, "relationshipByFollowedIdList");
    }
    public abstract String keepId_NotInScopeRelation_RelationshipByFollowedIdList(RelationshipCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select user_id from tweet where ...)} <br />
     * tweet by user_id, named 'tweetAsOne'.
     * @param subQuery The sub-query of TweetList for 'not in-scope'. (NotNull)
     */
    public void notInScopeTweetList(SubQuery<TweetCB> subQuery) {
        assertObjectNotNull("subQuery<TweetCB>", subQuery);
        TweetCB cb = new TweetCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_NotInScopeRelation_TweetList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "id", "user_id", subQueryPropertyName, "tweetList");
    }
    public abstract String keepId_NotInScopeRelation_TweetList(TweetCQ subQuery);

    public void xsderiveRelationshipByFollowIdList(String function, SubQuery<RelationshipCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_SpecifyDerivedReferrer_RelationshipByFollowIdList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "id", "follow_id", subQueryPropertyName, "relationshipByFollowIdList", aliasName, option);
    }
    public abstract String keepId_SpecifyDerivedReferrer_RelationshipByFollowIdList(RelationshipCQ subQuery);

    public void xsderiveRelationshipByFollowedIdList(String function, SubQuery<RelationshipCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_SpecifyDerivedReferrer_RelationshipByFollowedIdList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "id", "followed_id", subQueryPropertyName, "relationshipByFollowedIdList", aliasName, option);
    }
    public abstract String keepId_SpecifyDerivedReferrer_RelationshipByFollowedIdList(RelationshipCQ subQuery);

    public void xsderiveTweetList(String function, SubQuery<TweetCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<TweetCB>", subQuery);
        TweetCB cb = new TweetCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_SpecifyDerivedReferrer_TweetList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "id", "user_id", subQueryPropertyName, "tweetList", aliasName, option);
    }
    public abstract String keepId_SpecifyDerivedReferrer_TweetList(TweetCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from relationship where ...)} <br />
     * relationship by follow_id, named 'relationshipByFollowIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedRelationshipByFollowIdList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;RelationshipCB&gt;() {
     *     public void query(RelationshipCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<RelationshipCB> derivedRelationshipByFollowIdList() {
        return xcreateQDRFunctionRelationshipByFollowIdList();
    }
    protected HpQDRFunction<RelationshipCB> xcreateQDRFunctionRelationshipByFollowIdList() {
        return new HpQDRFunction<RelationshipCB>(new HpQDRSetupper<RelationshipCB>() {
            public void setup(String function, SubQuery<RelationshipCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveRelationshipByFollowIdList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveRelationshipByFollowIdList(String function, SubQuery<RelationshipCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_QueryDerivedReferrer_RelationshipByFollowIdList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepId_QueryDerivedReferrer_RelationshipByFollowIdListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "id", "follow_id", subQueryPropertyName, "relationshipByFollowIdList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepId_QueryDerivedReferrer_RelationshipByFollowIdList(RelationshipCQ subQuery);
    public abstract String keepId_QueryDerivedReferrer_RelationshipByFollowIdListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from relationship where ...)} <br />
     * relationship by followed_id, named 'relationshipByFollowedIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedRelationshipByFollowedIdList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;RelationshipCB&gt;() {
     *     public void query(RelationshipCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<RelationshipCB> derivedRelationshipByFollowedIdList() {
        return xcreateQDRFunctionRelationshipByFollowedIdList();
    }
    protected HpQDRFunction<RelationshipCB> xcreateQDRFunctionRelationshipByFollowedIdList() {
        return new HpQDRFunction<RelationshipCB>(new HpQDRSetupper<RelationshipCB>() {
            public void setup(String function, SubQuery<RelationshipCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveRelationshipByFollowedIdList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveRelationshipByFollowedIdList(String function, SubQuery<RelationshipCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<RelationshipCB>", subQuery);
        RelationshipCB cb = new RelationshipCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_QueryDerivedReferrer_RelationshipByFollowedIdList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepId_QueryDerivedReferrer_RelationshipByFollowedIdListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "id", "followed_id", subQueryPropertyName, "relationshipByFollowedIdList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepId_QueryDerivedReferrer_RelationshipByFollowedIdList(RelationshipCQ subQuery);
    public abstract String keepId_QueryDerivedReferrer_RelationshipByFollowedIdListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from tweet where ...)} <br />
     * tweet by user_id, named 'tweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedTweetList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;TweetCB&gt;() {
     *     public void query(TweetCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TweetCB> derivedTweetList() {
        return xcreateQDRFunctionTweetList();
    }
    protected HpQDRFunction<TweetCB> xcreateQDRFunctionTweetList() {
        return new HpQDRFunction<TweetCB>(new HpQDRSetupper<TweetCB>() {
            public void setup(String function, SubQuery<TweetCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveTweetList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveTweetList(String function, SubQuery<TweetCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<TweetCB>", subQuery);
        TweetCB cb = new TweetCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_QueryDerivedReferrer_TweetList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepId_QueryDerivedReferrer_TweetListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "id", "user_id", subQueryPropertyName, "tweetList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepId_QueryDerivedReferrer_TweetList(TweetCQ subQuery);
    public abstract String keepId_QueryDerivedReferrer_TweetListParameter(Object parameterValue);

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * username: {NotNull, CHAR(50)}
     * @param username The value of username as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUsername_Equal(String username) {
        doSetUsername_Equal(fRES(username));
    }

    protected void doSetUsername_Equal(String username) {
        regUsername(CK_EQ, username);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * username: {NotNull, CHAR(50)}
     * @param username The value of username as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUsername_NotEqual(String username) {
        doSetUsername_NotEqual(fRES(username));
    }

    protected void doSetUsername_NotEqual(String username) {
        regUsername(CK_NES, username);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * username: {NotNull, CHAR(50)}
     * @param username The value of username as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUsername_GreaterThan(String username) {
        regUsername(CK_GT, fRES(username));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * username: {NotNull, CHAR(50)}
     * @param username The value of username as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUsername_LessThan(String username) {
        regUsername(CK_LT, fRES(username));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * username: {NotNull, CHAR(50)}
     * @param username The value of username as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUsername_GreaterEqual(String username) {
        regUsername(CK_GE, fRES(username));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * username: {NotNull, CHAR(50)}
     * @param username The value of username as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUsername_LessEqual(String username) {
        regUsername(CK_LE, fRES(username));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * username: {NotNull, CHAR(50)}
     * @param usernameList The collection of username as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUsername_InScope(Collection<String> usernameList) {
        doSetUsername_InScope(usernameList);
    }

    public void doSetUsername_InScope(Collection<String> usernameList) {
        regINS(CK_INS, cTL(usernameList), getCValueUsername(), "username");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * username: {NotNull, CHAR(50)}
     * @param usernameList The collection of username as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUsername_NotInScope(Collection<String> usernameList) {
        doSetUsername_NotInScope(usernameList);
    }

    public void doSetUsername_NotInScope(Collection<String> usernameList) {
        regINS(CK_NINS, cTL(usernameList), getCValueUsername(), "username");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * username: {NotNull, CHAR(50)}
     * @param username The value of username as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUsername_PrefixSearch(String username) {
        setUsername_LikeSearch(username, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * username: {NotNull, CHAR(50)} <br />
     * <pre>e.g. setUsername_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param username The value of username as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUsername_LikeSearch(String username, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(username), getCValueUsername(), "username", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * username: {NotNull, CHAR(50)}
     * @param username The value of username as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUsername_NotLikeSearch(String username, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(username), getCValueUsername(), "username", likeSearchOption);
    }

    protected void regUsername(ConditionKey k, Object v) { regQ(k, v, getCValueUsername(), "username"); }
    abstract protected ConditionValue getCValueUsername();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * password: {NotNull, CHAR(255)}
     * @param password The value of password as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_Equal(String password) {
        doSetPassword_Equal(fRES(password));
    }

    protected void doSetPassword_Equal(String password) {
        regPassword(CK_EQ, password);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * password: {NotNull, CHAR(255)}
     * @param password The value of password as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_NotEqual(String password) {
        doSetPassword_NotEqual(fRES(password));
    }

    protected void doSetPassword_NotEqual(String password) {
        regPassword(CK_NES, password);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * password: {NotNull, CHAR(255)}
     * @param password The value of password as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_GreaterThan(String password) {
        regPassword(CK_GT, fRES(password));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * password: {NotNull, CHAR(255)}
     * @param password The value of password as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_LessThan(String password) {
        regPassword(CK_LT, fRES(password));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * password: {NotNull, CHAR(255)}
     * @param password The value of password as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_GreaterEqual(String password) {
        regPassword(CK_GE, fRES(password));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * password: {NotNull, CHAR(255)}
     * @param password The value of password as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_LessEqual(String password) {
        regPassword(CK_LE, fRES(password));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * password: {NotNull, CHAR(255)}
     * @param passwordList The collection of password as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        doSetPassword_InScope(passwordList);
    }

    public void doSetPassword_InScope(Collection<String> passwordList) {
        regINS(CK_INS, cTL(passwordList), getCValuePassword(), "password");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * password: {NotNull, CHAR(255)}
     * @param passwordList The collection of password as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_NotInScope(Collection<String> passwordList) {
        doSetPassword_NotInScope(passwordList);
    }

    public void doSetPassword_NotInScope(Collection<String> passwordList) {
        regINS(CK_NINS, cTL(passwordList), getCValuePassword(), "password");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * password: {NotNull, CHAR(255)}
     * @param password The value of password as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_PrefixSearch(String password) {
        setPassword_LikeSearch(password, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * password: {NotNull, CHAR(255)} <br />
     * <pre>e.g. setPassword_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param password The value of password as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(password), getCValuePassword(), "password", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * password: {NotNull, CHAR(255)}
     * @param password The value of password as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPassword_NotLikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(password), getCValuePassword(), "password", likeSearchOption);
    }

    protected void regPassword(ConditionKey k, Object v) { regQ(k, v, getCValuePassword(), "password"); }
    abstract protected ConditionValue getCValuePassword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * email: {NotNull, CHAR(100)}
     * @param email The value of email as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_Equal(String email) {
        doSetEmail_Equal(fRES(email));
    }

    protected void doSetEmail_Equal(String email) {
        regEmail(CK_EQ, email);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * email: {NotNull, CHAR(100)}
     * @param email The value of email as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_NotEqual(String email) {
        doSetEmail_NotEqual(fRES(email));
    }

    protected void doSetEmail_NotEqual(String email) {
        regEmail(CK_NES, email);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * email: {NotNull, CHAR(100)}
     * @param email The value of email as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_GreaterThan(String email) {
        regEmail(CK_GT, fRES(email));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * email: {NotNull, CHAR(100)}
     * @param email The value of email as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_LessThan(String email) {
        regEmail(CK_LT, fRES(email));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * email: {NotNull, CHAR(100)}
     * @param email The value of email as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_GreaterEqual(String email) {
        regEmail(CK_GE, fRES(email));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * email: {NotNull, CHAR(100)}
     * @param email The value of email as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_LessEqual(String email) {
        regEmail(CK_LE, fRES(email));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * email: {NotNull, CHAR(100)}
     * @param emailList The collection of email as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_InScope(Collection<String> emailList) {
        doSetEmail_InScope(emailList);
    }

    public void doSetEmail_InScope(Collection<String> emailList) {
        regINS(CK_INS, cTL(emailList), getCValueEmail(), "email");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * email: {NotNull, CHAR(100)}
     * @param emailList The collection of email as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_NotInScope(Collection<String> emailList) {
        doSetEmail_NotInScope(emailList);
    }

    public void doSetEmail_NotInScope(Collection<String> emailList) {
        regINS(CK_NINS, cTL(emailList), getCValueEmail(), "email");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * email: {NotNull, CHAR(100)}
     * @param email The value of email as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmail_PrefixSearch(String email) {
        setEmail_LikeSearch(email, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * email: {NotNull, CHAR(100)} <br />
     * <pre>e.g. setEmail_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param email The value of email as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEmail_LikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(email), getCValueEmail(), "email", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * email: {NotNull, CHAR(100)}
     * @param email The value of email as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEmail_NotLikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(email), getCValueEmail(), "email", likeSearchOption);
    }

    protected void regEmail(ConditionKey k, Object v) { regQ(k, v, getCValueEmail(), "email"); }
    abstract protected ConditionValue getCValueEmail();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * create_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createAt The value of createAt as equal. (NullAllowed: if null, no condition)
     */
    public void setCreateAt_Equal(java.sql.Timestamp createAt) {
        regCreateAt(CK_EQ,  createAt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * create_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createAt The value of createAt as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCreateAt_GreaterThan(java.sql.Timestamp createAt) {
        regCreateAt(CK_GT,  createAt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * create_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createAt The value of createAt as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCreateAt_LessThan(java.sql.Timestamp createAt) {
        regCreateAt(CK_LT,  createAt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * create_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createAt The value of createAt as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCreateAt_GreaterEqual(java.sql.Timestamp createAt) {
        regCreateAt(CK_GE,  createAt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * create_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param createAt The value of createAt as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCreateAt_LessEqual(java.sql.Timestamp createAt) {
        regCreateAt(CK_LE, createAt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * create_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setCreateAt_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createAt. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createAt. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCreateAt_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueCreateAt(), "create_at", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * create_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of createAt. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of createAt. (NullAllowed: if null, no to-condition)
     */
    public void setCreateAt_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setCreateAt_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regCreateAt(ConditionKey k, Object v) { regQ(k, v, getCValueCreateAt(), "create_at"); }
    abstract protected ConditionValue getCValueCreateAt();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;UserCB&gt;() {
     *     public void query(UserCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<UserCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;UserCB&gt;() {
     *     public void query(UserCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<UserCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;UserCB&gt;() {
     *     public void query(UserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<UserCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;UserCB&gt;() {
     *     public void query(UserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<UserCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;UserCB&gt;() {
     *     public void query(UserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<UserCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;UserCB&gt;() {
     *     public void query(UserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<UserCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<UserCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<UserCB>(new HpSSQSetupper<UserCB>() {
            public void setup(String function, SubQuery<UserCB> subQuery, HpSSQOption<UserCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<UserCB> subQuery, String operand, HpSSQOption<UserCB> option) {
        assertObjectNotNull("subQuery<UserCB>", subQuery);
        UserCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(UserCQ subQuery);

    protected UserCB xcreateScalarConditionCB() {
        UserCB cb = new UserCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected UserCB xcreateScalarConditionPartitionByCB() {
        UserCB cb = new UserCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<UserCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<UserCB>", subQuery);
        UserCB cb = new UserCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(UserCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<UserCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<UserCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<UserCB>(new HpQDRSetupper<UserCB>() {
            public void setup(String function, SubQuery<UserCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<UserCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<UserCB>", subQuery);
        UserCB cb = new UserCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(UserCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<UserCB> subQuery) {
        assertObjectNotNull("subQuery<UserCB>", subQuery);
        UserCB cb = new UserCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(UserCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<UserCB> subQuery) {
        assertObjectNotNull("subQuery<UserCB>", subQuery);
        UserCB cb = new UserCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(UserCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return UserCB.class.getName(); }
    protected String xabCQ() { return UserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
