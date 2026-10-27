package com.google.android.material.datepicker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface DateSelector<S> extends android.os.Parcelable {
    @androidx.annotation.StyleRes
    int getDefaultThemeResId(android.content.Context r1);

    @androidx.annotation.StringRes
    int getDefaultTitleResId();

    @androidx.annotation.Nullable
    java.lang.String getError();

    @androidx.annotation.NonNull
    java.util.Collection<java.lang.Long> getSelectedDays();

    @androidx.annotation.NonNull
    java.util.Collection<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> getSelectedRanges();

    @androidx.annotation.Nullable
    S getSelection();

    @androidx.annotation.NonNull
    java.lang.String getSelectionContentDescription(@androidx.annotation.NonNull android.content.Context r1);

    @androidx.annotation.NonNull
    java.lang.String getSelectionDisplayString(android.content.Context r1);

    boolean isSelectionComplete();

    @androidx.annotation.NonNull
    android.view.View onCreateTextInputView(@androidx.annotation.NonNull android.view.LayoutInflater r1, @androidx.annotation.Nullable android.view.ViewGroup r2, @androidx.annotation.Nullable android.os.Bundle r3, @androidx.annotation.NonNull com.google.android.material.datepicker.CalendarConstraints r4, @androidx.annotation.NonNull com.google.android.material.datepicker.OnSelectionChangedListener<S> r5);

    void select(long r1);

    void setSelection(@androidx.annotation.NonNull S r1);

    void setTextInputFormat(@androidx.annotation.Nullable java.text.SimpleDateFormat r1);
}
