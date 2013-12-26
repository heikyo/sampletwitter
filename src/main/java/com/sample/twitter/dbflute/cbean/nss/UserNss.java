package com.sample.twitter.dbflute.cbean.nss;

import com.sample.twitter.dbflute.cbean.cq.UserCQ;

/**
 * The nest select set-upper of user.
 * @author DBFlute(AutoGenerator)
 */
public class UserNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserCQ _query;
    public UserNss(UserCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
