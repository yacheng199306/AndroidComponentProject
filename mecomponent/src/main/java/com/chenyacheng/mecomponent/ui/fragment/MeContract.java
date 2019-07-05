package com.chenyacheng.mecomponent.ui.fragment;

import com.chenyacheng.commoblib.base.BasePresenter;
import com.chenyacheng.commoblib.base.BaseView;

import io.reactivex.ObservableTransformer;

/**
 * 首页页面契约类
 *
 * @author chenyacheng
 * @date 2019/01/21
 */
public interface MeContract {

    interface View extends BaseView {

        /**
         * me测试
         */
        void meResult();

        /**
         * 接收服务端异常数据的处理，或是自定义数据的处理，发送信息通知界面
         *
         * @param msg String
         */
        void setMsg(String msg);

        /**
         * 绑定完成Observable发布的事件和当前组件绑定，实现生命周期同步，从而实现当前组件生命周期结束时，自动取消对Observable订阅
         *
         * @param <T> Object对象
         * @return ObservableTransformer
         */
        <T> ObservableTransformer<T, T> bindLifecycle();
    }

    abstract class AbstractPresenter extends BasePresenter<View> {

        /**
         * me请求
         */
        public abstract void me();
    }
}
