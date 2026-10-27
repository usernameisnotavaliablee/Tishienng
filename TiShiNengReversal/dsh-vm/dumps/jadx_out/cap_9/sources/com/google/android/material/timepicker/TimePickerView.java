package com.google.android.material.timepicker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class TimePickerView extends androidx.constraintlayout.widget.ConstraintLayout implements com.google.android.material.timepicker.TimePickerControls {
    static final java.lang.String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private final com.google.android.material.timepicker.ClockFaceView clockFace;
    private final com.google.android.material.timepicker.ClockHandView clockHandView;
    private final com.google.android.material.chip.Chip hourView;
    private final com.google.android.material.chip.Chip minuteView;
    private com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener onDoubleTapListener;
    private com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener onPeriodChangeListener;
    private com.google.android.material.timepicker.TimePickerView.OnSelectionChange onSelectionChangeListener;
    private final android.view.View.OnClickListener selectionListener;
    private final com.google.android.material.button.MaterialButtonToggleGroup toggle;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface OnDoubleTapListener {
        void onDoubleTap();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface OnPeriodChangeListener {
        void onPeriodChange(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface OnSelectionChange {
        void onSelectionChanged(int r1);
    }

    public TimePickerView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TimePickerView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public TimePickerView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.google.android.material.timepicker.TimePickerView$1 r2 = new com.google.android.material.timepicker.TimePickerView$1
            r2.<init>(r0)
            r0.selectionListener = r2
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = com.google.android.material.R.layout.material_timepicker
            r1.inflate(r2, r0)
            int r1 = com.google.android.material.R.id.material_clock_face
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.timepicker.ClockFaceView r1 = (com.google.android.material.timepicker.ClockFaceView) r1
            r0.clockFace = r1
            int r1 = com.google.android.material.R.id.material_clock_period_toggle
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.button.MaterialButtonToggleGroup r1 = (com.google.android.material.button.MaterialButtonToggleGroup) r1
            r0.toggle = r1
            com.google.android.material.timepicker.f r2 = new com.google.android.material.timepicker.f
            r2.<init>(r0)
            r1.addOnButtonCheckedListener(r2)
            int r1 = com.google.android.material.R.id.material_minute_tv
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            r0.minuteView = r1
            int r1 = com.google.android.material.R.id.material_hour_tv
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            r0.hourView = r1
            int r1 = com.google.android.material.R.id.material_clock_hand
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.timepicker.ClockHandView r1 = (com.google.android.material.timepicker.ClockHandView) r1
            r0.clockHandView = r1
            r0.setupDoubleTap()
            r0.setUpDisplay()
            return
    }

    public static /* synthetic */ void a(com.google.android.material.timepicker.TimePickerView r0, com.google.android.material.button.MaterialButtonToggleGroup r1, int r2, boolean r3) {
            if (r3 != 0) goto L6
            r0.getClass()
            return
        L6:
            com.google.android.material.timepicker.TimePickerView$OnPeriodChangeListener r0 = r0.onPeriodChangeListener
            if (r0 == 0) goto L14
            int r1 = com.google.android.material.R.id.material_clock_period_pm_button
            if (r2 != r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            r0.onPeriodChange(r1)
        L14:
            return
    }

    static /* synthetic */ com.google.android.material.timepicker.TimePickerView.OnSelectionChange access$000(com.google.android.material.timepicker.TimePickerView r0) {
            com.google.android.material.timepicker.TimePickerView$OnSelectionChange r0 = r0.onSelectionChangeListener
            return r0
    }

    static /* synthetic */ com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener access$100(com.google.android.material.timepicker.TimePickerView r0) {
            com.google.android.material.timepicker.TimePickerView$OnDoubleTapListener r0 = r0.onDoubleTapListener
            return r0
    }

    private void setUpDisplay() {
            r3 = this;
            com.google.android.material.chip.Chip r0 = r3.minuteView
            int r1 = com.google.android.material.R.id.selection_type
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.setTag(r1, r2)
            com.google.android.material.chip.Chip r0 = r3.hourView
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.setTag(r1, r2)
            com.google.android.material.chip.Chip r0 = r3.minuteView
            android.view.View$OnClickListener r1 = r3.selectionListener
            r0.setOnClickListener(r1)
            com.google.android.material.chip.Chip r0 = r3.hourView
            android.view.View$OnClickListener r1 = r3.selectionListener
            r0.setOnClickListener(r1)
            com.google.android.material.chip.Chip r0 = r3.minuteView
            java.lang.String r1 = "android.view.View"
            r0.setAccessibilityClassName(r1)
            com.google.android.material.chip.Chip r0 = r3.hourView
            r0.setAccessibilityClassName(r1)
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    private void setupDoubleTap() {
            r3 = this;
            android.view.GestureDetector r0 = new android.view.GestureDetector
            android.content.Context r1 = r3.getContext()
            com.google.android.material.timepicker.TimePickerView$2 r2 = new com.google.android.material.timepicker.TimePickerView$2
            r2.<init>(r3)
            r0.<init>(r1, r2)
            com.google.android.material.timepicker.TimePickerView$3 r1 = new com.google.android.material.timepicker.TimePickerView$3
            r1.<init>(r3, r0)
            com.google.android.material.chip.Chip r0 = r3.minuteView
            r0.setOnTouchListener(r1)
            com.google.android.material.chip.Chip r0 = r3.hourView
            r0.setOnTouchListener(r1)
            return
    }

    private void updateSelection(com.google.android.material.chip.Chip r1, boolean r2) {
            r0 = this;
            r1.setChecked(r2)
            if (r2 == 0) goto L7
            r2 = 2
            goto L8
        L7:
            r2 = 0
        L8:
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r1, r2)
            return
    }

    public void addOnRotateListener(com.google.android.material.timepicker.ClockHandView.OnRotateListener r2) {
            r1 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r1.clockHandView
            r0.addOnRotateListener(r2)
            return
    }

    int getCurrentLevel() {
            r1 = this;
            com.google.android.material.timepicker.ClockFaceView r0 = r1.clockFace
            int r0 = r0.getCurrentLevel()
            return r0
    }

    protected void onVisibilityChanged(@androidx.annotation.NonNull android.view.View r1, int r2) {
            r0 = this;
            super/*android.view.ViewGroup*/.onVisibilityChanged(r1, r2)
            if (r1 != r0) goto Le
            if (r2 != 0) goto Le
            com.google.android.material.chip.Chip r1 = r0.hourView
            r2 = 8
            r1.sendAccessibilityEvent(r2)
        Le:
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setActiveSelection(int r5) {
            r4 = this;
            com.google.android.material.chip.Chip r0 = r4.minuteView
            r1 = 12
            r2 = 0
            r3 = 1
            if (r5 != r1) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            r4.updateSelection(r0, r1)
            com.google.android.material.chip.Chip r0 = r4.hourView
            r1 = 10
            if (r5 != r1) goto L15
            r2 = 1
        L15:
            r4.updateSelection(r0, r2)
            return
    }

    public void setAnimateOnTouchUp(boolean r2) {
            r1 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r1.clockHandView
            r0.setAnimateOnTouchUp(r2)
            return
    }

    void setCurrentLevel(int r2) {
            r1 = this;
            com.google.android.material.timepicker.ClockFaceView r0 = r1.clockFace
            r0.setCurrentLevel(r2)
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setHandRotation(float r2) {
            r1 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r1.clockHandView
            r0.setHandRotation(r2)
            return
    }

    public void setHandRotation(float r2, boolean r3) {
            r1 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r1.clockHandView
            r0.setHandRotation(r2, r3)
            return
    }

    public void setHourClickDelegate(androidx.core.view.AccessibilityDelegateCompat r2) {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.minuteView
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r2)
            return
    }

    public void setMinuteHourDelegate(androidx.core.view.AccessibilityDelegateCompat r2) {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.hourView
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r2)
            return
    }

    public void setOnActionUpListener(com.google.android.material.timepicker.ClockHandView.OnActionUpListener r2) {
            r1 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r1.clockHandView
            r0.setOnActionUpListener(r2)
            return
    }

    void setOnDoubleTapListener(@androidx.annotation.Nullable com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener r1) {
            r0 = this;
            r0.onDoubleTapListener = r1
            return
    }

    void setOnPeriodChangeListener(com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener r1) {
            r0 = this;
            r0.onPeriodChangeListener = r1
            return
    }

    void setOnSelectionChangeListener(com.google.android.material.timepicker.TimePickerView.OnSelectionChange r1) {
            r0 = this;
            r0.onSelectionChangeListener = r1
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setValues(java.lang.String[] r2, @androidx.annotation.StringRes int r3) {
            r1 = this;
            com.google.android.material.timepicker.ClockFaceView r0 = r1.clockFace
            r0.setValues(r2, r3)
            return
    }

    public void showToggle() {
            r2 = this;
            com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.toggle
            r1 = 0
            r0.setVisibility(r1)
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    @android.annotation.SuppressLint({"DefaultLocale"})
    public void updateTime(int r4, int r5, int r6) {
            r3 = this;
            r0 = 1
            if (r4 != r0) goto L6
            int r4 = com.google.android.material.R.id.material_clock_period_pm_button
            goto L8
        L6:
            int r4 = com.google.android.material.R.id.material_clock_period_am_button
        L8:
            com.google.android.material.button.MaterialButtonToggleGroup r1 = r3.toggle
            r1.check(r4)
            android.content.res.Resources r4 = r3.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r6
            java.lang.String r6 = "%02d"
            java.lang.String r1 = java.lang.String.format(r4, r6, r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r5
            java.lang.String r4 = java.lang.String.format(r4, r6, r0)
            com.google.android.material.chip.Chip r5 = r3.minuteView
            java.lang.CharSequence r5 = r5.getText()
            boolean r5 = android.text.TextUtils.equals(r5, r1)
            if (r5 != 0) goto L43
            com.google.android.material.chip.Chip r5 = r3.minuteView
            r5.setText(r1)
        L43:
            com.google.android.material.chip.Chip r5 = r3.hourView
            java.lang.CharSequence r5 = r5.getText()
            boolean r5 = android.text.TextUtils.equals(r5, r4)
            if (r5 != 0) goto L54
            com.google.android.material.chip.Chip r5 = r3.hourView
            r5.setText(r4)
        L54:
            return
    }
}
