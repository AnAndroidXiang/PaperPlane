package com.marktony.zhihudaily.home;

import com.marktony.zhihudaily.bean.GuokrHandpickNews;
import com.marktony.zhihudaily.BasePresenter;
import com.marktony.zhihudaily.BaseView;

import java.util.ArrayList;

/**
 * Created by Lizhaotailang on 2016/9/15.
 */

public interface GuokrContract {

    interface View extends BaseView<Presenter> {

        void showError();

        void showResults(ArrayList<GuokrHandpickNews.result> list);

        void showLoading();

        void stopLoading();

    }

    interface Presenter extends BasePresenter{

        void setUrl(String url);

        void refresh();

        void startReading(int position);

    }

}
