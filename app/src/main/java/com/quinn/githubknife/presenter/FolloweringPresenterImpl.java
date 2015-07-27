package com.quinn.githubknife.presenter;

import android.content.Context;

import com.quinn.githubknife.ui.view.ListFragmentView;

/**
 * Created by Quinn on 7/20/15.
 */
public class FolloweringPresenterImpl extends PresenterAdapter{

    public FolloweringPresenterImpl(Context context, ListFragmentView view){
        super(context, view);
    }

    @Override
    public void onPageLoad(int page, String user){
        super.onPageLoad(page,user);
        interactor.loadFollowerings(user,page);
    }


}
