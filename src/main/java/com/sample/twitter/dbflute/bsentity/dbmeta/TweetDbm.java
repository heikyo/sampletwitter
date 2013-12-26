package com.sample.twitter.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.sample.twitter.dbflute.allcommon.*;
import com.sample.twitter.dbflute.exentity.*;

/**
 * The DB meta of tweet. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TweetDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TweetDbm _instance = new TweetDbm();
    private TweetDbm() {}
    public static TweetDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgId(), "id");
        setupEpg(_epgMap, new EpgUserId(), "userId");
        setupEpg(_epgMap, new EpgTweet(), "tweet");
        setupEpg(_epgMap, new EpgCreateAt(), "createAt");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgId implements PropertyGateway {
        public Object read(Entity e) { return ((Tweet)e).getId(); }
        public void write(Entity e, Object v) { ((Tweet)e).setId(cti(v)); }
    }
    public static class EpgUserId implements PropertyGateway {
        public Object read(Entity e) { return ((Tweet)e).getUserId(); }
        public void write(Entity e, Object v) { ((Tweet)e).setUserId(cti(v)); }
    }
    public static class EpgTweet implements PropertyGateway {
        public Object read(Entity e) { return ((Tweet)e).getTweet(); }
        public void write(Entity e, Object v) { ((Tweet)e).setTweet((String)v); }
    }
    public static class EpgCreateAt implements PropertyGateway {
        public Object read(Entity e) { return ((Tweet)e).getCreateAt(); }
        public void write(Entity e, Object v) { ((Tweet)e).setCreateAt((java.sql.Timestamp)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "tweet";
    protected final String _tablePropertyName = "tweet";
    protected final TableSqlName _tableSqlName = new TableSqlName("tweet", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, true, "id", Integer.class, true, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, true, "userId", Integer.class, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, "user", null, null);
    protected final ColumnInfo _columnTweet = cci("tweet", "tweet", null, null, true, "tweet", String.class, false, false, "CHAR", 140, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCreateAt = cci("create_at", "create_at", null, null, true, "createAt", java.sql.Timestamp.class, false, false, "TIMESTAMP", 19, 0, "CURRENT_TIMESTAMP", false, null, null, null, null, null);

    public ColumnInfo columnId() { return _columnId; }
    public ColumnInfo columnUserId() { return _columnUserId; }
    public ColumnInfo columnTweet() { return _columnTweet; }
    public ColumnInfo columnCreateAt() { return _columnCreateAt; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnUserId());
        ls.add(columnTweet());
        ls.add(columnCreateAt());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignUser() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnUserId(), UserDbm.getInstance().columnId());
        return cfi("tweet_ibfk_1", "user", this, UserDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "tweetList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.sample.twitter.dbflute.exentity.Tweet"; }
    public String getConditionBeanTypeName() { return "com.sample.twitter.dbflute.cbean.TweetCB"; }
    public String getBehaviorTypeName() { return "com.sample.twitter.dbflute.exbhv.TweetBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Tweet> getEntityType() { return Tweet.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Tweet newMyEntity() { return new Tweet(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((Tweet)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((Tweet)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
