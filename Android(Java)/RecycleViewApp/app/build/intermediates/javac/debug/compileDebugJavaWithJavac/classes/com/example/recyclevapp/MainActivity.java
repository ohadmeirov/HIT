Êþº¾   4 	      $com/example/recyclevapp/MainActivity adapter (Lcom/example/recyclevapp/CustomeAdapter;
  	 
   (androidx/appcompat/app/AppCompatActivity <init> ()V
     onCreate (Landroid/os/Bundle;)V	       com/example/recyclevapp/R$layout activity_main I
     setContentView (I)V  java/util/ArrayList
  		     ! dataSet Ljava/util/ArrayList;	 # $ % &  com/example/recyclevapp/R$id resView
  ( ) * findViewById (I)Landroid/view/View; , )androidx/recyclerview/widget/RecyclerView	  . / 0 recyclerView +Landroidx/recyclerview/widget/RecyclerView;	 # 2 3  editTextSearch 5 android/widget/EditText	  7 8 9 	searchBox Landroid/widget/EditText; ; 0androidx/recyclerview/widget/LinearLayoutManager
 : =  > (Landroid/content/Context;)V	  @ A B layoutManager 2Landroidx/recyclerview/widget/LinearLayoutManager;
 + D E F setLayoutManager <(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V H 0androidx/recyclerview/widget/DefaultItemAnimator
 G 	
 + K L M setItemAnimator ;(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V	 O P Q R S com/example/recyclevapp/myData 	nameArray [Ljava/lang/String; U !com/example/recyclevapp/DataModel	 O W X S versionArray	 O Z [ \ drawableArray [Ljava/lang/Integer;
 ^ _ ` a b java/lang/Integer intValue ()I	 O d e \ id_
 T g  h )(Ljava/lang/String;Ljava/lang/String;II)V
  j k l add (Ljava/lang/Object;)Z n &com/example/recyclevapp/CustomeAdapter
 m p  q (Ljava/util/ArrayList;)V
 + s t u 
setAdapter 6(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V w &com/example/recyclevapp/MainActivity$1
 v y  z )(Lcom/example/recyclevapp/MainActivity;)V
 4 | } ~ addTextChangedListener (Landroid/text/TextWatcher;)V 	Signature :Ljava/util/ArrayList<Lcom/example/recyclevapp/DataModel;>; Code LineNumberTable LocalVariableTable this &Lcom/example/recyclevapp/MainActivity; i savedInstanceState Landroid/os/Bundle; StackMapTable 
access$000 P(Lcom/example/recyclevapp/MainActivity;)Lcom/example/recyclevapp/CustomeAdapter; x0 
SourceFile MainActivity.java InnerClasses  com/example/recyclevapp/R layout id  7androidx/recyclerview/widget/RecyclerView$LayoutManager LayoutManager  6androidx/recyclerview/widget/RecyclerView$ItemAnimator ItemAnimator  1androidx/recyclerview/widget/RecyclerView$Adapter Adapter !         !        / 0    A B         8 9           /     *· ±                              L     »*+· *² ¶ *» Y· µ **² "¶ 'À +µ -**² 1¶ 'À 4µ 6*» :Y*· <µ ?*´ -*´ ?¶ C*´ -» GY· I¶ J=² N¾¢ 2*´ » TY² N2² V2² Y2¶ ]² c2¶ ]· f¶ iW§ÿÌ*» mY*´ · oµ *´ -*´ ¶ r*´ 6» vY*· x¶ {±       J           %  3   ? ! J " X $ b % y (  )  %  $  -   . « 1 º =       Z 7      »       »       	 ü Zú 6       /     *´ °                                 2      #     + 	  + 	  + 	 v      