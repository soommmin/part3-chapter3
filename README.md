## part3-chapter3

# 월렛 서비스

<img src="https://github.com/soommmin/part3-chapter2/assets/150005268/a798da76-5054-47c5-be21-1e3b7ab7b634" width="200" height="400"/>
<img src="https://github.com/soommmin/part3-chapter2/assets/150005268/d1170032-e21e-48ea-9cee-8de0aa2a5976" width="200" height="400"/>
<img src="https://github.com/soommmin/part3-chapter2/assets/150005268/cd4c81be-348d-47dd-bd2e-b99f51224387" width="200" height="400"/>

월렛 서비스 앱은 매력적인 애니메이션 효과와 함께 간편하게 거래내역을 확인할 수 있는 어플리케이션 입니다. MotionLayout을 사용하여 사용자 인터페이스를 부드럽게 전환하고, DataBinding을 통해 실시간으로 데이터를 업데이트하며, Shared Elements Transition으로 화면 간의 전환을 부드럽게 처리합니다. 

## What I Learned
1. [MotionLayout](https://developer.android.com/training/constraint-layout/motionlayout?hl=ko)
   - MotionLayout은 ConstraintLayout을 확장한 것으로, 제약 조건을 사용하여 UI 요소들을 배치하는 동시에, 각 상태 간의 전환을 정의할 수 있습니다. 이를 통해 UI 요소들 간의 움직임, 크기 변경, 회전 등의 다       양한 애니메이션을 정의하고 제어할 수 있습니다.
2. [DataBinding](https://developer.android.com/topic/libraries/data-binding?hl=ko)
   - DataBinding은 안드로이드 앱의 UI와 데이터를 더욱 효율적으로 관리하기 위한 기술로, XML 레이아웃 파일과 액티비티 또는 프래그먼트의 코드를 연결하여 데이터를 자동으로 업데이트할 수 있도록 합니다.
     기존에는 UI 요소들을 코드에서 직접 참조하고 데이터를 설정해야 했지만, DataBinding을 사용하면 XML 파일에서 바로 데이터를 바인딩하여 UI를 업데이트할 수 있습니다. 이를 통해 개발자는 보다 간편하게 UI를 관리       할 수 있으며, 코드와 UI 간의 결합도를 낮출 수 있습니다.
3. [BindingAdapter](https://developer.android.com/topic/libraries/data-binding/binding-adapters?hl=ko)
   - BindingAdapter는 안드로이드의 DataBinding 라이브러리에서 제공하는 기능 중 하나로, XML 레이아웃에서 사용자가 정의한 커스텀 속성에 대한 바인딩 로직을 정의할 수 있게 해주는 어노테이션입니다.
     일반적으로 안드로이드에서 기본적으로 제공되지 않는 커스텀 속성이나 UI 동작을 구현하기 위해 사용됩니다. 예를 들어, RecyclerView와 같은 리스트나 그리드 뷰에서 데이터를 표시할 때, 데이터와 UI 간의 연결을 지원      하기 위해 사용할 수 있습니다.
4. [Shared Elements Transition](https://android-developers.googleblog.com/2018/02/continuous-shared-element-transitions.html)
  - Shared Elements Transition(공유 요소 전환)은 안드로이드에서 화면 전환 시 두 화면 간에 공유되는 요소들의 전환을 부드럽게 처리하는 기술입니다. 이를 통해 사용자가 화면 간 전환을 할 때, 공유되는 요소들이       자연스럽게 이동하고 크기 및 모양이 변화하는 효과를 제공하여 사용자 경험을 향상시킵니다.
5. [RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview?hl=ko)


