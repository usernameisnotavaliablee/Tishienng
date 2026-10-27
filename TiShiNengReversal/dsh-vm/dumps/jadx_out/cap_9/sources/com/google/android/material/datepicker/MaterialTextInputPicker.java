package com.google.android.material.datepicker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class MaterialTextInputPicker<S> extends com.google.android.material.datepicker.PickerFragment<S> {
    private static final java.lang.String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final java.lang.String DATE_SELECTOR_KEY = "DATE_SELECTOR_KEY";
    private static final java.lang.String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";

    @androidx.annotation.Nullable
    private com.google.android.material.datepicker.CalendarConstraints calendarConstraints;

    @androidx.annotation.Nullable
    private com.google.android.material.datepicker.DateSelector<S> dateSelector;

    @androidx.annotation.StyleRes
    private int themeResId;


    public MaterialTextInputPicker() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static <T> com.google.android.material.datepicker.MaterialTextInputPicker<T> newInstance(com.google.android.material.datepicker.DateSelector<T> r3, @androidx.annotation.StyleRes int r4, @androidx.annotation.NonNull com.google.android.material.datepicker.CalendarConstraints r5) {
            com.google.android.material.datepicker.MaterialTextInputPicker r0 = new com.google.android.material.datepicker.MaterialTextInputPicker
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "THEME_RES_ID_KEY"
            r1.putInt(r2, r4)
            java.lang.String r4 = "DATE_SELECTOR_KEY"
            r1.putParcelable(r4, r3)
            java.lang.String r3 = "CALENDAR_CONSTRAINTS_KEY"
            r1.putParcelable(r3, r5)
            r0.setArguments(r1)
            return r0
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    @androidx.annotation.NonNull
    public com.google.android.material.datepicker.DateSelector<S> getDateSelector() {
            r2 = this;
            com.google.android.material.datepicker.DateSelector<S> r0 = r2.dateSelector
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created."
            r0.<init>(r1)
            throw r0
    }

    public void onCreate(@androidx.annotation.Nullable android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            if (r2 != 0) goto L9
            android.os.Bundle r2 = r1.getArguments()
        L9:
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.themeResId = r0
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.DateSelector r0 = (com.google.android.material.datepicker.DateSelector) r0
            r1.dateSelector = r0
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            com.google.android.material.datepicker.CalendarConstraints r2 = (com.google.android.material.datepicker.CalendarConstraints) r2
            r1.calendarConstraints = r2
            return
    }

    @androidx.annotation.NonNull
    public android.view.View onCreateView(@androidx.annotation.NonNull android.view.LayoutInflater r10, @androidx.annotation.Nullable android.view.ViewGroup r11, @androidx.annotation.Nullable android.os.Bundle r12) {
            r9 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r9.getContext()
            int r2 = r9.themeResId
            r0.<init>(r1, r2)
            android.view.LayoutInflater r4 = r10.cloneInContext(r0)
            com.google.android.material.datepicker.DateSelector<S> r3 = r9.dateSelector
            com.google.android.material.datepicker.CalendarConstraints r7 = r9.calendarConstraints
            com.google.android.material.datepicker.MaterialTextInputPicker$1 r8 = new com.google.android.material.datepicker.MaterialTextInputPicker$1
            r8.<init>(r9)
            r5 = r11
            r6 = r12
            android.view.View r10 = r3.onCreateTextInputView(r4, r5, r6, r7, r8)
            return r10
    }

    public void onSaveInstanceState(@androidx.annotation.NonNull android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r1 = r2.themeResId
            r3.putInt(r0, r1)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            com.google.android.material.datepicker.DateSelector<S> r1 = r2.dateSelector
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            com.google.android.material.datepicker.CalendarConstraints r1 = r2.calendarConstraints
            r3.putParcelable(r0, r1)
            return
    }
}
