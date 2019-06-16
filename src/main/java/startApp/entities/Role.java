/*
 * Developed by Antonio112009 on 16/06/19 18:16
 * Last Modified 15/06/19 17:59
 * Copyright (c) 2019. All rights reserved
 *
 */

package startApp.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue
    @Column(name = "role_id")
    private int id;

    @Column(name = "role")
    private String role;
}