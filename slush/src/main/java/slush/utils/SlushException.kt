package slush.utils

sealed class SlushException(message: String) : Exception(message) {
    class LayoutIdNotFoundException :
        SlushException("Method setItemLayout() not called")

    class BothBindMethodsCalledException :
        SlushException("Only one of the methods onBind and onBindData should be called")

    class ItemListEditorUnavailableException :
        SlushException("Cannot use ItemListEditor when not using a normal list")

    class ObserveControllerUnavailableException :
        SlushException("ObserveController is only available when you use ObservableList")
}
