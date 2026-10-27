package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AppCompatSpinner extends android.widget.Spinner implements androidx.core.view.TintableBackgroundView {

    @android.annotation.SuppressLint({"ResourceType"})
    @androidx.annotation.StyleableRes
    private static final int[] ATTRS_ANDROID_SPINNERMODE = null;
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final java.lang.String TAG = "AppCompatSpinner";
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    int mDropDownWidth;
    private androidx.appcompat.widget.ForwardingListener mForwardingListener;
    private androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup mPopup;
    private final android.content.Context mPopupContext;
    private final boolean mPopupSet;
    private android.widget.SpinnerAdapter mTempAdapter;
    final android.graphics.Rect mTempRect;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(16)
    private static final class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void removeOnGlobalLayoutListener(@androidx.annotation.NonNull android.view.ViewTreeObserver r0, @androidx.annotation.Nullable android.view.ViewTreeObserver.OnGlobalLayoutListener r1) {
                r0.removeOnGlobalLayoutListener(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(17)
    private static final class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static int getTextAlignment(@androidx.annotation.NonNull android.view.View r0) {
                int r0 = r0.getTextAlignment()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getTextDirection(@androidx.annotation.NonNull android.view.View r0) {
                int r0 = r0.getTextDirection()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setTextAlignment(@androidx.annotation.NonNull android.view.View r0, int r1) {
                r0.setTextAlignment(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setTextDirection(@androidx.annotation.NonNull android.view.View r0, int r1) {
                r0.setTextDirection(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    private static final class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void setDropDownViewTheme(@androidx.annotation.NonNull android.widget.ThemedSpinnerAdapter r1, @androidx.annotation.Nullable android.content.res.Resources.Theme r2) {
                android.content.res.Resources$Theme r0 = r1.getDropDownViewTheme()
                boolean r0 = androidx.core.util.ObjectsCompat.equals(r0, r2)
                if (r0 != 0) goto Ld
                r1.setDropDownViewTheme(r2)
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    class DialogPopup implements androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup, android.content.DialogInterface.OnClickListener {
        private android.widget.ListAdapter mListAdapter;

        @androidx.annotation.VisibleForTesting
        androidx.appcompat.app.AlertDialog mPopup;
        private java.lang.CharSequence mPrompt;
        final /* synthetic */ androidx.appcompat.widget.AppCompatSpinner this$0;

        DialogPopup(androidx.appcompat.widget.AppCompatSpinner r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void dismiss() {
                r1 = this;
                androidx.appcompat.app.AlertDialog r0 = r1.mPopup
                if (r0 == 0) goto La
                r0.dismiss()
                r0 = 0
                r1.mPopup = r0
            La:
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public android.graphics.drawable.Drawable getBackground() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public java.lang.CharSequence getHintText() {
                r1 = this;
                java.lang.CharSequence r0 = r1.mPrompt
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOffset() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOriginalOffset() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getVerticalOffset() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public boolean isShowing() {
                r1 = this;
                androidx.appcompat.app.AlertDialog r0 = r1.mPopup
                if (r0 == 0) goto L9
                boolean r0 = r0.isShowing()
                return r0
            L9:
                r0 = 0
                return r0
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r4, int r5) {
                r3 = this;
                androidx.appcompat.widget.AppCompatSpinner r4 = r3.this$0
                r4.setSelection(r5)
                androidx.appcompat.widget.AppCompatSpinner r4 = r3.this$0
                android.widget.AdapterView$OnItemClickListener r4 = r4.getOnItemClickListener()
                if (r4 == 0) goto L19
                androidx.appcompat.widget.AppCompatSpinner r4 = r3.this$0
                android.widget.ListAdapter r0 = r3.mListAdapter
                long r0 = r0.getItemId(r5)
                r2 = 0
                r4.performItemClick(r2, r5, r0)
            L19:
                r3.dismiss()
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setAdapter(android.widget.ListAdapter r1) {
                r0 = this;
                r0.mListAdapter = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOffset(int r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOriginalOffset(int r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setPromptText(java.lang.CharSequence r1) {
                r0 = this;
                r0.mPrompt = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setVerticalOffset(int r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void show(int r4, int r5) {
                r3 = this;
                android.widget.ListAdapter r0 = r3.mListAdapter
                if (r0 != 0) goto L5
                return
            L5:
                androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
                androidx.appcompat.widget.AppCompatSpinner r1 = r3.this$0
                android.content.Context r1 = r1.getPopupContext()
                r0.<init>(r1)
                java.lang.CharSequence r1 = r3.mPrompt
                if (r1 == 0) goto L17
                r0.setTitle(r1)
            L17:
                android.widget.ListAdapter r1 = r3.mListAdapter
                androidx.appcompat.widget.AppCompatSpinner r2 = r3.this$0
                int r2 = r2.getSelectedItemPosition()
                androidx.appcompat.app.AlertDialog$Builder r0 = r0.setSingleChoiceItems(r1, r2, r3)
                androidx.appcompat.app.AlertDialog r0 = r0.create()
                r3.mPopup = r0
                android.widget.ListView r0 = r0.getListView()
                androidx.appcompat.widget.AppCompatSpinner.Api17Impl.setTextDirection(r0, r4)
                androidx.appcompat.widget.AppCompatSpinner.Api17Impl.setTextAlignment(r0, r5)
                androidx.appcompat.app.AlertDialog r4 = r3.mPopup
                r4.show()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class DropDownAdapter implements android.widget.ListAdapter, android.widget.SpinnerAdapter {
        private android.widget.SpinnerAdapter mAdapter;
        private android.widget.ListAdapter mListAdapter;

        public DropDownAdapter(@androidx.annotation.Nullable android.widget.SpinnerAdapter r3, @androidx.annotation.Nullable android.content.res.Resources.Theme r4) {
                r2 = this;
                r2.<init>()
                r2.mAdapter = r3
                boolean r0 = r3 instanceof android.widget.ListAdapter
                if (r0 == 0) goto Le
                r0 = r3
                android.widget.ListAdapter r0 = (android.widget.ListAdapter) r0
                r2.mListAdapter = r0
            Le:
                if (r4 == 0) goto L33
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L24
                boolean r0 = androidx.appcompat.widget.a.a(r3)
                if (r0 == 0) goto L24
                android.widget.ThemedSpinnerAdapter r3 = androidx.appcompat.widget.b.a(r3)
                androidx.appcompat.widget.AppCompatSpinner.Api23Impl.setDropDownViewTheme(r3, r4)
                return
            L24:
                boolean r0 = r3 instanceof androidx.appcompat.widget.ThemedSpinnerAdapter
                if (r0 == 0) goto L33
                androidx.appcompat.widget.ThemedSpinnerAdapter r3 = (androidx.appcompat.widget.ThemedSpinnerAdapter) r3
                android.content.res.Resources$Theme r0 = r3.getDropDownViewTheme()
                if (r0 != 0) goto L33
                r3.setDropDownViewTheme(r4)
            L33:
                return
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
                r1 = this;
                android.widget.ListAdapter r0 = r1.mListAdapter
                if (r0 == 0) goto L9
                boolean r0 = r0.areAllItemsEnabled()
                return r0
            L9:
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r0 = r0.getCount()
                return r0
        }

        @Override // android.widget.SpinnerAdapter
        public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                android.view.View r2 = r0.getDropDownView(r2, r3, r4)
                return r2
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.Object r2 = r0.getItem(r2)
                return r2
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                android.widget.SpinnerAdapter r0 = r2.mAdapter
                if (r0 != 0) goto L7
                r0 = -1
                return r0
            L7:
                long r0 = r0.getItemId(r3)
                return r0
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
                r0 = this;
                android.view.View r1 = r0.getDropDownView(r1, r2, r3)
                return r1
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 == 0) goto Lc
                boolean r0 = r0.hasStableIds()
                if (r0 == 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
                r1 = this;
                int r0 = r1.getCount()
                if (r0 != 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int r2) {
                r1 = this;
                android.widget.ListAdapter r0 = r1.mListAdapter
                if (r0 == 0) goto L9
                boolean r2 = r0.isEnabled(r2)
                return r2
            L9:
                r2 = 1
                return r2
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 == 0) goto L7
                r0.registerDataSetObserver(r2)
            L7:
                return
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 == 0) goto L7
                r0.unregisterDataSetObserver(r2)
            L7:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    class DropdownPopup extends androidx.appcompat.widget.ListPopupWindow implements androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup {
        android.widget.ListAdapter mAdapter;
        private java.lang.CharSequence mHintText;
        private int mOriginalHorizontalOffset;
        private final android.graphics.Rect mVisibleRect;
        final /* synthetic */ androidx.appcompat.widget.AppCompatSpinner this$0;




        public DropdownPopup(androidx.appcompat.widget.AppCompatSpinner r1, android.content.Context r2, android.util.AttributeSet r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3, r4)
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r0.mVisibleRect = r2
                r0.setAnchorView(r1)
                r2 = 1
                r0.setModal(r2)
                r2 = 0
                r0.setPromptPosition(r2)
                androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$1 r2 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$1
                r2.<init>(r0, r1)
                r0.setOnItemClickListener(r2)
                return
        }

        static /* synthetic */ void access$001(androidx.appcompat.widget.AppCompatSpinner.DropdownPopup r0) {
                super.show()
                return
        }

        void computeContentWidth() {
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.getBackground()
                if (r0 == 0) goto L24
                androidx.appcompat.widget.AppCompatSpinner r1 = r8.this$0
                android.graphics.Rect r1 = r1.mTempRect
                r0.getPadding(r1)
                androidx.appcompat.widget.AppCompatSpinner r0 = r8.this$0
                boolean r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r0)
                if (r0 == 0) goto L1c
                androidx.appcompat.widget.AppCompatSpinner r0 = r8.this$0
                android.graphics.Rect r0 = r0.mTempRect
                int r0 = r0.right
                goto L2e
            L1c:
                androidx.appcompat.widget.AppCompatSpinner r0 = r8.this$0
                android.graphics.Rect r0 = r0.mTempRect
                int r0 = r0.left
                int r0 = -r0
                goto L2e
            L24:
                androidx.appcompat.widget.AppCompatSpinner r0 = r8.this$0
                android.graphics.Rect r0 = r0.mTempRect
                r1 = 0
                r0.right = r1
                r0.left = r1
                r0 = 0
            L2e:
                androidx.appcompat.widget.AppCompatSpinner r1 = r8.this$0
                int r1 = r1.getPaddingLeft()
                androidx.appcompat.widget.AppCompatSpinner r2 = r8.this$0
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.AppCompatSpinner r3 = r8.this$0
                int r3 = r3.getWidth()
                androidx.appcompat.widget.AppCompatSpinner r4 = r8.this$0
                int r5 = r4.mDropDownWidth
                r6 = -2
                if (r5 != r6) goto L7b
                android.widget.ListAdapter r5 = r8.mAdapter
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.getBackground()
                int r4 = r4.compatMeasureContentWidth(r5, r6)
                androidx.appcompat.widget.AppCompatSpinner r5 = r8.this$0
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.AppCompatSpinner r6 = r8.this$0
                android.graphics.Rect r6 = r6.mTempRect
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r1
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                r8.setContentWidth(r4)
                goto L88
            L7b:
                r4 = -1
                if (r5 != r4) goto L85
                int r4 = r3 - r1
                int r4 = r4 - r2
                r8.setContentWidth(r4)
                goto L88
            L85:
                r8.setContentWidth(r5)
            L88:
                androidx.appcompat.widget.AppCompatSpinner r4 = r8.this$0
                boolean r4 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r4)
                if (r4 == 0) goto L9d
                int r3 = r3 - r2
                int r1 = r8.getWidth()
                int r3 = r3 - r1
                int r1 = r8.getHorizontalOriginalOffset()
                int r3 = r3 - r1
                int r0 = r0 + r3
                goto La3
            L9d:
                int r2 = r8.getHorizontalOriginalOffset()
                int r1 = r1 + r2
                int r0 = r0 + r1
            La3:
                r8.setHorizontalOffset(r0)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public java.lang.CharSequence getHintText() {
                r1 = this;
                java.lang.CharSequence r0 = r1.mHintText
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOriginalOffset() {
                r1 = this;
                int r0 = r1.mOriginalHorizontalOffset
                return r0
        }

        boolean isVisibleToUser(android.view.View r2) {
                r1 = this;
                boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r2)
                if (r0 == 0) goto L10
                android.graphics.Rect r0 = r1.mVisibleRect
                boolean r2 = r2.getGlobalVisibleRect(r0)
                if (r2 == 0) goto L10
                r2 = 1
                return r2
            L10:
                r2 = 0
                return r2
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setAdapter(android.widget.ListAdapter r1) {
                r0 = this;
                super.setAdapter(r1)
                r0.mAdapter = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOriginalOffset(int r1) {
                r0 = this;
                r0.mOriginalHorizontalOffset = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setPromptText(java.lang.CharSequence r1) {
                r0 = this;
                r0.mHintText = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void show(int r4, int r5) {
                r3 = this;
                boolean r0 = r3.isShowing()
                r3.computeContentWidth()
                r1 = 2
                r3.setInputMethodMode(r1)
                super.show()
                android.widget.ListView r1 = r3.getListView()
                r2 = 1
                r1.setChoiceMode(r2)
                androidx.appcompat.widget.AppCompatSpinner.Api17Impl.setTextDirection(r1, r4)
                androidx.appcompat.widget.AppCompatSpinner.Api17Impl.setTextAlignment(r1, r5)
                androidx.appcompat.widget.AppCompatSpinner r4 = r3.this$0
                int r4 = r4.getSelectedItemPosition()
                r3.setSelection(r4)
                if (r0 == 0) goto L28
                goto L40
            L28:
                androidx.appcompat.widget.AppCompatSpinner r4 = r3.this$0
                android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()
                if (r4 == 0) goto L40
                androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$2 r5 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$2
                r5.<init>(r3)
                r4.addOnGlobalLayoutListener(r5)
                androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$3 r4 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$3
                r4.<init>(r3, r5)
                r3.setOnDismissListener(r4)
            L40:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.AppCompatSpinner.SavedState> CREATOR = null;
        boolean mShowDropdown;


        static {
                androidx.appcompat.widget.AppCompatSpinner$SavedState$1 r0 = new androidx.appcompat.widget.AppCompatSpinner$SavedState$1
                r0.<init>()
                androidx.appcompat.widget.AppCompatSpinner.SavedState.CREATOR = r0
                return
        }

        SavedState(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                byte r1 = r1.readByte()
                if (r1 == 0) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                r0.mShowDropdown = r1
                return
        }

        SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.mShowDropdown
                byte r2 = (byte) r2
                r1.writeByte(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    interface SpinnerPopup {
        void dismiss();

        android.graphics.drawable.Drawable getBackground();

        java.lang.CharSequence getHintText();

        int getHorizontalOffset();

        int getHorizontalOriginalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(android.widget.ListAdapter r1);

        void setBackgroundDrawable(android.graphics.drawable.Drawable r1);

        void setHorizontalOffset(int r1);

        void setHorizontalOriginalOffset(int r1);

        void setPromptText(java.lang.CharSequence r1);

        void setVerticalOffset(int r1);

        void show(int r1, int r2);
    }

    static {
            r0 = 16843505(0x10102f1, float:2.3695668E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.AppCompatSpinner.ATTRS_ANDROID_SPINNERMODE = r0
            return
    }

    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r3, int r4) {
            r2 = this;
            r0 = 0
            int r1 = androidx.appcompat.R.attr.spinnerStyle
            r2.<init>(r3, r0, r1, r4)
            return
    }

    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.spinnerStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9, int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.Nullable android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.mTempRect = r0
            android.content.Context r0 = r5.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r5, r0)
            int[] r0 = androidx.appcompat.R.styleable.Spinner
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r6, r7, r0, r8, r1)
            androidx.appcompat.widget.AppCompatBackgroundHelper r2 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r2.<init>(r5)
            r5.mBackgroundTintHelper = r2
            if (r10 == 0) goto L29
            androidx.appcompat.view.ContextThemeWrapper r2 = new androidx.appcompat.view.ContextThemeWrapper
            r2.<init>(r6, r10)
            r5.mPopupContext = r2
            goto L3b
        L29:
            int r10 = androidx.appcompat.R.styleable.Spinner_popupTheme
            int r10 = r0.getResourceId(r10, r1)
            if (r10 == 0) goto L39
            androidx.appcompat.view.ContextThemeWrapper r2 = new androidx.appcompat.view.ContextThemeWrapper
            r2.<init>(r6, r10)
            r5.mPopupContext = r2
            goto L3b
        L39:
            r5.mPopupContext = r6
        L3b:
            r10 = -1
            r2 = 0
            if (r9 != r10) goto L67
            int[] r10 = androidx.appcompat.widget.AppCompatSpinner.ATTRS_ANDROID_SPINNERMODE     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            boolean r3 = r10.hasValue(r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            if (r3 == 0) goto L55
            int r9 = r10.getInt(r1, r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            goto L55
        L50:
            r6 = move-exception
            r2 = r10
            goto L5e
        L53:
            goto L64
        L55:
            r10.recycle()
            goto L67
        L59:
            r6 = move-exception
            goto L5e
        L5b:
            r10 = r2
            goto L64
        L5e:
            if (r2 == 0) goto L63
            r2.recycle()
        L63:
            throw r6
        L64:
            if (r10 == 0) goto L67
            goto L55
        L67:
            r10 = 1
            if (r9 == 0) goto La4
            if (r9 == r10) goto L6d
            goto Lb4
        L6d:
            androidx.appcompat.widget.AppCompatSpinner$DropdownPopup r9 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup
            android.content.Context r3 = r5.mPopupContext
            r9.<init>(r5, r3, r7, r8)
            android.content.Context r3 = r5.mPopupContext
            int[] r4 = androidx.appcompat.R.styleable.Spinner
            androidx.appcompat.widget.TintTypedArray r1 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r3, r7, r4, r8, r1)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.getLayoutDimension(r3, r4)
            r5.mDropDownWidth = r3
            int r3 = androidx.appcompat.R.styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r3)
            r9.setBackgroundDrawable(r3)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r3 = r0.getString(r3)
            r9.setPromptText(r3)
            r1.recycle()
            r5.mPopup = r9
            androidx.appcompat.widget.AppCompatSpinner$1 r1 = new androidx.appcompat.widget.AppCompatSpinner$1
            r1.<init>(r5, r5, r9)
            r5.mForwardingListener = r1
            goto Lb4
        La4:
            androidx.appcompat.widget.AppCompatSpinner$DialogPopup r9 = new androidx.appcompat.widget.AppCompatSpinner$DialogPopup
            r9.<init>(r5)
            r5.mPopup = r9
            int r1 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r1 = r0.getString(r1)
            r9.setPromptText(r1)
        Lb4:
            int r9 = androidx.appcompat.R.styleable.Spinner_android_entries
            java.lang.CharSequence[] r9 = r0.getTextArray(r9)
            if (r9 == 0) goto Lcc
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r6, r3, r9)
            int r6 = androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r6)
            r5.setAdapter2(r1)
        Lcc:
            r0.recycle()
            r5.mPopupSet = r10
            android.widget.SpinnerAdapter r6 = r5.mTempAdapter
            if (r6 == 0) goto Lda
            r5.setAdapter2(r6)
            r5.mTempAdapter = r2
        Lda:
            androidx.appcompat.widget.AppCompatBackgroundHelper r6 = r5.mBackgroundTintHelper
            r6.loadFromAttributes(r7, r8)
            return
    }

    int compatMeasureContentWidth(android.widget.SpinnerAdapter r11, android.graphics.drawable.Drawable r12) {
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r1 = r10.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r2 = r10.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            int r3 = r10.getSelectedItemPosition()
            int r3 = java.lang.Math.max(r0, r3)
            int r4 = r11.getCount()
            int r5 = r3 + 15
            int r4 = java.lang.Math.min(r4, r5)
            int r5 = r4 - r3
            int r5 = 15 - r5
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            r5 = 0
            r6 = r3
            r7 = r5
            r3 = 0
        L33:
            if (r6 >= r4) goto L5e
            int r8 = r11.getItemViewType(r6)
            if (r8 == r0) goto L3d
            r7 = r5
            r0 = r8
        L3d:
            android.view.View r7 = r11.getView(r6, r7, r10)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            if (r8 != 0) goto L50
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            r7.setLayoutParams(r8)
        L50:
            r7.measure(r1, r2)
            int r8 = r7.getMeasuredWidth()
            int r3 = java.lang.Math.max(r3, r8)
            int r6 = r6 + 1
            goto L33
        L5e:
            if (r12 == 0) goto L6d
            android.graphics.Rect r11 = r10.mTempRect
            r12.getPadding(r11)
            android.graphics.Rect r11 = r10.mTempRect
            int r12 = r11.left
            int r11 = r11.right
            int r12 = r12 + r11
            int r3 = r3 + r12
        L6d:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.applySupportBackgroundTint()
        La:
            return
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L9
            int r0 = r0.getHorizontalOffset()
            return r0
        L9:
            int r0 = super.getDropDownHorizontalOffset()
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L9
            int r0 = r0.getVerticalOffset()
            return r0
        L9:
            int r0 = super.getDropDownVerticalOffset()
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L7
            int r0 = r1.mDropDownWidth
            return r0
        L7:
            int r0 = super.getDropDownWidth()
            return r0
    }

    @androidx.annotation.VisibleForTesting
    final androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup getInternalPopup() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            return r0
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
        L9:
            android.graphics.drawable.Drawable r0 = super.getPopupBackground()
            return r0
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
            r1 = this;
            android.content.Context r0 = r1.mPopupContext
            return r0
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getHintText()
            return r0
        L9:
            java.lang.CharSequence r0 = super.getPrompt()
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getSupportBackgroundTintList()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.getSupportBackgroundTintMode()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L12
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L12
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            r0.dismiss()
        L12:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r4 = r2.mPopup
            if (r4 == 0) goto L32
            int r4 = android.view.View.MeasureSpec.getMode(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L32
            int r4 = r2.getMeasuredWidth()
            android.widget.SpinnerAdapter r0 = r2.getAdapter()
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            int r0 = r2.compatMeasureContentWidth(r0, r1)
            int r4 = java.lang.Math.max(r4, r0)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = java.lang.Math.min(r4, r3)
            int r4 = r2.getMeasuredHeight()
            r2.setMeasuredDimension(r3, r4)
        L32:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SavedState r2 = (androidx.appcompat.widget.AppCompatSpinner.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.mShowDropdown
            if (r2 == 0) goto L1b
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            if (r2 == 0) goto L1b
            androidx.appcompat.widget.AppCompatSpinner$2 r0 = new androidx.appcompat.widget.AppCompatSpinner$2
            r0.<init>(r1)
            r2.addOnGlobalLayoutListener(r0)
        L1b:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.appcompat.widget.AppCompatSpinner$SavedState r0 = new androidx.appcompat.widget.AppCompatSpinner$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r1 = r2.mPopup
            if (r1 == 0) goto L15
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r0.mShowDropdown = r1
            return r0
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.appcompat.widget.ForwardingListener r0 = r1.mForwardingListener
            if (r0 == 0) goto Lc
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto Lf
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto Ld
            r1.showPopup()
        Ld:
            r0 = 1
            return r0
        Lf:
            boolean r0 = super.performClick()
            return r0
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.SpinnerAdapter r1) {
            r0 = this;
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            r0.setAdapter2(r1)
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public void setAdapter2(android.widget.SpinnerAdapter r4) {
            r3 = this;
            boolean r0 = r3.mPopupSet
            if (r0 != 0) goto L7
            r3.mTempAdapter = r4
            return
        L7:
            super.setAdapter(r4)
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r3.mPopup
            if (r0 == 0) goto L24
            android.content.Context r0 = r3.mPopupContext
            if (r0 != 0) goto L16
            android.content.Context r0 = r3.getContext()
        L16:
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r1 = r3.mPopup
            androidx.appcompat.widget.AppCompatSpinner$DropDownAdapter r2 = new androidx.appcompat.widget.AppCompatSpinner$DropDownAdapter
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r2.<init>(r4, r0)
            r1.setAdapter(r2)
        L24:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setBackgroundDrawable(r2)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.onSetBackgroundDrawable(r2)
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.onSetBackgroundResource(r2)
        La:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto Ld
            r0.setHorizontalOriginalOffset(r2)
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            r0.setHorizontalOffset(r2)
            return
        Ld:
            super.setDropDownHorizontalOffset(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L8
            r0.setVerticalOffset(r2)
            return
        L8:
            super.setDropDownVerticalOffset(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L7
            r1.mDropDownWidth = r2
            return
        L7:
            super.setDropDownWidth(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L8
            r0.setBackgroundDrawable(r2)
            return
        L8:
            super.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getPopupContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L8
            r0.setPromptText(r2)
            return
        L8:
            super.setPrompt(r2)
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L7
            r0.setSupportBackgroundTintList(r2)
        L7:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L7
            r0.setSupportBackgroundTintMode(r2)
        L7:
            return
    }

    void showPopup() {
            r3 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r3.mPopup
            int r1 = androidx.appcompat.widget.AppCompatSpinner.Api17Impl.getTextDirection(r3)
            int r2 = androidx.appcompat.widget.AppCompatSpinner.Api17Impl.getTextAlignment(r3)
            r0.show(r1, r2)
            return
    }
}
