package com.sample.twitter.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.sample.twitter.dbflute.cbean.cq.RelationshipCQ;

/**
 * The nest select set-upper of relationship.
 * @author DBFlute(AutoGenerator)
 */
public class RelationshipNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RelationshipCQ _query;
    public RelationshipNss(RelationshipCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * user by my follow_id, named 'userByFollowId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public UserNss withUserByFollowId() {
        _query.doNss(new RelationshipCQ.NssCall() { public ConditionQuery qf() { return _query.queryUserByFollowId(); }});
        return new UserNss(_query.queryUserByFollowId());
    }
    /**
     * With nested relation columns to select clause. <br />
     * user by my followed_id, named 'userByFollowedId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public UserNss withUserByFollowedId() {
        _query.doNss(new RelationshipCQ.NssCall() { public ConditionQuery qf() { return _query.queryUserByFollowedId(); }});
        return new UserNss(_query.queryUserByFollowedId());
    }

}
