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
 * The abstract condition-query of tweet.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTweetCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTweetCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "tweet";
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
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as equal. (NullAllowed: if null, no condition)
     */
    public void setUserId_Equal(Integer userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Integer userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setUserId_NotEqual(Integer userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Integer userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userId The value of userId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueUserId(), "user_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userIdList The collection of userId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_InScope(Collection<Integer> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Integer> userIdList) {
        regINS(CK_INS, cTL(userIdList), getCValueUserId(), "user_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @param userIdList The collection of userId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), getCValueUserId(), "user_id");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select user_id from user where ...)} <br />
     * user by my user_id, named 'user'.
     * @param subQuery The sub-query of User for 'in-scope'. (NotNull)
     */
    public void inScopeUser(SubQuery<UserCB> subQuery) {
        assertObjectNotNull("subQuery<UserCB>", subQuery);
        UserCB cb = new UserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_InScopeRelation_User(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "user_id", "id", subQueryPropertyName, "user");
    }
    public abstract String keepUserId_InScopeRelation_User(UserCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select user_id from user where ...)} <br />
     * user by my user_id, named 'user'.
     * @param subQuery The sub-query of User for 'not in-scope'. (NotNull)
     */
    public void notInScopeUser(SubQuery<UserCB> subQuery) {
        assertObjectNotNull("subQuery<UserCB>", subQuery);
        UserCB cb = new UserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_NotInScopeRelation_User(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "user_id", "id", subQueryPropertyName, "user");
    }
    public abstract String keepUserId_NotInScopeRelation_User(UserCQ subQuery);

    protected void regUserId(ConditionKey k, Object v) { regQ(k, v, getCValueUserId(), "user_id"); }
    abstract protected ConditionValue getCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * tweet: {NotNull, CHAR(140)}
     * @param tweet The value of tweet as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTweet_Equal(String tweet) {
        doSetTweet_Equal(fRES(tweet));
    }

    protected void doSetTweet_Equal(String tweet) {
        regTweet(CK_EQ, tweet);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * tweet: {NotNull, CHAR(140)}
     * @param tweet The value of tweet as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTweet_NotEqual(String tweet) {
        doSetTweet_NotEqual(fRES(tweet));
    }

    protected void doSetTweet_NotEqual(String tweet) {
        regTweet(CK_NES, tweet);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * tweet: {NotNull, CHAR(140)}
     * @param tweet The value of tweet as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTweet_GreaterThan(String tweet) {
        regTweet(CK_GT, fRES(tweet));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * tweet: {NotNull, CHAR(140)}
     * @param tweet The value of tweet as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setTweet_LessThan(String tweet) {
        regTweet(CK_LT, fRES(tweet));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * tweet: {NotNull, CHAR(140)}
     * @param tweet The value of tweet as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTweet_GreaterEqual(String tweet) {
        regTweet(CK_GE, fRES(tweet));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * tweet: {NotNull, CHAR(140)}
     * @param tweet The value of tweet as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTweet_LessEqual(String tweet) {
        regTweet(CK_LE, fRES(tweet));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * tweet: {NotNull, CHAR(140)}
     * @param tweetList The collection of tweet as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTweet_InScope(Collection<String> tweetList) {
        doSetTweet_InScope(tweetList);
    }

    public void doSetTweet_InScope(Collection<String> tweetList) {
        regINS(CK_INS, cTL(tweetList), getCValueTweet(), "tweet");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * tweet: {NotNull, CHAR(140)}
     * @param tweetList The collection of tweet as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTweet_NotInScope(Collection<String> tweetList) {
        doSetTweet_NotInScope(tweetList);
    }

    public void doSetTweet_NotInScope(Collection<String> tweetList) {
        regINS(CK_NINS, cTL(tweetList), getCValueTweet(), "tweet");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * tweet: {NotNull, CHAR(140)}
     * @param tweet The value of tweet as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTweet_PrefixSearch(String tweet) {
        setTweet_LikeSearch(tweet, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * tweet: {NotNull, CHAR(140)} <br />
     * <pre>e.g. setTweet_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tweet The value of tweet as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTweet_LikeSearch(String tweet, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tweet), getCValueTweet(), "tweet", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * tweet: {NotNull, CHAR(140)}
     * @param tweet The value of tweet as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTweet_NotLikeSearch(String tweet, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tweet), getCValueTweet(), "tweet", likeSearchOption);
    }

    protected void regTweet(ConditionKey k, Object v) { regQ(k, v, getCValueTweet(), "tweet"); }
    abstract protected ConditionValue getCValueTweet();

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
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;TweetCB&gt;() {
     *     public void query(TweetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<TweetCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;TweetCB&gt;() {
     *     public void query(TweetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<TweetCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;TweetCB&gt;() {
     *     public void query(TweetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<TweetCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;TweetCB&gt;() {
     *     public void query(TweetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<TweetCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;TweetCB&gt;() {
     *     public void query(TweetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<TweetCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TweetCB&gt;() {
     *     public void query(TweetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<TweetCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<TweetCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<TweetCB>(new HpSSQSetupper<TweetCB>() {
            public void setup(String function, SubQuery<TweetCB> subQuery, HpSSQOption<TweetCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<TweetCB> subQuery, String operand, HpSSQOption<TweetCB> option) {
        assertObjectNotNull("subQuery<TweetCB>", subQuery);
        TweetCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(TweetCQ subQuery);

    protected TweetCB xcreateScalarConditionCB() {
        TweetCB cb = new TweetCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected TweetCB xcreateScalarConditionPartitionByCB() {
        TweetCB cb = new TweetCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<TweetCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<TweetCB>", subQuery);
        TweetCB cb = new TweetCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(TweetCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TweetCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<TweetCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<TweetCB>(new HpQDRSetupper<TweetCB>() {
            public void setup(String function, SubQuery<TweetCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<TweetCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<TweetCB>", subQuery);
        TweetCB cb = new TweetCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(TweetCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<TweetCB> subQuery) {
        assertObjectNotNull("subQuery<TweetCB>", subQuery);
        TweetCB cb = new TweetCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(TweetCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<TweetCB> subQuery) {
        assertObjectNotNull("subQuery<TweetCB>", subQuery);
        TweetCB cb = new TweetCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(TweetCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return TweetCB.class.getName(); }
    protected String xabCQ() { return TweetCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
