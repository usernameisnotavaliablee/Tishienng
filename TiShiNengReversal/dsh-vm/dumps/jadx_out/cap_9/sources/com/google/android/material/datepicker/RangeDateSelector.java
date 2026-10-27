package com.google.android.material.datepicker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class RangeDateSelector implements com.google.android.material.datepicker.DateSelector<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.RangeDateSelector> CREATOR = null;

    @androidx.annotation.Nullable
    private java.lang.CharSequence error;
    private final java.lang.String invalidRangeEndError;
    private java.lang.String invalidRangeStartError;

    @androidx.annotation.Nullable
    private java.lang.Long proposedTextEnd;

    @androidx.annotation.Nullable
    private java.lang.Long proposedTextStart;

    @androidx.annotation.Nullable
    private java.lang.Long selectedEndItem;

    @androidx.annotation.Nullable
    private java.lang.Long selectedStartItem;

    @androidx.annotation.Nullable
    private java.text.SimpleDateFormat textInputFormat;




    static {
            com.google.android.material.datepicker.RangeDateSelector$3 r0 = new com.google.android.material.datepicker.RangeDateSelector$3
            r0.<init>()
            com.google.android.material.datepicker.RangeDateSelector.CREATOR = r0
            return
    }

    public RangeDateSelector() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = " "
            r1.invalidRangeEndError = r0
            r0 = 0
            r1.selectedStartItem = r0
            r1.selectedEndItem = r0
            r1.proposedTextStart = r0
            r1.proposedTextEnd = r0
            return
    }

    static /* synthetic */ java.lang.Long access$002(com.google.android.material.datepicker.RangeDateSelector r0, java.lang.Long r1) {
            r0.proposedTextStart = r1
            return r1
    }

    static /* synthetic */ void access$100(com.google.android.material.datepicker.RangeDateSelector r0, com.google.android.material.textfield.TextInputLayout r1, com.google.android.material.textfield.TextInputLayout r2, com.google.android.material.datepicker.OnSelectionChangedListener r3) {
            r0.updateIfValidTextProposal(r1, r2, r3)
            return
    }

    static /* synthetic */ java.lang.Long access$202(com.google.android.material.datepicker.RangeDateSelector r0, java.lang.Long r1) {
            r0.proposedTextEnd = r1
            return r1
    }

    static /* synthetic */ java.lang.Long access$302(com.google.android.material.datepicker.RangeDateSelector r0, java.lang.Long r1) {
            r0.selectedStartItem = r1
            return r1
    }

    static /* synthetic */ java.lang.Long access$402(com.google.android.material.datepicker.RangeDateSelector r0, java.lang.Long r1) {
            r0.selectedEndItem = r1
            return r1
    }

    private void clearInvalidRange(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r4, @androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r5) {
            r3 = this;
            java.lang.CharSequence r0 = r4.getError()
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.String r0 = r3.invalidRangeStartError
            java.lang.CharSequence r2 = r4.getError()
            boolean r0 = r0.contentEquals(r2)
            if (r0 == 0) goto L16
            r4.setError(r1)
        L16:
            java.lang.CharSequence r4 = r5.getError()
            if (r4 == 0) goto L2b
            java.lang.String r4 = " "
            java.lang.CharSequence r0 = r5.getError()
            boolean r4 = r4.contentEquals(r0)
            if (r4 == 0) goto L2b
            r5.setError(r1)
        L2b:
            return
    }

    private boolean isValidRange(long r2, long r4) {
            r1 = this;
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L6
            r2 = 1
            return r2
        L6:
            r2 = 0
            return r2
    }

    private void setInvalidRange(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r2, @androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r3) {
            r1 = this;
            java.lang.String r0 = r1.invalidRangeStartError
            r2.setError(r0)
            java.lang.String r2 = " "
            r3.setError(r2)
            return
    }

    private void updateError(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r2, @androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r3) {
            r1 = this;
            java.lang.CharSequence r0 = r2.getError()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L11
            java.lang.CharSequence r2 = r2.getError()
            r1.error = r2
            return
        L11:
            java.lang.CharSequence r2 = r3.getError()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L22
            java.lang.CharSequence r2 = r3.getError()
            r1.error = r2
            return
        L22:
            r2 = 0
            r1.error = r2
            return
    }

    private void updateIfValidTextProposal(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r5, @androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r6, @androidx.annotation.NonNull com.google.android.material.datepicker.OnSelectionChangedListener<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> r7) {
            r4 = this;
            java.lang.Long r0 = r4.proposedTextStart
            if (r0 == 0) goto L30
            java.lang.Long r1 = r4.proposedTextEnd
            if (r1 != 0) goto L9
            goto L30
        L9:
            long r0 = r0.longValue()
            java.lang.Long r2 = r4.proposedTextEnd
            long r2 = r2.longValue()
            boolean r0 = r4.isValidRange(r0, r2)
            if (r0 == 0) goto L29
            java.lang.Long r0 = r4.proposedTextStart
            r4.selectedStartItem = r0
            java.lang.Long r0 = r4.proposedTextEnd
            r4.selectedEndItem = r0
            androidx.core.util.Pair r0 = r4.getSelection()
            r7.onSelectionChanged(r0)
            goto L36
        L29:
            r4.setInvalidRange(r5, r6)
            r7.onIncompleteSelectionChanged()
            goto L36
        L30:
            r4.clearInvalidRange(r5, r6)
            r7.onIncompleteSelectionChanged()
        L36:
            r4.updateError(r5, r6)
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(@androidx.annotation.NonNull android.content.Context r4) {
            r3 = this;
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            int r2 = com.google.android.material.R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis
            int r0 = r0.getDimensionPixelSize(r2)
            int r2 = r1.widthPixels
            int r1 = r1.heightPixels
            int r1 = java.lang.Math.min(r2, r1)
            if (r1 <= r0) goto L1b
            int r0 = com.google.android.material.R.attr.materialCalendarTheme
            goto L1d
        L1b:
            int r0 = com.google.android.material.R.attr.materialCalendarFullscreenTheme
        L1d:
            java.lang.Class<com.google.android.material.datepicker.MaterialDatePicker> r1 = com.google.android.material.datepicker.MaterialDatePicker.class
            java.lang.String r1 = r1.getCanonicalName()
            int r4 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r4, r0, r1)
            return r4
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
            r1 = this;
            int r0 = com.google.android.material.R.string.mtrl_picker_range_header_title
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @androidx.annotation.Nullable
    public java.lang.String getError() {
            r1 = this;
            java.lang.CharSequence r0 = r1.error
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.CharSequence r0 = r1.error
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @androidx.annotation.NonNull
    public java.util.Collection<java.lang.Long> getSelectedDays() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Long r1 = r2.selectedStartItem
            if (r1 == 0) goto Lc
            r0.add(r1)
        Lc:
            java.lang.Long r1 = r2.selectedEndItem
            if (r1 == 0) goto L13
            r0.add(r1)
        L13:
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @androidx.annotation.NonNull
    public java.util.Collection<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> getSelectedRanges() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.core.util.Pair r1 = new androidx.core.util.Pair
            java.lang.Long r2 = r4.selectedStartItem
            java.lang.Long r3 = r4.selectedEndItem
            r1.<init>(r2, r3)
            r0.add(r1)
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @androidx.annotation.NonNull
    public androidx.core.util.Pair<java.lang.Long, java.lang.Long> getSelection() {
            r3 = this;
            androidx.core.util.Pair r0 = new androidx.core.util.Pair
            java.lang.Long r1 = r3.selectedStartItem
            java.lang.Long r2 = r3.selectedEndItem
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.core.util.Pair<java.lang.Long, java.lang.Long> getSelection() {
            r1 = this;
            androidx.core.util.Pair r0 = r1.getSelection()
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @androidx.annotation.NonNull
    public java.lang.String getSelectionContentDescription(@androidx.annotation.NonNull android.content.Context r6) {
            r5 = this;
            android.content.res.Resources r6 = r6.getResources()
            java.lang.Long r0 = r5.selectedStartItem
            java.lang.Long r1 = r5.selectedEndItem
            androidx.core.util.Pair r0 = com.google.android.material.datepicker.DateStrings.getDateRangeString(r0, r1)
            java.lang.Object r1 = r0.first
            if (r1 != 0) goto L17
            int r1 = com.google.android.material.R.string.mtrl_picker_announce_current_selection_none
            java.lang.String r1 = r6.getString(r1)
            goto L19
        L17:
            java.lang.String r1 = (java.lang.String) r1
        L19:
            java.lang.Object r0 = r0.second
            if (r0 != 0) goto L24
            int r0 = com.google.android.material.R.string.mtrl_picker_announce_current_selection_none
            java.lang.String r0 = r6.getString(r0)
            goto L26
        L24:
            java.lang.String r0 = (java.lang.String) r0
        L26:
            int r2 = com.google.android.material.R.string.mtrl_picker_announce_current_range_selection
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r0
            java.lang.String r6 = r6.getString(r2, r3)
            return r6
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @androidx.annotation.NonNull
    public java.lang.String getSelectionDisplayString(@androidx.annotation.NonNull android.content.Context r7) {
            r6 = this;
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Long r0 = r6.selectedStartItem
            if (r0 != 0) goto L13
            java.lang.Long r1 = r6.selectedEndItem
            if (r1 != 0) goto L13
            int r0 = com.google.android.material.R.string.mtrl_picker_range_header_unselected
            java.lang.String r7 = r7.getString(r0)
            return r7
        L13:
            java.lang.Long r1 = r6.selectedEndItem
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2c
            int r1 = com.google.android.material.R.string.mtrl_picker_range_header_only_start_selected
            long r4 = r0.longValue()
            java.lang.String r0 = com.google.android.material.datepicker.DateStrings.getDateString(r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            java.lang.String r7 = r7.getString(r1, r3)
            return r7
        L2c:
            if (r0 != 0) goto L41
            int r0 = com.google.android.material.R.string.mtrl_picker_range_header_only_end_selected
            long r4 = r1.longValue()
            java.lang.String r1 = com.google.android.material.datepicker.DateStrings.getDateString(r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r1
            java.lang.String r7 = r7.getString(r0, r3)
            return r7
        L41:
            androidx.core.util.Pair r0 = com.google.android.material.datepicker.DateStrings.getDateRangeString(r0, r1)
            int r1 = com.google.android.material.R.string.mtrl_picker_range_header_selected
            java.lang.Object r4 = r0.first
            java.lang.Object r0 = r0.second
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r4
            r5[r3] = r0
            java.lang.String r7 = r7.getString(r1, r5)
            return r7
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
            r4 = this;
            java.lang.Long r0 = r4.selectedStartItem
            if (r0 == 0) goto L1a
            java.lang.Long r1 = r4.selectedEndItem
            if (r1 == 0) goto L1a
            long r0 = r0.longValue()
            java.lang.Long r2 = r4.selectedEndItem
            long r2 = r2.longValue()
            boolean r0 = r4.isValidRange(r0, r2)
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public android.view.View onCreateTextInputView(@androidx.annotation.NonNull android.view.LayoutInflater r14, @androidx.annotation.Nullable android.view.ViewGroup r15, @androidx.annotation.Nullable android.os.Bundle r16, com.google.android.material.datepicker.CalendarConstraints r17, @androidx.annotation.NonNull com.google.android.material.datepicker.OnSelectionChangedListener<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> r18) {
            r13 = this;
            int r0 = com.google.android.material.R.layout.mtrl_picker_text_input_date_range
            r1 = 0
            android.view.View r14 = r14.inflate(r0, r15, r1)
            int r0 = com.google.android.material.R.id.mtrl_picker_text_input_range_start
            android.view.View r0 = r14.findViewById(r0)
            r6 = r0
            com.google.android.material.textfield.TextInputLayout r6 = (com.google.android.material.textfield.TextInputLayout) r6
            int r0 = com.google.android.material.R.id.mtrl_picker_text_input_range_end
            android.view.View r0 = r14.findViewById(r0)
            r9 = r0
            com.google.android.material.textfield.TextInputLayout r9 = (com.google.android.material.textfield.TextInputLayout) r9
            android.widget.EditText r0 = r6.getEditText()
            android.widget.EditText r11 = r9.getEditText()
            boolean r2 = com.google.android.material.internal.ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()
            if (r2 == 0) goto L2f
            r2 = 17
            r0.setInputType(r2)
            r11.setInputType(r2)
        L2f:
            android.content.res.Resources r2 = r14.getResources()
            int r3 = com.google.android.material.R.string.mtrl_picker_invalid_range
            java.lang.String r2 = r2.getString(r3)
            r13.invalidRangeStartError = r2
            java.text.SimpleDateFormat r2 = r13.textInputFormat
            r12 = 1
            if (r2 == 0) goto L42
            r3 = 1
            goto L43
        L42:
            r3 = 0
        L43:
            if (r3 == 0) goto L47
        L45:
            r5 = r2
            goto L4c
        L47:
            java.text.SimpleDateFormat r2 = com.google.android.material.datepicker.UtcDates.getDefaultTextInputFormat()
            goto L45
        L4c:
            java.lang.Long r2 = r13.selectedStartItem
            if (r2 == 0) goto L5b
            java.lang.String r2 = r5.format(r2)
            r0.setText(r2)
            java.lang.Long r2 = r13.selectedStartItem
            r13.proposedTextStart = r2
        L5b:
            java.lang.Long r2 = r13.selectedEndItem
            if (r2 == 0) goto L6a
            java.lang.String r2 = r5.format(r2)
            r11.setText(r2)
            java.lang.Long r2 = r13.selectedEndItem
            r13.proposedTextEnd = r2
        L6a:
            if (r3 == 0) goto L72
            java.lang.String r2 = r5.toPattern()
        L70:
            r4 = r2
            goto L7b
        L72:
            android.content.res.Resources r2 = r14.getResources()
            java.lang.String r2 = com.google.android.material.datepicker.UtcDates.getDefaultTextInputHint(r2, r5)
            goto L70
        L7b:
            r6.setPlaceholderText(r4)
            r9.setPlaceholderText(r4)
            com.google.android.material.datepicker.RangeDateSelector$1 r2 = new com.google.android.material.datepicker.RangeDateSelector$1
            r8 = r6
            r3 = r13
            r7 = r17
            r10 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.addTextChangedListener(r2)
            com.google.android.material.datepicker.RangeDateSelector$2 r2 = new com.google.android.material.datepicker.RangeDateSelector$2
            r6 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.addTextChangedListener(r2)
            r2 = 2
            android.widget.EditText[] r2 = new android.widget.EditText[r2]
            r2[r1] = r0
            r2[r12] = r11
            com.google.android.material.datepicker.e.c(r2)
            return r14
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long r3) {
            r2 = this;
            java.lang.Long r0 = r2.selectedStartItem
            if (r0 != 0) goto Lb
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.selectedStartItem = r3
            return
        Lb:
            java.lang.Long r1 = r2.selectedEndItem
            if (r1 != 0) goto L20
            long r0 = r0.longValue()
            boolean r0 = r2.isValidRange(r0, r3)
            if (r0 == 0) goto L20
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.selectedEndItem = r3
            return
        L20:
            r0 = 0
            r2.selectedEndItem = r0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.selectedStartItem = r3
            return
    }

    /* renamed from: setSelection, reason: avoid collision after fix types in other method */
    public void setSelection2(@androidx.annotation.NonNull androidx.core.util.Pair<java.lang.Long, java.lang.Long> r5) {
            r4 = this;
            java.lang.Object r0 = r5.first
            if (r0 == 0) goto L1d
            java.lang.Object r1 = r5.second
            if (r1 == 0) goto L1d
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            java.lang.Object r2 = r5.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            boolean r0 = r4.isValidRange(r0, r2)
            androidx.core.util.Preconditions.checkArgument(r0)
        L1d:
            java.lang.Object r0 = r5.first
            r1 = 0
            if (r0 != 0) goto L24
            r0 = r1
            goto L32
        L24:
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r2 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
        L32:
            r4.selectedStartItem = r0
            java.lang.Object r5 = r5.second
            if (r5 != 0) goto L39
            goto L47
        L39:
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            long r0 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L47:
            r4.selectedEndItem = r1
            return
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public /* bridge */ /* synthetic */ void setSelection(@androidx.annotation.NonNull androidx.core.util.Pair<java.lang.Long, java.lang.Long> r1) {
            r0 = this;
            androidx.core.util.Pair r1 = (androidx.core.util.Pair) r1
            r0.setSelection2(r1)
            return
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@androidx.annotation.Nullable java.text.SimpleDateFormat r1) {
            r0 = this;
            if (r1 == 0) goto L8
            java.text.DateFormat r1 = com.google.android.material.datepicker.UtcDates.getNormalizedFormat(r1)
            java.text.SimpleDateFormat r1 = (java.text.SimpleDateFormat) r1
        L8:
            r0.textInputFormat = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.Long r2 = r0.selectedStartItem
            r1.writeValue(r2)
            java.lang.Long r2 = r0.selectedEndItem
            r1.writeValue(r2)
            return
    }
}
