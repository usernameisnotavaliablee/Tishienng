package com.bxkj.student.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class AcRunQuestionBinding extends androidx.databinding.ViewDataBinding {

    @androidx.annotation.NonNull
    public final com.bxkj.student.databinding.PubTitleBinding layoutTitle;

    @androidx.databinding.Bindable
    protected com.bxkj.student.run.app.exam.QuestionActivity mActivity;

    @androidx.databinding.Bindable
    protected java.util.List<java.util.Map<java.lang.String, java.lang.Object>> mAnswer;

    @androidx.databinding.Bindable
    protected java.lang.Integer mCheckedId;

    @androidx.databinding.Bindable
    protected java.util.Map<java.lang.String, java.lang.Object> mData;

    @androidx.databinding.Bindable
    protected java.lang.Boolean mIsShowRightAnswer;

    @androidx.annotation.NonNull
    public final android.widget.RadioGroup rgAnswer;

    @androidx.annotation.NonNull
    public final android.widget.Button tbCommit;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvIndex;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvQuestion;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvRightAnswer;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvScore;

    @androidx.annotation.NonNull
    public final android.widget.TextView tvType;

    protected AcRunQuestionBinding(java.lang.Object r1, android.view.View r2, int r3, com.bxkj.student.databinding.PubTitleBinding r4, android.widget.RadioGroup r5, android.widget.Button r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.layoutTitle = r4
            r0.rgAnswer = r5
            r0.tbCommit = r6
            r0.tvIndex = r7
            r0.tvQuestion = r8
            r0.tvRightAnswer = r9
            r0.tvScore = r10
            r0.tvType = r11
            return
    }

    public static com.bxkj.student.databinding.AcRunQuestionBinding bind(@androidx.annotation.NonNull android.view.View r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcRunQuestionBinding r1 = bind(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcRunQuestionBinding bind(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = 2131493013(0x7f0c0095, float:1.8609494E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.bind(r2, r1, r0)
            com.bxkj.student.databinding.AcRunQuestionBinding r1 = (com.bxkj.student.databinding.AcRunQuestionBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcRunQuestionBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcRunQuestionBinding r1 = inflate(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static com.bxkj.student.databinding.AcRunQuestionBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3) {
            androidx.databinding.DataBindingComponent r0 = androidx.databinding.DataBindingUtil.getDefaultComponent()
            com.bxkj.student.databinding.AcRunQuestionBinding r1 = inflate(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcRunQuestionBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, boolean r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 2131493013(0x7f0c0095, float:1.8609494E38)
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.inflateInternal(r1, r0, r2, r3, r4)
            com.bxkj.student.databinding.AcRunQuestionBinding r1 = (com.bxkj.student.databinding.AcRunQuestionBinding) r1
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.bxkj.student.databinding.AcRunQuestionBinding inflate(@androidx.annotation.NonNull android.view.LayoutInflater r3, @androidx.annotation.Nullable java.lang.Object r4) {
            r0 = 0
            r1 = 0
            r2 = 2131493013(0x7f0c0095, float:1.8609494E38)
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.inflateInternal(r3, r2, r0, r1, r4)
            com.bxkj.student.databinding.AcRunQuestionBinding r3 = (com.bxkj.student.databinding.AcRunQuestionBinding) r3
            return r3
    }

    @androidx.annotation.Nullable
    public com.bxkj.student.run.app.exam.QuestionActivity getActivity() {
            r1 = this;
            com.bxkj.student.run.app.exam.QuestionActivity r0 = r1.mActivity
            return r0
    }

    @androidx.annotation.Nullable
    public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getAnswer() {
            r1 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r1.mAnswer
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Integer getCheckedId() {
            r1 = this;
            java.lang.Integer r0 = r1.mCheckedId
            return r0
    }

    @androidx.annotation.Nullable
    public java.util.Map<java.lang.String, java.lang.Object> getData() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mData
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Boolean getIsShowRightAnswer() {
            r1 = this;
            java.lang.Boolean r0 = r1.mIsShowRightAnswer
            return r0
    }

    public abstract void setActivity(@androidx.annotation.Nullable com.bxkj.student.run.app.exam.QuestionActivity r1);

    public abstract void setAnswer(@androidx.annotation.Nullable java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r1);

    public abstract void setCheckedId(@androidx.annotation.Nullable java.lang.Integer r1);

    public abstract void setData(@androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.Object> r1);

    public abstract void setIsShowRightAnswer(@androidx.annotation.Nullable java.lang.Boolean r1);
}
