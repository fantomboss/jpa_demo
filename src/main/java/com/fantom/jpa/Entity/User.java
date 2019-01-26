package com.fantom.jpa.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * @author fantomboss
 * @date 2019/1/24-10:39
 */
@Data
@Entity
public class User {

  @Id
  @GeneratedValue
  private int userId;

  private String name;
  private String passWorld;
  private String sex;
/*
  fetch = FetchType.EAGER --（可以级联查询，连带的全部查询出来）
  fetch = FetchType.LAZY  --  (不可以级联查询，如果直接查询整个类的话会报错)
  #-----cascade 与fetch无关，不管是EAGER还是LAZY
        cascade 说的是自己作为维护方所具有的功能
  cascade = {CascadeType.PERSIST,      级联保存
             CascadeType.MERGE,        级联更新
             CascadeType.REMOVE,       级联删除
             CascadeType.REFRESH,      级联刷新
             CascadeType.ALL}           以上四种全部包括
*/
  @ManyToMany(fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
  @JoinTable(name = "user_book",joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "book_id"))
  private Set<Book> books;

  @OneToMany(fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
  @JoinColumn(name = "user_id")
  private Set<Subject> subjects;

  //a、targetEntity属性表示默认关联的实体类型。如果集合类中指定了具体类型了，不需要使用targetEntity.否则要指定targetEntity=AddressEO.class。
  //b、mappedBy属性用于标记当实体之间是双向时使用。指向拥有的一方，自己是被拥有的一方（双向关系必写！！）
  //  只有OneToOne,OneToMany,ManyToMany上才有mappedBy属性，ManyToOne不存在该属性；
  //---这里我们设置双向关系，表示两者之间两情相爱，互相维护
  @OneToOne(fetch = FetchType.EAGER,cascade = {CascadeType.ALL},targetEntity = Lover.class)
  @JoinColumn(name = "lover_id")
  private Lover lover;

  @ManyToOne(fetch = FetchType.EAGER,cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
  @JoinColumn(name = "country_id")
  private Country country;


  /*
      1、定义时使用接口，初始化使用具体的类。
      如Collection可以初始化为ArrayList或HashSet；
      Set可以初始化为HashSet；
      List可以初始化为ArrayList；
      Map可以初始化为HashMap.
      2、集合类的选择
      Collection类是Set和List的父类，在未确定使用Set或List时可使用；
      Set集合中对象不能重复，并且是无序的;
      List集合中的对象可以有重复，并且可以有排序；
      Map集合是带有key和value值的集合。
   */
}
